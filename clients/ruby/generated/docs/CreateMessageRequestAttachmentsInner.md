# OpenApiOpenAIClient::CreateMessageRequestAttachmentsInner

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **file_id** | **String** | The ID of the file to attach to the message. | [optional] |
| **tools** | [**Array&lt;CreateMessageRequestAttachmentsInnerToolsInner&gt;**](CreateMessageRequestAttachmentsInnerToolsInner.md) | The tools to add this file to. | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::CreateMessageRequestAttachmentsInner.new(
  file_id: null,
  tools: null
)
```

