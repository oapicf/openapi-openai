

# RealtimeServerEventResponseContentPartDone

Returned when a content part is done streaming in an assistant message item. Also emitted when a Response is interrupted, incomplete, or cancelled. 

The class is defined in **[RealtimeServerEventResponseContentPartDone.java](../../src/main/java/org/openapitools/model/RealtimeServerEventResponseContentPartDone.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventId** | `String` | The unique ID of the server event. | 
**type** | [**TypeEnum**](#TypeEnum) | The event type, must be &#x60;response.content_part.done&#x60;. | 
**responseId** | `String` | The ID of the response. | 
**itemId** | `String` | The ID of the item. | 
**outputIndex** | `Integer` | The index of the output item in the response. | 
**contentIndex** | `Integer` | The index of the content part in the item&#39;s content array. | 
**part** | [`RealtimeServerEventResponseContentPartDonePart`](RealtimeServerEventResponseContentPartDonePart.md) |  | 


## TypeEnum

Name | Value
---- | -----
RESPONSE_CONTENT_PART_DONE | `"response.content_part.done"`







