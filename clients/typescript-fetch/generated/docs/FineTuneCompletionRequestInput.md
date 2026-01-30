
# FineTuneCompletionRequestInput

The per-line training example of a fine-tuning input file for completions models

## Properties

Name | Type
------------ | -------------
`prompt` | string
`completion` | string

## Example

```typescript
import type { FineTuneCompletionRequestInput } from ''

// TODO: Update the object below with actual values
const example = {
  "prompt": null,
  "completion": null,
} satisfies FineTuneCompletionRequestInput

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as FineTuneCompletionRequestInput
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


