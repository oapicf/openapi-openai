# CreateChatCompletionResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | A unique identifier for the chat completion. | 
**choices** | [**Vec<models::CreateChatCompletionResponseChoicesInner>**](CreateChatCompletionResponse_choices_inner.md) | A list of chat completion choices. Can be more than one if `n` is greater than 1. | 
**created** | **i32** | The Unix timestamp (in seconds) of when the chat completion was created. | 
**model** | **String** | The model used for the chat completion. | 
**service_tier** | Option<**String**> | The service tier used for processing the request. This field is only included if the `service_tier` parameter is specified in the request. | [optional]
**system_fingerprint** | Option<**String**> | This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism.  | [optional]
**object** | **String** | The object type, which is always `chat.completion`. | 
**usage** | Option<[**models::CompletionUsage**](CompletionUsage.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


