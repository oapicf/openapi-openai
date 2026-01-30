# PROJECT_RATE_LIMIT

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | [**STRING_32**](STRING_32.md) | The object type, which is always &#x60;project.rate_limit&#x60; | [default to null]
**id** | [**STRING_32**](STRING_32.md) | The identifier, which can be referenced in API endpoints. | [default to null]
**model** | [**STRING_32**](STRING_32.md) | The model this rate limit applies to. | [default to null]
**max_requests_per_1_minute** | **INTEGER_32** | The maximum requests per minute. | [default to null]
**max_tokens_per_1_minute** | **INTEGER_32** | The maximum tokens per minute. | [default to null]
**max_images_per_1_minute** | **INTEGER_32** | The maximum images per minute. Only present for relevant models. | [optional] [default to null]
**max_audio_megabytes_per_1_minute** | **INTEGER_32** | The maximum audio megabytes per minute. Only present for relevant models. | [optional] [default to null]
**max_requests_per_1_day** | **INTEGER_32** | The maximum requests per day. Only present for relevant models. | [optional] [default to null]
**batch_1_day_max_input_tokens** | **INTEGER_32** | The maximum batch input tokens per day. Only present for relevant models. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


