package io.github.primelib.prometheus4j.api;

import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;
import lombok.Data;

import io.github.primelib.prometheus4j.model.AlertManagerReadResponse;
import io.github.primelib.prometheus4j.model.AlertReadResponse;
import io.github.primelib.prometheus4j.model.LabelNamesReadResponse;
import io.github.primelib.prometheus4j.model.LabelValuesReadResponse;
import io.github.primelib.prometheus4j.model.MetadataReadResponse;
import io.github.primelib.prometheus4j.model.MetricMetadata;
import io.github.primelib.prometheus4j.model.PrometheusBuildInfoReadResponse;
import io.github.primelib.prometheus4j.model.PrometheusConfigReadResponse;
import io.github.primelib.prometheus4j.model.QueryDataReadResponse;
import io.github.primelib.prometheus4j.model.QueryDataResultMetric;
import io.github.primelib.prometheus4j.model.QueryExemplarsReadResponse;
import io.github.primelib.prometheus4j.model.ResponseQueryRange;
import io.github.primelib.prometheus4j.model.RuleReadResponse;
import io.github.primelib.prometheus4j.model.RuntimeInfoResponse;
import io.github.primelib.prometheus4j.model.SnapshotCreateResponse;
import io.github.primelib.prometheus4j.model.TargetDiscoveryReadResponse;
import io.github.primelib.prometheus4j.model.TsdbStatus;
import io.github.primelib.prometheus4j.model.WalReplayStatusReadResponse;
import feign.RequestLine;
import feign.Param;

