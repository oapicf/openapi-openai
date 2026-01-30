# Org.OpenAPITools.Model.RealtimeClientEventSessionUpdate
Send this event to update the session’s default configuration. The client may  send this event at any time to update the session configuration, and any  field may be updated at any time, except for \"voice\". The server will respond  with a `session.updated` event that shows the full effective configuration.  Only fields that are present are updated, thus the correct way to clear a  field like \"instructions\" is to pass an empty string. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | The event type, must be &#x60;session.update&#x60;. | 
**Session** | [**RealtimeSessionCreateRequest**](RealtimeSessionCreateRequest.md) |  | 
**EventId** | **string** | Optional client-generated ID used to identify this event. | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

