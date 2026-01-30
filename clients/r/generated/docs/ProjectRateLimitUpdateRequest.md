# openapi::ProjectRateLimitUpdateRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**max_requests_per_1_minute** | **integer** | The maximum requests per minute. | [optional] 
**max_tokens_per_1_minute** | **integer** | The maximum tokens per minute. | [optional] 
**max_images_per_1_minute** | **integer** | The maximum images per minute. Only relevant for certain models. | [optional] 
**max_audio_megabytes_per_1_minute** | **integer** | The maximum audio megabytes per minute. Only relevant for certain models. | [optional] 
**max_requests_per_1_day** | **integer** | The maximum requests per day. Only relevant for certain models. | [optional] 
**batch_1_day_max_input_tokens** | **integer** | The maximum batch input tokens per day. Only relevant for certain models. | [optional] 


