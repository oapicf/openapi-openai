
# FineTuningJobEvent

Fine-tuning job event object

## Properties

Name | Type
------------ | -------------
`id` | string
`createdAt` | number
`level` | string
`message` | string
`object` | string

## Example

```typescript
import type { FineTuningJobEvent } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "createdAt": null,
  "level": null,
  "message": null,
  "object": null,
} satisfies FineTuningJobEvent

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as FineTuningJobEvent
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


