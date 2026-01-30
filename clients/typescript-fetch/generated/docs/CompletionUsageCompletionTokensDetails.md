
# CompletionUsageCompletionTokensDetails

Breakdown of tokens used in a completion.

## Properties

Name | Type
------------ | -------------
`acceptedPredictionTokens` | number
`audioTokens` | number
`reasoningTokens` | number
`rejectedPredictionTokens` | number

## Example

```typescript
import type { CompletionUsageCompletionTokensDetails } from ''

// TODO: Update the object below with actual values
const example = {
  "acceptedPredictionTokens": null,
  "audioTokens": null,
  "reasoningTokens": null,
  "rejectedPredictionTokens": null,
} satisfies CompletionUsageCompletionTokensDetails

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CompletionUsageCompletionTokensDetails
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


