# CreateFineTuningJobRequestHyperparameters

The hyperparameters used for the fine-tuning job. This value is now deprecated in favor of `method`, and should be passed in under the `method` parameter. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batch_size** | [**CreateFineTuningJobRequestHyperparametersBatchSize**](CreateFineTuningJobRequestHyperparametersBatchSize.md) |  | [optional] [default to undefined]
**learning_rate_multiplier** | [**CreateFineTuningJobRequestHyperparametersLearningRateMultiplier**](CreateFineTuningJobRequestHyperparametersLearningRateMultiplier.md) |  | [optional] [default to undefined]
**n_epochs** | [**CreateFineTuningJobRequestHyperparametersNEpochs**](CreateFineTuningJobRequestHyperparametersNEpochs.md) |  | [optional] [default to undefined]

## Example

```typescript
import { CreateFineTuningJobRequestHyperparameters } from './api';

const instance: CreateFineTuningJobRequestHyperparameters = {
    batch_size,
    learning_rate_multiplier,
    n_epochs,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
