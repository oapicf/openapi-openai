# openapi::RealtimeServerEventSessionCreated

Returned when a Session is created. Emitted automatically when a new  connection is established as the first server event. This event will contain  the default Session configuration. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **character** | The unique ID of the server event. | 
**type** | **character** | The event type, must be &#x60;session.created&#x60;. | [Enum: [session.created]] 
**session** | [**RealtimeSession**](RealtimeSession.md) |  | 


