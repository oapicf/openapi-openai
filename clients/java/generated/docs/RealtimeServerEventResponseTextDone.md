

# RealtimeServerEventResponseTextDone

Returned when the text value of a \"text\" content part is done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventId** | **String** | The unique ID of the server event. |  |
|**type** | [**TypeEnum**](#TypeEnum) | The event type, must be &#x60;response.text.done&#x60;. |  |
|**responseId** | **String** | The ID of the response. |  |
|**itemId** | **String** | The ID of the item. |  |
|**outputIndex** | **Integer** | The index of the output item in the response. |  |
|**contentIndex** | **Integer** | The index of the content part in the item&#39;s content array. |  |
|**text** | **String** | The final text content. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| RESPONSE_TEXT_DONE | &quot;response.text.done&quot; |



