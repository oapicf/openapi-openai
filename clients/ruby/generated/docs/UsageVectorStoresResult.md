# OpenApiOpenAIClient::UsageVectorStoresResult

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **object** | **String** |  |  |
| **usage_bytes** | **Integer** | The vector stores usage in bytes. |  |
| **project_id** | **String** | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result. | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::UsageVectorStoresResult.new(
  object: null,
  usage_bytes: null,
  project_id: null
)
```

