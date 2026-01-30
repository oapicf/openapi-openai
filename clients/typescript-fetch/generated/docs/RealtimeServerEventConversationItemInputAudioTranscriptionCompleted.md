
# RealtimeServerEventConversationItemInputAudioTranscriptionCompleted

This event is the output of audio transcription for user audio written to the  user audio buffer. Transcription begins when the input audio buffer is  committed by the client or server (in `server_vad` mode). Transcription runs  asynchronously with Response creation, so this event may come before or after  the Response events.  Realtime API models accept audio natively, and thus input transcription is a  separate process run on a separate ASR (Automatic Speech Recognition) model,  currently always `whisper-1`. Thus the transcript may diverge somewhat from  the model\'s interpretation, and should be treated as a rough guide. 

## Properties

Name | Type
------------ | -------------
`eventId` | string
`type` | string
`itemId` | string
`contentIndex` | number
`transcript` | string

## Example

```typescript
import type { RealtimeServerEventConversationItemInputAudioTranscriptionCompleted } from ''

// TODO: Update the object below with actual values
const example = {
  "eventId": null,
  "type": null,
  "itemId": null,
  "contentIndex": null,
  "transcript": null,
} satisfies RealtimeServerEventConversationItemInputAudioTranscriptionCompleted

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RealtimeServerEventConversationItemInputAudioTranscriptionCompleted
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


