# RunStepObject
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | The identifier of the run step, which can be referenced in API endpoints. | 
**Object** | **String** | The object type, which is always &#x60;thread.run.step&#x60;. | 
**CreatedAt** | **Int32** | The Unix timestamp (in seconds) for when the run step was created. | 
**AssistantId** | **String** | The ID of the [assistant](/docs/api-reference/assistants) associated with the run step. | 
**ThreadId** | **String** | The ID of the [thread](/docs/api-reference/threads) that was run. | 
**RunId** | **String** | The ID of the [run](/docs/api-reference/runs) that this run step is a part of. | 
**Type** | **String** | The type of run step, which can be either &#x60;message_creation&#x60; or &#x60;tool_calls&#x60;. | 
**Status** | **String** | The status of the run step, which can be either &#x60;in_progress&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, or &#x60;expired&#x60;. | 
**StepDetails** | [**RunStepObjectStepDetails**](RunStepObjectStepDetails.md) |  | 
**LastError** | [**RunStepObjectLastError**](RunStepObjectLastError.md) |  | 
**ExpiredAt** | **Int32** | The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired. | 
**CancelledAt** | **Int32** | The Unix timestamp (in seconds) for when the run step was cancelled. | 
**FailedAt** | **Int32** | The Unix timestamp (in seconds) for when the run step failed. | 
**CompletedAt** | **Int32** | The Unix timestamp (in seconds) for when the run step completed. | 
**Metadata** | [**SystemCollectionsHashtable**](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  | 
**Usage** | [**RunStepCompletionUsage**](RunStepCompletionUsage.md) |  | 

## Examples

- Prepare the resource
```powershell
$RunStepObject = Initialize-PSOpenAPIToolsRunStepObject  -Id null `
 -Object null `
 -CreatedAt null `
 -AssistantId null `
 -ThreadId null `
 -RunId null `
 -Type null `
 -Status null `
 -StepDetails null `
 -LastError null `
 -ExpiredAt null `
 -CancelledAt null `
 -FailedAt null `
 -CompletedAt null `
 -Metadata null `
 -Usage null
```

- Convert the resource to JSON
```powershell
$RunStepObject | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

