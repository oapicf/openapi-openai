
# ChatCompletionRequestUserMessageContentPart


## Properties

Name | Type
------------ | -------------
`type` | string
`text` | string
`imageUrl` | [ChatCompletionRequestMessageContentPartImageImageUrl](ChatCompletionRequestMessageContentPartImageImageUrl.md)
`inputAudio` | [ChatCompletionRequestMessageContentPartAudioInputAudio](ChatCompletionRequestMessageContentPartAudioInputAudio.md)

## Example

```typescript
import type { ChatCompletionRequestUserMessageContentPart } from ''

// TODO: Update the object below with actual values
const example = {
  "type": null,
  "text": null,
  "imageUrl": null,
  "inputAudio": null,
} satisfies ChatCompletionRequestUserMessageContentPart

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ChatCompletionRequestUserMessageContentPart
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


