# OpenApiOpenAIClient::MessageDeltaObjectDelta

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **role** | **String** | The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;. | [optional] |
| **content** | [**Array&lt;MessageDeltaObjectDeltaContentInner&gt;**](MessageDeltaObjectDeltaContentInner.md) | The content of the message in array of text and/or images. | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::MessageDeltaObjectDelta.new(
  role: null,
  content: null
)
```

