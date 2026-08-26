

# RealtimeServerEventResponseAudioDone

Returned when the model-generated audio is done. Also emitted when a Response is interrupted, incomplete, or cancelled. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventId** | **String** | The unique ID of the server event. |  |
|**type** | [**TypeEnum**](#TypeEnum) | The event type, must be &#x60;response.audio.done&#x60;. |  |
|**responseId** | **String** | The ID of the response. |  |
|**itemId** | **String** | The ID of the item. |  |
|**outputIndex** | **Integer** | The index of the output item in the response. |  |
|**contentIndex** | **Integer** | The index of the content part in the item&#39;s content array. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| RESPONSE_AUDIO_DONE | &quot;response.audio.done&quot; |



