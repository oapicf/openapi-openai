
# ChatCompletionResponseMessageAudio

If the audio output modality is requested, this object contains data about the audio response from the model. [Learn more](/docs/guides/audio). 

## Properties

Name | Type
------------ | -------------
`id` | string
`expiresAt` | number
`data` | string
`transcript` | string

## Example

```typescript
import type { ChatCompletionResponseMessageAudio } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "expiresAt": null,
  "data": null,
  "transcript": null,
} satisfies ChatCompletionResponseMessageAudio

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ChatCompletionResponseMessageAudio
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


