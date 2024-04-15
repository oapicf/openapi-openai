# 

The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

This Groovy package, using the [http-builder-ng library](https://http-builder-ng.github.io/http-builder-ng/), is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 2.0.0
- Package version: 2.0.0
- Build date: 2024-04-14T13:33:48.746452035Z[Etc/UTC]
- Generator version: 7.4.0
- Build package: org.openapitools.codegen.languages.GroovyClientCodegen
For more information, please visit [https://github.com/oapicf/openapi-openai](https://github.com/oapicf/openapi-openai)

## Requirements

* Groovy 2.5.7
* Gradle 4.9

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

## Getting Started


```groovy
def apiInstance = new AssistantsApi()
def threadId = "threadId_example" // String | The ID of the thread to which this run belongs.
def runId = "runId_example" // String | The ID of the run to cancel.

apiInstance.cancelRun(threadId, runId)
    {
    // on success
    def result = (RunObject)it
    println result
    
}
    {
    // on failure
    statusCode, message ->
        println "${statusCode} ${message}"
};
```
