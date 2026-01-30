
# UsageAudioTranscriptionsResult

The aggregated audio transcriptions usage details of the specific time bucket.

## Properties

Name | Type
------------ | -------------
`object` | string
`seconds` | number
`numModelRequests` | number
`projectId` | string
`userId` | string
`apiKeyId` | string
`model` | string

## Example

```typescript
import type { UsageAudioTranscriptionsResult } from ''

// TODO: Update the object below with actual values
const example = {
  "object": null,
  "seconds": null,
  "numModelRequests": null,
  "projectId": null,
  "userId": null,
  "apiKeyId": null,
  "model": null,
} satisfies UsageAudioTranscriptionsResult

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as UsageAudioTranscriptionsResult
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


