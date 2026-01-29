# OpenApiOpenAIClient::ListFineTuningJobCheckpointsResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **data** | [**Array&lt;FineTuningJobCheckpoint&gt;**](FineTuningJobCheckpoint.md) |  |  |
| **object** | **String** |  |  |
| **first_id** | **String** |  | [optional] |
| **last_id** | **String** |  | [optional] |
| **has_more** | **Boolean** |  |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::ListFineTuningJobCheckpointsResponse.new(
  data: null,
  object: null,
  first_id: null,
  last_id: null,
  has_more: null
)
```

