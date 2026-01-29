
# ChatCompletionRequestMessage


## Properties

Name | Type
------------ | -------------
`content` | string
`role` | string
`name` | string
`toolCalls` | [Array&lt;ChatCompletionMessageToolCall&gt;](ChatCompletionMessageToolCall.md)
`functionCall` | [ChatCompletionRequestAssistantMessageFunctionCall](ChatCompletionRequestAssistantMessageFunctionCall.md)
`toolCallId` | string

## Example

```typescript
import type { ChatCompletionRequestMessage } from ''

// TODO: Update the object below with actual values
const example = {
  "content": null,
  "role": null,
  "name": null,
  "toolCalls": null,
  "functionCall": null,
  "toolCallId": null,
} satisfies ChatCompletionRequestMessage

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ChatCompletionRequestMessage
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


