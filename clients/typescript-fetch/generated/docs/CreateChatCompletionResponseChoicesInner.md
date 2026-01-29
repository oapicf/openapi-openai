
# CreateChatCompletionResponseChoicesInner


## Properties

Name | Type
------------ | -------------
`finishReason` | string
`index` | number
`message` | [ChatCompletionResponseMessage](ChatCompletionResponseMessage.md)
`logprobs` | [CreateChatCompletionResponseChoicesInnerLogprobs](CreateChatCompletionResponseChoicesInnerLogprobs.md)

## Example

```typescript
import type { CreateChatCompletionResponseChoicesInner } from ''

// TODO: Update the object below with actual values
const example = {
  "finishReason": null,
  "index": null,
  "message": null,
  "logprobs": null,
} satisfies CreateChatCompletionResponseChoicesInner

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CreateChatCompletionResponseChoicesInner
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


