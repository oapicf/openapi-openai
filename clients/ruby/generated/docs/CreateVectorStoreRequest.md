# OpenApiOpenAIClient::CreateVectorStoreRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **file_ids** | **Array&lt;String&gt;** | A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like &#x60;file_search&#x60; that can access files. | [optional] |
| **name** | **String** | The name of the vector store. | [optional] |
| **expires_after** | [**VectorStoreExpirationAfter**](VectorStoreExpirationAfter.md) |  | [optional] |
| **chunking_strategy** | [**CreateVectorStoreRequestChunkingStrategy**](CreateVectorStoreRequestChunkingStrategy.md) |  | [optional] |
| **metadata** | **Object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::CreateVectorStoreRequest.new(
  file_ids: null,
  name: null,
  expires_after: null,
  chunking_strategy: null,
  metadata: null
)
```

