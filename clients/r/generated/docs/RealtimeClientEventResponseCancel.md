# openapi::RealtimeClientEventResponseCancel

Send this event to cancel an in-progress response. The server will respond  with a `response.cancelled` event or an error if there is no response to  cancel. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **character** | Optional client-generated ID used to identify this event. | [optional] 
**type** | **character** | The event type, must be &#x60;response.cancel&#x60;. | [Enum: [response.cancel]] 
**response_id** | **character** | A specific response ID to cancel - if not provided, will cancel an  in-progress response in the default conversation.  | [optional] 


