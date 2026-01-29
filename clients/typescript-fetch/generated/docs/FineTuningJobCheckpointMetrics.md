
# FineTuningJobCheckpointMetrics

Metrics at the step number during the fine-tuning job.

## Properties

Name | Type
------------ | -------------
`step` | number
`trainLoss` | number
`trainMeanTokenAccuracy` | number
`validLoss` | number
`validMeanTokenAccuracy` | number
`fullValidLoss` | number
`fullValidMeanTokenAccuracy` | number

## Example

```typescript
import type { FineTuningJobCheckpointMetrics } from ''

// TODO: Update the object below with actual values
const example = {
  "step": null,
  "trainLoss": null,
  "trainMeanTokenAccuracy": null,
  "validLoss": null,
  "validMeanTokenAccuracy": null,
  "fullValidLoss": null,
  "fullValidMeanTokenAccuracy": null,
} satisfies FineTuningJobCheckpointMetrics

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as FineTuningJobCheckpointMetrics
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


