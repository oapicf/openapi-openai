
# UsageCompletionsResult

The aggregated completions usage details of the specific time bucket.

## Properties

Name | Type
------------ | -------------
`object` | string
`inputTokens` | number
`inputCachedTokens` | number
`outputTokens` | number
`inputAudioTokens` | number
`outputAudioTokens` | number
`numModelRequests` | number
`projectId` | string
`userId` | string
`apiKeyId` | string
`model` | string
`batch` | boolean

## Example

```typescript
import type { UsageCompletionsResult } from ''

// TODO: Update the object below with actual values
const example = {
  "object": null,
  "inputTokens": null,
  "inputCachedTokens": null,
  "outputTokens": null,
  "inputAudioTokens": null,
  "outputAudioTokens": null,
  "numModelRequests": null,
  "projectId": null,
  "userId": null,
  "apiKeyId": null,
  "model": null,
  "batch": null,
} satisfies UsageCompletionsResult

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as UsageCompletionsResult
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


