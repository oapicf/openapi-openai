# OpenApiOpenAIClient::MessageContentTextAnnotationsFileCitationObject

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **type** | **String** | Always &#x60;file_citation&#x60;. |  |
| **text** | **String** | The text in the message content that needs to be replaced. |  |
| **file_citation** | [**MessageContentTextAnnotationsFileCitationObjectFileCitation**](MessageContentTextAnnotationsFileCitationObjectFileCitation.md) |  |  |
| **start_index** | **Integer** |  |  |
| **end_index** | **Integer** |  |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::MessageContentTextAnnotationsFileCitationObject.new(
  type: null,
  text: null,
  file_citation: null,
  start_index: null,
  end_index: null
)
```

