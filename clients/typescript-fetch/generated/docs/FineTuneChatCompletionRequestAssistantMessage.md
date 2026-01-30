
# FineTuneChatCompletionRequestAssistantMessage


## Properties

Name | Type
------------ | -------------
`content` | [ChatCompletionRequestAssistantMessageContent](ChatCompletionRequestAssistantMessageContent.md)
`refusal` | string
`role` | string
`name` | string
`audio` | [ChatCompletionRequestAssistantMessageAudio](ChatCompletionRequestAssistantMessageAudio.md)
`toolCalls` | [Array&lt;ChatCompletionMessageToolCall&gt;](ChatCompletionMessageToolCall.md)
`functionCall` | [ChatCompletionRequestAssistantMessageFunctionCall](ChatCompletionRequestAssistantMessageFunctionCall.md)
`weight` | number

## Example

```typescript
import type { FineTuneChatCompletionRequestAssistantMessage } from ''

// TODO: Update the object below with actual values
const example = {
  "content": null,
  "refusal": null,
  "role": null,
  "name": null,
  "audio": null,
  "toolCalls": null,
  "functionCall": null,
  "weight": null,
} satisfies FineTuneChatCompletionRequestAssistantMessage

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as FineTuneChatCompletionRequestAssistantMessage
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


