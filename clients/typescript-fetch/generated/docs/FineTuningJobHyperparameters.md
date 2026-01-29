
# FineTuningJobHyperparameters

The hyperparameters used for the fine-tuning job. See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.

## Properties

Name | Type
------------ | -------------
`nEpochs` | [FineTuningJobHyperparametersNEpochs](FineTuningJobHyperparametersNEpochs.md)

## Example

```typescript
import type { FineTuningJobHyperparameters } from ''

// TODO: Update the object below with actual values
const example = {
  "nEpochs": null,
} satisfies FineTuningJobHyperparameters

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as FineTuningJobHyperparameters
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


