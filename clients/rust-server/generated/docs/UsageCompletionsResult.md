# UsageCompletionsResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | [***models::UsageCompletionsResultObject**](UsageCompletionsResult_object.md) |  | 
**input_tokens** | **i32** | The aggregated number of text input tokens used, including cached tokens. For customers subscribe to scale tier, this includes scale tier tokens. | 
**input_cached_tokens** | **i32** | The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens. | [optional] [default to None]
**output_tokens** | **i32** | The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens. | 
**input_audio_tokens** | **i32** | The aggregated number of audio input tokens used, including cached tokens. | [optional] [default to None]
**output_audio_tokens** | **i32** | The aggregated number of audio output tokens used. | [optional] [default to None]
**num_model_requests** | **i32** | The count of requests made to the model. | 
**project_id** | **swagger::Nullable<String>** | When `group_by=project_id`, this field provides the project ID of the grouped usage result. | [optional] [default to None]
**user_id** | **swagger::Nullable<String>** | When `group_by=user_id`, this field provides the user ID of the grouped usage result. | [optional] [default to None]
**api_key_id** | **swagger::Nullable<String>** | When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result. | [optional] [default to None]
**model** | **swagger::Nullable<String>** | When `group_by=model`, this field provides the model name of the grouped usage result. | [optional] [default to None]
**batch** | **swagger::Nullable<bool>** | When `group_by=batch`, this field tells whether the grouped usage result is batch or not. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


