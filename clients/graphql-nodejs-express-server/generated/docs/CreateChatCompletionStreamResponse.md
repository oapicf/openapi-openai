# CreateChatCompletionStreamResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id_** | **String!** | A unique identifier for the chat completion. Each chunk has the same ID. | [default to null]
**choices** | [**CreateChatCompletionStreamResponseChoicesInner**](CreateChatCompletionStreamResponse_choices_inner.md) | A list of chat completion choices. Can be more than one if &#x60;n&#x60; is greater than 1. | [default to null]
**created** | **Int!** | The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp. | [default to null]
**model** | **String!** | The model to generate the completion. | [default to null]
**systemFingerprint** | **String!** | This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism.  | [optional] [default to null]
**object** | **String!** | The object type, which is always &#x60;chat.completion.chunk&#x60;. | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


