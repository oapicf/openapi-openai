

# RealtimeServerEventInputAudioBufferCommitted

Returned when an input audio buffer is committed, either by the client or  automatically in server VAD mode. The `item_id` property is the ID of the user message item that will be created, thus a `conversation.item.created` event  will also be sent to the client. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventId** | **String** | The unique ID of the server event. |  |
|**type** | [**TypeEnum**](#TypeEnum) | The event type, must be &#x60;input_audio_buffer.committed&#x60;. |  |
|**previousItemId** | **String** | The ID of the preceding item after which the new item will be inserted.  |  |
|**itemId** | **String** | The ID of the user message item that will be created. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| INPUT_AUDIO_BUFFER_COMMITTED | &quot;input_audio_buffer.committed&quot; |



