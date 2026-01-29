
# ListRunsResponse


## Properties

Name | Type
------------ | -------------
`object` | string
`data` | [Array&lt;RunObject&gt;](RunObject.md)
`firstId` | string
`lastId` | string
`hasMore` | boolean

## Example

```typescript
import type { ListRunsResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "object": list,
  "data": null,
  "firstId": run_abc123,
  "lastId": run_abc456,
  "hasMore": false,
} satisfies ListRunsResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ListRunsResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


