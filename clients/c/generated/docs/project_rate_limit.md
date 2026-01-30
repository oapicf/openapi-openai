# project_rate_limit_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **openai_api_project_rate_limit_OBJECT_e** | The object type, which is always &#x60;project.rate_limit&#x60; | 
**id** | **char \*** | The identifier, which can be referenced in API endpoints. | 
**model** | **char \*** | The model this rate limit applies to. | 
**max_requests_per_1_minute** | **int** | The maximum requests per minute. | 
**max_tokens_per_1_minute** | **int** | The maximum tokens per minute. | 
**max_images_per_1_minute** | **int** | The maximum images per minute. Only present for relevant models. | [optional] 
**max_audio_megabytes_per_1_minute** | **int** | The maximum audio megabytes per minute. Only present for relevant models. | [optional] 
**max_requests_per_1_day** | **int** | The maximum requests per day. Only present for relevant models. | [optional] 
**batch_1_day_max_input_tokens** | **int** | The maximum batch input tokens per day. Only present for relevant models. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


