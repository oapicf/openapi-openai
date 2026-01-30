# RealtimeServerEventResponseContentPartDonePart

The content part that is done.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **string** | The content type (\&quot;text\&quot;, \&quot;audio\&quot;). | [optional] [default to undefined]
**text** | **string** | The text content (if type is \&quot;text\&quot;). | [optional] [default to undefined]
**audio** | **string** | Base64-encoded audio data (if type is \&quot;audio\&quot;). | [optional] [default to undefined]
**transcript** | **string** | The transcript of the audio (if type is \&quot;audio\&quot;). | [optional] [default to undefined]

## Example

```typescript
import { RealtimeServerEventResponseContentPartDonePart } from './api';

const instance: RealtimeServerEventResponseContentPartDonePart = {
    type,
    text,
    audio,
    transcript,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
