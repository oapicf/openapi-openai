
# CreateCompletionResponseChoicesInner


## Properties

Name | Type
------------ | -------------
`finishReason` | string
`index` | number
`logprobs` | [CreateCompletionResponseChoicesInnerLogprobs](CreateCompletionResponseChoicesInnerLogprobs.md)
`text` | string

## Example

```typescript
import type { CreateCompletionResponseChoicesInner } from ''

// TODO: Update the object below with actual values
const example = {
  "finishReason": null,
  "index": null,
  "logprobs": null,
  "text": null,
} satisfies CreateCompletionResponseChoicesInner

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CreateCompletionResponseChoicesInner
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


