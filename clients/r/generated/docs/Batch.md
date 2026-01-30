# openapi::Batch


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **character** |  | 
**object** | **character** | The object type, which is always &#x60;batch&#x60;. | [Enum: [batch]] 
**endpoint** | **character** | The OpenAI API endpoint used by the batch. | 
**errors** | [**BatchErrors**](Batch_errors.md) |  | [optional] 
**input_file_id** | **character** | The ID of the input file for the batch. | 
**completion_window** | **character** | The time frame within which the batch should be processed. | 
**status** | **character** | The current status of the batch. | [Enum: [validating, failed, in_progress, finalizing, completed, expired, cancelling, cancelled]] 
**output_file_id** | **character** | The ID of the file containing the outputs of successfully executed requests. | [optional] 
**error_file_id** | **character** | The ID of the file containing the outputs of requests with errors. | [optional] 
**created_at** | **integer** | The Unix timestamp (in seconds) for when the batch was created. | 
**in_progress_at** | **integer** | The Unix timestamp (in seconds) for when the batch started processing. | [optional] 
**expires_at** | **integer** | The Unix timestamp (in seconds) for when the batch will expire. | [optional] 
**finalizing_at** | **integer** | The Unix timestamp (in seconds) for when the batch started finalizing. | [optional] 
**completed_at** | **integer** | The Unix timestamp (in seconds) for when the batch was completed. | [optional] 
**failed_at** | **integer** | The Unix timestamp (in seconds) for when the batch failed. | [optional] 
**expired_at** | **integer** | The Unix timestamp (in seconds) for when the batch expired. | [optional] 
**cancelling_at** | **integer** | The Unix timestamp (in seconds) for when the batch started cancelling. | [optional] 
**cancelled_at** | **integer** | The Unix timestamp (in seconds) for when the batch was cancelled. | [optional] 
**request_counts** | [**BatchRequestCounts**](Batch_request_counts.md) |  | [optional] 
**metadata** | **object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [optional] 


