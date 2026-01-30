# OpenApiOpenAIClient::Project

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | The identifier, which can be referenced in API endpoints |  |
| **object** | **String** | The object type, which is always &#x60;organization.project&#x60; |  |
| **name** | **String** | The name of the project. This appears in reporting. |  |
| **created_at** | **Integer** | The Unix timestamp (in seconds) of when the project was created. |  |
| **archived_at** | **Integer** | The Unix timestamp (in seconds) of when the project was archived or &#x60;null&#x60;. | [optional] |
| **status** | **String** | &#x60;active&#x60; or &#x60;archived&#x60; |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::Project.new(
  id: null,
  object: null,
  name: null,
  created_at: null,
  archived_at: null,
  status: null
)
```

