# OpenApiOpenAIClient::VectorStoreObjectFileCounts

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **in_progress** | **Integer** | The number of files that are currently being processed. |  |
| **completed** | **Integer** | The number of files that have been successfully processed. |  |
| **failed** | **Integer** | The number of files that have failed to process. |  |
| **cancelled** | **Integer** | The number of files that were cancelled. |  |
| **total** | **Integer** | The total number of files. |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::VectorStoreObjectFileCounts.new(
  in_progress: null,
  completed: null,
  failed: null,
  cancelled: null,
  total: null
)
```

