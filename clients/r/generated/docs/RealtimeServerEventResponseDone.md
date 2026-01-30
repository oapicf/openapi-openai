# openapi::RealtimeServerEventResponseDone

Returned when a Response is done streaming. Always emitted, no matter the  final state. The Response object included in the `response.done` event will  include all output Items in the Response but will omit the raw audio data. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **character** | The unique ID of the server event. | 
**type** | **character** | The event type, must be &#x60;response.done&#x60;. | [Enum: [response.done]] 
**response** | [**RealtimeResponse**](RealtimeResponse.md) |  | 


