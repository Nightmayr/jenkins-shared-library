# Jenkins Shared Library

## `vars` directory
The vars directory contains script files that can be called as variables within pipelines. If we have a script called `log.groovy` and within this script we have a method named `info` then we can call this method from a pipeline script that has imported this library by doing the following; `log.info`.

The naming convention for files in this repo is camelCase.