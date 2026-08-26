# UsageAudioTranscriptionsResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | [***models::UsageAudioTranscriptionsResultObject**](UsageAudioTranscriptionsResult_object.md) |  | 
**seconds** | **i32** | The number of seconds processed. | 
**num_model_requests** | **i32** | The count of requests made to the model. | 
**project_id** | **swagger::Nullable<String>** | When `group_by=project_id`, this field provides the project ID of the grouped usage result. | [optional] [default to None]
**user_id** | **swagger::Nullable<String>** | When `group_by=user_id`, this field provides the user ID of the grouped usage result. | [optional] [default to None]
**api_key_id** | **swagger::Nullable<String>** | When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result. | [optional] [default to None]
**model** | **swagger::Nullable<String>** | When `group_by=model`, this field provides the model name of the grouped usage result. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


