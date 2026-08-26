

# RealtimeServerEventError

Returned when an error occurs, which could be a client problem or a server  problem. Most errors are recoverable and the session will stay open, we  recommend to implementors to monitor and log error messages by default. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventId** | **String** | The unique ID of the server event. |  |
|**type** | [**TypeEnum**](#TypeEnum) | The event type, must be &#x60;error&#x60;. |  |
|**error** | [**RealtimeServerEventErrorError**](RealtimeServerEventErrorError.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ERROR | &quot;error&quot; |



