# MessageDeltaContentTextAnnotationsFilePathObject

A URL for the file that\'s generated when the assistant used the `code_interpreter` tool to generate a file.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **number** | The index of the annotation in the text content part. | [default to undefined]
**type** | **string** | Always &#x60;file_path&#x60;. | [default to undefined]
**text** | **string** | The text in the message content that needs to be replaced. | [optional] [default to undefined]
**file_path** | [**MessageDeltaContentTextAnnotationsFilePathObjectFilePath**](MessageDeltaContentTextAnnotationsFilePathObjectFilePath.md) |  | [optional] [default to undefined]
**start_index** | **number** |  | [optional] [default to undefined]
**end_index** | **number** |  | [optional] [default to undefined]

## Example

```typescript
import { MessageDeltaContentTextAnnotationsFilePathObject } from './api';

const instance: MessageDeltaContentTextAnnotationsFilePathObject = {
    index,
    type,
    text,
    file_path,
    start_index,
    end_index,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
