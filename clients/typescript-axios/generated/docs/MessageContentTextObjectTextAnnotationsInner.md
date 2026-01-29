# MessageContentTextObjectTextAnnotationsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **string** | Always &#x60;file_citation&#x60;. | [default to undefined]
**text** | **string** | The text in the message content that needs to be replaced. | [default to undefined]
**file_citation** | [**MessageContentTextAnnotationsFileCitationObjectFileCitation**](MessageContentTextAnnotationsFileCitationObjectFileCitation.md) |  | [default to undefined]
**start_index** | **number** |  | [default to undefined]
**end_index** | **number** |  | [default to undefined]
**file_path** | [**MessageContentTextAnnotationsFilePathObjectFilePath**](MessageContentTextAnnotationsFilePathObjectFilePath.md) |  | [default to undefined]

## Example

```typescript
import { MessageContentTextObjectTextAnnotationsInner } from './api';

const instance: MessageContentTextObjectTextAnnotationsInner = {
    type,
    text,
    file_citation,
    start_index,
    end_index,
    file_path,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
