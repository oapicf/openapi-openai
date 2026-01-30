# openapi::RealtimeServerEventResponseFunctionCallArgumentsDelta

Returned when the model-generated function call arguments are updated. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **character** | The unique ID of the server event. | 
**type** | **character** | The event type, must be &#x60;response.function_call_arguments.delta&#x60;.  | [Enum: [response.function_call_arguments.delta]] 
**response_id** | **character** | The ID of the response. | 
**item_id** | **character** | The ID of the function call item. | 
**output_index** | **integer** | The index of the output item in the response. | 
**call_id** | **character** | The ID of the function call. | 
**delta** | **character** | The arguments delta as a JSON string. | 


