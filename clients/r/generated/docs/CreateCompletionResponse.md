# openapi::CreateCompletionResponse

Represents a completion response from the API. Note: both the streamed and non-streamed response objects share the same shape (unlike the chat endpoint). 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **character** | A unique identifier for the completion. | 
**choices** | [**array[CreateCompletionResponseChoicesInner]**](CreateCompletionResponse_choices_inner.md) | The list of completion choices the model generated for the input prompt. | 
**created** | **integer** | The Unix timestamp (in seconds) of when the completion was created. | 
**model** | **character** | The model used for completion. | 
**system_fingerprint** | **character** | This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism.  | [optional] 
**object** | **character** | The object type, which is always \&quot;text_completion\&quot; | [Enum: [text_completion]] 
**usage** | [**CompletionUsage**](CompletionUsage.md) |  | [optional] 


