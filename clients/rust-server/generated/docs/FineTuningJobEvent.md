# FineTuningJobEvent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | [***models::FineTuningJobEventObject**](FineTuningJobEvent_object.md) |  | 
**id** | **String** | The object identifier. | 
**created_at** | **i32** | The Unix timestamp (in seconds) for when the fine-tuning job was created. | 
**level** | [***models::FineTuningJobEventLevel**](FineTuningJobEvent_level.md) |  | 
**message** | **String** | The message of the event. | 
**r#type** | [***models::FineTuningJobEventType**](FineTuningJobEvent_type.md) |  | [optional] [default to None]
**data** | [***serde_json::Value**](.md) | The data associated with the event. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


