# UsageCompletionsResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **string** |  | 
**InputTokens** | **int32** | The aggregated number of text input tokens used, including cached tokens. For customers subscribe to scale tier, this includes scale tier tokens. | 
**InputCachedTokens** | Pointer to **int32** | The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens. | [optional] 
**OutputTokens** | **int32** | The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens. | 
**InputAudioTokens** | Pointer to **int32** | The aggregated number of audio input tokens used, including cached tokens. | [optional] 
**OutputAudioTokens** | Pointer to **int32** | The aggregated number of audio output tokens used. | [optional] 
**NumModelRequests** | **int32** | The count of requests made to the model. | 
**ProjectId** | Pointer to **NullableString** | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result. | [optional] 
**UserId** | Pointer to **NullableString** | When &#x60;group_by&#x3D;user_id&#x60;, this field provides the user ID of the grouped usage result. | [optional] 
**ApiKeyId** | Pointer to **NullableString** | When &#x60;group_by&#x3D;api_key_id&#x60;, this field provides the API key ID of the grouped usage result. | [optional] 
**Model** | Pointer to **NullableString** | When &#x60;group_by&#x3D;model&#x60;, this field provides the model name of the grouped usage result. | [optional] 
**Batch** | Pointer to **NullableBool** | When &#x60;group_by&#x3D;batch&#x60;, this field tells whether the grouped usage result is batch or not. | [optional] 

## Methods

### NewUsageCompletionsResult

`func NewUsageCompletionsResult(object string, inputTokens int32, outputTokens int32, numModelRequests int32, ) *UsageCompletionsResult`

NewUsageCompletionsResult instantiates a new UsageCompletionsResult object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUsageCompletionsResultWithDefaults

`func NewUsageCompletionsResultWithDefaults() *UsageCompletionsResult`

NewUsageCompletionsResultWithDefaults instantiates a new UsageCompletionsResult object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetObject

`func (o *UsageCompletionsResult) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *UsageCompletionsResult) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *UsageCompletionsResult) SetObject(v string)`

SetObject sets Object field to given value.


### GetInputTokens

`func (o *UsageCompletionsResult) GetInputTokens() int32`

GetInputTokens returns the InputTokens field if non-nil, zero value otherwise.

### GetInputTokensOk

`func (o *UsageCompletionsResult) GetInputTokensOk() (*int32, bool)`

GetInputTokensOk returns a tuple with the InputTokens field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInputTokens

`func (o *UsageCompletionsResult) SetInputTokens(v int32)`

SetInputTokens sets InputTokens field to given value.


### GetInputCachedTokens

`func (o *UsageCompletionsResult) GetInputCachedTokens() int32`

GetInputCachedTokens returns the InputCachedTokens field if non-nil, zero value otherwise.

### GetInputCachedTokensOk

`func (o *UsageCompletionsResult) GetInputCachedTokensOk() (*int32, bool)`

GetInputCachedTokensOk returns a tuple with the InputCachedTokens field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInputCachedTokens

`func (o *UsageCompletionsResult) SetInputCachedTokens(v int32)`

SetInputCachedTokens sets InputCachedTokens field to given value.

### HasInputCachedTokens

`func (o *UsageCompletionsResult) HasInputCachedTokens() bool`

HasInputCachedTokens returns a boolean if a field has been set.

### GetOutputTokens

`func (o *UsageCompletionsResult) GetOutputTokens() int32`

GetOutputTokens returns the OutputTokens field if non-nil, zero value otherwise.

### GetOutputTokensOk

`func (o *UsageCompletionsResult) GetOutputTokensOk() (*int32, bool)`

GetOutputTokensOk returns a tuple with the OutputTokens field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOutputTokens

`func (o *UsageCompletionsResult) SetOutputTokens(v int32)`

SetOutputTokens sets OutputTokens field to given value.


### GetInputAudioTokens

`func (o *UsageCompletionsResult) GetInputAudioTokens() int32`

GetInputAudioTokens returns the InputAudioTokens field if non-nil, zero value otherwise.

### GetInputAudioTokensOk

`func (o *UsageCompletionsResult) GetInputAudioTokensOk() (*int32, bool)`

GetInputAudioTokensOk returns a tuple with the InputAudioTokens field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInputAudioTokens

`func (o *UsageCompletionsResult) SetInputAudioTokens(v int32)`

SetInputAudioTokens sets InputAudioTokens field to given value.

### HasInputAudioTokens

`func (o *UsageCompletionsResult) HasInputAudioTokens() bool`

HasInputAudioTokens returns a boolean if a field has been set.

### GetOutputAudioTokens

`func (o *UsageCompletionsResult) GetOutputAudioTokens() int32`

GetOutputAudioTokens returns the OutputAudioTokens field if non-nil, zero value otherwise.

### GetOutputAudioTokensOk

`func (o *UsageCompletionsResult) GetOutputAudioTokensOk() (*int32, bool)`

GetOutputAudioTokensOk returns a tuple with the OutputAudioTokens field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOutputAudioTokens

`func (o *UsageCompletionsResult) SetOutputAudioTokens(v int32)`

SetOutputAudioTokens sets OutputAudioTokens field to given value.

### HasOutputAudioTokens

`func (o *UsageCompletionsResult) HasOutputAudioTokens() bool`

