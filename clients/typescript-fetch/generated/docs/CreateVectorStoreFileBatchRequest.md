
# CreateVectorStoreFileBatchRequest


## Properties

Name | Type
------------ | -------------
`fileIds` | Array&lt;string&gt;
`chunkingStrategy` | [ChunkingStrategyRequestParam](ChunkingStrategyRequestParam.md)

## Example

```typescript
import type { CreateVectorStoreFileBatchRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "fileIds": null,
  "chunkingStrategy": null,
} satisfies CreateVectorStoreFileBatchRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CreateVectorStoreFileBatchRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


