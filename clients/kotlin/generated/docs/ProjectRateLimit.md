
# ProjectRateLimit

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **&#x60;object&#x60;** | [**inline**](#&#x60;Object&#x60;) | The object type, which is always &#x60;project.rate_limit&#x60; |  |
| **id** | **kotlin.String** | The identifier, which can be referenced in API endpoints. |  |
| **model** | **kotlin.String** | The model this rate limit applies to. |  |
| **maxRequestsPer1Minute** | **kotlin.Int** | The maximum requests per minute. |  |
| **maxTokensPer1Minute** | **kotlin.Int** | The maximum tokens per minute. |  |
| **maxImagesPer1Minute** | **kotlin.Int** | The maximum images per minute. Only present for relevant models. |  [optional] |
| **maxAudioMegabytesPer1Minute** | **kotlin.Int** | The maximum audio megabytes per minute. Only present for relevant models. |  [optional] |
| **maxRequestsPer1Day** | **kotlin.Int** | The maximum requests per day. Only present for relevant models. |  [optional] |
| **batch1DayMaxInputTokens** | **kotlin.Int** | The maximum batch input tokens per day. Only present for relevant models. |  [optional] |


<a id="`Object`"></a>
## Enum: object
| Name | Value |
| ---- | ----- |
| &#x60;object&#x60; | project.rate_limit |



