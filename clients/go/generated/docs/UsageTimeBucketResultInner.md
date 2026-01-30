# UsageTimeBucketResultInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **string** |  | 
**InputTokens** | **int32** | The aggregated number of input tokens used. | 
**InputCachedTokens** | Pointer to **int32** | The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens. | [optional] 
**OutputTokens** | **int32** | The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens. | 
**InputAudioTokens** | Pointer to **int32** | The aggregated number of audio input tokens used, including cached tokens. | [optional] 
**OutputAudioTokens** | Pointer to **int32** | The aggregated number of audio output tokens used. | [optional] 
**NumModelRequests** | **int32** | The count of requests made to the model. | 
**ProjectId** | Pointer to **NullableString** | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped costs result. | [optional] 
**UserId** | Pointer to **NullableString** | When &#x60;group_by&#x3D;user_id&#x60;, this field provides the user ID of the grouped usage result. | [optional] 
**ApiKeyId** | Pointer to **NullableString** | When &#x60;group_by&#x3D;api_key_id&#x60;, this field provides the API key ID of the grouped usage result. | [optional] 
**Model** | Pointer to **NullableString** | When &#x60;group_by&#x3D;model&#x60;, this field provides the model name of the grouped usage result. | [optional] 
**Batch** | Pointer to **NullableBool** | When &#x60;group_by&#x3D;batch&#x60;, this field tells whether the grouped usage result is batch or not. | [optional] 
**Images** | **int32** | The number of images processed. | 
**Source** | Pointer to **NullableString** | When &#x60;group_by&#x3D;source&#x60;, this field provides the source of the grouped usage result, possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60;. | [optional] 
**Size** | Pointer to **NullableString** | When &#x60;group_by&#x3D;size&#x60;, this field provides the image size of the grouped usage result. | [optional] 
**Characters** | **int32** | The number of characters processed. | 
**Seconds** | **int32** | The number of seconds processed. | 
**UsageBytes** | **int32** | The vector stores usage in bytes. | 
**Sessions** | **int32** | The number of code interpreter sessions. | 
**Amount** | Pointer to [**CostsResultAmount**](CostsResultAmount.md) |  | [optional] 
**LineItem** | Pointer to **NullableString** | When &#x60;group_by&#x3D;line_item&#x60;, this field provides the line item of the grouped costs result. | [optional] 

## Methods

### NewUsageTimeBucketResultInner

`func NewUsageTimeBucketResultInner(object string, inputTokens int32, outputTokens int32, numModelRequests int32, images int32, characters int32, seconds int32, usageBytes int32, sessions int32, ) *UsageTimeBucketResultInner`

NewUsageTimeBucketResultInner instantiates a new UsageTimeBucketResultInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUsageTimeBucketResultInnerWithDefaults

`func NewUsageTimeBucketResultInnerWithDefaults() *UsageTimeBucketResultInner`

NewUsageTimeBucketResultInnerWithDefaults instantiates a new UsageTimeBucketResultInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetObject

`func (o *UsageTimeBucketResultInner) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *UsageTimeBucketResultInner) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *UsageTimeBucketResultInner) SetObject(v string)`

SetObject sets Object field to given value.


### GetInputTokens

`func (o *UsageTimeBucketResultInner) GetInputTokens() int32`

GetInputTokens returns the InputTokens field if non-nil, zero value otherwise.

### GetInputTokensOk

`func (o *UsageTimeBucketResultInner) GetInputTokensOk() (*int32, bool)`

GetInputTokensOk returns a tuple with the InputTokens field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInputTokens

`func (o *UsageTimeBucketResultInner) SetInputTokens(v int32)`

SetInputTokens sets InputTokens field to given value.


### GetInputCachedTokens

`func (o *UsageTimeBucketResultInner) GetInputCachedTokens() int32`

GetInputCachedTokens returns the InputCachedTokens field if non-nil, zero value otherwise.

### GetInputCachedTokensOk

`func (o *UsageTimeBucketResultInner) GetInputCachedTokensOk() (*int32, bool)`

GetInputCachedTokensOk returns a tuple with the InputCachedTokens field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInputCachedTokens

`func (o *UsageTimeBucketResultInner) SetInputCachedTokens(v int32)`

SetInputCachedTokens sets InputCachedTokens field to given value.

### HasInputCachedTokens

`func (o *UsageTimeBucketResultInner) HasInputCachedTokens() bool`

HasInputCachedTokens returns a boolean if a field has been set.

