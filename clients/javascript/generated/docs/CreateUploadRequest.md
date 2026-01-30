# OpenapiOpenai.CreateUploadRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filename** | **String** | The name of the file to upload.  | 
**purpose** | **String** | The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose).  | 
**bytes** | **Number** | The number of bytes in the file you are uploading.  | 
**mimeType** | **String** | The MIME type of the file.  This must fall within the supported MIME types for your file purpose. See the supported MIME types for assistants and vision.  | 



## Enum: PurposeEnum


* `assistants` (value: `"assistants"`)

* `batch` (value: `"batch"`)

* `fine-tune` (value: `"fine-tune"`)

* `vision` (value: `"vision"`)




