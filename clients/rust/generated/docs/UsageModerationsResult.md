# UsageModerationsResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **String** |  | 
**input_tokens** | **i32** | The aggregated number of input tokens used. | 
**num_model_requests** | **i32** | The count of requests made to the model. | 
**project_id** | Option<**String**> | When `group_by=project_id`, this field provides the project ID of the grouped usage result. | [optional]
**user_id** | Option<**String**> | When `group_by=user_id`, this field provides the user ID of the grouped usage result. | [optional]
**api_key_id** | Option<**String**> | When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result. | [optional]
**model** | Option<**String**> | When `group_by=model`, this field provides the model name of the grouped usage result. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


