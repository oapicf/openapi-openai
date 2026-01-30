# CreateChatCompletionResponse

Represents a chat completion response returned by model, based on the provided input.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | A unique identifier for the chat completion. | [default to undefined]
**choices** | [**Array&lt;CreateChatCompletionResponseChoicesInner&gt;**](CreateChatCompletionResponseChoicesInner.md) | A list of chat completion choices. Can be more than one if &#x60;n&#x60; is greater than 1. | [default to undefined]
**created** | **number** | The Unix timestamp (in seconds) of when the chat completion was created. | [default to undefined]
**model** | **string** | The model used for the chat completion. | [default to undefined]
**service_tier** | **string** | The service tier used for processing the request. This field is only included if the &#x60;service_tier&#x60; parameter is specified in the request. | [optional] [default to undefined]
**system_fingerprint** | **string** | This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism.  | [optional] [default to undefined]
**object** | **string** | The object type, which is always &#x60;chat.completion&#x60;. | [default to undefined]
**usage** | [**CompletionUsage**](CompletionUsage.md) |  | [optional] [default to undefined]

## Example

```typescript
import { CreateChatCompletionResponse } from './api';

const instance: CreateChatCompletionResponse = {
    id,
    choices,
    created,
    model,
    service_tier,
    system_fingerprint,
    object,
    usage,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
