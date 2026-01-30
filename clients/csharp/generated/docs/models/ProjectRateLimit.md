# Org.OpenAPITools.Model.ProjectRateLimit
Represents a project rate limit config.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **string** | The object type, which is always &#x60;project.rate_limit&#x60; | 
**Id** | **string** | The identifier, which can be referenced in API endpoints. | 
**Model** | **string** | The model this rate limit applies to. | 
**MaxRequestsPer1Minute** | **int** | The maximum requests per minute. | 
**MaxTokensPer1Minute** | **int** | The maximum tokens per minute. | 
**MaxImagesPer1Minute** | **int** | The maximum images per minute. Only present for relevant models. | [optional] 
**MaxAudioMegabytesPer1Minute** | **int** | The maximum audio megabytes per minute. Only present for relevant models. | [optional] 
**MaxRequestsPer1Day** | **int** | The maximum requests per day. Only present for relevant models. | [optional] 
**Batch1DayMaxInputTokens** | **int** | The maximum batch input tokens per day. Only present for relevant models. | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

