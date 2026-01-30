# Batch


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** |  | [default to undefined]
**object** | **string** | The object type, which is always &#x60;batch&#x60;. | [default to undefined]
**endpoint** | **string** | The OpenAI API endpoint used by the batch. | [default to undefined]
**errors** | [**BatchErrors**](BatchErrors.md) |  | [optional] [default to undefined]
**input_file_id** | **string** | The ID of the input file for the batch. | [default to undefined]
**completion_window** | **string** | The time frame within which the batch should be processed. | [default to undefined]
**status** | **string** | The current status of the batch. | [default to undefined]
**output_file_id** | **string** | The ID of the file containing the outputs of successfully executed requests. | [optional] [default to undefined]
**error_file_id** | **string** | The ID of the file containing the outputs of requests with errors. | [optional] [default to undefined]
**created_at** | **number** | The Unix timestamp (in seconds) for when the batch was created. | [default to undefined]
**in_progress_at** | **number** | The Unix timestamp (in seconds) for when the batch started processing. | [optional] [default to undefined]
**expires_at** | **number** | The Unix timestamp (in seconds) for when the batch will expire. | [optional] [default to undefined]
**finalizing_at** | **number** | The Unix timestamp (in seconds) for when the batch started finalizing. | [optional] [default to undefined]
**completed_at** | **number** | The Unix timestamp (in seconds) for when the batch was completed. | [optional] [default to undefined]
**failed_at** | **number** | The Unix timestamp (in seconds) for when the batch failed. | [optional] [default to undefined]
**expired_at** | **number** | The Unix timestamp (in seconds) for when the batch expired. | [optional] [default to undefined]
**cancelling_at** | **number** | The Unix timestamp (in seconds) for when the batch started cancelling. | [optional] [default to undefined]
**cancelled_at** | **number** | The Unix timestamp (in seconds) for when the batch was cancelled. | [optional] [default to undefined]
**request_counts** | [**BatchRequestCounts**](BatchRequestCounts.md) |  | [optional] [default to undefined]
**metadata** | **object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [optional] [default to undefined]

## Example

```typescript
import { Batch } from './api';

const instance: Batch = {
    id,
    object,
    endpoint,
    errors,
    input_file_id,
    completion_window,
    status,
    output_file_id,
    error_file_id,
    created_at,
    in_progress_at,
    expires_at,
    finalizing_at,
    completed_at,
    failed_at,
    expired_at,
    cancelling_at,
    cancelled_at,
    request_counts,
    metadata,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
