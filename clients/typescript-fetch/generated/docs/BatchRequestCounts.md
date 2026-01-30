
# BatchRequestCounts

The request counts for different statuses within the batch.

## Properties

Name | Type
------------ | -------------
`total` | number
`completed` | number
`failed` | number

## Example

```typescript
import type { BatchRequestCounts } from ''

// TODO: Update the object below with actual values
const example = {
  "total": null,
  "completed": null,
  "failed": null,
} satisfies BatchRequestCounts

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as BatchRequestCounts
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


