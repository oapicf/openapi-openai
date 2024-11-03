

# MessageContentTextAnnotationsFileCitationObject

A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \"retrieval\" tool to search files.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`type`** | [**`Type`**](#`Type`) | Always &#x60;file_citation&#x60;. | 
**text** | **String** | The text in the message content that needs to be replaced. | 
**fileCitation** | [**MessageContentTextAnnotationsFileCitationObjectFileCitation**](MessageContentTextAnnotationsFileCitationObjectFileCitation.md) |  | 
**startIndex** | **Int** |  | 
**endIndex** | **Int** |  | 


## Enum: `Type`
Allowed values: [file_citation]




