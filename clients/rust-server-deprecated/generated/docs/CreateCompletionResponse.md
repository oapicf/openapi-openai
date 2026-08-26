# CreateCompletionResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | A unique identifier for the completion. | 
**choices** | [**Vec<models::CreateCompletionResponseChoicesInner>**](CreateCompletionResponse_choices_inner.md) | The list of completion choices the model generated for the input prompt. | 
**created** | **i32** | The Unix timestamp (in seconds) of when the completion was created. | 
**model** | **String** | The model used for completion. | 
**system_fingerprint** | **String** | This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism.  | [optional] [default to None]
**object** | [***models::CreateCompletionResponseObject**](CreateCompletionResponse_object.md) |  | 
**usage** | [***models::CompletionUsage**](CompletionUsage.md) |  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


