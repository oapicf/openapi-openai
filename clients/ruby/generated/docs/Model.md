# OpenApiOpenAIClient::Model

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | The model identifier, which can be referenced in the API endpoints. |  |
| **created** | **Integer** | The Unix timestamp (in seconds) when the model was created. |  |
| **object** | **String** | The object type, which is always \&quot;model\&quot;. |  |
| **owned_by** | **String** | The organization that owns the model. |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::Model.new(
  id: null,
  created: null,
  object: null,
  owned_by: null
)
```

