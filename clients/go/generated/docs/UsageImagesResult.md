# UsageImagesResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **string** |  | 
**Images** | **int32** | The number of images processed. | 
**NumModelRequests** | **int32** | The count of requests made to the model. | 
**Source** | Pointer to **NullableString** | When &#x60;group_by&#x3D;source&#x60;, this field provides the source of the grouped usage result, possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60;. | [optional] 
**Size** | Pointer to **NullableString** | When &#x60;group_by&#x3D;size&#x60;, this field provides the image size of the grouped usage result. | [optional] 
**ProjectId** | Pointer to **NullableString** | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result. | [optional] 
**UserId** | Pointer to **NullableString** | When &#x60;group_by&#x3D;user_id&#x60;, this field provides the user ID of the grouped usage result. | [optional] 
**ApiKeyId** | Pointer to **NullableString** | When &#x60;group_by&#x3D;api_key_id&#x60;, this field provides the API key ID of the grouped usage result. | [optional] 
**Model** | Pointer to **NullableString** | When &#x60;group_by&#x3D;model&#x60;, this field provides the model name of the grouped usage result. | [optional] 

## Methods

### NewUsageImagesResult

`func NewUsageImagesResult(object string, images int32, numModelRequests int32, ) *UsageImagesResult`

NewUsageImagesResult instantiates a new UsageImagesResult object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUsageImagesResultWithDefaults

`func NewUsageImagesResultWithDefaults() *UsageImagesResult`

NewUsageImagesResultWithDefaults instantiates a new UsageImagesResult object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetObject

`func (o *UsageImagesResult) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *UsageImagesResult) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *UsageImagesResult) SetObject(v string)`

SetObject sets Object field to given value.


### GetImages

`func (o *UsageImagesResult) GetImages() int32`

GetImages returns the Images field if non-nil, zero value otherwise.

### GetImagesOk

`func (o *UsageImagesResult) GetImagesOk() (*int32, bool)`

GetImagesOk returns a tuple with the Images field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImages

`func (o *UsageImagesResult) SetImages(v int32)`

SetImages sets Images field to given value.


### GetNumModelRequests

`func (o *UsageImagesResult) GetNumModelRequests() int32`

GetNumModelRequests returns the NumModelRequests field if non-nil, zero value otherwise.

### GetNumModelRequestsOk

`func (o *UsageImagesResult) GetNumModelRequestsOk() (*int32, bool)`

GetNumModelRequestsOk returns a tuple with the NumModelRequests field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumModelRequests

`func (o *UsageImagesResult) SetNumModelRequests(v int32)`

SetNumModelRequests sets NumModelRequests field to given value.


### GetSource

`func (o *UsageImagesResult) GetSource() string`

GetSource returns the Source field if non-nil, zero value otherwise.

### GetSourceOk

`func (o *UsageImagesResult) GetSourceOk() (*string, bool)`

GetSourceOk returns a tuple with the Source field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSource

`func (o *UsageImagesResult) SetSource(v string)`

SetSource sets Source field to given value.

### HasSource

`func (o *UsageImagesResult) HasSource() bool`

HasSource returns a boolean if a field has been set.

### SetSourceNil

`func (o *UsageImagesResult) SetSourceNil(b bool)`

 SetSourceNil sets the value for Source to be an explicit nil

### UnsetSource
`func (o *UsageImagesResult) UnsetSource()`

UnsetSource ensures that no value is present for Source, not even an explicit nil
### GetSize

`func (o *UsageImagesResult) GetSize() string`

GetSize returns the Size field if non-nil, zero value otherwise.

### GetSizeOk

`func (o *UsageImagesResult) GetSizeOk() (*string, bool)`

GetSizeOk returns a tuple with the Size field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSize

`func (o *UsageImagesResult) SetSize(v string)`

SetSize sets Size field to given value.

### HasSize

`func (o *UsageImagesResult) HasSize() bool`

HasSize returns a boolean if a field has been set.

