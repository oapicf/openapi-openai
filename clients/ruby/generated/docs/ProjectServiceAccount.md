# OpenApiOpenAIClient::ProjectServiceAccount

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **object** | **String** | The object type, which is always &#x60;organization.project.service_account&#x60; |  |
| **id** | **String** | The identifier, which can be referenced in API endpoints |  |
| **name** | **String** | The name of the service account |  |
| **role** | **String** | &#x60;owner&#x60; or &#x60;member&#x60; |  |
| **created_at** | **Integer** | The Unix timestamp (in seconds) of when the service account was created |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::ProjectServiceAccount.new(
  object: null,
  id: null,
  name: null,
  role: null,
  created_at: null
)
```

