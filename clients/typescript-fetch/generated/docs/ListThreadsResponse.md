
# ListThreadsResponse


## Properties

Name | Type
------------ | -------------
`object` | string
`data` | [Array&lt;ThreadObject&gt;](ThreadObject.md)
`firstId` | string
`lastId` | string
`hasMore` | boolean

## Example

```typescript
import type { ListThreadsResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "object": list,
  "data": null,
  "firstId": asst_abc123,
  "lastId": asst_abc456,
  "hasMore": false,
} satisfies ListThreadsResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ListThreadsResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


