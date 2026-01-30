
# VectorStoreFileObjectChunkingStrategy

The strategy used to chunk the file.

## Properties

Name | Type
------------ | -------------
`type` | string
`_static` | [StaticChunkingStrategy](StaticChunkingStrategy.md)

## Example

```typescript
import type { VectorStoreFileObjectChunkingStrategy } from ''

// TODO: Update the object below with actual values
const example = {
  "type": null,
  "_static": null,
} satisfies VectorStoreFileObjectChunkingStrategy

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as VectorStoreFileObjectChunkingStrategy
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


