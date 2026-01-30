# openapi::CreateUploadRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filename** | **character** | The name of the file to upload.  | 
**purpose** | **character** | The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose).  | [Enum: [assistants, batch, fine-tune, vision]] 
**bytes** | **integer** | The number of bytes in the file you are uploading.  | 
**mime_type** | **character** | The MIME type of the file.  This must fall within the supported MIME types for your file purpose. See the supported MIME types for assistants and vision.  | 


