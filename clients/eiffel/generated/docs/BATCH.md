# BATCH

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**STRING_32**](STRING_32.md) |  | [default to null]
**object** | [**STRING_32**](STRING_32.md) | The object type, which is always &#x60;batch&#x60;. | [default to null]
**endpoint** | [**STRING_32**](STRING_32.md) | The OpenAI API endpoint used by the batch. | [default to null]
**errors** | [**BATCH_ERRORS**](Batch_errors.md) |  | [optional] [default to null]
**input_file_id** | [**STRING_32**](STRING_32.md) | The ID of the input file for the batch. | [default to null]
**completion_window** | [**STRING_32**](STRING_32.md) | The time frame within which the batch should be processed. | [default to null]
**status** | [**STRING_32**](STRING_32.md) | The current status of the batch. | [default to null]
**output_file_id** | [**STRING_32**](STRING_32.md) | The ID of the file containing the outputs of successfully executed requests. | [optional] [default to null]
**error_file_id** | [**STRING_32**](STRING_32.md) | The ID of the file containing the outputs of requests with errors. | [optional] [default to null]
**created_at** | **INTEGER_32** | The Unix timestamp (in seconds) for when the batch was created. | [default to null]
**in_progress_at** | **INTEGER_32** | The Unix timestamp (in seconds) for when the batch started processing. | [optional] [default to null]
**expires_at** | **INTEGER_32** | The Unix timestamp (in seconds) for when the batch will expire. | [optional] [default to null]
**finalizing_at** | **INTEGER_32** | The Unix timestamp (in seconds) for when the batch started finalizing. | [optional] [default to null]
**completed_at** | **INTEGER_32** | The Unix timestamp (in seconds) for when the batch was completed. | [optional] [default to null]
**failed_at** | **INTEGER_32** | The Unix timestamp (in seconds) for when the batch failed. | [optional] [default to null]
**expired_at** | **INTEGER_32** | The Unix timestamp (in seconds) for when the batch expired. | [optional] [default to null]
**cancelling_at** | **INTEGER_32** | The Unix timestamp (in seconds) for when the batch started cancelling. | [optional] [default to null]
**cancelled_at** | **INTEGER_32** | The Unix timestamp (in seconds) for when the batch was cancelled. | [optional] [default to null]
**request_counts** | [**BATCH_REQUEST_COUNTS**](Batch_request_counts.md) |  | [optional] [default to null]
**metadata** | [**ANY**](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


