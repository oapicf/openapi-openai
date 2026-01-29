# CreateCompletionResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | A unique identifier for the completion. | 
**choices** | [**Vec<models::CreateCompletionResponseChoicesInner>**](CreateCompletionResponse_choices_inner.md) | The list of completion choices the model generated for the input prompt. | 
**created** | **i32** | The Unix timestamp (in seconds) of when the completion was created. | 
**model** | **String** | The model used for completion. | 
**system_fingerprint** | Option<**String**> | This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism.  | [optional]
**object** | **String** | The object type, which is always \"text_completion\" | 
**usage** | Option<[**models::CompletionUsage**](CompletionUsage.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


