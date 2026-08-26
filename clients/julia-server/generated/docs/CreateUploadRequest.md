# CreateUploadRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`filename`** | **`String`** | The name of the file to upload.  | [default to nothing]
**`purpose`** | **`String`** | The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose).  | [default to nothing]
**`bytes`** | **`Int64`** | The number of bytes in the file you are uploading.  | [default to nothing]
**`mime_type`** | **`String`** | The MIME type of the file.  This must fall within the supported MIME types for your file purpose. See the supported MIME types for assistants and vision.  | [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


