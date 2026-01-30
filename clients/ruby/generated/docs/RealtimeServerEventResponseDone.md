# OpenApiOpenAIClient::RealtimeServerEventResponseDone

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **event_id** | **String** | The unique ID of the server event. |  |
| **type** | **String** | The event type, must be &#x60;response.done&#x60;. |  |
| **response** | [**RealtimeResponse**](RealtimeResponse.md) |  |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::RealtimeServerEventResponseDone.new(
  event_id: null,
  type: null,
  response: null
)
```

