# openapi::RealtimeServerEventSessionUpdated

Returned when a session is updated with a `session.update` event, unless  there is an error. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **character** | The unique ID of the server event. | 
**type** | **character** | The event type, must be &#x60;session.updated&#x60;. | [Enum: [session.updated]] 
**session** | [**RealtimeSession**](RealtimeSession.md) |  | 


