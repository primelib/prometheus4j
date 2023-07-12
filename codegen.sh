#!/bin/bash

# setup
PROJECT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )"

# test
case $1 in
  "update")
    echo "> running update"
    # update openapi spec
    # NOTE: this openapi spec is crafted by hand
    ;;

  "generate")
    echo "> running code generation"
    docker run -it --rm -v $(pwd):/project ghcr.io/primelib/primecodegen:0.0.1 \
        primecodegen generate \
        -e auto \
        -i "/project/openapi.yaml" \
        -o "/project/" \
        -c "/project/openapi-generator.json" \
        --openapi-normalizer SIMPLIFY_ONEOF_ANYOF=true \
        --openapi-normalizer SIMPLIFY_BOOLEAN_ENUM=true \
        --openapi-normalizer REMOVE_ANYOF_ONEOF_AND_KEEP_PROPERTIES_ONLY=true \
        --openapi-normalizer REFACTOR_ALLOF_WITH_PROPERTIES_ONLY=true
    ;;
esac
