# OpenApiOpenAIClient::CreateVectorStoreFileRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **file_id** | **String** | A [File](/docs/api-reference/files) ID that the vector store should use. Useful for tools like &#x60;file_search&#x60; that can access files. |  |
| **chunking_strategy** | [**ChunkingStrategyRequestParam**](ChunkingStrategyRequestParam.md) |  | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::CreateVectorStoreFileRequest.new(
  file_id: null,
  chunking_strategy: null
)
```

