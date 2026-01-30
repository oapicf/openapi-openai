# OpenApiOpenAIClient::CreateUploadRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **filename** | **String** | The name of the file to upload.  |  |
| **purpose** | **String** | The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose).  |  |
| **bytes** | **Integer** | The number of bytes in the file you are uploading.  |  |
| **mime_type** | **String** | The MIME type of the file.  This must fall within the supported MIME types for your file purpose. See the supported MIME types for assistants and vision.  |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::CreateUploadRequest.new(
  filename: null,
  purpose: null,
  bytes: null,
  mime_type: null
)
```

