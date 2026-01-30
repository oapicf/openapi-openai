# OpenApiOpenAIClient::ProjectApiKey

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **object** | **String** | The object type, which is always &#x60;organization.project.api_key&#x60; |  |
| **redacted_value** | **String** | The redacted value of the API key |  |
| **name** | **String** | The name of the API key |  |
| **created_at** | **Integer** | The Unix timestamp (in seconds) of when the API key was created |  |
| **id** | **String** | The identifier, which can be referenced in API endpoints |  |
| **owner** | [**ProjectApiKeyOwner**](ProjectApiKeyOwner.md) |  |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::ProjectApiKey.new(
  object: null,
  redacted_value: null,
  name: null,
  created_at: null,
  id: null,
  owner: null
)
```

