

# ProjectRateLimit

Represents a project rate limit config.

The class is defined in **[ProjectRateLimit.java](../../src/main/java/org/openapitools/model/ProjectRateLimit.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_object** | [**ObjectEnum**](#ObjectEnum) | The object type, which is always &#x60;project.rate_limit&#x60; | 
**id** | `String` | The identifier, which can be referenced in API endpoints. | 
**model** | `String` | The model this rate limit applies to. | 
**maxRequestsPer1Minute** | `Integer` | The maximum requests per minute. | 
**maxTokensPer1Minute** | `Integer` | The maximum tokens per minute. | 
**maxImagesPer1Minute** | `Integer` | The maximum images per minute. Only present for relevant models. |  [optional property]
**maxAudioMegabytesPer1Minute** | `Integer` | The maximum audio megabytes per minute. Only present for relevant models. |  [optional property]
**maxRequestsPer1Day** | `Integer` | The maximum requests per day. Only present for relevant models. |  [optional property]
**batch1DayMaxInputTokens** | `Integer` | The maximum batch input tokens per day. Only present for relevant models. |  [optional property]

## ObjectEnum

Name | Value
---- | -----
PROJECT_RATE_LIMIT | `"project.rate_limit"`










