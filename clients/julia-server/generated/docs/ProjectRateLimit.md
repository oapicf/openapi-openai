# ProjectRateLimit


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`object`** | **`String`** | The object type, which is always &#x60;project.rate_limit&#x60; | [default to nothing]
**`id`** | **`String`** | The identifier, which can be referenced in API endpoints. | [default to nothing]
**`model`** | **`String`** | The model this rate limit applies to. | [default to nothing]
**`max_requests_per_1_minute`** | **`Int64`** | The maximum requests per minute. | [default to nothing]
**`max_tokens_per_1_minute`** | **`Int64`** | The maximum tokens per minute. | [default to nothing]
**`max_images_per_1_minute`** | **`Int64`** | The maximum images per minute. Only present for relevant models. | [optional] [default to nothing]
**`max_audio_megabytes_per_1_minute`** | **`Int64`** | The maximum audio megabytes per minute. Only present for relevant models. | [optional] [default to nothing]
**`max_requests_per_1_day`** | **`Int64`** | The maximum requests per day. Only present for relevant models. | [optional] [default to nothing]
**`batch_1_day_max_input_tokens`** | **`Int64`** | The maximum batch input tokens per day. Only present for relevant models. | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


