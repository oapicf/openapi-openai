# openapi::RealtimeServerEventResponseCreated

Returned when a new Response is created. The first event of response creation, where the response is in an initial state of `in_progress`. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **character** | The unique ID of the server event. | 
**type** | **character** | The event type, must be &#x60;response.created&#x60;. | [Enum: [response.created]] 
**response** | [**RealtimeResponse**](RealtimeResponse.md) |  | 