### GetOutputTokens

`func (o *UsageTimeBucketResultInner) GetOutputTokens() int32`

GetOutputTokens returns the OutputTokens field if non-nil, zero value otherwise.

### GetOutputTokensOk

`func (o *UsageTimeBucketResultInner) GetOutputTokensOk() (*int32, bool)`

GetOutputTokensOk returns a tuple with the OutputTokens field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOutputTokens

`func (o *UsageTimeBucketResultInner) SetOutputTokens(v int32)`

SetOutputTokens sets OutputTokens field to given value.


### GetInputAudioTokens

`func (o *UsageTimeBucketResultInner) GetInputAudioTokens() int32`

GetInputAudioTokens returns the InputAudioTokens field if non-nil, zero value otherwise.

### GetInputAudioTokensOk

`func (o *UsageTimeBucketResultInner) GetInputAudioTokensOk() (*int32, bool)`

GetInputAudioTokensOk returns a tuple with the InputAudioTokens field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInputAudioTokens

`func (o *UsageTimeBucketResultInner) SetInputAudioTokens(v int32)`

SetInputAudioTokens sets InputAudioTokens field to given value.

### HasInputAudioTokens

`func (o *UsageTimeBucketResultInner) HasInputAudioTokens() bool`

HasInputAudioTokens returns a boolean if a field has been set.

### GetOutputAudioTokens

`func (o *UsageTimeBucketResultInner) GetOutputAudioTokens() int32`

GetOutputAudioTokens returns the OutputAudioTokens field if non-nil, zero value otherwise.

### GetOutputAudioTokensOk

`func (o *UsageTimeBucketResultInner) GetOutputAudioTokensOk() (*int32, bool)`

GetOutputAudioTokensOk returns a tuple with the OutputAudioTokens field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOutputAudioTokens

`func (o *UsageTimeBucketResultInner) SetOutputAudioTokens(v int32)`

SetOutputAudioTokens sets OutputAudioTokens field to given value.

### HasOutputAudioTokens

`func (o *UsageTimeBucketResultInner) HasOutputAudioTokens() bool`

HasOutputAudioTokens returns a boolean if a field has been set.

### GetNumModelRequests

`func (o *UsageTimeBucketResultInner) GetNumModelRequests() int32`

GetNumModelRequests returns the NumModelRequests field if non-nil, zero value otherwise.

### GetNumModelRequestsOk

`func (o *UsageTimeBucketResultInner) GetNumModelRequestsOk() (*int32, bool)`

GetNumModelRequestsOk returns a tuple with the NumModelRequests field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumModelRequests

`func (o *UsageTimeBucketResultInner) SetNumModelRequests(v int32)`

SetNumModelRequests sets NumModelRequests field to given value.


### GetProjectId

`func (o *UsageTimeBucketResultInner) GetProjectId() string`

GetProjectId returns the ProjectId field if non-nil, zero value otherwise.

### GetProjectIdOk

`func (o *UsageTimeBucketResultInner) GetProjectIdOk() (*string, bool)`

GetProjectIdOk returns a tuple with the ProjectId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProjectId

`func (o *UsageTimeBucketResultInner) SetProjectId(v string)`

SetProjectId sets ProjectId field to given value.

### HasProjectId

`func (o *UsageTimeBucketResultInner) HasProjectId() bool`

HasProjectId returns a boolean if a field has been set.

### SetProjectIdNil

`func (o *UsageTimeBucketResultInner) SetProjectIdNil(b bool)`

 SetProjectIdNil sets the value for ProjectId to be an explicit nil

### UnsetProjectId
`func (o *UsageTimeBucketResultInner) UnsetProjectId()`

UnsetProjectId ensures that no value is present for ProjectId, not even an explicit nil
### GetUserId

`func (o *UsageTimeBucketResultInner) GetUserId() string`

GetUserId returns the UserId field if non-nil, zero value otherwise.

### GetUserIdOk

`func (o *UsageTimeBucketResultInner) GetUserIdOk() (*string, bool)`

GetUserIdOk returns a tuple with the UserId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserId

`func (o *UsageTimeBucketResultInner) SetUserId(v string)`

SetUserId sets UserId field to given value.

### HasUserId

`func (o *UsageTimeBucketResultInner) HasUserId() bool`

HasUserId returns a boolean if a field has been set.

### SetUserIdNil

`func (o *UsageTimeBucketResultInner) SetUserIdNil(b bool)`

 SetUserIdNil sets the value for UserId to be an explicit nil

