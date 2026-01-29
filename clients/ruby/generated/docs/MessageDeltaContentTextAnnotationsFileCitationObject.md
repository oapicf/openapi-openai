# OpenApiOpenAIClient::MessageDeltaContentTextAnnotationsFileCitationObject

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **index** | **Integer** | The index of the annotation in the text content part. |  |
| **type** | **String** | Always &#x60;file_citation&#x60;. |  |
| **text** | **String** | The text in the message content that needs to be replaced. | [optional] |
| **file_citation** | [**MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation**](MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation.md) |  | [optional] |
| **start_index** | **Integer** |  | [optional] |
| **end_index** | **Integer** |  | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::MessageDeltaContentTextAnnotationsFileCitationObject.new(
  index: null,
  type: null,
  text: null,
  file_citation: null,
  start_index: null,
  end_index: null
)
```

