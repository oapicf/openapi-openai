# openapi::RealtimeServerEventResponseOutputItemDone

Returned when an Item is done streaming. Also emitted when a Response is  interrupted, incomplete, or cancelled. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **character** | The unique ID of the server event. | 
**type** | **character** | The event type, must be &#x60;response.output_item.done&#x60;. | [Enum: [response.output_item.done]] 
**response_id** | **character** | The ID of the Response to which the item belongs. | 
**output_index** | **integer** | The index of the output item in the Response. | 
**item** | [**RealtimeConversationItem**](RealtimeConversationItem.md) |  | 


