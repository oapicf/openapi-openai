# UsageCompletionsResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **String** |  | 
**input_tokens** | **i32** | The aggregated number of text input tokens used, including cached tokens. For customers subscribe to scale tier, this includes scale tier tokens. | 
**input_cached_tokens** | Option<**i32**> | The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens. | [optional]
**output_tokens** | **i32** | The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens. | 
**input_audio_tokens** | Option<**i32**> | The aggregated number of audio input tokens used, including cached tokens. | [optional]
**output_audio_tokens** | Option<**i32**> | The aggregated number of audio output tokens used. | [optional]
**num_model_requests** | **i32** | The count of requests made to the model. | 
**project_id** | Option<**String**> | When `group_by=project_id`, this field provides the project ID of the grouped usage result. | [optional]
**user_id** | Option<**String**> | When `group_by=user_id`, this field provides the user ID of the grouped usage result. | [optional]
**api_key_id** | Option<**String**> | When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result. | [optional]
**model** | Option<**String**> | When `group_by=model`, this field provides the model name of the grouped usage result. | [optional]
**batch** | Option<**bool**> | When `group_by=batch`, this field tells whether the grouped usage result is batch or not. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


