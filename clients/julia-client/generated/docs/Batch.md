# Batch


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`id`** | **`String`** |  | [default to nothing]
**`object`** | **`String`** | The object type, which is always &#x60;batch&#x60;. | [default to nothing]
**`endpoint`** | **`String`** | The OpenAI API endpoint used by the batch. | [default to nothing]
**`errors`** | [**`*BatchErrors`**](BatchErrors.md) |  | [optional] [default to nothing]
**`input_file_id`** | **`String`** | The ID of the input file for the batch. | [default to nothing]
**`completion_window`** | **`String`** | The time frame within which the batch should be processed. | [default to nothing]
**`status`** | **`String`** | The current status of the batch. | [default to nothing]
**`output_file_id`** | **`String`** | The ID of the file containing the outputs of successfully executed requests. | [optional] [default to nothing]
**`error_file_id`** | **`String`** | The ID of the file containing the outputs of requests with errors. | [optional] [default to nothing]
**`created_at`** | **`Int64`** | The Unix timestamp (in seconds) for when the batch was created. | [default to nothing]
**`in_progress_at`** | **`Int64`** | The Unix timestamp (in seconds) for when the batch started processing. | [optional] [default to nothing]
**`expires_at`** | **`Int64`** | The Unix timestamp (in seconds) for when the batch will expire. | [optional] [default to nothing]
**`finalizing_at`** | **`Int64`** | The Unix timestamp (in seconds) for when the batch started finalizing. | [optional] [default to nothing]
**`completed_at`** | **`Int64`** | The Unix timestamp (in seconds) for when the batch was completed. | [optional] [default to nothing]
**`failed_at`** | **`Int64`** | The Unix timestamp (in seconds) for when the batch failed. | [optional] [default to nothing]
**`expired_at`** | **`Int64`** | The Unix timestamp (in seconds) for when the batch expired. | [optional] [default to nothing]
**`cancelling_at`** | **`Int64`** | The Unix timestamp (in seconds) for when the batch started cancelling. | [optional] [default to nothing]
**`cancelled_at`** | **`Int64`** | The Unix timestamp (in seconds) for when the batch was cancelled. | [optional] [default to nothing]
**`request_counts`** | [**`*BatchRequestCounts`**](BatchRequestCounts.md) |  | [optional] [default to nothing]
**`metadata`** | **`Any`** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


