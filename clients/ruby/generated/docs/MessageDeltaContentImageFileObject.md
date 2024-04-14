# OpenApiOpenAIClient::MessageDeltaContentImageFileObject

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **index** | **Integer** | The index of the content part in the message. |  |
| **type** | **String** | Always &#x60;image_file&#x60;. |  |
| **image_file** | [**MessageDeltaContentImageFileObjectImageFile**](MessageDeltaContentImageFileObjectImageFile.md) |  | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::MessageDeltaContentImageFileObject.new(
  index: null,
  type: null,
  image_file: null
)
```

