# RealtimeConversationItemContentInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **string** | The content type (&#x60;input_text&#x60;, &#x60;input_audio&#x60;, &#x60;item_reference&#x60;, &#x60;text&#x60;).  | [optional] [default to undefined]
**text** | **string** | The text content, used for &#x60;input_text&#x60; and &#x60;text&#x60; content types.  | [optional] [default to undefined]
**id** | **string** | ID of a previous conversation item to reference (for &#x60;item_reference&#x60; content types in &#x60;response.create&#x60; events). These can reference both client and server created items.  | [optional] [default to undefined]
**audio** | **string** | Base64-encoded audio bytes, used for &#x60;input_audio&#x60; content type.  | [optional] [default to undefined]
**transcript** | **string** | The transcript of the audio, used for &#x60;input_audio&#x60; content type.  | [optional] [default to undefined]

## Example

```typescript
import { RealtimeConversationItemContentInner } from './api';

const instance: RealtimeConversationItemContentInner = {
    type,
    text,
    id,
    audio,
    transcript,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
