

# MessageDeltaContentTextAnnotationsFileCitationObject

A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \"retrieval\" tool to search files.

The class is defined in **[MessageDeltaContentTextAnnotationsFileCitationObject.java](../../src/main/java/org/openapitools/model/MessageDeltaContentTextAnnotationsFileCitationObject.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | `Integer` | The index of the annotation in the text content part. | 
**type** | [**TypeEnum**](#TypeEnum) | Always &#x60;file_citation&#x60;. | 
**text** | `String` | The text in the message content that needs to be replaced. |  [optional property]
**fileCitation** | [`MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation`](MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation.md) |  |  [optional property]
**startIndex** | `Integer` |  |  [optional property]
**endIndex** | `Integer` |  |  [optional property]


## TypeEnum

Name | Value
---- | -----
FILE_CITATION | `"file_citation"`






