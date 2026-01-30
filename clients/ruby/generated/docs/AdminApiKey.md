# OpenApiOpenAIClient::AdminApiKey

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **object** | **String** |  | [optional] |
| **id** | **String** |  | [optional] |
| **name** | **String** |  | [optional] |
| **redacted_value** | **String** |  | [optional] |
| **value** | **String** |  | [optional] |
| **created_at** | **Integer** |  | [optional] |
| **owner** | [**AdminApiKeyOwner**](AdminApiKeyOwner.md) |  | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::AdminApiKey.new(
  object: organization.admin_api_key,
  id: key_abc,
  name: Administration Key,
  redacted_value: sk-admin...def,
  value: sk-admin-1234abcd,
  created_at: 1711471533,
  owner: null
)
```

