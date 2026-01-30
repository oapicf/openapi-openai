# realtime_response_status_details_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **openai_api_realtime_response_status_details_TYPE_e** | The type of error that caused the response to fail, corresponding  with the &#x60;status&#x60; field (&#x60;completed&#x60;, &#x60;cancelled&#x60;, &#x60;incomplete&#x60;,  &#x60;failed&#x60;).  | [optional] 
**reason** | **openai_api_realtime_response_status_details_REASON_e** | The reason the Response did not complete. For a &#x60;cancelled&#x60; Response,  one of &#x60;turn_detected&#x60; (the server VAD detected a new start of speech)  or &#x60;client_cancelled&#x60; (the client sent a cancel event). For an  &#x60;incomplete&#x60; Response, one of &#x60;max_output_tokens&#x60; or &#x60;content_filter&#x60;  (the server-side safety filter activated and cut off the response).  | [optional] 
**error** | [**realtime_response_status_details_error_t**](realtime_response_status_details_error.md) \* |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


