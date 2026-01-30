# openapi::RealtimeServerEventResponseContentPartAdded

Returned when a new content part is added to an assistant message item during response generation. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **character** | The unique ID of the server event. | 
**type** | **character** | The event type, must be &#x60;response.content_part.added&#x60;. | [Enum: [response.content_part.added]] 
**response_id** | **character** | The ID of the response. | 
**item_id** | **character** | The ID of the item to which the content part was added. | 
**output_index** | **integer** | The index of the output item in the response. | 
**content_index** | **integer** | The index of the content part in the item&#39;s content array. | 
**part** | [**RealtimeServerEventResponseContentPartAddedPart**](RealtimeServerEventResponseContentPartAdded_part.md) |  | 


