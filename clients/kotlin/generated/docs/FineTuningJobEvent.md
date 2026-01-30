
# FineTuningJobEvent

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **&#x60;object&#x60;** | [**inline**](#&#x60;Object&#x60;) | The object type, which is always \&quot;fine_tuning.job.event\&quot;. |  |
| **id** | **kotlin.String** | The object identifier. |  |
| **createdAt** | **kotlin.Int** | The Unix timestamp (in seconds) for when the fine-tuning job was created. |  |
| **level** | [**inline**](#Level) | The log level of the event. |  |
| **message** | **kotlin.String** | The message of the event. |  |
| **type** | [**inline**](#Type) | The type of event. |  [optional] |
| **&#x60;data&#x60;** | [**kotlin.Any**](.md) | The data associated with the event. |  [optional] |


<a id="`Object`"></a>
## Enum: object
| Name | Value |
| ---- | ----- |
| &#x60;object&#x60; | fine_tuning.job.event |


<a id="Level"></a>
## Enum: level
| Name | Value |
| ---- | ----- |
| level | info, warn, error |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | message, metrics |



