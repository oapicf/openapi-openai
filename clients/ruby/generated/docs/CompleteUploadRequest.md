# OpenApiOpenAIClient::CompleteUploadRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **part_ids** | **Array&lt;String&gt;** | The ordered list of Part IDs.  |  |
| **md5** | **String** | The optional md5 checksum for the file contents to verify if the bytes uploaded matches what you expect.  | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::CompleteUploadRequest.new(
  part_ids: null,
  md5: null
)
```

