

# CreateUploadRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**filename** | **String** | The name of the file to upload.  |  |
|**purpose** | [**PurposeEnum**](#PurposeEnum) | The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose).  |  |
|**bytes** | **Integer** | The number of bytes in the file you are uploading.  |  |
|**mimeType** | **String** | The MIME type of the file.  This must fall within the supported MIME types for your file purpose. See the supported MIME types for assistants and vision.  |  |



## Enum: PurposeEnum

| Name | Value |
|---- | -----|
| ASSISTANTS | &quot;assistants&quot; |
| BATCH | &quot;batch&quot; |
| FINE_TUNE | &quot;fine-tune&quot; |
| VISION | &quot;vision&quot; |



