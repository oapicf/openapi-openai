
# CreateChatCompletionFunctionResponse

Represents a chat completion response returned by model, based on the provided input.

## Properties

Name | Type
------------ | -------------
`id` | string
`choices` | [Array&lt;CreateChatCompletionFunctionResponseChoicesInner&gt;](CreateChatCompletionFunctionResponseChoicesInner.md)
`created` | number
`model` | string
`systemFingerprint` | string
`object` | string
`usage` | [CompletionUsage](CompletionUsage.md)

## Example

```typescript
import type { CreateChatCompletionFunctionResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "choices": null,
  "created": null,
  "model": null,
  "systemFingerprint": null,
  "object": null,
  "usage": null,
} satisfies CreateChatCompletionFunctionResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CreateChatCompletionFunctionResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


