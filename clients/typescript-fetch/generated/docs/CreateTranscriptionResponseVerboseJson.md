
# CreateTranscriptionResponseVerboseJson

Represents a verbose json transcription response returned by model, based on the provided input.

## Properties

Name | Type
------------ | -------------
`language` | string
`duration` | string
`text` | string
`words` | [Array&lt;TranscriptionWord&gt;](TranscriptionWord.md)
`segments` | [Array&lt;TranscriptionSegment&gt;](TranscriptionSegment.md)

## Example

```typescript
import type { CreateTranscriptionResponseVerboseJson } from ''

// TODO: Update the object below with actual values
const example = {
  "language": null,
  "duration": null,
  "text": null,
  "words": null,
  "segments": null,
} satisfies CreateTranscriptionResponseVerboseJson

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CreateTranscriptionResponseVerboseJson
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


