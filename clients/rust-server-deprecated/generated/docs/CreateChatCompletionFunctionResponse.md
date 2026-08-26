# CreateChatCompletionFunctionResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | A unique identifier for the chat completion. | 
**choices** | [**Vec<models::CreateChatCompletionFunctionResponseChoicesInner>**](CreateChatCompletionFunctionResponse_choices_inner.md) | A list of chat completion choices. Can be more than one if `n` is greater than 1. | 
**created** | **i32** | The Unix timestamp (in seconds) of when the chat completion was created. | 
**model** | **String** | The model used for the chat completion. | 
**system_fingerprint** | **String** | This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism.  | [optional] [default to None]
**object** | [***models::CreateChatCompletionFunctionResponseObject**](CreateChatCompletionFunctionResponse_object.md) |  | 
**usage** | [***models::CompletionUsage**](CompletionUsage.md) |  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


