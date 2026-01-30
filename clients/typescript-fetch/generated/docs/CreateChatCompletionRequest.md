
# CreateChatCompletionRequest


## Properties

Name | Type
------------ | -------------
`messages` | [Array&lt;ChatCompletionRequestMessage&gt;](ChatCompletionRequestMessage.md)
`model` | [CreateChatCompletionRequestModel](CreateChatCompletionRequestModel.md)
`store` | boolean
`reasoningEffort` | string
`metadata` | { [key: string]: string; }
`frequencyPenalty` | number
`logitBias` | { [key: string]: number; }
`logprobs` | boolean
`topLogprobs` | number
`maxTokens` | number
`maxCompletionTokens` | number
`n` | number
`modalities` | Array&lt;string&gt;
`prediction` | [PredictionContent](PredictionContent.md)
`audio` | [CreateChatCompletionRequestAudio](CreateChatCompletionRequestAudio.md)
`presencePenalty` | number
`responseFormat` | [CreateChatCompletionRequestResponseFormat](CreateChatCompletionRequestResponseFormat.md)
`seed` | number
`serviceTier` | string
`stop` | [CreateChatCompletionRequestStop](CreateChatCompletionRequestStop.md)
`stream` | boolean
`streamOptions` | [ChatCompletionStreamOptions](ChatCompletionStreamOptions.md)
`temperature` | number
`topP` | number
`tools` | [Array&lt;ChatCompletionTool&gt;](ChatCompletionTool.md)
`toolChoice` | [ChatCompletionToolChoiceOption](ChatCompletionToolChoiceOption.md)
`parallelToolCalls` | boolean
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
  "store": null,
  "reasoningEffort": null,
  "metadata": null,
  "frequencyPenalty": null,
  "logitBias": null,
  "logprobs": null,
  "topLogprobs": null,
  "maxTokens": null,
  "maxCompletionTokens": null,
  "n": 1,
  "modalities": null,
  "prediction": null,
  "audio": null,
  "presencePenalty": null,
  "responseFormat": null,
  "seed": null,
  "serviceTier": null,
  "stop": null,
  "stream": null,
  "streamOptions": null,
  "temperature": 1,
  "topP": 1,
  "tools": null,
  "toolChoice": null,
  "parallelToolCalls": null,
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


