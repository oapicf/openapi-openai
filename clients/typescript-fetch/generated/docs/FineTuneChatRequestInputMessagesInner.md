
# FineTuneChatRequestInputMessagesInner


## Properties

Name | Type
------------ | -------------
`content` | string
`role` | string
`name` | string
`weight` | number
`refusal` | string
`audio` | [ChatCompletionRequestAssistantMessageAudio](ChatCompletionRequestAssistantMessageAudio.md)
`toolCalls` | [Array&lt;ChatCompletionMessageToolCall&gt;](ChatCompletionMessageToolCall.md)
`functionCall` | [ChatCompletionRequestAssistantMessageFunctionCall](ChatCompletionRequestAssistantMessageFunctionCall.md)
`toolCallId` | string

## Example

```typescript
import type { FineTuneChatRequestInputMessagesInner } from ''

// TODO: Update the object below with actual values
const example = {
  "content": null,
  "role": null,
  "name": null,
  "weight": null,
  "refusal": null,
  "audio": null,
  "toolCalls": null,
  "functionCall": null,
  "toolCallId": null,
} satisfies FineTuneChatRequestInputMessagesInner

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as FineTuneChatRequestInputMessagesInner
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


