# CreateChatCompletionFunctionResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`id`** | **`String`** | A unique identifier for the chat completion. | [default to nothing]
**`choices`** | [**`Vector{CreateChatCompletionFunctionResponseChoicesInner}`**](CreateChatCompletionFunctionResponseChoicesInner.md) | A list of chat completion choices. Can be more than one if &#x60;n&#x60; is greater than 1. | [default to nothing]
**`created`** | **`Int64`** | The Unix timestamp (in seconds) of when the chat completion was created. | [default to nothing]
**`model`** | **`String`** | The model used for the chat completion. | [default to nothing]
**`system_fingerprint`** | **`String`** | This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism.  | [optional] [default to nothing]
**`object`** | **`String`** | The object type, which is always &#x60;chat.completion&#x60;. | [default to nothing]
**`usage`** | [**`*CompletionUsage`**](CompletionUsage.md) |  | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


