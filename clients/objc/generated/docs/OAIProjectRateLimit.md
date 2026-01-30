# OAIProjectRateLimit

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **NSString*** | The object type, which is always &#x60;project.rate_limit&#x60; | 
**_id** | **NSString*** | The identifier, which can be referenced in API endpoints. | 
**model** | **NSString*** | The model this rate limit applies to. | 
**maxRequestsPer1Minute** | **NSNumber*** | The maximum requests per minute. | 
**maxTokensPer1Minute** | **NSNumber*** | The maximum tokens per minute. | 
**maxImagesPer1Minute** | **NSNumber*** | The maximum images per minute. Only present for relevant models. | [optional] 
**maxAudioMegabytesPer1Minute** | **NSNumber*** | The maximum audio megabytes per minute. Only present for relevant models. | [optional] 
**maxRequestsPer1Day** | **NSNumber*** | The maximum requests per day. Only present for relevant models. | [optional] 
**batch1DayMaxInputTokens** | **NSNumber*** | The maximum batch input tokens per day. Only present for relevant models. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


