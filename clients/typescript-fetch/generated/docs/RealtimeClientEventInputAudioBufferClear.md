
# RealtimeClientEventInputAudioBufferClear

Send this event to clear the audio bytes in the buffer. The server will  respond with an `input_audio_buffer.cleared` event. 

## Properties

Name | Type
------------ | -------------
`eventId` | string
`type` | string

## Example

```typescript
import type { RealtimeClientEventInputAudioBufferClear } from ''

// TODO: Update the object below with actual values
const example = {
  "eventId": null,
  "type": null,
} satisfies RealtimeClientEventInputAudioBufferClear

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RealtimeClientEventInputAudioBufferClear
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


