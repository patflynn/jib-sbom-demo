# Jib w/ SBOMs demo

  1. First update the `jib.image` property in pom.xml to point to a repository that you have push access to.
  2. run `mvn install` to build your image and publish the combined SBOM. 
  3. run `cosign download sbom ${jib.image}` to view combined sbom.

Note: If your base is a different format (json/xml) or type (cyclonedx/spdx) your merged sbom will look weird.
