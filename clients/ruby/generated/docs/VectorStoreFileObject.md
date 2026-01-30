# OpenApiOpenAIClient::VectorStoreFileObject

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | The identifier, which can be referenced in API endpoints. |  |
| **object** | **String** | The object type, which is always &#x60;vector_store.file&#x60;. |  |
| **usage_bytes** | **Integer** | The total vector store usage in bytes. Note that this may be different from the original file size. |  |
| **created_at** | **Integer** | The Unix timestamp (in seconds) for when the vector store file was created. |  |
| **vector_store_id** | **String** | The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to. |  |
| **status** | **String** | The status of the vector store file, which can be either &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;cancelled&#x60;, or &#x60;failed&#x60;. The status &#x60;completed&#x60; indicates that the vector store file is ready for use. |  |
| **last_error** | [**VectorStoreFileObjectLastError**](VectorStoreFileObjectLastError.md) |  |  |
| **chunking_strategy** | [**VectorStoreFileObjectChunkingStrategy**](VectorStoreFileObjectChunkingStrategy.md) |  | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::VectorStoreFileObject.new(
  id: null,
  object: null,
  usage_bytes: null,
  created_at: null,
  vector_store_id: null,
  status: null,
  last_error: null,
  chunking_strategy: null
)
```

