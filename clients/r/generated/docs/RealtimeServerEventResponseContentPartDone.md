# openapi::RealtimeServerEventResponseContentPartDone

Returned when a content part is done streaming in an assistant message item. Also emitted when a Response is interrupted, incomplete, or cancelled. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **character** | The unique ID of the server event. | 
**type** | **character** | The event type, must be &#x60;response.content_part.done&#x60;. | [Enum: [response.content_part.done]] 
**response_id** | **character** | The ID of the response. | 
**item_id** | **character** | The ID of the item. | 
**output_index** | **integer** | The index of the output item in the response. | 
**content_index** | **integer** | The index of the content part in the item&#39;s content array. | 
**part** | [**RealtimeServerEventResponseContentPartDonePart**](RealtimeServerEventResponseContentPartDone_part.md) |  | 


