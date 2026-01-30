# Org.OpenAPITools.Model.RealtimeClientEventResponseCancel
Send this event to cancel an in-progress response. The server will respond  with a `response.cancelled` event or an error if there is no response to  cancel. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | The event type, must be &#x60;response.cancel&#x60;. | 
**EventId** | **string** | Optional client-generated ID used to identify this event. | [optional] 
**ResponseId** | **string** | A specific response ID to cancel - if not provided, will cancel an  in-progress response in the default conversation.  | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

