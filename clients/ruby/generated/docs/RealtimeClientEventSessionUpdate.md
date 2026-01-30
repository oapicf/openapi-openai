# OpenApiOpenAIClient::RealtimeClientEventSessionUpdate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **event_id** | **String** | Optional client-generated ID used to identify this event. | [optional] |
| **type** | **String** | The event type, must be &#x60;session.update&#x60;. |  |
| **session** | [**RealtimeSessionCreateRequest**](RealtimeSessionCreateRequest.md) |  |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::RealtimeClientEventSessionUpdate.new(
  event_id: null,
  type: null,
  session: null
)
```

