# CreateCompletionResponse

Represents a completion response from the API. Note: both the streamed and non-streamed response objects share the same shape (unlike the chat endpoint). 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | A unique identifier for the completion. | [default to undefined]
**choices** | [**Array&lt;CreateCompletionResponseChoicesInner&gt;**](CreateCompletionResponseChoicesInner.md) | The list of completion choices the model generated for the input prompt. | [default to undefined]
**created** | **number** | The Unix timestamp (in seconds) of when the completion was created. | [default to undefined]
**model** | **string** | The model used for completion. | [default to undefined]
**system_fingerprint** | **string** | This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism.  | [optional] [default to undefined]
**object** | **string** | The object type, which is always \&quot;text_completion\&quot; | [default to undefined]
**usage** | [**CompletionUsage**](CompletionUsage.md) |  | [optional] [default to undefined]

## Example

```typescript
import { CreateCompletionResponse } from './api';

const instance: CreateCompletionResponse = {
    id,
    choices,
    created,
    model,
    system_fingerprint,
    object,
    usage,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
