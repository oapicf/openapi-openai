

# CreateUploadRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filename** | **String** | The name of the file to upload.  | 
**purpose** | [**Purpose**](#Purpose) | The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose).  | 
**bytes** | **Int** | The number of bytes in the file you are uploading.  | 
**mimeType** | **String** | The MIME type of the file.  This must fall within the supported MIME types for your file purpose. See the supported MIME types for assistants and vision.  | 


## Enum: Purpose
Allowed values: [assistants, batch, fine-tune, vision]




