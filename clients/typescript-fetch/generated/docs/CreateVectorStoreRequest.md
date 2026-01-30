
# CreateVectorStoreRequest


## Properties

Name | Type
------------ | -------------
`fileIds` | Array&lt;string&gt;
`name` | string
`expiresAfter` | [VectorStoreExpirationAfter](VectorStoreExpirationAfter.md)
`chunkingStrategy` | [CreateVectorStoreRequestChunkingStrategy](CreateVectorStoreRequestChunkingStrategy.md)
`metadata` | object

## Example

```typescript
import type { CreateVectorStoreRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "fileIds": null,
  "name": null,
  "expiresAfter": null,
  "chunkingStrategy": null,
  "metadata": null,
} satisfies CreateVectorStoreRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CreateVectorStoreRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


