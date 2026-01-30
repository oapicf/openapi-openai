
# FineTunePreferenceRequestInput

The per-line training example of a fine-tuning input file for chat models using the dpo method.

## Properties

Name | Type
------------ | -------------
`input` | [FineTunePreferenceRequestInputInput](FineTunePreferenceRequestInputInput.md)
`preferredCompletion` | [Array&lt;FineTunePreferenceRequestInputPreferredCompletionInner&gt;](FineTunePreferenceRequestInputPreferredCompletionInner.md)
`nonPreferredCompletion` | [Array&lt;FineTunePreferenceRequestInputPreferredCompletionInner&gt;](FineTunePreferenceRequestInputPreferredCompletionInner.md)

## Example

```typescript
import type { FineTunePreferenceRequestInput } from ''

// TODO: Update the object below with actual values
const example = {
  "input": null,
  "preferredCompletion": null,
  "nonPreferredCompletion": null,
} satisfies FineTunePreferenceRequestInput

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as FineTunePreferenceRequestInput
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


