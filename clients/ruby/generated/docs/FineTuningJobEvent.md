# OpenApiOpenAIClient::FineTuningJobEvent

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **object** | **String** | The object type, which is always \&quot;fine_tuning.job.event\&quot;. |  |
| **id** | **String** | The object identifier. |  |
| **created_at** | **Integer** | The Unix timestamp (in seconds) for when the fine-tuning job was created. |  |
| **level** | **String** | The log level of the event. |  |
| **message** | **String** | The message of the event. |  |
| **type** | **String** | The type of event. | [optional] |
| **data** | **Object** | The data associated with the event. | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::FineTuningJobEvent.new(
  object: null,
  id: null,
  created_at: null,
  level: null,
  message: null,
  type: null,
  data: null
)
```

