# Batch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  | 
**object** | [***models::BatchObject**](Batch_object.md) |  | 
**endpoint** | **String** | The OpenAI API endpoint used by the batch. | 
**errors** | [***models::BatchErrors**](Batch_errors.md) |  | [optional] [default to None]
**input_file_id** | **String** | The ID of the input file for the batch. | 
**completion_window** | **String** | The time frame within which the batch should be processed. | 
**status** | [***models::BatchStatus**](Batch_status.md) |  | 
**output_file_id** | **String** | The ID of the file containing the outputs of successfully executed requests. | [optional] [default to None]
**error_file_id** | **String** | The ID of the file containing the outputs of requests with errors. | [optional] [default to None]
**created_at** | **i32** | The Unix timestamp (in seconds) for when the batch was created. | 
**in_progress_at** | **i32** | The Unix timestamp (in seconds) for when the batch started processing. | [optional] [default to None]
**expires_at** | **i32** | The Unix timestamp (in seconds) for when the batch will expire. | [optional] [default to None]
**finalizing_at** | **i32** | The Unix timestamp (in seconds) for when the batch started finalizing. | [optional] [default to None]
**completed_at** | **i32** | The Unix timestamp (in seconds) for when the batch was completed. | [optional] [default to None]
**failed_at** | **i32** | The Unix timestamp (in seconds) for when the batch failed. | [optional] [default to None]
**expired_at** | **i32** | The Unix timestamp (in seconds) for when the batch expired. | [optional] [default to None]
**cancelling_at** | **i32** | The Unix timestamp (in seconds) for when the batch started cancelling. | [optional] [default to None]
**cancelled_at** | **i32** | The Unix timestamp (in seconds) for when the batch was cancelled. | [optional] [default to None]
**request_counts** | [***models::BatchRequestCounts**](Batch_request_counts.md) |  | [optional] [default to None]
**metadata** | [***serde_json::Value**](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


