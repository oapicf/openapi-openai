# OpenApiOpenAIClient::CreateAssistantRequestToolResourcesFileSearch

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **vector_store_ids** | **Array&lt;String&gt;** | The [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant.  | [optional] |
| **vector_stores** | [**Array&lt;CreateAssistantRequestToolResourcesFileSearchVectorStoresInner&gt;**](CreateAssistantRequestToolResourcesFileSearchVectorStoresInner.md) | A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this assistant. There can be a maximum of 1 vector store attached to the assistant.  | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::CreateAssistantRequestToolResourcesFileSearch.new(
  vector_store_ids: null,
  vector_stores: null
)
```

