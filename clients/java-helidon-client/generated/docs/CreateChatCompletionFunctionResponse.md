

# CreateChatCompletionFunctionResponse

Represents a chat completion response returned by model, based on the provided input.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A unique identifier for the chat completion. |  |
|**choices** | [**List&lt;CreateChatCompletionFunctionResponseChoicesInner&gt;**](CreateChatCompletionFunctionResponseChoicesInner.md) | A list of chat completion choices. Can be more than one if &#x60;n&#x60; is greater than 1. |  |
|**created** | **Integer** | The Unix timestamp (in seconds) of when the chat completion was created. |  |
|**model** | **String** | The model used for the chat completion. |  |
|**systemFingerprint** | **String** | This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism.  |  [optional] |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The object type, which is always &#x60;chat.completion&#x60;. |  |
|**usage** | [**CompletionUsage**](CompletionUsage.md) |  |  [optional] |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| CHAT_COMPLETION | &quot;chat.completion&quot; |



