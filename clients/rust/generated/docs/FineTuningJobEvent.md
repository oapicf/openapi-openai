# FineTuningJobEvent

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **Object** | The object type, which is always \"fine_tuning.job.event\". (enum: fine_tuning.job.event) | 
**id** | **String** | The object identifier. | 
**created_at** | **i32** | The Unix timestamp (in seconds) for when the fine-tuning job was created. | 
**level** | **Level** | The log level of the event. (enum: info, warn, error) | 
**message** | **String** | The message of the event. | 
**r#type** | Option<**Type**> | The type of event. (enum: message, metrics) | [optional]
**data** | Option<**serde_json::Value**> | The data associated with the event. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


