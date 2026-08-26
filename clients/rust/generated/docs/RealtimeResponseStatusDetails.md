# RealtimeResponseStatusDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**r#type** | Option<**Type**> | The type of error that caused the response to fail, corresponding  with the `status` field (`completed`, `cancelled`, `incomplete`,  `failed`).  (enum: completed, cancelled, failed, incomplete) | [optional]
**reason** | Option<**Reason**> | The reason the Response did not complete. For a `cancelled` Response,  one of `turn_detected` (the server VAD detected a new start of speech)  or `client_cancelled` (the client sent a cancel event). For an  `incomplete` Response, one of `max_output_tokens` or `content_filter`  (the server-side safety filter activated and cut off the response).  (enum: turn_detected, client_cancelled, max_output_tokens, content_filter) | [optional]
**error** | Option<[**models::RealtimeResponseStatusDetailsError**](RealtimeResponseStatusDetailsError.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


