
# CompletionUsage

Usage statistics for the completion request.

## Properties

Name | Type
------------ | -------------
`completionTokens` | number
`promptTokens` | number
`totalTokens` | number
`completionTokensDetails` | [CompletionUsageCompletionTokensDetails](CompletionUsageCompletionTokensDetails.md)
`promptTokensDetails` | [CompletionUsagePromptTokensDetails](CompletionUsagePromptTokensDetails.md)

## Example

```typescript
import type { CompletionUsage } from ''

// TODO: Update the object below with actual values
const example = {
  "completionTokens": null,
  "promptTokens": null,
  "totalTokens": null,
  "completionTokensDetails": null,
  "promptTokensDetails": null,
} satisfies CompletionUsage

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CompletionUsage
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


