# OpenApiOpenAIClient::FineTuneMethod

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **type** | **String** | The type of method. Is either &#x60;supervised&#x60; or &#x60;dpo&#x60;. | [optional] |
| **supervised** | [**FineTuneSupervisedMethod**](FineTuneSupervisedMethod.md) |  | [optional] |
| **dpo** | [**FineTuneDPOMethod**](FineTuneDPOMethod.md) |  | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::FineTuneMethod.new(
  type: null,
  supervised: null,
  dpo: null
)
```

