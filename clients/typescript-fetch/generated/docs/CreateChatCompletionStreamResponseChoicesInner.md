
# CreateChatCompletionStreamResponseChoicesInner


## Properties

Name | Type
------------ | -------------
`delta` | [ChatCompletionStreamResponseDelta](ChatCompletionStreamResponseDelta.md)
`logprobs` | [CreateChatCompletionResponseChoicesInnerLogprobs](CreateChatCompletionResponseChoicesInnerLogprobs.md)
`finishReason` | string
`index` | number

## Example

```typescript
import type { CreateChatCompletionStreamResponseChoicesInner } from ''

// TODO: Update the object below with actual values
const example = {
  "delta": null,
  "logprobs": null,
  "finishReason": null,
  "index": null,
} satisfies CreateChatCompletionStreamResponseChoicesInner

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CreateChatCompletionStreamResponseChoicesInner
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


