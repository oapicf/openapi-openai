
# MessageDeltaContentTextObjectTextAnnotationsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **index** | **kotlin.Int** | The index of the annotation in the text content part. |  |
| **type** | [**inline**](#Type) | Always &#x60;file_citation&#x60;. |  |
| **text** | **kotlin.String** | The text in the message content that needs to be replaced. |  [optional] |
| **fileCitation** | [**MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation**](MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation.md) |  |  [optional] |
| **startIndex** | **kotlin.Int** |  |  [optional] |
| **endIndex** | **kotlin.Int** |  |  [optional] |
| **filePath** | [**MessageDeltaContentTextAnnotationsFilePathObjectFilePath**](MessageDeltaContentTextAnnotationsFilePathObjectFilePath.md) |  |  [optional] |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | file_citation, file_path |



