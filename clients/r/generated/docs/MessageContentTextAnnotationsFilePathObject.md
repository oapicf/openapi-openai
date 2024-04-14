# openapi::MessageContentTextAnnotationsFilePathObject

A URL for the file that's generated when the assistant used the `code_interpreter` tool to generate a file.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **character** | Always &#x60;file_path&#x60;. | [Enum: [file_path]] 
**text** | **character** | The text in the message content that needs to be replaced. | 
**file_path** | [**MessageContentTextAnnotationsFilePathObjectFilePath**](MessageContentTextAnnotationsFilePathObject_file_path.md) |  | 
**start_index** | **integer** |  | [Min: 0] 
**end_index** | **integer** |  | [Min: 0] 


