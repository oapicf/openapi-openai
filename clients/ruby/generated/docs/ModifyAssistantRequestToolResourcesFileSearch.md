# OpenApiOpenAIClient::ModifyAssistantRequestToolResourcesFileSearch

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **vector_store_ids** | **Array&lt;String&gt;** | Overrides the [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant.  | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::ModifyAssistantRequestToolResourcesFileSearch.new(
  vector_store_ids: null
)
```

