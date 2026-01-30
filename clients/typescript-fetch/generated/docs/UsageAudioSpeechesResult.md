
# UsageAudioSpeechesResult

The aggregated audio speeches usage details of the specific time bucket.

## Properties

Name | Type
------------ | -------------
`object` | string
`characters` | number
`numModelRequests` | number
`projectId` | string
`userId` | string
`apiKeyId` | string
`model` | string

## Example

```typescript
import type { UsageAudioSpeechesResult } from ''

// TODO: Update the object below with actual values
const example = {
  "object": null,
  "characters": null,
  "numModelRequests": null,
  "projectId": null,
  "userId": null,
  "apiKeyId": null,
  "model": null,
} satisfies UsageAudioSpeechesResult

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as UsageAudioSpeechesResult
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


