
# RunCompletionUsage

Usage statistics related to the run. This value will be `null` if the run is not in a terminal state (i.e. `in_progress`, `queued`, etc.).

## Properties

Name | Type
------------ | -------------
`completionTokens` | number
`promptTokens` | number
`totalTokens` | number

## Example

```typescript
import type { RunCompletionUsage } from ''

// TODO: Update the object below with actual values
const example = {
  "completionTokens": null,
  "promptTokens": null,
  "totalTokens": null,
} satisfies RunCompletionUsage

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RunCompletionUsage
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


