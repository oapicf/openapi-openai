# OpenApiOpenAIClient::MessageContentTextAnnotationsFilePathObject

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **type** | **String** | Always &#x60;file_path&#x60;. |  |
| **text** | **String** | The text in the message content that needs to be replaced. |  |
| **file_path** | [**MessageContentTextAnnotationsFilePathObjectFilePath**](MessageContentTextAnnotationsFilePathObjectFilePath.md) |  |  |
| **start_index** | **Integer** |  |  |
| **end_index** | **Integer** |  |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::MessageContentTextAnnotationsFilePathObject.new(
  type: null,
  text: null,
  file_path: null,
  start_index: null,
  end_index: null
)
```

