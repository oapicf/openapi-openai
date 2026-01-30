# OpenapiOpenai.FineTuningJobEvent

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **String** | The object type, which is always \&quot;fine_tuning.job.event\&quot;. | 
**id** | **String** | The object identifier. | 
**createdAt** | **Number** | The Unix timestamp (in seconds) for when the fine-tuning job was created. | 
**level** | **String** | The log level of the event. | 
**message** | **String** | The message of the event. | 
**type** | **String** | The type of event. | [optional] 
**data** | **Object** | The data associated with the event. | [optional] 



## Enum: ObjectEnum


* `fine_tuning.job.event` (value: `"fine_tuning.job.event"`)





## Enum: LevelEnum


* `info` (value: `"info"`)

* `warn` (value: `"warn"`)

* `error` (value: `"error"`)





## Enum: TypeEnum


* `message` (value: `"message"`)

* `metrics` (value: `"metrics"`)