### SetSizeNil

`func (o *UsageImagesResult) SetSizeNil(b bool)`

 SetSizeNil sets the value for Size to be an explicit nil

### UnsetSize
`func (o *UsageImagesResult) UnsetSize()`

UnsetSize ensures that no value is present for Size, not even an explicit nil
### GetProjectId

`func (o *UsageImagesResult) GetProjectId() string`

GetProjectId returns the ProjectId field if non-nil, zero value otherwise.

### GetProjectIdOk

`func (o *UsageImagesResult) GetProjectIdOk() (*string, bool)`

GetProjectIdOk returns a tuple with the ProjectId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProjectId

`func (o *UsageImagesResult) SetProjectId(v string)`

SetProjectId sets ProjectId field to given value.

### HasProjectId

`func (o *UsageImagesResult) HasProjectId() bool`

HasProjectId returns a boolean if a field has been set.

### SetProjectIdNil

`func (o *UsageImagesResult) SetProjectIdNil(b bool)`

 SetProjectIdNil sets the value for ProjectId to be an explicit nil

### UnsetProjectId
`func (o *UsageImagesResult) UnsetProjectId()`

UnsetProjectId ensures that no value is present for ProjectId, not even an explicit nil
### GetUserId

`func (o *UsageImagesResult) GetUserId() string`

GetUserId returns the UserId field if non-nil, zero value otherwise.

### GetUserIdOk

`func (o *UsageImagesResult) GetUserIdOk() (*string, bool)`

GetUserIdOk returns a tuple with the UserId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserId

`func (o *UsageImagesResult) SetUserId(v string)`

SetUserId sets UserId field to given value.

### HasUserId

`func (o *UsageImagesResult) HasUserId() bool`

HasUserId returns a boolean if a field has been set.

### SetUserIdNil

`func (o *UsageImagesResult) SetUserIdNil(b bool)`

 SetUserIdNil sets the value for UserId to be an explicit nil

### UnsetUserId
`func (o *UsageImagesResult) UnsetUserId()`

UnsetUserId ensures that no value is present for UserId, not even an explicit nil
### GetApiKeyId

`func (o *UsageImagesResult) GetApiKeyId() string`

GetApiKeyId returns the ApiKeyId field if non-nil, zero value otherwise.

### GetApiKeyIdOk

`func (o *UsageImagesResult) GetApiKeyIdOk() (*string, bool)`

GetApiKeyIdOk returns a tuple with the ApiKeyId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetApiKeyId

`func (o *UsageImagesResult) SetApiKeyId(v string)`

SetApiKeyId sets ApiKeyId field to given value.

### HasApiKeyId

`func (o *UsageImagesResult) HasApiKeyId() bool`

HasApiKeyId returns a boolean if a field has been set.

### SetApiKeyIdNil

`func (o *UsageImagesResult) SetApiKeyIdNil(b bool)`

 SetApiKeyIdNil sets the value for ApiKeyId to be an explicit nil

### UnsetApiKeyId
`func (o *UsageImagesResult) UnsetApiKeyId()`

UnsetApiKeyId ensures that no value is present for ApiKeyId, not even an explicit nil
### GetModel

`func (o *UsageImagesResult) GetModel() string`

GetModel returns the Model field if non-nil, zero value otherwise.

### GetModelOk

`func (o *UsageImagesResult) GetModelOk() (*string, bool)`

GetModelOk returns a tuple with the Model field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModel

`func (o *UsageImagesResult) SetModel(v string)`

SetModel sets Model field to given value.

### HasModel

`func (o *UsageImagesResult) HasModel() bool`

HasModel returns a boolean if a field has been set.

### SetModelNil

`func (o *UsageImagesResult) SetModelNil(b bool)`

 SetModelNil sets the value for Model to be an explicit nil

### UnsetModel
`func (o *UsageImagesResult) UnsetModel()`

UnsetModel ensures that no value is present for Model, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


