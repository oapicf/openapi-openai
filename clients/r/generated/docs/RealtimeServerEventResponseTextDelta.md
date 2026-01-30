# openapi::RealtimeServerEventResponseTextDelta

Returned when the text value of a \"text\" content part is updated.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **character** | The unique ID of the server event. | 
**type** | **character** | The event type, must be &#x60;response.text.delta&#x60;. | [Enum: [response.text.delta]] 
**response_id** | **character** | The ID of the response. | 
**item_id** | **character** | The ID of the item. | 
**output_index** | **integer** | The index of the output item in the response. | 
**content_index** | **integer** | The index of the content part in the item&#39;s content array. | 
**delta** | **character** | The text delta. | 


