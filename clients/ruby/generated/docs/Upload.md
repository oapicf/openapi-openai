# OpenApiOpenAIClient::Upload

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | The Upload unique identifier, which can be referenced in API endpoints. |  |
| **created_at** | **Integer** | The Unix timestamp (in seconds) for when the Upload was created. |  |
| **filename** | **String** | The name of the file to be uploaded. |  |
| **bytes** | **Integer** | The intended number of bytes to be uploaded. |  |
| **purpose** | **String** | The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values. |  |
| **status** | **String** | The status of the Upload. |  |
| **expires_at** | **Integer** | The Unix timestamp (in seconds) for when the Upload was created. |  |
| **object** | **String** | The object type, which is always \&quot;upload\&quot;. | [optional] |
| **file** | [**OpenAIFile**](OpenAIFile.md) |  | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::Upload.new(
  id: null,
  created_at: null,
  filename: null,
  bytes: null,
  purpose: null,
  status: null,
  expires_at: null,
  object: null,
  file: null
)
```

