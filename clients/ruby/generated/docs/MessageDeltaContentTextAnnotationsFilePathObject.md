# OpenApiOpenAIClient::MessageDeltaContentTextAnnotationsFilePathObject

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **index** | **Integer** | The index of the annotation in the text content part. |  |
| **type** | **String** | Always &#x60;file_path&#x60;. |  |
| **text** | **String** | The text in the message content that needs to be replaced. | [optional] |
| **file_path** | [**MessageDeltaContentTextAnnotationsFilePathObjectFilePath**](MessageDeltaContentTextAnnotationsFilePathObjectFilePath.md) |  | [optional] |
| **start_index** | **Integer** |  | [optional] |
| **end_index** | **Integer** |  | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::MessageDeltaContentTextAnnotationsFilePathObject.new(
  index: null,
  type: null,
  text: null,
  file_path: null,
  start_index: null,
  end_index: null
)
```

