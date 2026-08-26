# Batch

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  | 
**object** | **Object** | The object type, which is always `batch`. (enum: batch) | 
**endpoint** | **String** | The OpenAI API endpoint used by the batch. | 
**errors** | Option<[**models::BatchErrors**](BatchErrors.md)> |  | [optional]
**input_file_id** | **String** | The ID of the input file for the batch. | 
**completion_window** | **String** | The time frame within which the batch should be processed. | 
**status** | **Status** | The current status of the batch. (enum: validating, failed, in_progress, finalizing, completed, expired, cancelling, cancelled) | 
**output_file_id** | Option<**String**> | The ID of the file containing the outputs of successfully executed requests. | [optional]
**error_file_id** | Option<**String**> | The ID of the file containing the outputs of requests with errors. | [optional]
**created_at** | **i32** | The Unix timestamp (in seconds) for when the batch was created. | 
**in_progress_at** | Option<**i32**> | The Unix timestamp (in seconds) for when the batch started processing. | [optional]
**expires_at** | Option<**i32**> | The Unix timestamp (in seconds) for when the batch will expire. | [optional]
**finalizing_at** | Option<**i32**> | The Unix timestamp (in seconds) for when the batch started finalizing. | [optional]
**completed_at** | Option<**i32**> | The Unix timestamp (in seconds) for when the batch was completed. | [optional]
**failed_at** | Option<**i32**> | The Unix timestamp (in seconds) for when the batch failed. | [optional]
**expired_at** | Option<**i32**> | The Unix timestamp (in seconds) for when the batch expired. | [optional]
**cancelling_at** | Option<**i32**> | The Unix timestamp (in seconds) for when the batch started cancelling. | [optional]
**cancelled_at** | Option<**i32**> | The Unix timestamp (in seconds) for when the batch was cancelled. | [optional]
**request_counts** | Option<[**models::BatchRequestCounts**](BatchRequestCounts.md)> |  | [optional]
**metadata** | Option<**serde_json::Value**> | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


