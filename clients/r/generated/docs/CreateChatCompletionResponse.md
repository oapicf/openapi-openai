# openapi::CreateChatCompletionResponse

Represents a chat completion response returned by model, based on the provided input.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **character** | A unique identifier for the chat completion. | 
**choices** | [**array[CreateChatCompletionResponseChoicesInner]**](CreateChatCompletionResponse_choices_inner.md) | A list of chat completion choices. Can be more than one if &#x60;n&#x60; is greater than 1. | 
**created** | **integer** | The Unix timestamp (in seconds) of when the chat completion was created. | 
**model** | **character** | The model used for the chat completion. | 
**system_fingerprint** | **character** | This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism.  | [optional] 
**object** | **character** | The object type, which is always &#x60;chat.completion&#x60;. | [Enum: [chat.completion]] 
**usage** | [**CompletionUsage**](CompletionUsage.md) |  | [optional] 


