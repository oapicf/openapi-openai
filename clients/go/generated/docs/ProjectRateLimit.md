# ProjectRateLimit

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **string** | The object type, which is always &#x60;project.rate_limit&#x60; | 
**Id** | **string** | The identifier, which can be referenced in API endpoints. | 
**Model** | **string** | The model this rate limit applies to. | 
**MaxRequestsPer1Minute** | **int32** | The maximum requests per minute. | 
**MaxTokensPer1Minute** | **int32** | The maximum tokens per minute. | 
**MaxImagesPer1Minute** | Pointer to **int32** | The maximum images per minute. Only present for relevant models. | [optional] 
**MaxAudioMegabytesPer1Minute** | Pointer to **int32** | The maximum audio megabytes per minute. Only present for relevant models. | [optional] 
**MaxRequestsPer1Day** | Pointer to **int32** | The maximum requests per day. Only present for relevant models. | [optional] 
**Batch1DayMaxInputTokens** | Pointer to **int32** | The maximum batch input tokens per day. Only present for relevant models. | [optional] 

## Methods

### NewProjectRateLimit

`func NewProjectRateLimit(object string, id string, model string, maxRequestsPer1Minute int32, maxTokensPer1Minute int32, ) *ProjectRateLimit`

NewProjectRateLimit instantiates a new ProjectRateLimit object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewProjectRateLimitWithDefaults

`func NewProjectRateLimitWithDefaults() *ProjectRateLimit`

NewProjectRateLimitWithDefaults instantiates a new ProjectRateLimit object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetObject

`func (o *ProjectRateLimit) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *ProjectRateLimit) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *ProjectRateLimit) SetObject(v string)`

SetObject sets Object field to given value.


### GetId

`func (o *ProjectRateLimit) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ProjectRateLimit) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ProjectRateLimit) SetId(v string)`

SetId sets Id field to given value.


### GetModel

`func (o *ProjectRateLimit) GetModel() string`

GetModel returns the Model field if non-nil, zero value otherwise.

### GetModelOk

`func (o *ProjectRateLimit) GetModelOk() (*string, bool)`

GetModelOk returns a tuple with the Model field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModel

`func (o *ProjectRateLimit) SetModel(v string)`

SetModel sets Model field to given value.


### GetMaxRequestsPer1Minute

`func (o *ProjectRateLimit) GetMaxRequestsPer1Minute() int32`

GetMaxRequestsPer1Minute returns the MaxRequestsPer1Minute field if non-nil, zero value otherwise.

### GetMaxRequestsPer1MinuteOk

`func (o *ProjectRateLimit) GetMaxRequestsPer1MinuteOk() (*int32, bool)`

GetMaxRequestsPer1MinuteOk returns a tuple with the MaxRequestsPer1Minute field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxRequestsPer1Minute

`func (o *ProjectRateLimit) SetMaxRequestsPer1Minute(v int32)`

SetMaxRequestsPer1Minute sets MaxRequestsPer1Minute field to given value.


### GetMaxTokensPer1Minute

`func (o *ProjectRateLimit) GetMaxTokensPer1Minute() int32`

GetMaxTokensPer1Minute returns the MaxTokensPer1Minute field if non-nil, zero value otherwise.

### GetMaxTokensPer1MinuteOk

`func (o *ProjectRateLimit) GetMaxTokensPer1MinuteOk() (*int32, bool)`

GetMaxTokensPer1MinuteOk returns a tuple with the MaxTokensPer1Minute field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxTokensPer1Minute

`func (o *ProjectRateLimit) SetMaxTokensPer1Minute(v int32)`

SetMaxTokensPer1Minute sets MaxTokensPer1Minute field to given value.


### GetMaxImagesPer1Minute

`func (o *ProjectRateLimit) GetMaxImagesPer1Minute() int32`

GetMaxImagesPer1Minute returns the MaxImagesPer1Minute field if non-nil, zero value otherwise.

### GetMaxImagesPer1MinuteOk

`func (o *ProjectRateLimit) GetMaxImagesPer1MinuteOk() (*int32, bool)`

GetMaxImagesPer1MinuteOk returns a tuple with the MaxImagesPer1Minute field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxImagesPer1Minute

`func (o *ProjectRateLimit) SetMaxImagesPer1Minute(v int32)`

SetMaxImagesPer1Minute sets MaxImagesPer1Minute field to given value.

### HasMaxImagesPer1Minute

`func (o *ProjectRateLimit) HasMaxImagesPer1Minute() bool`

HasMaxImagesPer1Minute returns a boolean if a field has been set.

### GetMaxAudioMegabytesPer1Minute

`func (o *ProjectRateLimit) GetMaxAudioMegabytesPer1Minute() int32`

GetMaxAudioMegabytesPer1Minute returns the MaxAudioMegabytesPer1Minute field if non-nil, zero value otherwise.

### GetMaxAudioMegabytesPer1MinuteOk

`func (o *ProjectRateLimit) GetMaxAudioMegabytesPer1MinuteOk() (*int32, bool)`

GetMaxAudioMegabytesPer1MinuteOk returns a tuple with the MaxAudioMegabytesPer1Minute field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxAudioMegabytesPer1Minute

`func (o *ProjectRateLimit) SetMaxAudioMegabytesPer1Minute(v int32)`

SetMaxAudioMegabytesPer1Minute sets MaxAudioMegabytesPer1Minute field to given value.

### HasMaxAudioMegabytesPer1Minute

`func (o *ProjectRateLimit) HasMaxAudioMegabytesPer1Minute() bool`

HasMaxAudioMegabytesPer1Minute returns a boolean if a field has been set.

### GetMaxRequestsPer1Day

`func (o *ProjectRateLimit) GetMaxRequestsPer1Day() int32`

GetMaxRequestsPer1Day returns the MaxRequestsPer1Day field if non-nil, zero value otherwise.

### GetMaxRequestsPer1DayOk

`func (o *ProjectRateLimit) GetMaxRequestsPer1DayOk() (*int32, bool)`

GetMaxRequestsPer1DayOk returns a tuple with the MaxRequestsPer1Day field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxRequestsPer1Day

`func (o *ProjectRateLimit) SetMaxRequestsPer1Day(v int32)`

SetMaxRequestsPer1Day sets MaxRequestsPer1Day field to given value.

### HasMaxRequestsPer1Day

`func (o *ProjectRateLimit) HasMaxRequestsPer1Day() bool`

HasMaxRequestsPer1Day returns a boolean if a field has been set.

### GetBatch1DayMaxInputTokens

`func (o *ProjectRateLimit) GetBatch1DayMaxInputTokens() int32`

GetBatch1DayMaxInputTokens returns the Batch1DayMaxInputTokens field if non-nil, zero value otherwise.

### GetBatch1DayMaxInputTokensOk

`func (o *ProjectRateLimit) GetBatch1DayMaxInputTokensOk() (*int32, bool)`

GetBatch1DayMaxInputTokensOk returns a tuple with the Batch1DayMaxInputTokens field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBatch1DayMaxInputTokens

`func (o *ProjectRateLimit) SetBatch1DayMaxInputTokens(v int32)`

SetBatch1DayMaxInputTokens sets Batch1DayMaxInputTokens field to given value.

### HasBatch1DayMaxInputTokens

`func (o *ProjectRateLimit) HasBatch1DayMaxInputTokens() bool`

HasBatch1DayMaxInputTokens returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


