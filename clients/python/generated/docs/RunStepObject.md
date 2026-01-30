# RunStepObject

Represents a step in execution of a run. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The identifier of the run step, which can be referenced in API endpoints. | 
**object** | **str** | The object type, which is always &#x60;thread.run.step&#x60;. | 
**created_at** | **int** | The Unix timestamp (in seconds) for when the run step was created. | 
**assistant_id** | **str** | The ID of the [assistant](/docs/api-reference/assistants) associated with the run step. | 
**thread_id** | **str** | The ID of the [thread](/docs/api-reference/threads) that was run. | 
**run_id** | **str** | The ID of the [run](/docs/api-reference/runs) that this run step is a part of. | 
**type** | **str** | The type of run step, which can be either &#x60;message_creation&#x60; or &#x60;tool_calls&#x60;. | 
**status** | **str** | The status of the run step, which can be either &#x60;in_progress&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, or &#x60;expired&#x60;. | 
**step_details** | [**RunStepObjectStepDetails**](RunStepObjectStepDetails.md) |  | 
**last_error** | [**RunStepObjectLastError**](RunStepObjectLastError.md) |  | 
**expired_at** | **int** | The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired. | 
**cancelled_at** | **int** | The Unix timestamp (in seconds) for when the run step was cancelled. | 
**failed_at** | **int** | The Unix timestamp (in seconds) for when the run step failed. | 
**completed_at** | **int** | The Unix timestamp (in seconds) for when the run step completed. | 
**metadata** | **object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | 
**usage** | [**RunStepCompletionUsage**](RunStepCompletionUsage.md) |  | 

## Example

```python
from openapiopenai.models.run_step_object import RunStepObject

# TODO update the JSON string below
json = "{}"
# create an instance of RunStepObject from a JSON string
run_step_object_instance = RunStepObject.from_json(json)
# print the JSON string representation of the object
print(RunStepObject.to_json())

# convert the object into a dict
run_step_object_dict = run_step_object_instance.to_dict()
# create an instance of RunStepObject from a dict
run_step_object_from_dict = RunStepObject.from_dict(run_step_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


