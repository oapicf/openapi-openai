
# ListBatchesResponse


## Properties

Name | Type
------------ | -------------
`data` | [Array&lt;Batch&gt;](Batch.md)
`firstId` | string
`lastId` | string
`hasMore` | boolean
`object` | string

## Example

```typescript
import type { ListBatchesResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "data": null,
  "firstId": batch_abc123,
  "lastId": batch_abc456,
  "hasMore": null,
  "object": null,
} satisfies ListBatchesResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ListBatchesResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


