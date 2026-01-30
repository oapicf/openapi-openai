# OpenApiOpenAIClient::User

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **object** | **String** | The object type, which is always &#x60;organization.user&#x60; |  |
| **id** | **String** | The identifier, which can be referenced in API endpoints |  |
| **name** | **String** | The name of the user |  |
| **email** | **String** | The email address of the user |  |
| **role** | **String** | &#x60;owner&#x60; or &#x60;reader&#x60; |  |
| **added_at** | **Integer** | The Unix timestamp (in seconds) of when the user was added. |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::User.new(
  object: null,
  id: null,
  name: null,
  email: null,
  role: null,
  added_at: null
)
```

