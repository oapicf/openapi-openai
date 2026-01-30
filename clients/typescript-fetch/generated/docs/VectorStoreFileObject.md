
# VectorStoreFileObject

A list of files attached to a vector store.

## Properties

Name | Type
------------ | -------------
`id` | string
`object` | string
`usageBytes` | number
`createdAt` | number
`vectorStoreId` | string
`status` | string
`lastError` | [VectorStoreFileObjectLastError](VectorStoreFileObjectLastError.md)
`chunkingStrategy` | [VectorStoreFileObjectChunkingStrategy](VectorStoreFileObjectChunkingStrategy.md)

## Example

```typescript
import type { VectorStoreFileObject } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "object": null,
  "usageBytes": null,
  "createdAt": null,
  "vectorStoreId": null,
  "status": null,
  "lastError": null,
  "chunkingStrategy": null,
} satisfies VectorStoreFileObject

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as VectorStoreFileObject
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


