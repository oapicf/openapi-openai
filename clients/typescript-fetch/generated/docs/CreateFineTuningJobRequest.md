
# CreateFineTuningJobRequest


## Properties

Name | Type
------------ | -------------
`model` | [CreateFineTuningJobRequestModel](CreateFineTuningJobRequestModel.md)
`trainingFile` | string
`hyperparameters` | [CreateFineTuningJobRequestHyperparameters](CreateFineTuningJobRequestHyperparameters.md)
`suffix` | string
`validationFile` | string
`integrations` | [Array&lt;CreateFineTuningJobRequestIntegrationsInner&gt;](CreateFineTuningJobRequestIntegrationsInner.md)
`seed` | number
`method` | [FineTuneMethod](FineTuneMethod.md)

## Example

```typescript
import type { CreateFineTuningJobRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "model": null,
  "trainingFile": file-abc123,
  "hyperparameters": null,
  "suffix": null,
  "validationFile": file-abc123,
  "integrations": null,
  "seed": 42,
  "method": null,
} satisfies CreateFineTuningJobRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CreateFineTuningJobRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


