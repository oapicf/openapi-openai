
# FineTuneSupervisedMethodHyperparameters

The hyperparameters used for the fine-tuning job.

## Properties

Name | Type
------------ | -------------
`batchSize` | [FineTuneDPOMethodHyperparametersBatchSize](FineTuneDPOMethodHyperparametersBatchSize.md)
`learningRateMultiplier` | [FineTuneDPOMethodHyperparametersLearningRateMultiplier](FineTuneDPOMethodHyperparametersLearningRateMultiplier.md)
`nEpochs` | [FineTuneDPOMethodHyperparametersNEpochs](FineTuneDPOMethodHyperparametersNEpochs.md)

## Example

```typescript
import type { FineTuneSupervisedMethodHyperparameters } from ''

// TODO: Update the object below with actual values
const example = {
  "batchSize": null,
  "learningRateMultiplier": null,
  "nEpochs": null,
} satisfies FineTuneSupervisedMethodHyperparameters

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as FineTuneSupervisedMethodHyperparameters
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


