# OpenApiOpenAIClient::AssistantFileObject

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | The identifier, which can be referenced in API endpoints. |  |
| **object** | **String** | The object type, which is always &#x60;assistant.file&#x60;. |  |
| **created_at** | **Integer** | The Unix timestamp (in seconds) for when the assistant file was created. |  |
| **assistant_id** | **String** | The assistant ID that the file is attached to. |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::AssistantFileObject.new(
  id: null,
  object: null,
  created_at: null,
  assistant_id: null
)
```

