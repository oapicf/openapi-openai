# WWW::OpenAPIClient::Object::FineTuningJobEvent

## Load the model package
```perl
use WWW::OpenAPIClient::Object::FineTuningJobEvent;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **string** | The object type, which is always \&quot;fine_tuning.job.event\&quot;. | 
**id** | **string** | The object identifier. | 
**created_at** | **int** | The Unix timestamp (in seconds) for when the fine-tuning job was created. | 
**level** | **string** | The log level of the event. | 
**message** | **string** | The message of the event. | 
**type** | **string** | The type of event. | [optional] 
**data** | **object** | The data associated with the event. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


