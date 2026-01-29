
# CreateCompletionRequest


## Properties

Name | Type
------------ | -------------
`model` | [CreateCompletionRequestModel](CreateCompletionRequestModel.md)
`prompt` | [CreateCompletionRequestPrompt](CreateCompletionRequestPrompt.md)
`bestOf` | number
`echo` | boolean
`frequencyPenalty` | number
`logitBias` | { [key: string]: number; }
`logprobs` | number
`maxTokens` | number
`n` | number
`presencePenalty` | number
`seed` | number
`stop` | [CreateCompletionRequestStop](CreateCompletionRequestStop.md)
`stream` | boolean
`suffix` | string
`temperature` | number
`topP` | number
`user` | string

## Example

```typescript
import type { CreateCompletionRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "model": null,
  "prompt": null,
  "bestOf": null,
  "echo": null,
  "frequencyPenalty": null,
  "logitBias": null,
  "logprobs": null,
  "maxTokens": 16,
  "n": 1,
  "presencePenalty": null,
  "seed": null,
  "stop": null,
  "stream": null,
  "suffix": test.,
  "temperature": 1,
  "topP": 1,
  "user": user-1234,
} satisfies CreateCompletionRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CreateCompletionRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


