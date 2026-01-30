
# UsageTimeBucketResultInner


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
`images` | number
`source` | string
`size` | string
`characters` | number
`seconds` | number
`usageBytes` | number
`sessions` | number
`amount` | [CostsResultAmount](CostsResultAmount.md)
`lineItem` | string

## Example

```typescript
import type { UsageTimeBucketResultInner } from ''

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
  "images": null,
  "source": null,
  "size": null,
  "characters": null,
  "seconds": null,
  "usageBytes": null,
  "sessions": null,
  "amount": null,
  "lineItem": null,
} satisfies UsageTimeBucketResultInner

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as UsageTimeBucketResultInner
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


