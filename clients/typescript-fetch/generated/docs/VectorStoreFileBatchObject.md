
# VectorStoreFileBatchObject

A batch of files attached to a vector store.

## Properties

Name | Type
------------ | -------------
`id` | string
`object` | string
`createdAt` | number
`vectorStoreId` | string
`status` | string
`fileCounts` | [VectorStoreFileBatchObjectFileCounts](VectorStoreFileBatchObjectFileCounts.md)

## Example

```typescript
import type { VectorStoreFileBatchObject } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "object": null,
  "createdAt": null,
  "vectorStoreId": null,
  "status": null,
  "fileCounts": null,
} satisfies VectorStoreFileBatchObject

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as VectorStoreFileBatchObject
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


