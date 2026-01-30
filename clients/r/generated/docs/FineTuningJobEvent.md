# openapi::FineTuningJobEvent

Fine-tuning job event object

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **character** | The object type, which is always \&quot;fine_tuning.job.event\&quot;. | [Enum: [fine_tuning.job.event]] 
**id** | **character** | The object identifier. | 
**created_at** | **integer** | The Unix timestamp (in seconds) for when the fine-tuning job was created. | 
**level** | **character** | The log level of the event. | [Enum: [info, warn, error]] 
**message** | **character** | The message of the event. | 
**type** | **character** | The type of event. | [optional] [Enum: [message, metrics]] 
**data** | **object** | The data associated with the event. | [optional] 


