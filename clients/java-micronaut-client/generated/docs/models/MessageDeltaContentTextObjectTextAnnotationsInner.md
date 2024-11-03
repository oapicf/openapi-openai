

# MessageDeltaContentTextObjectTextAnnotationsInner

The class is defined in **[MessageDeltaContentTextObjectTextAnnotationsInner.java](../../src/main/java/org/openapitools/model/MessageDeltaContentTextObjectTextAnnotationsInner.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | `Integer` | The index of the annotation in the text content part. | 
**type** | [**TypeEnum**](#TypeEnum) | Always &#x60;file_citation&#x60;. | 
**text** | `String` | The text in the message content that needs to be replaced. |  [optional property]
**fileCitation** | [`MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation`](MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation.md) |  |  [optional property]
**startIndex** | `Integer` |  |  [optional property]
**endIndex** | `Integer` |  |  [optional property]
**filePath** | [`MessageDeltaContentTextAnnotationsFilePathObjectFilePath`](MessageDeltaContentTextAnnotationsFilePathObjectFilePath.md) |  |  [optional property]


## TypeEnum

Name | Value
---- | -----
CITATION | `"file_citation"`
PATH | `"file_path"`







