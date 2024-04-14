

# MessageContentTextObjectTextAnnotationsInner

The class is defined in **[MessageContentTextObjectTextAnnotationsInner.java](../../src/main/java/org/openapitools/model/MessageContentTextObjectTextAnnotationsInner.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | Always &#x60;file_citation&#x60;. | 
**text** | `String` | The text in the message content that needs to be replaced. | 
**fileCitation** | [`MessageContentTextAnnotationsFileCitationObjectFileCitation`](MessageContentTextAnnotationsFileCitationObjectFileCitation.md) |  | 
**startIndex** | `Integer` |  | 
**endIndex** | `Integer` |  | 
**filePath** | [`MessageContentTextAnnotationsFilePathObjectFilePath`](MessageContentTextAnnotationsFilePathObjectFilePath.md) |  | 

## TypeEnum

Name | Value
---- | -----
CITATION | `"file_citation"`
PATH | `"file_path"`







