
# ListPaginatedFineTuningJobsResponse


## Properties

Name | Type
------------ | -------------
`data` | [Array&lt;FineTuningJob&gt;](FineTuningJob.md)
`hasMore` | boolean
`object` | string

## Example

```typescript
import type { ListPaginatedFineTuningJobsResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "data": null,
  "hasMore": null,
  "object": null,
} satisfies ListPaginatedFineTuningJobsResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ListPaginatedFineTuningJobsResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


