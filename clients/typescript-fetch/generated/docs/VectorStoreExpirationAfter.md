
# VectorStoreExpirationAfter

The expiration policy for a vector store.

## Properties

Name | Type
------------ | -------------
`anchor` | string
`days` | number

## Example

```typescript
import type { VectorStoreExpirationAfter } from ''

// TODO: Update the object below with actual values
const example = {
  "anchor": null,
  "days": null,
} satisfies VectorStoreExpirationAfter

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as VectorStoreExpirationAfter
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


