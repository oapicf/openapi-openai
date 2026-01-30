# UsageAudioSpeechesResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **string** |  | 
**Characters** | **int32** | The number of characters processed. | 
**NumModelRequests** | **int32** | The count of requests made to the model. | 
**ProjectId** | Pointer to **NullableString** | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result. | [optional] 
**UserId** | Pointer to **NullableString** | When &#x60;group_by&#x3D;user_id&#x60;, this field provides the user ID of the grouped usage result. | [optional] 
**ApiKeyId** | Pointer to **NullableString** | When &#x60;group_by&#x3D;api_key_id&#x60;, this field provides the API key ID of the grouped usage result. | [optional] 
**Model** | Pointer to **NullableString** | When &#x60;group_by&#x3D;model&#x60;, this field provides the model name of the grouped usage result. | [optional] 

## Methods

### NewUsageAudioSpeechesResult

`func NewUsageAudioSpeechesResult(object string, characters int32, numModelRequests int32, ) *UsageAudioSpeechesResult`

NewUsageAudioSpeechesResult instantiates a new UsageAudioSpeechesResult object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUsageAudioSpeechesResultWithDefaults

`func NewUsageAudioSpeechesResultWithDefaults() *UsageAudioSpeechesResult`

NewUsageAudioSpeechesResultWithDefaults instantiates a new UsageAudioSpeechesResult object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetObject

`func (o *UsageAudioSpeechesResult) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *UsageAudioSpeechesResult) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *UsageAudioSpeechesResult) SetObject(v string)`

SetObject sets Object field to given value.


### GetCharacters

`func (o *UsageAudioSpeechesResult) GetCharacters() int32`

GetCharacters returns the Characters field if non-nil, zero value otherwise.

### GetCharactersOk

`func (o *UsageAudioSpeechesResult) GetCharactersOk() (*int32, bool)`

GetCharactersOk returns a tuple with the Characters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCharacters

`func (o *UsageAudioSpeechesResult) SetCharacters(v int32)`

SetCharacters sets Characters field to given value.


### GetNumModelRequests

`func (o *UsageAudioSpeechesResult) GetNumModelRequests() int32`

GetNumModelRequests returns the NumModelRequests field if non-nil, zero value otherwise.

### GetNumModelRequestsOk

`func (o *UsageAudioSpeechesResult) GetNumModelRequestsOk() (*int32, bool)`

GetNumModelRequestsOk returns a tuple with the NumModelRequests field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumModelRequests

`func (o *UsageAudioSpeechesResult) SetNumModelRequests(v int32)`

SetNumModelRequests sets NumModelRequests field to given value.


### GetProjectId

`func (o *UsageAudioSpeechesResult) GetProjectId() string`

GetProjectId returns the ProjectId field if non-nil, zero value otherwise.

### GetProjectIdOk

`func (o *UsageAudioSpeechesResult) GetProjectIdOk() (*string, bool)`

GetProjectIdOk returns a tuple with the ProjectId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProjectId

`func (o *UsageAudioSpeechesResult) SetProjectId(v string)`

SetProjectId sets ProjectId field to given value.

### HasProjectId

`func (o *UsageAudioSpeechesResult) HasProjectId() bool`

HasProjectId returns a boolean if a field has been set.

### SetProjectIdNil

`func (o *UsageAudioSpeechesResult) SetProjectIdNil(b bool)`

 SetProjectIdNil sets the value for ProjectId to be an explicit nil

### UnsetProjectId
`func (o *UsageAudioSpeechesResult) UnsetProjectId()`

UnsetProjectId ensures that no value is present for ProjectId, not even an explicit nil
### GetUserId

`func (o *UsageAudioSpeechesResult) GetUserId() string`

GetUserId returns the UserId field if non-nil, zero value otherwise.

### GetUserIdOk

`func (o *UsageAudioSpeechesResult) GetUserIdOk() (*string, bool)`

GetUserIdOk returns a tuple with the UserId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserId

`func (o *UsageAudioSpeechesResult) SetUserId(v string)`

SetUserId sets UserId field to given value.

### HasUserId

`func (o *UsageAudioSpeechesResult) HasUserId() bool`

HasUserId returns a boolean if a field has been set.

### SetUserIdNil

`func (o *UsageAudioSpeechesResult) SetUserIdNil(b bool)`

 SetUserIdNil sets the value for UserId to be an explicit nil

### UnsetUserId
`func (o *UsageAudioSpeechesResult) UnsetUserId()`

UnsetUserId ensures that no value is present for UserId, not even an explicit nil
### GetApiKeyId

`func (o *UsageAudioSpeechesResult) GetApiKeyId() string`

GetApiKeyId returns the ApiKeyId field if non-nil, zero value otherwise.

### GetApiKeyIdOk

`func (o *UsageAudioSpeechesResult) GetApiKeyIdOk() (*string, bool)`

GetApiKeyIdOk returns a tuple with the ApiKeyId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetApiKeyId

`func (o *UsageAudioSpeechesResult) SetApiKeyId(v string)`

SetApiKeyId sets ApiKeyId field to given value.

### HasApiKeyId

`func (o *UsageAudioSpeechesResult) HasApiKeyId() bool`

HasApiKeyId returns a boolean if a field has been set.

### SetApiKeyIdNil

`func (o *UsageAudioSpeechesResult) SetApiKeyIdNil(b bool)`

 SetApiKeyIdNil sets the value for ApiKeyId to be an explicit nil

### UnsetApiKeyId
`func (o *UsageAudioSpeechesResult) UnsetApiKeyId()`

UnsetApiKeyId ensures that no value is present for ApiKeyId, not even an explicit nil
### GetModel

`func (o *UsageAudioSpeechesResult) GetModel() string`

GetModel returns the Model field if non-nil, zero value otherwise.

### GetModelOk

`func (o *UsageAudioSpeechesResult) GetModelOk() (*string, bool)`

GetModelOk returns a tuple with the Model field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModel

`func (o *UsageAudioSpeechesResult) SetModel(v string)`

SetModel sets Model field to given value.

### HasModel

`func (o *UsageAudioSpeechesResult) HasModel() bool`

HasModel returns a boolean if a field has been set.

### SetModelNil

`func (o *UsageAudioSpeechesResult) SetModelNil(b bool)`

 SetModelNil sets the value for Model to be an explicit nil

### UnsetModel
`func (o *UsageAudioSpeechesResult) UnsetModel()`

UnsetModel ensures that no value is present for Model, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


