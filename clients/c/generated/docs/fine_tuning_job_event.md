# fine_tuning_job_event_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **openai_api_fine_tuning_job_event_OBJECT_e** | The object type, which is always \&quot;fine_tuning.job.event\&quot;. | 
**id** | **char \*** | The object identifier. | 
**created_at** | **int** | The Unix timestamp (in seconds) for when the fine-tuning job was created. | 
**level** | **openai_api_fine_tuning_job_event_LEVEL_e** | The log level of the event. | 
**message** | **char \*** | The message of the event. | 
**type** | **openai_api_fine_tuning_job_event_TYPE_e** | The type of event. | [optional] 
**data** | [**object_t**](.md) \* | The data associated with the event. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


