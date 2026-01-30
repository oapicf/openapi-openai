

# MessageDeltaContentTextAnnotationsFileCitationObject

A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \"file_search\" tool to search files.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **Int** | The index of the annotation in the text content part. | 
**`type`** | [**`Type`**](#`Type`) | Always &#x60;file_citation&#x60;. | 
**text** | **String** | The text in the message content that needs to be replaced. |  [optional]
**fileCitation** | [**MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation**](MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation.md) |  |  [optional]
**startIndex** | **Int** |  |  [optional]
**endIndex** | **Int** |  |  [optional]


## Enum: `Type`
Allowed values: [file_citation]




