
# CreateFineTuningJobRequestHyperparameters

The hyperparameters used for the fine-tuning job. This value is now deprecated in favor of `method`, and should be passed in under the `method` parameter. 

## Properties

Name | Type
------------ | -------------
`batchSize` | [CreateFineTuningJobRequestHyperparametersBatchSize](CreateFineTuningJobRequestHyperparametersBatchSize.md)
`learningRateMultiplier` | [CreateFineTuningJobRequestHyperparametersLearningRateMultiplier](CreateFineTuningJobRequestHyperparametersLearningRateMultiplier.md)
`nEpochs` | [CreateFineTuningJobRequestHyperparametersNEpochs](CreateFineTuningJobRequestHyperparametersNEpochs.md)

## Example

```typescript
import type { CreateFineTuningJobRequestHyperparameters } from ''

// TODO: Update the object below with actual values
const example = {
  "batchSize": null,
  "learningRateMultiplier": null,
  "nEpochs": null,
} satisfies CreateFineTuningJobRequestHyperparameters

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CreateFineTuningJobRequestHyperparameters
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


