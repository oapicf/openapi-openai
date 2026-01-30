

# RealtimeServerEventSessionCreated

Returned when a Session is created. Emitted automatically when a new  connection is established as the first server event. This event will contain  the default Session configuration. 

The class is defined in **[RealtimeServerEventSessionCreated.java](../../src/main/java/org/openapitools/model/RealtimeServerEventSessionCreated.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventId** | `String` | The unique ID of the server event. | 
**type** | [**TypeEnum**](#TypeEnum) | The event type, must be &#x60;session.created&#x60;. | 
**session** | [`RealtimeSession`](RealtimeSession.md) |  | 


## TypeEnum

Name | Value
---- | -----
SESSION_CREATED | `"session.created"`



