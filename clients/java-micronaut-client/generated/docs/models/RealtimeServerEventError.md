

# RealtimeServerEventError

Returned when an error occurs, which could be a client problem or a server  problem. Most errors are recoverable and the session will stay open, we  recommend to implementors to monitor and log error messages by default. 

The class is defined in **[RealtimeServerEventError.java](../../src/main/java/org/openapitools/model/RealtimeServerEventError.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventId** | `String` | The unique ID of the server event. | 
**type** | [**TypeEnum**](#TypeEnum) | The event type, must be &#x60;error&#x60;. | 
**error** | [`RealtimeServerEventErrorError`](RealtimeServerEventErrorError.md) |  | 


## TypeEnum

Name | Value
---- | -----
ERROR | `"error"`



