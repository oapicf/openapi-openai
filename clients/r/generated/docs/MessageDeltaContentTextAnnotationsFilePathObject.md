# openapi::MessageDeltaContentTextAnnotationsFilePathObject

A URL for the file that's generated when the assistant used the `code_interpreter` tool to generate a file.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **integer** | The index of the annotation in the text content part. | 
**type** | **character** | Always &#x60;file_path&#x60;. | [Enum: [file_path]] 
**text** | **character** | The text in the message content that needs to be replaced. | [optional] 
**file_path** | [**MessageDeltaContentTextAnnotationsFilePathObjectFilePath**](MessageDeltaContentTextAnnotationsFilePathObject_file_path.md) |  | [optional] 
**start_index** | **integer** |  | [optional] [Min: 0] 
**end_index** | **integer** |  | [optional] [Min: 0] 


