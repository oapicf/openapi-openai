# openapi::MessageDeltaContentTextObjectTextAnnotationsInner


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **integer** | The index of the annotation in the text content part. | 
**type** | **character** | Always &#x60;file_citation&#x60;. | [Enum: [file_citation, file_path]] 
**text** | **character** | The text in the message content that needs to be replaced. | [optional] 
**file_citation** | [**MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation**](MessageDeltaContentTextAnnotationsFileCitationObject_file_citation.md) |  | [optional] 
**start_index** | **integer** |  | [optional] [Min: 0] 
**end_index** | **integer** |  | [optional] [Min: 0] 
**file_path** | [**MessageDeltaContentTextAnnotationsFilePathObjectFilePath**](MessageDeltaContentTextAnnotationsFilePathObject_file_path.md) |  | [optional] 


