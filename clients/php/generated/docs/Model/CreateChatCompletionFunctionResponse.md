# # CreateChatCompletionFunctionResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | A unique identifier for the chat completion. |
**choices** | [**\OpenAPI\Client\Model\CreateChatCompletionFunctionResponseChoicesInner[]**](CreateChatCompletionFunctionResponseChoicesInner.md) | A list of chat completion choices. Can be more than one if &#x60;n&#x60; is greater than 1. |
**created** | **int** | The Unix timestamp (in seconds) of when the chat completion was created. |
**model** | **string** | The model used for the chat completion. |
**system_fingerprint** | **string** | This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism. | [optional]
**object** | **string** | The object type, which is always &#x60;chat.completion&#x60;. |
**usage** | [**\OpenAPI\Client\Model\CompletionUsage**](CompletionUsage.md) |  | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
