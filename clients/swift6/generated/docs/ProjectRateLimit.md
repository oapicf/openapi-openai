# ProjectRateLimit

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **String** | The object type, which is always &#x60;project.rate_limit&#x60; | 
**id** | **String** | The identifier, which can be referenced in API endpoints. | 
**model** | **String** | The model this rate limit applies to. | 
**maxRequestsPer1Minute** | **Int** | The maximum requests per minute. | 
**maxTokensPer1Minute** | **Int** | The maximum tokens per minute. | 
**maxImagesPer1Minute** | **Int** | The maximum images per minute. Only present for relevant models. | [optional] 
**maxAudioMegabytesPer1Minute** | **Int** | The maximum audio megabytes per minute. Only present for relevant models. | [optional] 
**maxRequestsPer1Day** | **Int** | The maximum requests per day. Only present for relevant models. | [optional] 
**batch1DayMaxInputTokens** | **Int** | The maximum batch input tokens per day. Only present for relevant models. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


