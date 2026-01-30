# CreateBatchRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**InputFileId** | **string** | The ID of an uploaded file that contains requests for the new batch.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your input file must be formatted as a [JSONL file](/docs/api-reference/batch/request-input), and must be uploaded with the purpose &#x60;batch&#x60;. The file can contain up to 50,000 requests, and can be up to 200 MB in size.  | 
**Endpoint** | **string** | The endpoint to be used for all requests in the batch. Currently &#x60;/v1/chat/completions&#x60;, &#x60;/v1/embeddings&#x60;, and &#x60;/v1/completions&#x60; are supported. Note that &#x60;/v1/embeddings&#x60; batches are also restricted to a maximum of 50,000 embedding inputs across all requests in the batch. | 
**CompletionWindow** | **string** | The time frame within which the batch should be processed. Currently only &#x60;24h&#x60; is supported. | 
**Metadata** | Pointer to **map[string]string** | Optional custom metadata for the batch. | [optional] 

## Methods

### NewCreateBatchRequest

`func NewCreateBatchRequest(inputFileId string, endpoint string, completionWindow string, ) *CreateBatchRequest`

NewCreateBatchRequest instantiates a new CreateBatchRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateBatchRequestWithDefaults

`func NewCreateBatchRequestWithDefaults() *CreateBatchRequest`

NewCreateBatchRequestWithDefaults instantiates a new CreateBatchRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetInputFileId

`func (o *CreateBatchRequest) GetInputFileId() string`

GetInputFileId returns the InputFileId field if non-nil, zero value otherwise.

### GetInputFileIdOk

`func (o *CreateBatchRequest) GetInputFileIdOk() (*string, bool)`

GetInputFileIdOk returns a tuple with the InputFileId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInputFileId

`func (o *CreateBatchRequest) SetInputFileId(v string)`

SetInputFileId sets InputFileId field to given value.


### GetEndpoint

`func (o *CreateBatchRequest) GetEndpoint() string`

GetEndpoint returns the Endpoint field if non-nil, zero value otherwise.

### GetEndpointOk

`func (o *CreateBatchRequest) GetEndpointOk() (*string, bool)`

GetEndpointOk returns a tuple with the Endpoint field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndpoint

`func (o *CreateBatchRequest) SetEndpoint(v string)`

SetEndpoint sets Endpoint field to given value.


### GetCompletionWindow

`func (o *CreateBatchRequest) GetCompletionWindow() string`

GetCompletionWindow returns the CompletionWindow field if non-nil, zero value otherwise.

### GetCompletionWindowOk

`func (o *CreateBatchRequest) GetCompletionWindowOk() (*string, bool)`

GetCompletionWindowOk returns a tuple with the CompletionWindow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletionWindow

`func (o *CreateBatchRequest) SetCompletionWindow(v string)`

SetCompletionWindow sets CompletionWindow field to given value.


### GetMetadata

`func (o *CreateBatchRequest) GetMetadata() map[string]string`

GetMetadata returns the Metadata field if non-nil, zero value otherwise.

### GetMetadataOk

`func (o *CreateBatchRequest) GetMetadataOk() (*map[string]string, bool)`

GetMetadataOk returns a tuple with the Metadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMetadata

`func (o *CreateBatchRequest) SetMetadata(v map[string]string)`

SetMetadata sets Metadata field to given value.

### HasMetadata

`func (o *CreateBatchRequest) HasMetadata() bool`

HasMetadata returns a boolean if a field has been set.

### SetMetadataNil

`func (o *CreateBatchRequest) SetMetadataNil(b bool)`

 SetMetadataNil sets the value for Metadata to be an explicit nil

### UnsetMetadata
`func (o *CreateBatchRequest) UnsetMetadata()`

UnsetMetadata ensures that no value is present for Metadata, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


