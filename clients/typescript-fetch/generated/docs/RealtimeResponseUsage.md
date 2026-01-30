
# RealtimeResponseUsage

Usage statistics for the Response, this will correspond to billing. A  Realtime API session will maintain a conversation context and append new  Items to the Conversation, thus output from previous turns (text and  audio tokens) will become the input for later turns. 

## Properties

Name | Type
------------ | -------------
`totalTokens` | number
`inputTokens` | number
`outputTokens` | number
`inputTokenDetails` | [RealtimeResponseUsageInputTokenDetails](RealtimeResponseUsageInputTokenDetails.md)
`outputTokenDetails` | [RealtimeResponseUsageOutputTokenDetails](RealtimeResponseUsageOutputTokenDetails.md)

## Example

```typescript
import type { RealtimeResponseUsage } from ''

// TODO: Update the object below with actual values
const example = {
  "totalTokens": null,
  "inputTokens": null,
  "outputTokens": null,
  "inputTokenDetails": null,
  "outputTokenDetails": null,
} satisfies RealtimeResponseUsage

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RealtimeResponseUsage
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


