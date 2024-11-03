

# MessageContentTextAnnotationsFileCitationObject

A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \"retrieval\" tool to search files.

The class is defined in **[MessageContentTextAnnotationsFileCitationObject.java](../../src/main/java/org/openapitools/model/MessageContentTextAnnotationsFileCitationObject.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | Always &#x60;file_citation&#x60;. | 
**text** | `String` | The text in the message content that needs to be replaced. | 
**fileCitation** | [`MessageContentTextAnnotationsFileCitationObjectFileCitation`](MessageContentTextAnnotationsFileCitationObjectFileCitation.md) |  | 
**startIndex** | `Integer` |  | 
**endIndex** | `Integer` |  | 

## TypeEnum

Name | Value
---- | -----
FILE_CITATION | `"file_citation"`






