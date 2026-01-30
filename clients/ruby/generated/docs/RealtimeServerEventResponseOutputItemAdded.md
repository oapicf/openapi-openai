# OpenApiOpenAIClient::RealtimeServerEventResponseOutputItemAdded

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **event_id** | **String** | The unique ID of the server event. |  |
| **type** | **String** | The event type, must be &#x60;response.output_item.added&#x60;. |  |
| **response_id** | **String** | The ID of the Response to which the item belongs. |  |
| **output_index** | **Integer** | The index of the output item in the Response. |  |
| **item** | [**RealtimeConversationItem**](RealtimeConversationItem.md) |  |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::RealtimeServerEventResponseOutputItemAdded.new(
  event_id: null,
  type: null,
  response_id: null,
  output_index: null,
  item: null
)
```

