# CreateChatCompletionStreamResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | A unique identifier for the chat completion. Each chunk has the same ID. | 
**choices** | [**Vec<models::CreateChatCompletionStreamResponseChoicesInner>**](CreateChatCompletionStreamResponse_choices_inner.md) | A list of chat completion choices. Can contain more than one elements if `n` is greater than 1. Can also be empty for the last chunk if you set `stream_options: {\"include_usage\": true}`.  | 
**created** | **i32** | The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp. | 
**model** | **String** | The model to generate the completion. | 
**service_tier** | Option<**String**> | The service tier used for processing the request. This field is only included if the `service_tier` parameter is specified in the request. | [optional]
**system_fingerprint** | Option<**String**> | This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism.  | [optional]
**object** | **String** | The object type, which is always `chat.completion.chunk`. | 
**usage** | Option<[**models::CreateChatCompletionStreamResponseUsage**](CreateChatCompletionStreamResponse_usage.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


