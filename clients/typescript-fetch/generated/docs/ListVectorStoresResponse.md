
# ListVectorStoresResponse


## Properties

Name | Type
------------ | -------------
`object` | string
`data` | [Array&lt;VectorStoreObject&gt;](VectorStoreObject.md)
`firstId` | string
`lastId` | string
`hasMore` | boolean

## Example

```typescript
import type { ListVectorStoresResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "object": list,
  "data": null,
  "firstId": vs_abc123,
  "lastId": vs_abc456,
  "hasMore": false,
} satisfies ListVectorStoresResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ListVectorStoresResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


