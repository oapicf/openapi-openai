# CreateChatCompletionStreamResponse

Represents a streamed chunk of a chat completion response returned by model, based on the provided input.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | A unique identifier for the chat completion. Each chunk has the same ID. | [default to undefined]
**choices** | [**Array&lt;CreateChatCompletionStreamResponseChoicesInner&gt;**](CreateChatCompletionStreamResponseChoicesInner.md) | A list of chat completion choices. Can be more than one if &#x60;n&#x60; is greater than 1. | [default to undefined]
**created** | **number** | The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp. | [default to undefined]
**model** | **string** | The model to generate the completion. | [default to undefined]
**system_fingerprint** | **string** | This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism.  | [optional] [default to undefined]
**object** | **string** | The object type, which is always &#x60;chat.completion.chunk&#x60;. | [default to undefined]

## Example

```typescript
import { CreateChatCompletionStreamResponse } from './api';

const instance: CreateChatCompletionStreamResponse = {
    id,
    choices,
    created,
    model,
    system_fingerprint,
    object,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
