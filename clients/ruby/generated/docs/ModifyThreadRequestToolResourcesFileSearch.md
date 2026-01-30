# OpenApiOpenAIClient::ModifyThreadRequestToolResourcesFileSearch

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **vector_store_ids** | **Array&lt;String&gt;** | The [vector store](/docs/api-reference/vector-stores/object) attached to this thread. There can be a maximum of 1 vector store attached to the thread.  | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::ModifyThreadRequestToolResourcesFileSearch.new(
  vector_store_ids: null
)
```

