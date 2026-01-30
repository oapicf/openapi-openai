# OpenApiOpenAIClient::RealtimeServerEventError

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **event_id** | **String** | The unique ID of the server event. |  |
| **type** | **String** | The event type, must be &#x60;error&#x60;. |  |
| **error** | [**RealtimeServerEventErrorError**](RealtimeServerEventErrorError.md) |  |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::RealtimeServerEventError.new(
  event_id: null,
  type: null,
  error: null
)
```

