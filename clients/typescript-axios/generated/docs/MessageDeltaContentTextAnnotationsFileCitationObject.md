# MessageDeltaContentTextAnnotationsFileCitationObject

A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \"retrieval\" tool to search files.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **number** | The index of the annotation in the text content part. | [default to undefined]
**type** | **string** | Always &#x60;file_citation&#x60;. | [default to undefined]
**text** | **string** | The text in the message content that needs to be replaced. | [optional] [default to undefined]
**file_citation** | [**MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation**](MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation.md) |  | [optional] [default to undefined]
**start_index** | **number** |  | [optional] [default to undefined]
**end_index** | **number** |  | [optional] [default to undefined]

## Example

```typescript
import { MessageDeltaContentTextAnnotationsFileCitationObject } from './api';

const instance: MessageDeltaContentTextAnnotationsFileCitationObject = {
    index,
    type,
    text,
    file_citation,
    start_index,
    end_index,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
