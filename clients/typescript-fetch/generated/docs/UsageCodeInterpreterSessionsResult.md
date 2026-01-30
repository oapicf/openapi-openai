
# UsageCodeInterpreterSessionsResult

The aggregated code interpreter sessions usage details of the specific time bucket.

## Properties

Name | Type
------------ | -------------
`object` | string
`sessions` | number
`projectId` | string

## Example

```typescript
import type { UsageCodeInterpreterSessionsResult } from ''

// TODO: Update the object below with actual values
const example = {
  "object": null,
  "sessions": null,
  "projectId": null,
} satisfies UsageCodeInterpreterSessionsResult

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as UsageCodeInterpreterSessionsResult
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


