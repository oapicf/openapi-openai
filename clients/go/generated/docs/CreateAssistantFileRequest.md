# CreateAssistantFileRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FileId** | **string** | A [File](/docs/api-reference/files) ID (with &#x60;purpose&#x3D;\&quot;assistants\&quot;&#x60;) that the assistant should use. Useful for tools like &#x60;retrieval&#x60; and &#x60;code_interpreter&#x60; that can access files. | 

## Methods

### NewCreateAssistantFileRequest

`func NewCreateAssistantFileRequest(fileId string, ) *CreateAssistantFileRequest`

NewCreateAssistantFileRequest instantiates a new CreateAssistantFileRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateAssistantFileRequestWithDefaults

`func NewCreateAssistantFileRequestWithDefaults() *CreateAssistantFileRequest`

NewCreateAssistantFileRequestWithDefaults instantiates a new CreateAssistantFileRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFileId

`func (o *CreateAssistantFileRequest) GetFileId() string`

GetFileId returns the FileId field if non-nil, zero value otherwise.

### GetFileIdOk

`func (o *CreateAssistantFileRequest) GetFileIdOk() (*string, bool)`

GetFileIdOk returns a tuple with the FileId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFileId

`func (o *CreateAssistantFileRequest) SetFileId(v string)`

SetFileId sets FileId field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


