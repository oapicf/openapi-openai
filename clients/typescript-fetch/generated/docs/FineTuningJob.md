
# FineTuningJob

The `fine_tuning.job` object represents a fine-tuning job that has been created through the API. 

## Properties

Name | Type
------------ | -------------
`id` | string
`createdAt` | number
`error` | [FineTuningJobError](FineTuningJobError.md)
`fineTunedModel` | string
`finishedAt` | number
`hyperparameters` | [FineTuningJobHyperparameters](FineTuningJobHyperparameters.md)
`model` | string
`object` | string
`organizationId` | string
`resultFiles` | Array&lt;string&gt;
`status` | string
`trainedTokens` | number
`trainingFile` | string
`validationFile` | string
`integrations` | [Array&lt;FineTuningJobIntegrationsInner&gt;](FineTuningJobIntegrationsInner.md)
`seed` | number
`estimatedFinish` | number
`method` | [FineTuneMethod](FineTuneMethod.md)

## Example

```typescript
import type { FineTuningJob } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "createdAt": null,
  "error": null,
  "fineTunedModel": null,
  "finishedAt": null,
  "hyperparameters": null,
  "model": null,
  "object": null,
  "organizationId": null,
  "resultFiles": null,
  "status": null,
  "trainedTokens": null,
  "trainingFile": null,
  "validationFile": null,
  "integrations": null,
  "seed": null,
  "estimatedFinish": null,
  "method": null,
} satisfies FineTuningJob

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as FineTuningJob
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


