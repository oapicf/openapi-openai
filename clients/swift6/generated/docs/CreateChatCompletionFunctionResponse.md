# CreateChatCompletionFunctionResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | A unique identifier for the chat completion. | 
**choices** | [CreateChatCompletionFunctionResponseChoicesInner] | A list of chat completion choices. Can be more than one if &#x60;n&#x60; is greater than 1. | 
**created** | **Int** | The Unix timestamp (in seconds) of when the chat completion was created. | 
**model** | **String** | The model used for the chat completion. | 
**systemFingerprint** | **String** | This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism.  | [optional] 
**object** | **String** | The object type, which is always &#x60;chat.completion&#x60;. | 
**usage** | [**CompletionUsage**](CompletionUsage.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


