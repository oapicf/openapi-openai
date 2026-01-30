# CREATE_UPLOAD_REQUEST

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filename** | [**STRING_32**](STRING_32.md) | The name of the file to upload.  | [default to null]
**purpose** | [**STRING_32**](STRING_32.md) | The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose).  | [default to null]
**bytes** | **INTEGER_32** | The number of bytes in the file you are uploading.  | [default to null]
**mime_type** | [**STRING_32**](STRING_32.md) | The MIME type of the file.  This must fall within the supported MIME types for your file purpose. See the supported MIME types for assistants and vision.  | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


