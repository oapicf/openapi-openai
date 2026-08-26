# UsageModerationsResult


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`object`** | **`String`** |  | [default to nothing]
**`input_tokens`** | **`Int64`** | The aggregated number of input tokens used. | [default to nothing]
**`num_model_requests`** | **`Int64`** | The count of requests made to the model. | [default to nothing]
**`project_id`** | **`String`** | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result. | [optional] [default to nothing]
**`user_id`** | **`String`** | When &#x60;group_by&#x3D;user_id&#x60;, this field provides the user ID of the grouped usage result. | [optional] [default to nothing]
**`api_key_id`** | **`String`** | When &#x60;group_by&#x3D;api_key_id&#x60;, this field provides the API key ID of the grouped usage result. | [optional] [default to nothing]
**`model`** | **`String`** | When &#x60;group_by&#x3D;model&#x60;, this field provides the model name of the grouped usage result. | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


