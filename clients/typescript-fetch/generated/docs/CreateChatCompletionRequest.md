
# CreateChatCompletionRequest


## Properties

Name | Type
------------ | -------------
`messages` | [Array&lt;ChatCompletionRequestMessage&gt;](ChatCompletionRequestMessage.md)
`model` | [CreateChatCompletionRequestModel](CreateChatCompletionRequestModel.md)
`frequencyPenalty` | number
`logitBias` | { [key: string]: number; }
`logprobs` | boolean
`topLogprobs` | number
`maxTokens` | number
`n` | number
`presencePenalty` | number
`responseFormat` | [CreateChatCompletionRequestResponseFormat](CreateChatCompletionRequestResponseFormat.md)
`seed` | number
`stop` | [CreateChatCompletionRequestStop](CreateChatCompletionRequestStop.md)
`stream` | boolean
`temperature` | number
`topP` | number
`tools` | [Array&lt;ChatCompletionTool&gt;](ChatCompletionTool.md)
`toolChoice` | [ChatCompletionToolChoiceOption](ChatCompletionToolChoiceOption.md)
`user` | string
`functionCall` | [CreateChatCompletionRequestFunctionCall](CreateChatCompletionRequestFunctionCall.md)
`functions` | [Array&lt;ChatCompletionFunctions&gt;](ChatCompletionFunctions.md)

## Example

```typescript
import type { CreateChatCompletionRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "messages": null,
  "model": null,
  "frequencyPenalty": null,
  "logitBias": null,
  "logprobs": null,
  "topLogprobs": null,
  "maxTokens": null,
  "n": 1,
  "presencePenalty": null,
  "responseFormat": null,
  "seed": null,
  "stop": null,
  "stream": null,
  "temperature": 1,
  "topP": 1,
  "tools": null,
  "toolChoice": null,
  "user": user-1234,
  "functionCall": null,
  "functions": null,
} satisfies CreateChatCompletionRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CreateChatCompletionRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


