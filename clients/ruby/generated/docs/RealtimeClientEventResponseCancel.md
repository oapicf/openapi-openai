# OpenApiOpenAIClient::RealtimeClientEventResponseCancel

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **event_id** | **String** | Optional client-generated ID used to identify this event. | [optional] |
| **type** | **String** | The event type, must be &#x60;response.cancel&#x60;. |  |
| **response_id** | **String** | A specific response ID to cancel - if not provided, will cancel an  in-progress response in the default conversation.  | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::RealtimeClientEventResponseCancel.new(
  event_id: null,
  type: null,
  response_id: null
)
```