### UnsetUserId
`func (o *UsageTimeBucketResultInner) UnsetUserId()`

UnsetUserId ensures that no value is present for UserId, not even an explicit nil
### GetApiKeyId

`func (o *UsageTimeBucketResultInner) GetApiKeyId() string`

GetApiKeyId returns the ApiKeyId field if non-nil, zero value otherwise.

### GetApiKeyIdOk

`func (o *UsageTimeBucketResultInner) GetApiKeyIdOk() (*string, bool)`

GetApiKeyIdOk returns a tuple with the ApiKeyId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetApiKeyId

`func (o *UsageTimeBucketResultInner) SetApiKeyId(v string)`

SetApiKeyId sets ApiKeyId field to given value.

### HasApiKeyId

`func (o *UsageTimeBucketResultInner) HasApiKeyId() bool`

HasApiKeyId returns a boolean if a field has been set.

### SetApiKeyIdNil

`func (o *UsageTimeBucketResultInner) SetApiKeyIdNil(b bool)`

 SetApiKeyIdNil sets the value for ApiKeyId to be an explicit nil

### UnsetApiKeyId
`func (o *UsageTimeBucketResultInner) UnsetApiKeyId()`

UnsetApiKeyId ensures that no value is present for ApiKeyId, not even an explicit nil
### GetModel

`func (o *UsageTimeBucketResultInner) GetModel() string`

GetModel returns the Model field if non-nil, zero value otherwise.

### GetModelOk

`func (o *UsageTimeBucketResultInner) GetModelOk() (*string, bool)`

GetModelOk returns a tuple with the Model field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModel

`func (o *UsageTimeBucketResultInner) SetModel(v string)`

SetModel sets Model field to given value.

### HasModel

`func (o *UsageTimeBucketResultInner) HasModel() bool`

HasModel returns a boolean if a field has been set.

### SetModelNil

`func (o *UsageTimeBucketResultInner) SetModelNil(b bool)`

 SetModelNil sets the value for Model to be an explicit nil

### UnsetModel
`func (o *UsageTimeBucketResultInner) UnsetModel()`

UnsetModel ensures that no value is present for Model, not even an explicit nil
### GetBatch

`func (o *UsageTimeBucketResultInner) GetBatch() bool`

GetBatch returns the Batch field if non-nil, zero value otherwise.

### GetBatchOk

`func (o *UsageTimeBucketResultInner) GetBatchOk() (*bool, bool)`

GetBatchOk returns a tuple with the Batch field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBatch

`func (o *UsageTimeBucketResultInner) SetBatch(v bool)`

SetBatch sets Batch field to given value.

### HasBatch

`func (o *UsageTimeBucketResultInner) HasBatch() bool`

HasBatch returns a boolean if a field has been set.

### SetBatchNil

`func (o *UsageTimeBucketResultInner) SetBatchNil(b bool)`

 SetBatchNil sets the value for Batch to be an explicit nil

### UnsetBatch
`func (o *UsageTimeBucketResultInner) UnsetBatch()`

UnsetBatch ensures that no value is present for Batch, not even an explicit nil
### GetImages

`func (o *UsageTimeBucketResultInner) GetImages() int32`

GetImages returns the Images field if non-nil, zero value otherwise.

### GetImagesOk

`func (o *UsageTimeBucketResultInner) GetImagesOk() (*int32, bool)`

GetImagesOk returns a tuple with the Images field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImages

`func (o *UsageTimeBucketResultInner) SetImages(v int32)`

SetImages sets Images field to given value.


### GetSource

`func (o *UsageTimeBucketResultInner) GetSource() string`

GetSource returns the Source field if non-nil, zero value otherwise.

### GetSourceOk

`func (o *UsageTimeBucketResultInner) GetSourceOk() (*string, bool)`

GetSourceOk returns a tuple with the Source field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSource

`func (o *UsageTimeBucketResultInner) SetSource(v string)`

SetSource sets Source field to given value.

### HasSource

`func (o *UsageTimeBucketResultInner) HasSource() bool`

HasSource returns a boolean if a field has been set.

### SetSourceNil

`func (o *UsageTimeBucketResultInner) SetSourceNil(b bool)`

 SetSourceNil sets the value for Source to be an explicit nil

### UnsetSource
`func (o *UsageTimeBucketResultInner) UnsetSource()`

UnsetSource ensures that no value is present for Source, not even an explicit nil
### GetSize

