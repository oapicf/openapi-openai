# ProjectRateLimitUpdateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**max_requests_per_1_minute** | Option<**i32**> | The maximum requests per minute. | [optional]
**max_tokens_per_1_minute** | Option<**i32**> | The maximum tokens per minute. | [optional]
**max_images_per_1_minute** | Option<**i32**> | The maximum images per minute. Only relevant for certain models. | [optional]
**max_audio_megabytes_per_1_minute** | Option<**i32**> | The maximum audio megabytes per minute. Only relevant for certain models. | [optional]
**max_requests_per_1_day** | Option<**i32**> | The maximum requests per day. Only relevant for certain models. | [optional]
**batch_1_day_max_input_tokens** | Option<**i32**> | The maximum batch input tokens per day. Only relevant for certain models. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


