# openapi::MessageDeltaContentTextAnnotationsFileCitationObject

A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \"file_search\" tool to search files.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **integer** | The index of the annotation in the text content part. | 
**type** | **character** | Always &#x60;file_citation&#x60;. | [Enum: [file_citation]] 
**text** | **character** | The text in the message content that needs to be replaced. | [optional] 
**file_citation** | [**MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation**](MessageDeltaContentTextAnnotationsFileCitationObject_file_citation.md) |  | [optional] 
**start_index** | **integer** |  | [optional] [Min: 0] 
**end_index** | **integer** |  | [optional] [Min: 0] 


