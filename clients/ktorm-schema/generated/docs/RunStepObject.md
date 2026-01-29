
# Table `RunStepObject`
(mapped from: RunStepObject)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | The identifier of the run step, which can be referenced in API endpoints. | 
**object** | object | text NOT NULL |  | [**object**](#Object) | The object type, which is always &#x60;thread.run.step&#x60;. | 
**createdAt** | created_at | int NOT NULL |  | **kotlin.Int** | The Unix timestamp (in seconds) for when the run step was created. | 
**assistantId** | assistant_id | text NOT NULL |  | **kotlin.String** | The ID of the [assistant](/docs/api-reference/assistants) associated with the run step. | 
**threadId** | thread_id | text NOT NULL |  | **kotlin.String** | The ID of the [thread](/docs/api-reference/threads) that was run. | 
**runId** | run_id | text NOT NULL |  | **kotlin.String** | The ID of the [run](/docs/api-reference/runs) that this run step is a part of. | 
**type** | type | text NOT NULL |  | [**type**](#Type) | The type of run step, which can be either &#x60;message_creation&#x60; or &#x60;tool_calls&#x60;. | 
**status** | status | text NOT NULL |  | [**status**](#Status) | The status of the run step, which can be either &#x60;in_progress&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, or &#x60;expired&#x60;. | 
**stepDetails** | step_details | long NOT NULL |  | [**RunStepObjectStepDetails**](RunStepObjectStepDetails.md) |  |  [foreignkey]
**lastError** | last_error | long NOT NULL |  | [**RunStepObjectLastError**](RunStepObjectLastError.md) |  |  [foreignkey]
**expiredAt** | expired_at | int NOT NULL |  | **kotlin.Int** | The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired. | 
**cancelledAt** | cancelled_at | int NOT NULL |  | **kotlin.Int** | The Unix timestamp (in seconds) for when the run step was cancelled. | 
**failedAt** | failed_at | int NOT NULL |  | **kotlin.Int** | The Unix timestamp (in seconds) for when the run step failed. | 
**completedAt** | completed_at | int NOT NULL |  | **kotlin.Int** | The Unix timestamp (in seconds) for when the run step completed. | 
**metadata** | metadata | blob NOT NULL |  | [**kotlin.Any**](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  | 
**usage** | usage | long NOT NULL |  | [**RunStepCompletionUsage**](RunStepCompletionUsage.md) |  |  [foreignkey]


















