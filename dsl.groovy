#!/usr/bin/env groovy
job('example-job-from-job-dsl') {
    steps {
        shell("echo 'Hello World'")
    }
}
