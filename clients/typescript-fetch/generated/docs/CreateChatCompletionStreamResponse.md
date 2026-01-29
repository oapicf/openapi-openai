
# CreateChatCompletionStreamResponse

Represents a streamed chunk of a chat completion response returned by model, based on the provided input.

## Properties

Name | Type
------------ | -------------
`id` | string
`choices` | [Array&lt;CreateChatCompletionStreamResponseChoicesInner&gt;](CreateChatCompletionStreamResponseChoicesInner.md)
`created` | number
`model` | string
`systemFingerprint` | string
`object` | string

## Example

```typescript
import type { CreateChatCompletionStreamResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "choices": null,
  "created": null,
  "model": null,
  "systemFingerprint": null,
  "object": null,
} satisfies CreateChatCompletionStreamResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CreateChatCompletionStreamResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


