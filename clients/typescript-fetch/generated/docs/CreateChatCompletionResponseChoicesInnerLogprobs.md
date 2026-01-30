
# CreateChatCompletionResponseChoicesInnerLogprobs

Log probability information for the choice.

## Properties

Name | Type
------------ | -------------
`content` | [Array&lt;ChatCompletionTokenLogprob&gt;](ChatCompletionTokenLogprob.md)
`refusal` | [Array&lt;ChatCompletionTokenLogprob&gt;](ChatCompletionTokenLogprob.md)

## Example

```typescript
import type { CreateChatCompletionResponseChoicesInnerLogprobs } from ''

// TODO: Update the object below with actual values
const example = {
  "content": null,
  "refusal": null,
} satisfies CreateChatCompletionResponseChoicesInnerLogprobs

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CreateChatCompletionResponseChoicesInnerLogprobs
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