HasOutputAudioTokens returns a boolean if a field has been set.

### GetNumModelRequests

`func (o *UsageCompletionsResult) GetNumModelRequests() int32`

GetNumModelRequests returns the NumModelRequests field if non-nil, zero value otherwise.

### GetNumModelRequestsOk

`func (o *UsageCompletionsResult) GetNumModelRequestsOk() (*int32, bool)`

GetNumModelRequestsOk returns a tuple with the NumModelRequests field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumModelRequests

`func (o *UsageCompletionsResult) SetNumModelRequests(v int32)`

SetNumModelRequests sets NumModelRequests field to given value.


### GetProjectId

`func (o *UsageCompletionsResult) GetProjectId() string`

GetProjectId returns the ProjectId field if non-nil, zero value otherwise.

### GetProjectIdOk

`func (o *UsageCompletionsResult) GetProjectIdOk() (*string, bool)`

GetProjectIdOk returns a tuple with the ProjectId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProjectId

`func (o *UsageCompletionsResult) SetProjectId(v string)`

SetProjectId sets ProjectId field to given value.

### HasProjectId

`func (o *UsageCompletionsResult) HasProjectId() bool`

HasProjectId returns a boolean if a field has been set.

### SetProjectIdNil

`func (o *UsageCompletionsResult) SetProjectIdNil(b bool)`

 SetProjectIdNil sets the value for ProjectId to be an explicit nil

### UnsetProjectId
`func (o *UsageCompletionsResult) UnsetProjectId()`

UnsetProjectId ensures that no value is present for ProjectId, not even an explicit nil
### GetUserId

`func (o *UsageCompletionsResult) GetUserId() string`

GetUserId returns the UserId field if non-nil, zero value otherwise.

### GetUserIdOk

`func (o *UsageCompletionsResult) GetUserIdOk() (*string, bool)`

GetUserIdOk returns a tuple with the UserId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserId

`func (o *UsageCompletionsResult) SetUserId(v string)`

SetUserId sets UserId field to given value.

### HasUserId

`func (o *UsageCompletionsResult) HasUserId() bool`

HasUserId returns a boolean if a field has been set.

### SetUserIdNil

`func (o *UsageCompletionsResult) SetUserIdNil(b bool)`

 SetUserIdNil sets the value for UserId to be an explicit nil

### UnsetUserId
`func (o *UsageCompletionsResult) UnsetUserId()`

UnsetUserId ensures that no value is present for UserId, not even an explicit nil
### GetApiKeyId

`func (o *UsageCompletionsResult) GetApiKeyId() string`

GetApiKeyId returns the ApiKeyId field if non-nil, zero value otherwise.

### GetApiKeyIdOk

`func (o *UsageCompletionsResult) GetApiKeyIdOk() (*string, bool)`

GetApiKeyIdOk returns a tuple with the ApiKeyId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetApiKeyId

`func (o *UsageCompletionsResult) SetApiKeyId(v string)`

SetApiKeyId sets ApiKeyId field to given value.

### HasApiKeyId

`func (o *UsageCompletionsResult) HasApiKeyId() bool`

HasApiKeyId returns a boolean if a field has been set.

### SetApiKeyIdNil

`func (o *UsageCompletionsResult) SetApiKeyIdNil(b bool)`

 SetApiKeyIdNil sets the value for ApiKeyId to be an explicit nil

### UnsetApiKeyId
`func (o *UsageCompletionsResult) UnsetApiKeyId()`

UnsetApiKeyId ensures that no value is present for ApiKeyId, not even an explicit nil
### GetModel

`func (o *UsageCompletionsResult) GetModel() string`

GetModel returns the Model field if non-nil, zero value otherwise.

### GetModelOk

`func (o *UsageCompletionsResult) GetModelOk() (*string, bool)`

GetModelOk returns a tuple with the Model field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModel

`func (o *UsageCompletionsResult) SetModel(v string)`

SetModel sets Model field to given value.

### HasModel

`func (o *UsageCompletionsResult) HasModel() bool`

HasModel returns a boolean if a field has been set.

### SetModelNil

`func (o *UsageCompletionsResult) SetModelNil(b bool)`

 SetModelNil sets the value for Model to be an explicit nil

### UnsetModel
`func (o *UsageCompletionsResult) UnsetModel()`

UnsetModel ensures that no value is present for Model, not even an explicit nil
### GetBatch

`func (o *UsageCompletionsResult) GetBatch() bool`

GetBatch returns the Batch field if non-nil, zero value otherwise.

### GetBatchOk

`func (o *UsageCompletionsResult) GetBatchOk() (*bool, bool)`

GetBatchOk returns a tuple with the Batch field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBatch

`func (o *UsageCompletionsResult) SetBatch(v bool)`

SetBatch sets Batch field to given value.

### HasBatch

`func (o *UsageCompletionsResult) HasBatch() bool`

HasBatch returns a boolean if a field has been set.

### SetBatchNil

`func (o *UsageCompletionsResult) SetBatchNil(b bool)`

 SetBatchNil sets the value for Batch to be an explicit nil

### UnsetBatch
`func (o *UsageCompletionsResult) UnsetBatch()`

UnsetBatch ensures that no value is present for Batch, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


