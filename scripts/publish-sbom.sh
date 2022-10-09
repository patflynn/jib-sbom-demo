#!/usr/bin/env bash

echo "pulling sbom for base $1 and merging with bom.json"
cosign download sbom $1 >> bom.json
digest=`cat jib-image.digest`
echo "publishing sbom for $2:${digest}"
cosign attach sbom --input-format json --sbom bom.json $2@${digest}