
# CreateCompletionResponse

Represents a completion response from the API. Note: both the streamed and non-streamed response objects share the same shape (unlike the chat endpoint). 

## Properties

Name | Type
------------ | -------------
`id` | string
`choices` | [Array&lt;CreateCompletionResponseChoicesInner&gt;](CreateCompletionResponseChoicesInner.md)
`created` | number
`model` | string
`systemFingerprint` | string
`object` | string
`usage` | [CompletionUsage](CompletionUsage.md)

## Example

```typescript
import type { CreateCompletionResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "choices": null,
  "created": null,
  "model": null,
  "systemFingerprint": null,
  "object": null,
  "usage": null,
} satisfies CreateCompletionResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CreateCompletionResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


