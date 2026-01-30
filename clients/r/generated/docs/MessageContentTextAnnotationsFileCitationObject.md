# openapi::MessageContentTextAnnotationsFileCitationObject

A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \"file_search\" tool to search files.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **character** | Always &#x60;file_citation&#x60;. | [Enum: [file_citation]] 
**text** | **character** | The text in the message content that needs to be replaced. | 
**file_citation** | [**MessageContentTextAnnotationsFileCitationObjectFileCitation**](MessageContentTextAnnotationsFileCitationObject_file_citation.md) |  | 
**start_index** | **integer** |  | [Min: 0] 
**end_index** | **integer** |  | [Min: 0] 


