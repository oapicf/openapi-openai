
# CreateTranslationResponseVerboseJson


## Properties

Name | Type
------------ | -------------
`language` | string
`duration` | string
`text` | string
`segments` | [Array&lt;TranscriptionSegment&gt;](TranscriptionSegment.md)

## Example

```typescript
import type { CreateTranslationResponseVerboseJson } from ''

// TODO: Update the object below with actual values
const example = {
  "language": null,
  "duration": null,
  "text": null,
  "segments": null,
} satisfies CreateTranslationResponseVerboseJson

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CreateTranslationResponseVerboseJson
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


