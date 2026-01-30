# OpenapiOpenai.ProjectRateLimit

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **String** | The object type, which is always &#x60;project.rate_limit&#x60; | 
**id** | **String** | The identifier, which can be referenced in API endpoints. | 
**model** | **String** | The model this rate limit applies to. | 
**maxRequestsPer1Minute** | **Number** | The maximum requests per minute. | 
**maxTokensPer1Minute** | **Number** | The maximum tokens per minute. | 
**maxImagesPer1Minute** | **Number** | The maximum images per minute. Only present for relevant models. | [optional] 
**maxAudioMegabytesPer1Minute** | **Number** | The maximum audio megabytes per minute. Only present for relevant models. | [optional] 
**maxRequestsPer1Day** | **Number** | The maximum requests per day. Only present for relevant models. | [optional] 
**batch1DayMaxInputTokens** | **Number** | The maximum batch input tokens per day. Only present for relevant models. | [optional] 



## Enum: ObjectEnum


* `project.rate_limit` (value: `"project.rate_limit"`)




