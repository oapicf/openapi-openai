# OpenApiOpenAIClient::MessageDeltaContentImageUrlObject

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **index** | **Integer** | The index of the content part in the message. |  |
| **type** | **String** | Always &#x60;image_url&#x60;. |  |
| **image_url** | [**MessageDeltaContentImageUrlObjectImageUrl**](MessageDeltaContentImageUrlObjectImageUrl.md) |  | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::MessageDeltaContentImageUrlObject.new(
  index: null,
  type: null,
  image_url: null
)
```

