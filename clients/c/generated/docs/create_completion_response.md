# create_completion_response_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **char \*** | A unique identifier for the completion. | 
**choices** | [**list_t**](create_completion_response_choices_inner.md) \* | The list of completion choices the model generated for the input prompt. | 
**created** | **int** | The Unix timestamp (in seconds) of when the completion was created. | 
**model** | **char \*** | The model used for completion. | 
**system_fingerprint** | **char \*** | This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism.  | [optional] 
**object** | **openai_api_create_completion_response_OBJECT_e** | The object type, which is always \&quot;text_completion\&quot; | 
**usage** | [**completion_usage_t**](completion_usage.md) \* |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


