
# RealtimeServerEventInputAudioBufferSpeechStarted

Sent by the server when in `server_vad` mode to indicate that speech has been  detected in the audio buffer. This can happen any time audio is added to the  buffer (unless speech is already detected). The client may want to use this  event to interrupt audio playback or provide visual feedback to the user.   The client should expect to receive a `input_audio_buffer.speech_stopped` event  when speech stops. The `item_id` property is the ID of the user message item  that will be created when speech stops and will also be included in the  `input_audio_buffer.speech_stopped` event (unless the client manually commits  the audio buffer during VAD activation). 

## Properties

Name | Type
------------ | -------------
`eventId` | string
`type` | string
`audioStartMs` | number
`itemId` | string

## Example

```typescript
import type { RealtimeServerEventInputAudioBufferSpeechStarted } from ''

// TODO: Update the object below with actual values
const example = {
  "eventId": null,
  "type": null,
  "audioStartMs": null,
  "itemId": null,
} satisfies RealtimeServerEventInputAudioBufferSpeechStarted

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RealtimeServerEventInputAudioBufferSpeechStarted
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


