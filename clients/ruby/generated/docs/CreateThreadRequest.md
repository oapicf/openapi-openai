# OpenApiOpenAIClient::CreateThreadRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **messages** | [**Array&lt;CreateMessageRequest&gt;**](CreateMessageRequest.md) | A list of [messages](/docs/api-reference/messages) to start the thread with. | [optional] |
| **metadata** | **Object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::CreateThreadRequest.new(
  messages: null,
  metadata: null
)
```

