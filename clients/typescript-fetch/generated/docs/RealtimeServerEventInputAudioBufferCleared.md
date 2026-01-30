
# RealtimeServerEventInputAudioBufferCleared

Returned when the input audio buffer is cleared by the client with a  `input_audio_buffer.clear` event. 

## Properties

Name | Type
------------ | -------------
`eventId` | string
`type` | string

## Example

```typescript
import type { RealtimeServerEventInputAudioBufferCleared } from ''

// TODO: Update the object below with actual values
const example = {
  "eventId": null,
  "type": null,
} satisfies RealtimeServerEventInputAudioBufferCleared

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RealtimeServerEventInputAudioBufferCleared
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


