# OpenApiOpenAIClient::MessageDeltaContentTextObject

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **index** | **Integer** | The index of the content part in the message. |  |
| **type** | **String** | Always &#x60;text&#x60;. |  |
| **text** | [**MessageDeltaContentTextObjectText**](MessageDeltaContentTextObjectText.md) |  | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::MessageDeltaContentTextObject.new(
  index: null,
  type: null,
  text: null
)
```

