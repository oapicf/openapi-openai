# OpenApiOpenAIClient::ApiKeyList

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **object** | **String** |  | [optional] |
| **data** | [**Array&lt;AdminApiKey&gt;**](AdminApiKey.md) |  | [optional] |
| **has_more** | **Boolean** |  | [optional] |
| **first_id** | **String** |  | [optional] |
| **last_id** | **String** |  | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::ApiKeyList.new(
  object: list,
  data: null,
  has_more: false,
  first_id: key_abc,
  last_id: key_xyz
)
```

