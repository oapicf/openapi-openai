
# RealtimeClientEventInputAudioBufferAppend

Send this event to append audio bytes to the input audio buffer. The audio  buffer is temporary storage you can write to and later commit. In Server VAD  mode, the audio buffer is used to detect speech and the server will decide  when to commit. When Server VAD is disabled, you must commit the audio buffer manually.  The client may choose how much audio to place in each event up to a maximum  of 15 MiB, for example streaming smaller chunks from the client may allow the  VAD to be more responsive. Unlike made other client events, the server will  not send a confirmation response to this event. 

## Properties

Name | Type
------------ | -------------
`eventId` | string
`type` | string
`audio` | string

## Example

```typescript
import type { RealtimeClientEventInputAudioBufferAppend } from ''

// TODO: Update the object below with actual values
const example = {
  "eventId": null,
  "type": null,
  "audio": null,
} satisfies RealtimeClientEventInputAudioBufferAppend

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RealtimeClientEventInputAudioBufferAppend
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


