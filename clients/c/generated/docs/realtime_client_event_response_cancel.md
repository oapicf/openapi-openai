# realtime_client_event_response_cancel_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **char \*** | Optional client-generated ID used to identify this event. | [optional] 
**type** | **openai_api_realtime_client_event_response_cancel_TYPE_e** | The event type, must be &#x60;response.cancel&#x60;. | 
**response_id** | **char \*** | A specific response ID to cancel - if not provided, will cancel an  in-progress response in the default conversation.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


