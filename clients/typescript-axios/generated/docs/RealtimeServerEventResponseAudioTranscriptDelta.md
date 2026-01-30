# RealtimeServerEventResponseAudioTranscriptDelta

Returned when the model-generated transcription of audio output is updated. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **string** | The unique ID of the server event. | [default to undefined]
**type** | **string** | The event type, must be &#x60;response.audio_transcript.delta&#x60;. | [default to undefined]
**response_id** | **string** | The ID of the response. | [default to undefined]
**item_id** | **string** | The ID of the item. | [default to undefined]
**output_index** | **number** | The index of the output item in the response. | [default to undefined]
**content_index** | **number** | The index of the content part in the item\&#39;s content array. | [default to undefined]
**delta** | **string** | The transcript delta. | [default to undefined]

## Example

```typescript
import { RealtimeServerEventResponseAudioTranscriptDelta } from './api';

const instance: RealtimeServerEventResponseAudioTranscriptDelta = {
    event_id,
    type,
    response_id,
    item_id,
    output_index,
    content_index,
    delta,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
