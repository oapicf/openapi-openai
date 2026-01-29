
# CreateTranscription200Response


## Properties

Name | Type
------------ | -------------
`text` | string
`language` | string
`duration` | string
`words` | [Array&lt;TranscriptionWord&gt;](TranscriptionWord.md)
`segments` | [Array&lt;TranscriptionSegment&gt;](TranscriptionSegment.md)

## Example

```typescript
import type { CreateTranscription200Response } from ''

// TODO: Update the object below with actual values
const example = {
  "text": null,
  "language": null,
  "duration": null,
  "words": null,
  "segments": null,
} satisfies CreateTranscription200Response

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CreateTranscription200Response
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


