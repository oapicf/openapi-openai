# openapi::MessageContentTextObjectTextAnnotationsInner


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **character** | Always &#x60;file_citation&#x60;. | [Enum: [file_citation, file_path]] 
**text** | **character** | The text in the message content that needs to be replaced. | 
**file_citation** | [**MessageContentTextAnnotationsFileCitationObjectFileCitation**](MessageContentTextAnnotationsFileCitationObject_file_citation.md) |  | 
**start_index** | **integer** |  | [Min: 0] 
**end_index** | **integer** |  | [Min: 0] 
**file_path** | [**MessageContentTextAnnotationsFilePathObjectFilePath**](MessageContentTextAnnotationsFilePathObject_file_path.md) |  | 


