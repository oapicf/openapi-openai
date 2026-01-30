
# VectorStoreObject

A vector store is a collection of processed files can be used by the `file_search` tool.

## Properties

Name | Type
------------ | -------------
`id` | string
`object` | string
`createdAt` | number
`name` | string
`usageBytes` | number
`fileCounts` | [VectorStoreObjectFileCounts](VectorStoreObjectFileCounts.md)
`status` | string
`expiresAfter` | [VectorStoreExpirationAfter](VectorStoreExpirationAfter.md)
`expiresAt` | number
`lastActiveAt` | number
`metadata` | object

## Example

```typescript
import type { VectorStoreObject } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "object": null,
  "createdAt": null,
  "name": null,
  "usageBytes": null,
  "fileCounts": null,
  "status": null,
  "expiresAfter": null,
  "expiresAt": null,
  "lastActiveAt": null,
  "metadata": null,
} satisfies VectorStoreObject

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as VectorStoreObject
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


