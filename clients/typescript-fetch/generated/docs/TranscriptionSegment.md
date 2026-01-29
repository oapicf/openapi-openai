
# TranscriptionSegment


## Properties

Name | Type
------------ | -------------
`id` | number
`seek` | number
`start` | number
`end` | number
`text` | string
`tokens` | Array&lt;number&gt;
`temperature` | number
`avgLogprob` | number
`compressionRatio` | number
`noSpeechProb` | number

## Example

```typescript
import type { TranscriptionSegment } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "seek": null,
  "start": null,
  "end": null,
  "text": null,
  "tokens": null,
  "temperature": null,
  "avgLogprob": null,
  "compressionRatio": null,
  "noSpeechProb": null,
} satisfies TranscriptionSegment

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as TranscriptionSegment
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


