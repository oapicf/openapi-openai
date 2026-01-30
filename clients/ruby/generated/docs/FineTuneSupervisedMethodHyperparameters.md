# OpenApiOpenAIClient::FineTuneSupervisedMethodHyperparameters

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **batch_size** | [**FineTuneDPOMethodHyperparametersBatchSize**](FineTuneDPOMethodHyperparametersBatchSize.md) |  | [optional] |
| **learning_rate_multiplier** | [**FineTuneDPOMethodHyperparametersLearningRateMultiplier**](FineTuneDPOMethodHyperparametersLearningRateMultiplier.md) |  | [optional] |
| **n_epochs** | [**FineTuneDPOMethodHyperparametersNEpochs**](FineTuneDPOMethodHyperparametersNEpochs.md) |  | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::FineTuneSupervisedMethodHyperparameters.new(
  batch_size: null,
  learning_rate_multiplier: null,
  n_epochs: null
)
```

