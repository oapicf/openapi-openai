# OpenApiOpenAIClient::RealtimeClientEventResponseCreate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **event_id** | **String** | Optional client-generated ID used to identify this event. | [optional] |
| **type** | **String** | The event type, must be &#x60;response.create&#x60;. |  |
| **response** | [**RealtimeResponseCreateParams**](RealtimeResponseCreateParams.md) |  | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::RealtimeClientEventResponseCreate.new(
  event_id: null,
  type: null,
  response: null
)
```

