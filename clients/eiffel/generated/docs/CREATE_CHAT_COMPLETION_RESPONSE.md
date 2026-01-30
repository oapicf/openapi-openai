# CREATE_CHAT_COMPLETION_RESPONSE

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**STRING_32**](STRING_32.md) | A unique identifier for the chat completion. | [default to null]
**choices** | [**LIST [CREATE_CHAT_COMPLETION_RESPONSE_CHOICES_INNER]**](CreateChatCompletionResponse_choices_inner.md) | A list of chat completion choices. Can be more than one if &#x60;n&#x60; is greater than 1. | [default to null]
**created** | **INTEGER_32** | The Unix timestamp (in seconds) of when the chat completion was created. | [default to null]
**model** | [**STRING_32**](STRING_32.md) | The model used for the chat completion. | [default to null]
**service_tier** | [**STRING_32**](STRING_32.md) | The service tier used for processing the request. This field is only included if the &#x60;service_tier&#x60; parameter is specified in the request. | [optional] [default to null]
**system_fingerprint** | [**STRING_32**](STRING_32.md) | This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism.  | [optional] [default to null]
**object** | [**STRING_32**](STRING_32.md) | The object type, which is always &#x60;chat.completion&#x60;. | [default to null]
**usage** | [**COMPLETION_USAGE**](CompletionUsage.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


