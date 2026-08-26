

# RealtimeServerEventSessionUpdated

Returned when a session is updated with a `session.update` event, unless  there is an error. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventId** | **String** | The unique ID of the server event. |  |
|**type** | [**TypeEnum**](#TypeEnum) | The event type, must be &#x60;session.updated&#x60;. |  |
|**session** | [**RealtimeSession**](RealtimeSession.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SESSION_UPDATED | &quot;session.updated&quot; |



