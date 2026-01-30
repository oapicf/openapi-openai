

# ProjectRateLimit

Represents a project rate limit config.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**_object** | [**ObjectEnum**](#ObjectEnum) | The object type, which is always &#x60;project.rate_limit&#x60; |  |
|**id** | **String** | The identifier, which can be referenced in API endpoints. |  |
|**model** | **String** | The model this rate limit applies to. |  |
|**maxRequestsPer1Minute** | **Integer** | The maximum requests per minute. |  |
|**maxTokensPer1Minute** | **Integer** | The maximum tokens per minute. |  |
|**maxImagesPer1Minute** | **Integer** | The maximum images per minute. Only present for relevant models. |  [optional] |
|**maxAudioMegabytesPer1Minute** | **Integer** | The maximum audio megabytes per minute. Only present for relevant models. |  [optional] |
|**maxRequestsPer1Day** | **Integer** | The maximum requests per day. Only present for relevant models. |  [optional] |
|**batch1DayMaxInputTokens** | **Integer** | The maximum batch input tokens per day. Only present for relevant models. |  [optional] |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| PROJECT_RATE_LIMIT | &quot;project.rate_limit&quot; |



