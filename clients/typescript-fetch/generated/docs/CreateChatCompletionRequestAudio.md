
# CreateChatCompletionRequestAudio

Parameters for audio output. Required when audio output is requested with `modalities: [\"audio\"]`. [Learn more](/docs/guides/audio). 

## Properties

Name | Type
------------ | -------------
`voice` | string
`format` | string

## Example

```typescript
import type { CreateChatCompletionRequestAudio } from ''

// TODO: Update the object below with actual values
const example = {
  "voice": null,
  "format": null,
} satisfies CreateChatCompletionRequestAudio

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CreateChatCompletionRequestAudio
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


