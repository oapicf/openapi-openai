# openapi::ProjectRateLimit

Represents a project rate limit config.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **character** | The object type, which is always &#x60;project.rate_limit&#x60; | [Enum: [project.rate_limit]] 
**id** | **character** | The identifier, which can be referenced in API endpoints. | 
**model** | **character** | The model this rate limit applies to. | 
**max_requests_per_1_minute** | **integer** | The maximum requests per minute. | 
**max_tokens_per_1_minute** | **integer** | The maximum tokens per minute. | 
**max_images_per_1_minute** | **integer** | The maximum images per minute. Only present for relevant models. | [optional] 
**max_audio_megabytes_per_1_minute** | **integer** | The maximum audio megabytes per minute. Only present for relevant models. | [optional] 
**max_requests_per_1_day** | **integer** | The maximum requests per day. Only present for relevant models. | [optional] 
**batch_1_day_max_input_tokens** | **integer** | The maximum batch input tokens per day. Only present for relevant models. | [optional] 


