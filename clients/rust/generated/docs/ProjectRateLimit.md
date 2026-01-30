# ProjectRateLimit

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **String** | The object type, which is always `project.rate_limit` | 
**id** | **String** | The identifier, which can be referenced in API endpoints. | 
**model** | **String** | The model this rate limit applies to. | 
**max_requests_per_1_minute** | **i32** | The maximum requests per minute. | 
**max_tokens_per_1_minute** | **i32** | The maximum tokens per minute. | 
**max_images_per_1_minute** | Option<**i32**> | The maximum images per minute. Only present for relevant models. | [optional]
**max_audio_megabytes_per_1_minute** | Option<**i32**> | The maximum audio megabytes per minute. Only present for relevant models. | [optional]
**max_requests_per_1_day** | Option<**i32**> | The maximum requests per day. Only present for relevant models. | [optional]
**batch_1_day_max_input_tokens** | Option<**i32**> | The maximum batch input tokens per day. Only present for relevant models. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


