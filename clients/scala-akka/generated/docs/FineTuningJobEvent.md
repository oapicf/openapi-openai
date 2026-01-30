

# FineTuningJobEvent

Fine-tuning job event object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`object`** | [**`Object`**](#`Object`) | The object type, which is always \&quot;fine_tuning.job.event\&quot;. | 
**id** | **String** | The object identifier. | 
**createdAt** | **Int** | The Unix timestamp (in seconds) for when the fine-tuning job was created. | 
**level** | [**Level**](#Level) | The log level of the event. | 
**message** | **String** | The message of the event. | 
**`type`** | [**`Type`**](#`Type`) | The type of event. |  [optional]
**data** | **Any** | The data associated with the event. |  [optional]


## Enum: `Object`
Allowed values: [fine_tuning.job.event]



## Enum: Level
Allowed values: [info, warn, error]



## Enum: `Type`
Allowed values: [message, metrics]




