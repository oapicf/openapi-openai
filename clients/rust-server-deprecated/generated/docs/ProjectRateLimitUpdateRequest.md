# ProjectRateLimitUpdateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**max_requests_per_1_minute** | **i32** | The maximum requests per minute. | [optional] [default to None]
**max_tokens_per_1_minute** | **i32** | The maximum tokens per minute. | [optional] [default to None]
**max_images_per_1_minute** | **i32** | The maximum images per minute. Only relevant for certain models. | [optional] [default to None]
**max_audio_megabytes_per_1_minute** | **i32** | The maximum audio megabytes per minute. Only relevant for certain models. | [optional] [default to None]
**max_requests_per_1_day** | **i32** | The maximum requests per day. Only relevant for certain models. | [optional] [default to None]
**batch_1_day_max_input_tokens** | **i32** | The maximum batch input tokens per day. Only relevant for certain models. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


