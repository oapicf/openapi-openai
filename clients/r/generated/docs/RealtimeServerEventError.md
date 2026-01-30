# openapi::RealtimeServerEventError

Returned when an error occurs, which could be a client problem or a server  problem. Most errors are recoverable and the session will stay open, we  recommend to implementors to monitor and log error messages by default. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **character** | The unique ID of the server event. | 
**type** | **character** | The event type, must be &#x60;error&#x60;. | [Enum: [error]] 
**error** | [**RealtimeServerEventErrorError**](RealtimeServerEventError_error.md) |  | 


