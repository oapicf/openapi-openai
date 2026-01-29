
# FineTuningJobCheckpoint

The `fine_tuning.job.checkpoint` object represents a model checkpoint for a fine-tuning job that is ready to use. 

## Properties

Name | Type
------------ | -------------
`id` | string
`createdAt` | number
`fineTunedModelCheckpoint` | string
`stepNumber` | number
`metrics` | [FineTuningJobCheckpointMetrics](FineTuningJobCheckpointMetrics.md)
`fineTuningJobId` | string
`object` | string

## Example

```typescript
import type { FineTuningJobCheckpoint } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "createdAt": null,
  "fineTunedModelCheckpoint": null,
  "stepNumber": null,
  "metrics": null,
  "fineTuningJobId": null,
  "object": null,
} satisfies FineTuningJobCheckpoint

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as FineTuningJobCheckpoint
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


