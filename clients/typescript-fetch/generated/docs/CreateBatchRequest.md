
# CreateBatchRequest


## Properties

Name | Type
------------ | -------------
`inputFileId` | string
`endpoint` | string
`completionWindow` | string
`metadata` | { [key: string]: string; }

## Example

```typescript
import type { CreateBatchRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "inputFileId": null,
  "endpoint": null,
  "completionWindow": null,
  "metadata": null,
} satisfies CreateBatchRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CreateBatchRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


