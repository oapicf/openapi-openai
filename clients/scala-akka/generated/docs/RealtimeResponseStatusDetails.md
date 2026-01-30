

# RealtimeResponseStatusDetails

Additional details about the status.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`type`** | [**`Type`**](#`Type`) | The type of error that caused the response to fail, corresponding  with the &#x60;status&#x60; field (&#x60;completed&#x60;, &#x60;cancelled&#x60;, &#x60;incomplete&#x60;,  &#x60;failed&#x60;).  |  [optional]
**reason** | [**Reason**](#Reason) | The reason the Response did not complete. For a &#x60;cancelled&#x60; Response,  one of &#x60;turn_detected&#x60; (the server VAD detected a new start of speech)  or &#x60;client_cancelled&#x60; (the client sent a cancel event). For an  &#x60;incomplete&#x60; Response, one of &#x60;max_output_tokens&#x60; or &#x60;content_filter&#x60;  (the server-side safety filter activated and cut off the response).  |  [optional]
**error** | [**RealtimeResponseStatusDetailsError**](RealtimeResponseStatusDetailsError.md) |  |  [optional]


## Enum: `Type`
Allowed values: [completed, cancelled, failed, incomplete]



## Enum: Reason
Allowed values: [turn_detected, client_cancelled, max_output_tokens, content_filter]




