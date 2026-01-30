

# RealtimeServerEventResponseDone

Returned when a Response is done streaming. Always emitted, no matter the  final state. The Response object included in the `response.done` event will  include all output Items in the Response but will omit the raw audio data. 

The class is defined in **[RealtimeServerEventResponseDone.java](../../src/main/java/org/openapitools/model/RealtimeServerEventResponseDone.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventId** | `String` | The unique ID of the server event. | 
**type** | [**TypeEnum**](#TypeEnum) | The event type, must be &#x60;response.done&#x60;. | 
**response** | [`RealtimeResponse`](RealtimeResponse.md) |  | 


## TypeEnum

Name | Value
---- | -----
RESPONSE_DONE | `"response.done"`



