# OpenApiOpenAIClient::AdminApiKeysDelete200Response

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** |  | [optional] |
| **object** | **String** |  | [optional] |
| **deleted** | **Boolean** |  | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::AdminApiKeysDelete200Response.new(
  id: key_abc,
  object: organization.admin_api_key.deleted,
  deleted: true
)
```