@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public interface PrometheusHTTPApi {

    /**
     * Removes deleted data
     * <p>
     * CleanTombstones removes the deleted data from disk and cleans up the existing tombstones. This can be used after deleting series to free up space. 
     *
     */
    @RequestLine("POST /admin/tsdb/clean_tombstones")
    void cleanTombstones();

    /**
     * Creates Snapshot of current data
     * <p>
     * Snapshot creates a snapshot of all current data into "snapshots/&amp;lt;datetime&amp;gt;-&amp;lt;rand&amp;gt;" under the TSDB's data directory and returns the directory as response. It will optionally skip snapshotting data that is only present in the head block, and which has not yet been compacted to disk. 
     *
     * @param skipHead             Skip data present in the head block. Optional.  (optional)
     */
    @RequestLine("POST /admin/tsdb/snapshot?skip_head={skipHead}")
    SnapshotCreateResponse createSnapshot(@Param("skip_head") @Nullable Boolean skipHead);

    /**
     * Deletes selected data
     * <p>
     * DeleteSeries deletes data for a selection of series in a time range. The actual data still exists on disk and is cleaned up in future compactions or can be explicitly cleaned up by hitting the [Clean Tombstones](https://prometheus.io/docs/prometheus/latest/querying/api/#clean-tombstones) endpoint.
     * **NOTE:** This endpoint marks samples from series as deleted, but will not necessarily prevent associated series metadata from still being returned in metadata queries for the affected time range (even after cleaning tombstones). The exact extent of metadata deletion is an implementation detail that may change in the future. 
     *
     * @param match                Repeated label matcher argument that selects the series to delete. At least one match[] argument must be provided.  (required)
     * @param start                Start timestamp. Optional and defaults to minimum possible time. (optional)
     * @param end                  End timestamp. Optional and defaults to maximum possible time.  Not mentioning both start and end times would clear all the data for the matched series in the database.  (optional)
     */
    @RequestLine("POST /admin/tsdb/delete_series?match={match}&start={start}&end={end}")
    void deleteSeries(@Param("match") @NotNull List<String> match, @Param("start") @Nullable String start, @Param("end") @Nullable String end);

    /**
     * Evaluates instant query
     * <p>
     * The following endpoint evaluates an instant query at a single point in time
     * You can URL-encode these parameters directly in the request body by using the "POST" method and "Content-Type: application/x-www-form-urlencoded" header. This is useful when specifying a large query that may breach server-side URL character limits.
     * The data section of the query result has the following format " {
     *  "resultType": "matrix" | "vector" | "scalar" | "string",
     *  "result": &amp;lt;value&amp;gt; } " "&amp;lt;value&amp;gt;" refers to the query result data, which has varying formats depending on the "resultType". See the [expression query result formats](https://prometheus.io/docs/prometheus/latest/querying/api/#expression-query-result-formats). 
     *
     * @param query                Prometheus expression query string.  (required)
     * @param time                 Evaluation timestamp. Optional. The current server time is used if the time parameter is omitted.  (optional)
     * @param timeout              Evaluation timeout. Optional. Defaults to and is capped by the value of the "-query.timeout" flag.  (optional)
     */
    @RequestLine("GET /query?query={query}&time={time}&timeout={timeout}")
    QueryDataReadResponse evaluateQueryInstant(@Param("query") @NotNull String query, @Param("time") @Nullable String time, @Param("timeout") @Nullable String timeout);

    /**
     * Evaluates query over range of time.
     * <p>
     * The following endpoint evaluates an expression query over a range of time
     * You can URL-encode these parameters directly in the request body by using the "POST" method and "Content-Type: application/x-www-form-urlencoded" header. This is useful when specifying a large query that may breach server-side URL character limits.
     * The data section of the query result has the following format " {
     *  "resultType": "matrix",
     *  "result": &amp;lt;value&amp;gt; } " For the format of the "&amp;lt;value&amp;gt;" placeholder, see the [range-vector result format](https://prometheus.io/docs/prometheus/latest/querying/api/#range-vectors). 
     *
     * @param query                Prometheus expression query string.  (required)
     * @param start                Start timestamp.  (optional)
     * @param end                  End timestamp.  (optional)
     * @param step                 Query resolution step width in "duration" format or float number of seconds.  (optional)
     * @param timeout              Evaluation timeout. Optional. Defaults to and is capped by the value of the "-query.timeout" flag.  (optional)
     */
    @RequestLine("GET /query_range?query={query}&start={start}&end={end}&step={step}&timeout={timeout}")
    ResponseQueryRange evaluateQueryRange(@Param("query") @NotNull String query, @Param("start") @Nullable String start, @Param("end") @Nullable String end, @Param("step") @Nullable String step, @Param("timeout") @Nullable String timeout);

    /**
     * Returns metric metadata
     * <p>
     * It returns metadata about metrics currently scrapped from targets. However, it does not provide any target information. This is considered experimental and might change in the future.
     * The data section of the query result consists of an object where each key is a metric name and each value is a list of unique metadata objects, as exposed for that metric name across all targets. 
     *
     * @param limit                Maximum number of metrics to return. (required)
     * @param metric               A metric name to filter metadata for. All metric metadata is retrieved if left empty. (optional)
     */
    @RequestLine("GET /metadata?limit={limit}&metric={metric}")
    MetadataReadResponse metricMetadataReadResponse(@Param("limit") @NotNull Integer limit, @Param("metric") @Nullable String metric);

    /**
     * Returns current alertmanager discovery
     * <p>
     * Returns an overview of the current state of the Prometheus alertmanager discovery
     * Both the active and dropped Alertmanagers are part of the response. 
     *
     */
    @RequestLine("GET /alertmanagers")
    AlertManagerReadResponse readAlertManagers();

    /**
     * Returns active alerts
     * <p>
     * The /alerts endpoint returns a list of all active alerts.
     * As the /alerts endpoint is fairly new, it does not have the same stability guarantees as the overarching API v1. 
     *
     */
    @RequestLine("GET /alerts")
    AlertReadResponse readAlerts();

    /**
     * Returns label names
     * <p>
     * The following endpoint returns a list of label names.
     * The `data` section of the JSON response is a list of string label names. **NOTE:** These API endpoints may return metadata for series for which there is no sample within the selected time range, and/or for series whose samples have been marked as deleted via the deletion API endpoint. The exact extent of additionally returned series metadata is an implementation detail that may change in the future. 
     *
     * @param start                Start timestamp.  (optional)
     * @param end                  End timestamp.  (optional)
     * @param match                Repeated series selector argument that selects the series from which to read the label values. Optional.  (optional)
     */
    @RequestLine("GET /labels?start={start}&end={end}&match={match}")
    LabelNamesReadResponse readLabelNames(@Param("start") @Nullable String start, @Param("end") @Nullable String end, @Param("match") @Nullable List<String> match);

    /**
     * Returns label values
     * <p>
     * The following endpoint returns a list of label values for a provided label name The `data` section of the JSON response is a list of string label values.
     * **NOTE:** These API endpoints may return metadata for series for which there is no sample within the selected time range, and/or for series whose samples have been marked as deleted via the deletion API endpoint. The exact extent of additionally returned series metadata is an implementation detail that may change in the future. 
     *
     * @param labelName            Label name. (required)
     * @param start                Start timestamp. (required)
     * @param end                  End timestamp. (optional)
     * @param match                Repeated series selector argument that selects the series from which to read the label values.  (optional)
     */
    @RequestLine("GET /label/{label_name}/values?start={start}&end={end}&match={match}")
    LabelValuesReadResponse readLabelValues(@Param("label_name") @NotNull String labelName, @Param("start") @NotNull String start, @Param("end") @Nullable String end, @Param("match") @Nullable List<String> match);

    /**
     * Returns list of Exemplars
     * <p>
     * This is &amp;lt;b&amp;gt;experimental&amp;lt;/b&amp;gt; and might change in the future. The following endpoint returns a list of exemplars for a valid PromQL query for a specific time range 
     *
     * @param query                Prometheus expression query string.  (required)
     * @param start                Start timestamp.  (optional)
     * @param end                  End timestamp.  (optional)
     */
    @RequestLine("GET /query_exemplars?query={query}&start={start}&end={end}")
    @ApiStatus.Experimental
    QueryExemplarsReadResponse readQueryExemplars(@Param("query") @NotNull String query, @Param("start") @Nullable String start, @Param("end") @Nullable String end);

    /**
     * Returns currently loaded rules
     * <p>
     * The "/rules" API endpoint returns a list of alerting and recording rules that are currently loaded. In addition it returns the currently active alerts fired by the Prometheus instance of each alerting rule.
     * As the "/rules" endpoint is fairly new, it does not have the same stability guarantees as the overarching API v1.
     *
     * @param type                 Return only the alerting rules (e.g. "type=alert") or the recording rules (e.g. "type=record"). When the parameter is absent or empty, no filtering is done.  (optional)
     */
    @RequestLine("GET /rules?type={type}")
    RuleReadResponse readRules(@Param("type") @Nullable String type);

    /**
     * Returns time series
     * <p>
     * The following endpoint returns the list of time series that match a certain label set.
     * You can URL-encode these parameters directly in the request body by using the "POST" method and "Content-Type: application/x-www-form-urlencoded" header. This is useful when specifying a large or dynamic number of series selectors that may breach server-side URL character limits.
     * The "data" section of the query result consists of a list of objects that contain the label name/value pairs which identify each series. 
     *
     * @param match                Repeated series selector argument that selects the series to return. At least one "match[]" argument must be provided.  (required)
     * @param start                Start timestamp. Optional.  (optional)
     * @param end                  End timestamp. Optional.  (optional)
     */
    @RequestLine("GET /series?start={start}&end={end}&match={match}")
    List<QueryDataResultMetric> readSeries(@Param("match") @NotNull List<String> match, @Param("start") @Nullable String start, @Param("end") @Nullable String end);

    /**
     * Returns build information
     * <p>
     * The following endpoint returns various build information properties about the Prometheus server. 
     *
     */
    @RequestLine("GET /status/buildinfo")
    PrometheusBuildInfoReadResponse readServerBuildInfo();

    /**
     * Returns configuration file
     * <p>
     * The following endpoint returns currently loaded configuration file
     * The config is returned as dumped YAML file. Due to limitation of the YAML library, YAML comments are not included. 
     *
     */
    @RequestLine("GET /status/config")
    PrometheusConfigReadResponse readServerConfig();

    /**
     * Returns flag values
     * <p>
     * The following endpoint returns flag values that Prometheus was configured with. 
     *
     */
    @RequestLine("GET /status/flags")
    void readServerFlags();

    /**
     * Returns runtime info
     * <p>
     * The following endpoint returns various runtime information properties about the Prometheus server
     * The returned values are of different types, depending on the nature of the runtime property
     * --- **NOTE:** The exact returned runtime properties may change without notice between Prometheus versions.
     * ---
     * New in v2.14 
     *
     */
    @RequestLine("GET /status/runtimeinfo")
    RuntimeInfoResponse readServerRuntimeInfo();

    /**
     * Returns statistics about TSBD
     * <p>
     * The following endpoint returns various cardinality statistics about the Prometheus TSDB
     * Response Data ---
     * **headStats:** This provides the following data about the head block of the TSDB: &amp;gt;**numSeries:** The number of series. **chunkCount:** The number of chunks. **minTime:** The current minimum timestamp in milliseconds. **maxTime:** The current maximum timestamp in milliseconds.
     * **seriesCountByMetricName:** This will provide a list of metrics names and their series count. **labelValueCountByLabelName:** This will provide a list of the label names and their value count. **memoryInBytesByLabelName:** This will provide a list of the label names and memory used in bytes. Memory usage is calculated by adding the length of all values for a given label name. **seriesCountByLabelPair:** This will provide a list of label value pairs and their series count. 
     *
     */
    @RequestLine("GET /status/tsdb")
    TsdbStatus readServerTSDBStatus();

    /**
     * Returns info about WAL replay.
     * <p>
     * The following endpoint returns information about the WAL replay
     * Response Data ---
     * **read:** The number of segments replayed so far.
     * **total:** The total number segments needed to be replayed.
     * **progress:** The progress of the replay (0 - 100%).
     * **state:** The state of the replay.
     * **Possible states:**
     * 
     * - **waiting:** Waiting for the replay to start.
     * 
     * - **in progress:** The replay is in progress.
     * 
     * - **done:** The replay has finished.
     * 
     * --- **NOTE:** This endpoint is available before the server has been marked ready and is updated in real time to facilitate monitoring the progress of the WAL replay.
     * ---
     * New in v2.28 
     *
     */
    @RequestLine("GET /status/walreplay")
    WalReplayStatusReadResponse readServerWALReplayStatus();

    /**
     * Returns target metadata
     * <p>
     * The following endpoint returns metadata about metrics currently scraped from targets. This is experimental and might change in the future.
     * The "data" section of the query result consists of a list of objects that contain metric metadata and the target label set.
     *
     * @param matchTarget          Label selectors that match targets by their label sets. All targets are selected if left empty.  (optional)
     * @param metric               A metric name to retrieve metadata for. All metric metadata is retrieved if left empty.  (optional)
     * @param limit                Maximum number of targets to match.  (optional)
     */
    @RequestLine("GET /targets/metadata?match_target={matchTarget}&metric={metric}&limit={limit}")
    @ApiStatus.Experimental
    List<MetricMetadata> readTargetMetadata(@Param("match_target") @Nullable String matchTarget, @Param("metric") @Nullable String metric, @Param("limit") @Nullable Integer limit);

    /**
     * Returns current target discovery.
     * <p>
     * Both the active and dropped targets are part of the response by default. "labels" represents the label set after relabelling has occurred. "discoveredLabels" represent the unmodified labels retrieved during service discovery before relabelling has occurred. 
     *
     * @param state                The "state" query parameter allows the caller to filter by active or dropped targets, (e.g., "state=active", "state=dropped", "state=any").  (optional)
     */
    @RequestLine("GET /targets?state={state}")
    TargetDiscoveryReadResponse readTargets(@Param("state") @Nullable String state);

}
