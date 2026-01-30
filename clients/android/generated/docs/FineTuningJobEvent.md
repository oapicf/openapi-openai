

# FineTuningJobEvent

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_object** | [**_objectEnum**](#_objectEnum) | The object type, which is always \&quot;fine_tuning.job.event\&quot;. | 
**id** | **String** | The object identifier. | 
**createdAt** | **Integer** | The Unix timestamp (in seconds) for when the fine-tuning job was created. | 
**level** | [**LevelEnum**](#LevelEnum) | The log level of the event. | 
**message** | **String** | The message of the event. | 
**type** | [**TypeEnum**](#TypeEnum) | The type of event. |  [optional]
**data** | **Object** | The data associated with the event. |  [optional]


## Enum: _objectEnum

Name | Value
---- | -----


## Enum: LevelEnum

Name | Value
---- | -----


## Enum: TypeEnum

Name | Value
---- | -----




