
# UsageImagesResult

The aggregated images usage details of the specific time bucket.

## Properties

Name | Type
------------ | -------------
`object` | string
`images` | number
`numModelRequests` | number
`source` | string
`size` | string
`projectId` | string
`userId` | string
`apiKeyId` | string
`model` | string

## Example

```typescript
import type { UsageImagesResult } from ''

// TODO: Update the object below with actual values
const example = {
  "object": null,
  "images": null,
  "numModelRequests": null,
  "source": null,
  "size": null,
  "projectId": null,
  "userId": null,
  "apiKeyId": null,
  "model": null,
} satisfies UsageImagesResult

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as UsageImagesResult
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


