
# RealtimeResponseUsageInputTokenDetails

Details about the input tokens used in the Response.

## Properties

Name | Type
------------ | -------------
`cachedTokens` | number
`textTokens` | number
`audioTokens` | number

## Example

```typescript
import type { RealtimeResponseUsageInputTokenDetails } from ''

// TODO: Update the object below with actual values
const example = {
  "cachedTokens": null,
  "textTokens": null,
  "audioTokens": null,
} satisfies RealtimeResponseUsageInputTokenDetails

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RealtimeResponseUsageInputTokenDetails
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


