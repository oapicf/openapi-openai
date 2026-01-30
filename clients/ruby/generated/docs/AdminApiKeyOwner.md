# OpenApiOpenAIClient::AdminApiKeyOwner

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **type** | **String** |  | [optional] |
| **id** | **String** |  | [optional] |
| **name** | **String** |  | [optional] |
| **created_at** | **Integer** |  | [optional] |
| **role** | **String** |  | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::AdminApiKeyOwner.new(
  type: service_account,
  id: sa_456,
  name: My Service Account,
  created_at: 1711471533,
  role: member
)
```

