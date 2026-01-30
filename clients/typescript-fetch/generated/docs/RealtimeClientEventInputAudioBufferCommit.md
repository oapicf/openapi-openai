
# RealtimeClientEventInputAudioBufferCommit

Send this event to commit the user input audio buffer, which will create a  new user message item in the conversation. This event will produce an error  if the input audio buffer is empty. When in Server VAD mode, the client does  not need to send this event, the server will commit the audio buffer  automatically.  Committing the input audio buffer will trigger input audio transcription  (if enabled in session configuration), but it will not create a response  from the model. The server will respond with an `input_audio_buffer.committed`  event. 

## Properties

Name | Type
------------ | -------------
`eventId` | string
`type` | string

## Example

```typescript
import type { RealtimeClientEventInputAudioBufferCommit } from ''

// TODO: Update the object below with actual values
const example = {
  "eventId": null,
  "type": null,
} satisfies RealtimeClientEventInputAudioBufferCommit

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RealtimeClientEventInputAudioBufferCommit
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


