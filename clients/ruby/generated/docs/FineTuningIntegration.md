# OpenApiOpenAIClient::FineTuningIntegration

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **type** | **String** | The type of the integration being enabled for the fine-tuning job |  |
| **wandb** | [**CreateFineTuningJobRequestIntegrationsInnerWandb**](CreateFineTuningJobRequestIntegrationsInnerWandb.md) |  |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::FineTuningIntegration.new(
  type: null,
  wandb: null
)
```

