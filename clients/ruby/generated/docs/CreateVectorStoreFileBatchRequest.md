# OpenApiOpenAIClient::CreateVectorStoreFileBatchRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **file_ids** | **Array&lt;String&gt;** | A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like &#x60;file_search&#x60; that can access files. |  |
| **chunking_strategy** | [**ChunkingStrategyRequestParam**](ChunkingStrategyRequestParam.md) |  | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::CreateVectorStoreFileBatchRequest.new(
  file_ids: null,
  chunking_strategy: null
)
```

