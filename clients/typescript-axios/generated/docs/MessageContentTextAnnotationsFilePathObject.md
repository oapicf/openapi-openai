# MessageContentTextAnnotationsFilePathObject

A URL for the file that\'s generated when the assistant used the `code_interpreter` tool to generate a file.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **string** | Always &#x60;file_path&#x60;. | [default to undefined]
**text** | **string** | The text in the message content that needs to be replaced. | [default to undefined]
**file_path** | [**MessageContentTextAnnotationsFilePathObjectFilePath**](MessageContentTextAnnotationsFilePathObjectFilePath.md) |  | [default to undefined]
**start_index** | **number** |  | [default to undefined]
**end_index** | **number** |  | [default to undefined]

## Example

```typescript
import { MessageContentTextAnnotationsFilePathObject } from './api';

const instance: MessageContentTextAnnotationsFilePathObject = {
    type,
    text,
    file_path,
    start_index,
    end_index,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
