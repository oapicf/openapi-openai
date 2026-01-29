
# ListFineTuningJobCheckpointsResponse


## Properties

Name | Type
------------ | -------------
`data` | [Array&lt;FineTuningJobCheckpoint&gt;](FineTuningJobCheckpoint.md)
`object` | string
`firstId` | string
`lastId` | string
`hasMore` | boolean

## Example

```typescript
import type { ListFineTuningJobCheckpointsResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "data": null,
  "object": null,
  "firstId": null,
  "lastId": null,
  "hasMore": null,
} satisfies ListFineTuningJobCheckpointsResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ListFineTuningJobCheckpointsResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


