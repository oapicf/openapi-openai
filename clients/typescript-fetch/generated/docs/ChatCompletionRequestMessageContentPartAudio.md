
# ChatCompletionRequestMessageContentPartAudio

Learn about [audio inputs](/docs/guides/audio). 

## Properties

Name | Type
------------ | -------------
`type` | string
`inputAudio` | [ChatCompletionRequestMessageContentPartAudioInputAudio](ChatCompletionRequestMessageContentPartAudioInputAudio.md)

## Example

```typescript
import type { ChatCompletionRequestMessageContentPartAudio } from ''

// TODO: Update the object below with actual values
const example = {
  "type": null,
  "inputAudio": null,
} satisfies ChatCompletionRequestMessageContentPartAudio

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ChatCompletionRequestMessageContentPartAudio
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


