# OpenApiOpenAIClient::CreateFineTuningJobRequestIntegrationsInner

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **type** | **String** | The type of integration to enable. Currently, only \&quot;wandb\&quot; (Weights and Biases) is supported.  |  |
| **wandb** | [**CreateFineTuningJobRequestIntegrationsInnerWandb**](CreateFineTuningJobRequestIntegrationsInnerWandb.md) |  |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::CreateFineTuningJobRequestIntegrationsInner.new(
  type: null,
  wandb: null
)
```

