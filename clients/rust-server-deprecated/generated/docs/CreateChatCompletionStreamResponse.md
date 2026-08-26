# CreateChatCompletionStreamResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | A unique identifier for the chat completion. Each chunk has the same ID. | 
**choices** | [**Vec<models::CreateChatCompletionStreamResponseChoicesInner>**](CreateChatCompletionStreamResponse_choices_inner.md) | A list of chat completion choices. Can contain more than one elements if `n` is greater than 1. Can also be empty for the last chunk if you set `stream_options: {\"include_usage\": true}`.  | 
**created** | **i32** | The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp. | 
**model** | **String** | The model to generate the completion. | 
**service_tier** | [***swagger::Nullable<models::CreateChatCompletionResponseServiceTier>**](CreateChatCompletionResponse_service_tier.md) |  | [optional] [default to None]
**system_fingerprint** | **String** | This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism.  | [optional] [default to None]
**object** | [***models::CreateChatCompletionStreamResponseObject**](CreateChatCompletionStreamResponse_object.md) |  | 
**usage** | [***swagger::Nullable<models::CreateChatCompletionStreamResponseUsage>**](CreateChatCompletionStreamResponse_usage.md) |  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


