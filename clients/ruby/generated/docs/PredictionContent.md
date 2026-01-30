# OpenApiOpenAIClient::PredictionContent

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **type** | **String** | The type of the predicted content you want to provide. This type is currently always &#x60;content&#x60;.  |  |
| **content** | [**PredictionContentContent**](PredictionContentContent.md) |  |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::PredictionContent.new(
  type: null,
  content: null
)
```

