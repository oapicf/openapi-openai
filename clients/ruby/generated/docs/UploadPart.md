# OpenApiOpenAIClient::UploadPart

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | The upload Part unique identifier, which can be referenced in API endpoints. |  |
| **created_at** | **Integer** | The Unix timestamp (in seconds) for when the Part was created. |  |
| **upload_id** | **String** | The ID of the Upload object that this Part was added to. |  |
| **object** | **String** | The object type, which is always &#x60;upload.part&#x60;. |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::UploadPart.new(
  id: null,
  created_at: null,
  upload_id: null,
  object: null
)
```

