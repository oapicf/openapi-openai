# OpenApiOpenAIClient::FineTuningJobCheckpointMetrics

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **step** | **Float** |  | [optional] |
| **train_loss** | **Float** |  | [optional] |
| **train_mean_token_accuracy** | **Float** |  | [optional] |
| **valid_loss** | **Float** |  | [optional] |
| **valid_mean_token_accuracy** | **Float** |  | [optional] |
| **full_valid_loss** | **Float** |  | [optional] |
| **full_valid_mean_token_accuracy** | **Float** |  | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::FineTuningJobCheckpointMetrics.new(
  step: null,
  train_loss: null,
  train_mean_token_accuracy: null,
  valid_loss: null,
  valid_mean_token_accuracy: null,
  full_valid_loss: null,
  full_valid_mean_token_accuracy: null
)
```

