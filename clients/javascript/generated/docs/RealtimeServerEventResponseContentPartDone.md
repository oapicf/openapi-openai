# OpenapiOpenai.RealtimeServerEventResponseContentPartDone

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventId** | **String** | The unique ID of the server event. | 
**type** | **String** | The event type, must be &#x60;response.content_part.done&#x60;. | 
**responseId** | **String** | The ID of the response. | 
**itemId** | **String** | The ID of the item. | 
**outputIndex** | **Number** | The index of the output item in the response. | 
**contentIndex** | **Number** | The index of the content part in the item&#39;s content array. | 
**part** | [**RealtimeServerEventResponseContentPartDonePart**](RealtimeServerEventResponseContentPartDonePart.md) |  | 



## Enum: TypeEnum


* `response.content_part.done` (value: `"response.content_part.done"`)




