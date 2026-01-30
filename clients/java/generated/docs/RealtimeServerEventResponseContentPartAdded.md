

# RealtimeServerEventResponseContentPartAdded

Returned when a new content part is added to an assistant message item during response generation. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventId** | **String** | The unique ID of the server event. |  |
|**type** | [**TypeEnum**](#TypeEnum) | The event type, must be &#x60;response.content_part.added&#x60;. |  |
|**responseId** | **String** | The ID of the response. |  |
|**itemId** | **String** | The ID of the item to which the content part was added. |  |
|**outputIndex** | **Integer** | The index of the output item in the response. |  |
|**contentIndex** | **Integer** | The index of the content part in the item&#39;s content array. |  |
|**part** | [**RealtimeServerEventResponseContentPartAddedPart**](RealtimeServerEventResponseContentPartAddedPart.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| RESPONSE_CONTENT_PART_ADDED | &quot;response.content_part.added&quot; |



