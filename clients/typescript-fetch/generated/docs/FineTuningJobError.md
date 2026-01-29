
# FineTuningJobError

For fine-tuning jobs that have `failed`, this will contain more information on the cause of the failure.

## Properties

Name | Type
------------ | -------------
`code` | string
`message` | string
`param` | string

## Example

```typescript
import type { FineTuningJobError } from ''

// TODO: Update the object below with actual values
const example = {
  "code": null,
  "message": null,
  "param": null,
} satisfies FineTuningJobError

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as FineTuningJobError
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


