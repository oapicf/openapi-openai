
# CreateCompletionResponseChoicesInnerLogprobs


## Properties

Name | Type
------------ | -------------
`textOffset` | Array&lt;number&gt;
`tokenLogprobs` | Array&lt;number&gt;
`tokens` | Array&lt;string&gt;
`topLogprobs` | Array&lt;{ [key: string]: number; }&gt;

## Example

```typescript
import type { CreateCompletionResponseChoicesInnerLogprobs } from ''

// TODO: Update the object below with actual values
const example = {
  "textOffset": null,
  "tokenLogprobs": null,
  "tokens": null,
  "topLogprobs": null,
} satisfies CreateCompletionResponseChoicesInnerLogprobs

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CreateCompletionResponseChoicesInnerLogprobs
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