`func (o *UsageTimeBucketResultInner) GetSize() string`

GetSize returns the Size field if non-nil, zero value otherwise.

### GetSizeOk

`func (o *UsageTimeBucketResultInner) GetSizeOk() (*string, bool)`

GetSizeOk returns a tuple with the Size field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSize

`func (o *UsageTimeBucketResultInner) SetSize(v string)`

SetSize sets Size field to given value.

### HasSize

`func (o *UsageTimeBucketResultInner) HasSize() bool`

HasSize returns a boolean if a field has been set.

### SetSizeNil

`func (o *UsageTimeBucketResultInner) SetSizeNil(b bool)`

 SetSizeNil sets the value for Size to be an explicit nil

### UnsetSize
`func (o *UsageTimeBucketResultInner) UnsetSize()`

UnsetSize ensures that no value is present for Size, not even an explicit nil
### GetCharacters

`func (o *UsageTimeBucketResultInner) GetCharacters() int32`

GetCharacters returns the Characters field if non-nil, zero value otherwise.

### GetCharactersOk

`func (o *UsageTimeBucketResultInner) GetCharactersOk() (*int32, bool)`

GetCharactersOk returns a tuple with the Characters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCharacters

`func (o *UsageTimeBucketResultInner) SetCharacters(v int32)`

SetCharacters sets Characters field to given value.


### GetSeconds

`func (o *UsageTimeBucketResultInner) GetSeconds() int32`

GetSeconds returns the Seconds field if non-nil, zero value otherwise.

### GetSecondsOk

`func (o *UsageTimeBucketResultInner) GetSecondsOk() (*int32, bool)`

GetSecondsOk returns a tuple with the Seconds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSeconds

`func (o *UsageTimeBucketResultInner) SetSeconds(v int32)`

SetSeconds sets Seconds field to given value.


### GetUsageBytes

`func (o *UsageTimeBucketResultInner) GetUsageBytes() int32`

GetUsageBytes returns the UsageBytes field if non-nil, zero value otherwise.

### GetUsageBytesOk

`func (o *UsageTimeBucketResultInner) GetUsageBytesOk() (*int32, bool)`

GetUsageBytesOk returns a tuple with the UsageBytes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsageBytes

`func (o *UsageTimeBucketResultInner) SetUsageBytes(v int32)`

SetUsageBytes sets UsageBytes field to given value.


### GetSessions

`func (o *UsageTimeBucketResultInner) GetSessions() int32`

GetSessions returns the Sessions field if non-nil, zero value otherwise.

### GetSessionsOk

`func (o *UsageTimeBucketResultInner) GetSessionsOk() (*int32, bool)`

GetSessionsOk returns a tuple with the Sessions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSessions

`func (o *UsageTimeBucketResultInner) SetSessions(v int32)`

SetSessions sets Sessions field to given value.


### GetAmount

`func (o *UsageTimeBucketResultInner) GetAmount() CostsResultAmount`

GetAmount returns the Amount field if non-nil, zero value otherwise.

### GetAmountOk

`func (o *UsageTimeBucketResultInner) GetAmountOk() (*CostsResultAmount, bool)`

GetAmountOk returns a tuple with the Amount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAmount

`func (o *UsageTimeBucketResultInner) SetAmount(v CostsResultAmount)`

SetAmount sets Amount field to given value.

### HasAmount

`func (o *UsageTimeBucketResultInner) HasAmount() bool`

HasAmount returns a boolean if a field has been set.

### GetLineItem

`func (o *UsageTimeBucketResultInner) GetLineItem() string`

GetLineItem returns the LineItem field if non-nil, zero value otherwise.

### GetLineItemOk

`func (o *UsageTimeBucketResultInner) GetLineItemOk() (*string, bool)`

GetLineItemOk returns a tuple with the LineItem field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLineItem

`func (o *UsageTimeBucketResultInner) SetLineItem(v string)`

SetLineItem sets LineItem field to given value.

### HasLineItem

`func (o *UsageTimeBucketResultInner) HasLineItem() bool`

HasLineItem returns a boolean if a field has been set.

### SetLineItemNil

`func (o *UsageTimeBucketResultInner) SetLineItemNil(b bool)`

 SetLineItemNil sets the value for LineItem to be an explicit nil

### UnsetLineItem
`func (o *UsageTimeBucketResultInner) UnsetLineItem()`

UnsetLineItem ensures that no value is present for LineItem, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


