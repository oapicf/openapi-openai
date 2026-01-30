
# RealtimeServerEventInputAudioBufferSpeechStopped

Returned in `server_vad` mode when the server detects the end of speech in  the audio buffer. The server will also send an `conversation.item.created`  event with the user message item that is created from the audio buffer. 

## Properties

Name | Type
------------ | -------------
`eventId` | string
`type` | string
`audioEndMs` | number
`itemId` | string

## Example

```typescript
import type { RealtimeServerEventInputAudioBufferSpeechStopped } from ''

// TODO: Update the object below with actual values
const example = {
  "eventId": null,
  "type": null,
  "audioEndMs": null,
  "itemId": null,
} satisfies RealtimeServerEventInputAudioBufferSpeechStopped

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RealtimeServerEventInputAudioBufferSpeechStopped
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


