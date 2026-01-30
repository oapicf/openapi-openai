
# RealtimeSessionInputAudioTranscription

Configuration for input audio transcription, defaults to off and can be  set to `null` to turn off once on. Input audio transcription is not native  to the model, since the model consumes audio directly. Transcription runs  asynchronously through Whisper and should be treated as rough guidance  rather than the representation understood by the model. 

## Properties

Name | Type
------------ | -------------
`model` | string

## Example

```typescript
import type { RealtimeSessionInputAudioTranscription } from ''

// TODO: Update the object below with actual values
const example = {
  "model": null,
} satisfies RealtimeSessionInputAudioTranscription

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RealtimeSessionInputAudioTranscription
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


