# OpenApiOpenAIClient::ThreadObject

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | The identifier, which can be referenced in API endpoints. |  |
| **object** | **String** | The object type, which is always &#x60;thread&#x60;. |  |
| **created_at** | **Integer** | The Unix timestamp (in seconds) for when the thread was created. |  |
| **metadata** | **Object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::ThreadObject.new(
  id: null,
  object: null,
  created_at: null,
  metadata: null
)
```

