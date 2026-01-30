
# ChatCompletionRequestToolMessage


## Properties

Name | Type
------------ | -------------
`role` | string
`content` | [ChatCompletionRequestToolMessageContent](ChatCompletionRequestToolMessageContent.md)
`toolCallId` | string

## Example

```typescript
import type { ChatCompletionRequestToolMessage } from ''

// TODO: Update the object below with actual values
const example = {
  "role": null,
  "content": null,
  "toolCallId": null,
} satisfies ChatCompletionRequestToolMessage

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ChatCompletionRequestToolMessage
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


