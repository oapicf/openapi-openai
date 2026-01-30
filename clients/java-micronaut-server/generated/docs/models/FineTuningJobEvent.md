

# FineTuningJobEvent

Fine-tuning job event object

The class is defined in **[FineTuningJobEvent.java](../../src/main/java/org/openapitools/model/FineTuningJobEvent.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_object** | [**ObjectEnum**](#ObjectEnum) | The object type, which is always \&quot;fine_tuning.job.event\&quot;. | 
**id** | `String` | The object identifier. | 
**createdAt** | `Integer` | The Unix timestamp (in seconds) for when the fine-tuning job was created. | 
**level** | [**LevelEnum**](#LevelEnum) | The log level of the event. | 
**message** | `String` | The message of the event. | 
**type** | [**TypeEnum**](#TypeEnum) | The type of event. |  [optional property]
**data** | `Object` | The data associated with the event. |  [optional property]

## ObjectEnum

Name | Value
---- | -----
FINE_TUNING_JOB_EVENT | `"fine_tuning.job.event"`



## LevelEnum

Name | Value
---- | -----
INFO | `"info"`
WARN | `"warn"`
ERROR | `"error"`


## TypeEnum

Name | Value
---- | -----
MESSAGE | `"message"`
METRICS | `"metrics"`



