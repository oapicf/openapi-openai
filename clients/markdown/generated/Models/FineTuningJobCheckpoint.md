# FineTuningJobCheckpoint
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **String** | The checkpoint identifier, which can be referenced in the API endpoints. | [default to null] |
| **created\_at** | **Integer** | The Unix timestamp (in seconds) for when the checkpoint was created. | [default to null] |
| **fine\_tuned\_model\_checkpoint** | **String** | The name of the fine-tuned checkpoint model that is created. | [default to null] |
| **step\_number** | **Integer** | The step number that the checkpoint was created at. | [default to null] |
| **metrics** | [**FineTuningJobCheckpoint_metrics**](FineTuningJobCheckpoint_metrics.md) |  | [default to null] |
| **fine\_tuning\_job\_id** | **String** | The name of the fine-tuning job that this checkpoint was created from. | [default to null] |
| **object** | **String** | The object type, which is always \&quot;fine_tuning.job.checkpoint\&quot;. | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

