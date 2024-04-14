# OpenApiOpenAIClient::CreateAssistantFileRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **file_id** | **String** | A [File](/docs/api-reference/files) ID (with &#x60;purpose&#x3D;\&quot;assistants\&quot;&#x60;) that the assistant should use. Useful for tools like &#x60;retrieval&#x60; and &#x60;code_interpreter&#x60; that can access files. |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::CreateAssistantFileRequest.new(
  file_id: null
)
```

