
# FineTuningJobHyperparametersNEpochs

The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. \"auto\" decides the optimal number of epochs based on the size of the dataset. If setting the number manually, we support any number between 1 and 50 epochs.

## Properties

Name | Type
------------ | -------------

## Example

```typescript
import type { FineTuningJobHyperparametersNEpochs } from ''

// TODO: Update the object below with actual values
const example = {
} satisfies FineTuningJobHyperparametersNEpochs

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as FineTuningJobHyperparametersNEpochs
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


