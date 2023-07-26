package io.github.primelib.prometheus4j.api;

import java.util.List;
import javax.annotation.processing.Generated;

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
import io.github.primelib.prometheus4j.model.TsdbStatusReadResponse;
import io.github.primelib.prometheus4j.model.WalReplayStatusReadResponse;
import java.util.concurrent.CompletableFuture;

import java.util.function.Consumer;

import io.github.primelib.prometheus4j.spec.CreateSnapshotOperationSpec;
import io.github.primelib.prometheus4j.spec.DeleteSeriesOperationSpec;
import io.github.primelib.prometheus4j.spec.EvaluateQueryInstantOperationSpec;
import io.github.primelib.prometheus4j.spec.EvaluateQueryRangeOperationSpec;
import io.github.primelib.prometheus4j.spec.MetricMetadataReadResponseOperationSpec;
import io.github.primelib.prometheus4j.spec.ReadLabelNamesOperationSpec;
import io.github.primelib.prometheus4j.spec.ReadLabelValuesOperationSpec;
import io.github.primelib.prometheus4j.spec.ReadQueryExemplarsOperationSpec;
import io.github.primelib.prometheus4j.spec.ReadRulesOperationSpec;
import io.github.primelib.prometheus4j.spec.ReadSeriesOperationSpec;
import io.github.primelib.prometheus4j.spec.ReadTargetMetadataOperationSpec;
import io.github.primelib.prometheus4j.spec.ReadTargetsOperationSpec;

