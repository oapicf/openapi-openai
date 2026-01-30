# create_upload_request_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filename** | **char \*** | The name of the file to upload.  | 
**purpose** | **openai_api_create_upload_request_PURPOSE_e** | The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose).  | 
**bytes** | **int** | The number of bytes in the file you are uploading.  | 
**mime_type** | **char \*** | The MIME type of the file.  This must fall within the supported MIME types for your file purpose. See the supported MIME types for assistants and vision.  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


