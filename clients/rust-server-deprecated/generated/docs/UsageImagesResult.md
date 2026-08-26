# UsageImagesResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | [***models::UsageImagesResultObject**](UsageImagesResult_object.md) |  | 
**images** | **i32** | The number of images processed. | 
**num_model_requests** | **i32** | The count of requests made to the model. | 
**source** | **swagger::Nullable<String>** | When `group_by=source`, this field provides the source of the grouped usage result, possible values are `image.generation`, `image.edit`, `image.variation`. | [optional] [default to None]
**size** | **swagger::Nullable<String>** | When `group_by=size`, this field provides the image size of the grouped usage result. | [optional] [default to None]
**project_id** | **swagger::Nullable<String>** | When `group_by=project_id`, this field provides the project ID of the grouped usage result. | [optional] [default to None]
**user_id** | **swagger::Nullable<String>** | When `group_by=user_id`, this field provides the user ID of the grouped usage result. | [optional] [default to None]
**api_key_id** | **swagger::Nullable<String>** | When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result. | [optional] [default to None]
**model** | **swagger::Nullable<String>** | When `group_by=model`, this field provides the model name of the grouped usage result. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