@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PrometheusHTTPAsyncConsumerApi {
    private final PrometheusHTTPAsyncApi api;

    public PrometheusHTTPAsyncConsumerApi(PrometheusHTTPAsyncApi api) {
        this.api = api;
    }

    /**
     * Removes deleted data
     * <p>
     * CleanTombstones removes the deleted data from disk and cleans up the existing tombstones. This can be used after deleting series to free up space. 
     */
    public CompletableFuture<Void> cleanTombstones() {
        return api.cleanTombstones();
    }

    /**
     * Creates Snapshot of current data
     * <p>
     * Snapshot creates a snapshot of all current data into {@code }{@code snapshots/&amp;lt;datetime&amp;gt;-&amp;lt;rand&amp;gt;}{@code } under the TSDB's data directory and returns the directory as response. It will optionally skip snapshotting data that is only present in the head block, and which has not yet been compacted to disk. 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>skipHead: Skip data present in the head block. Optional. </li>
     * </ul>
     */
    public CompletableFuture<SnapshotCreateResponse> createSnapshot(Consumer<CreateSnapshotOperationSpec> spec) {
        CreateSnapshotOperationSpec r = new CreateSnapshotOperationSpec(spec);
        return api.createSnapshot(r.skipHead());
    }

    /**
     * Deletes selected data
     * <p>
     * DeleteSeries deletes data for a selection of series in a time range. The actual data still exists on disk and is cleaned up in future compactions or can be explicitly cleaned up by hitting the [Clean Tombstones](https://prometheus.io/docs/prometheus/latest/querying/api/#clean-tombstones) endpoint.
     * **NOTE:** This endpoint marks samples from series as deleted, but will not necessarily prevent associated series metadata from still being returned in metadata queries for the affected time range (even after cleaning tombstones). The exact extent of metadata deletion is an implementation detail that may change in the future. 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>match: Repeated label matcher argument that selects the series to delete. At least one match[] argument must be provided. </li>
     *   <li>start: Start timestamp. Optional and defaults to minimum possible time.</li>
     *   <li>end: End timestamp. Optional and defaults to maximum possible time.  Not mentioning both start and end times would clear all the data for the matched series in the database. </li>
     * </ul>
     */
    public CompletableFuture<Void> deleteSeries(Consumer<DeleteSeriesOperationSpec> spec) {
        DeleteSeriesOperationSpec r = new DeleteSeriesOperationSpec(spec);
        return api.deleteSeries(r.match(), r.start(), r.end());
    }

    /**
     * Evaluates instant query
     * <p>
     * The following endpoint evaluates an instant query at a single point in time
     * You can URL-encode these parameters directly in the request body by using the {@code }{@code POST}{@code } method and {@code }{@code Content-Type: application/x-www-form-urlencoded}{@code } header. This is useful when specifying a large query that may breach server-side URL character limits.
     * The data section of the query result has the following format {@code }` {
     *  "resultType": "matrix" | "vector" | "scalar" | "string",
     *  "result": &amp;lt;value&amp;gt; } {@code }{@code  }{@code }&amp;lt;value&amp;gt;{@code }{@code  refers to the query result data, which has varying formats depending on the }{@code }resultType{@code }`. See the [expression query result formats](https://prometheus.io/docs/prometheus/latest/querying/api/#expression-query-result-formats). 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>query: Prometheus expression query string. </li>
     *   <li>time: Evaluation timestamp. Optional. The current server time is used if the time parameter is omitted. </li>
     *   <li>timeout: Evaluation timeout. Optional. Defaults to and is capped by the value of the {@code }{@code -query.timeout}{@code } flag. </li>
     * </ul>
     */
    public CompletableFuture<QueryDataReadResponse> evaluateQueryInstant(Consumer<EvaluateQueryInstantOperationSpec> spec) {
        EvaluateQueryInstantOperationSpec r = new EvaluateQueryInstantOperationSpec(spec);
        return api.evaluateQueryInstant(r.query(), r.time(), r.timeout());
    }

    /**
     * Evaluates query over range of time.
     * <p>
     * The following endpoint evaluates an expression query over a range of time
     * You can URL-encode these parameters directly in the request body by using the {@code }{@code POST}{@code } method and {@code }{@code Content-Type: application/x-www-form-urlencoded}{@code } header. This is useful when specifying a large query that may breach server-side URL character limits.
     * The data section of the query result has the following format {@code }` {
     *  "resultType": "matrix",
     *  "result": &amp;lt;value&amp;gt; } {@code }{@code  For the format of the }{@code }&amp;lt;value&amp;gt;{@code }` placeholder, see the [range-vector result format](https://prometheus.io/docs/prometheus/latest/querying/api/#range-vectors). 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>query: Prometheus expression query string. </li>
     *   <li>start: Start timestamp. </li>
     *   <li>end: End timestamp. </li>
     *   <li>step: Query resolution step width in {@code }{@code duration}{@code } format or float number of seconds. </li>
     *   <li>timeout: Evaluation timeout. Optional. Defaults to and is capped by the value of the {@code }{@code -query.timeout}{@code } flag. </li>
     * </ul>
     */
    public CompletableFuture<ResponseQueryRange> evaluateQueryRange(Consumer<EvaluateQueryRangeOperationSpec> spec) {
        EvaluateQueryRangeOperationSpec r = new EvaluateQueryRangeOperationSpec(spec);
        return api.evaluateQueryRange(r.query(), r.start(), r.end(), r.step(), r.timeout());
    }

    /**
     * Returns metric metadata
     * <p>
     * It returns metadata about metrics currently scrapped from targets. However, it does not provide any target information. This is considered experimental and might change in the future.
     * The data section of the query result consists of an object where each key is a metric name and each value is a list of unique metadata objects, as exposed for that metric name across all targets. 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>limit: Maximum number of metrics to return.</li>
     *   <li>metric: A metric name to filter metadata for. All metric metadata is retrieved if left empty.</li>
     * </ul>
     */
    public CompletableFuture<MetadataReadResponse> metricMetadataReadResponse(Consumer<MetricMetadataReadResponseOperationSpec> spec) {
        MetricMetadataReadResponseOperationSpec r = new MetricMetadataReadResponseOperationSpec(spec);
        return api.metricMetadataReadResponse(r.limit(), r.metric());
    }

    /**
     * Returns current alertmanager discovery
     * <p>
     * Returns an overview of the current state of the Prometheus alertmanager discovery
     * Both the active and dropped Alertmanagers are part of the response. 
     */
    public CompletableFuture<AlertManagerReadResponse> readAlertManagers() {
        return api.readAlertManagers();
    }

    /**
     * Returns active alerts
     * <p>
     * The /alerts endpoint returns a list of all active alerts.
     * As the /alerts endpoint is fairly new, it does not have the same stability guarantees as the overarching API v1. 
     */
    public CompletableFuture<AlertReadResponse> readAlerts() {
        return api.readAlerts();
    }

    /**
     * Returns label names
     * <p>
     * The following endpoint returns a list of label names.
     * The {@code data} section of the JSON response is a list of string label names. **NOTE:** These API endpoints may return metadata for series for which there is no sample within the selected time range, and/or for series whose samples have been marked as deleted via the deletion API endpoint. The exact extent of additionally returned series metadata is an implementation detail that may change in the future. 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>start: Start timestamp. </li>
     *   <li>end: End timestamp. </li>
     *   <li>match: Repeated series selector argument that selects the series from which to read the label values. Optional. </li>
     * </ul>
     */
    public CompletableFuture<LabelNamesReadResponse> readLabelNames(Consumer<ReadLabelNamesOperationSpec> spec) {
        ReadLabelNamesOperationSpec r = new ReadLabelNamesOperationSpec(spec);
        return api.readLabelNames(r.start(), r.end(), r.match());
    }

    /**
     * Returns label values
     * <p>
     * The following endpoint returns a list of label values for a provided label name The {@code data} section of the JSON response is a list of string label values.
     * **NOTE:** These API endpoints may return metadata for series for which there is no sample within the selected time range, and/or for series whose samples have been marked as deleted via the deletion API endpoint. The exact extent of additionally returned series metadata is an implementation detail that may change in the future. 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>labelName: Label name.</li>
     *   <li>start: Start timestamp.</li>
     *   <li>end: End timestamp.</li>
     *   <li>match: Repeated series selector argument that selects the series from which to read the label values. </li>
     * </ul>
     */
    public CompletableFuture<LabelValuesReadResponse> readLabelValues(Consumer<ReadLabelValuesOperationSpec> spec) {
        ReadLabelValuesOperationSpec r = new ReadLabelValuesOperationSpec(spec);
        return api.readLabelValues(r.labelName(), r.start(), r.end(), r.match());
    }

    /**
     * Returns list of Exemplars
     * <p>
     * This is &amp;lt;b&amp;gt;experimental&amp;lt;/b&amp;gt; and might change in the future. The following endpoint returns a list of exemplars for a valid PromQL query for a specific time range 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>query: Prometheus expression query string. </li>
     *   <li>start: Start timestamp. </li>
     *   <li>end: End timestamp. </li>
     * </ul>
     */
    public CompletableFuture<QueryExemplarsReadResponse> readQueryExemplars(Consumer<ReadQueryExemplarsOperationSpec> spec) {
        ReadQueryExemplarsOperationSpec r = new ReadQueryExemplarsOperationSpec(spec);
        return api.readQueryExemplars(r.query(), r.start(), r.end());
    }

    /**
     * Returns currently loaded rules
     * <p>
     * The {@code }{@code /rules}{@code } API endpoint returns a list of alerting and recording rules that are currently loaded. In addition it returns the currently active alerts fired by the Prometheus instance of each alerting rule.
     * As the {@code }{@code /rules}{@code } endpoint is fairly new, it does not have the same stability guarantees as the overarching API v1.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>type: Return only the alerting rules (e.g. {@code }{@code type=alert}{@code }) or the recording rules (e.g. {@code }{@code type=record}{@code }). When the parameter is absent or empty, no filtering is done. </li>
     * </ul>
     */
    public CompletableFuture<RuleReadResponse> readRules(Consumer<ReadRulesOperationSpec> spec) {
        ReadRulesOperationSpec r = new ReadRulesOperationSpec(spec);
        return api.readRules(r.type());
    }

    /**
     * Returns time series
     * <p>
     * The following endpoint returns the list of time series that match a certain label set.
     * You can URL-encode these parameters directly in the request body by using the {@code }{@code POST}{@code } method and {@code }{@code Content-Type: application/x-www-form-urlencoded}{@code } header. This is useful when specifying a large or dynamic number of series selectors that may breach server-side URL character limits.
     * The {@code }{@code data}{@code } section of the query result consists of a list of objects that contain the label name/value pairs which identify each series. 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>match: Repeated series selector argument that selects the series to return. At least one {@code }{@code match[]}{@code } argument must be provided. </li>
     *   <li>start: Start timestamp. Optional. </li>
     *   <li>end: End timestamp. Optional. </li>
     * </ul>
     */
    public CompletableFuture<List<QueryDataResultMetric>> readSeries(Consumer<ReadSeriesOperationSpec> spec) {
        ReadSeriesOperationSpec r = new ReadSeriesOperationSpec(spec);
        return api.readSeries(r.match(), r.start(), r.end());
    }

    /**
     * Returns build information
     * <p>
     * The following endpoint returns various build information properties about the Prometheus server. 
     */
    public CompletableFuture<PrometheusBuildInfoReadResponse> readServerBuildInfo() {
        return api.readServerBuildInfo();
    }

    /**
     * Returns configuration file
     * <p>
     * The following endpoint returns currently loaded configuration file
     * The config is returned as dumped YAML file. Due to limitation of the YAML library, YAML comments are not included. 
     */
    public CompletableFuture<PrometheusConfigReadResponse> readServerConfig() {
        return api.readServerConfig();
    }

    /**
     * Returns flag values
     * <p>
     * The following endpoint returns flag values that Prometheus was configured with. 
     */
    public CompletableFuture<Void> readServerFlags() {
        return api.readServerFlags();
    }

    /**
     * Returns runtime info
     * <p>
     * The following endpoint returns various runtime information properties about the Prometheus server
     * The returned values are of different types, depending on the nature of the runtime property
     * --- **NOTE:** The exact returned runtime properties may change without notice between Prometheus versions.
     * ---
     * New in v2.14 
     */
    public CompletableFuture<RuntimeInfoResponse> readServerRuntimeInfo() {
        return api.readServerRuntimeInfo();
    }

    /**
     * Returns statistics about TSBD
     * <p>
     * The following endpoint returns various cardinality statistics about the Prometheus TSDB
     * Response Data ---
     * **headStats:** This provides the following data about the head block of the TSDB: &amp;gt;**numSeries:** The number of series. **chunkCount:** The number of chunks. **minTime:** The current minimum timestamp in milliseconds. **maxTime:** The current maximum timestamp in milliseconds.
     * **seriesCountByMetricName:** This will provide a list of metrics names and their series count. **labelValueCountByLabelName:** This will provide a list of the label names and their value count. **memoryInBytesByLabelName:** This will provide a list of the label names and memory used in bytes. Memory usage is calculated by adding the length of all values for a given label name. **seriesCountByLabelPair:** This will provide a list of label value pairs and their series count. 
     */
    public CompletableFuture<TsdbStatusReadResponse> readServerTSDBStatus() {
        return api.readServerTSDBStatus();
    }

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
     */
    public CompletableFuture<WalReplayStatusReadResponse> readServerWALReplayStatus() {
        return api.readServerWALReplayStatus();
    }

    /**
     * Returns target metadata
     * <p>
     * The following endpoint returns metadata about metrics currently scraped from targets. This is experimental and might change in the future.
     * The {@code }{@code data}{@code } section of the query result consists of a list of objects that contain metric metadata and the target label set.
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>matchTarget: Label selectors that match targets by their label sets. All targets are selected if left empty. </li>
     *   <li>metric: A metric name to retrieve metadata for. All metric metadata is retrieved if left empty. </li>
     *   <li>limit: Maximum number of targets to match. </li>
     * </ul>
     */
    public CompletableFuture<List<MetricMetadata>> readTargetMetadata(Consumer<ReadTargetMetadataOperationSpec> spec) {
        ReadTargetMetadataOperationSpec r = new ReadTargetMetadataOperationSpec(spec);
        return api.readTargetMetadata(r.matchTarget(), r.metric(), r.limit());
    }

    /**
     * Returns current target discovery.
     * <p>
     * Both the active and dropped targets are part of the response by default. {@code }{@code labels}{@code } represents the label set after relabelling has occurred. {@code }{@code discoveredLabels}{@code } represent the unmodified labels retrieved during service discovery before relabelling has occurred. 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>state: The {@code }{@code state}{@code } query parameter allows the caller to filter by active or dropped targets, (e.g., {@code }{@code state=active}{@code }, {@code }{@code state=dropped}{@code }, {@code }{@code state=any}{@code }). </li>
     * </ul>
     */
    public CompletableFuture<TargetDiscoveryReadResponse> readTargets(Consumer<ReadTargetsOperationSpec> spec) {
        ReadTargetsOperationSpec r = new ReadTargetsOperationSpec(spec);
        return api.readTargets(r.state());
    }

}
