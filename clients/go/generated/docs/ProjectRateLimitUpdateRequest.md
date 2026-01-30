# ProjectRateLimitUpdateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MaxRequestsPer1Minute** | Pointer to **int32** | The maximum requests per minute. | [optional] 
**MaxTokensPer1Minute** | Pointer to **int32** | The maximum tokens per minute. | [optional] 
**MaxImagesPer1Minute** | Pointer to **int32** | The maximum images per minute. Only relevant for certain models. | [optional] 
**MaxAudioMegabytesPer1Minute** | Pointer to **int32** | The maximum audio megabytes per minute. Only relevant for certain models. | [optional] 
**MaxRequestsPer1Day** | Pointer to **int32** | The maximum requests per day. Only relevant for certain models. | [optional] 
**Batch1DayMaxInputTokens** | Pointer to **int32** | The maximum batch input tokens per day. Only relevant for certain models. | [optional] 

## Methods

### NewProjectRateLimitUpdateRequest

`func NewProjectRateLimitUpdateRequest() *ProjectRateLimitUpdateRequest`

NewProjectRateLimitUpdateRequest instantiates a new ProjectRateLimitUpdateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewProjectRateLimitUpdateRequestWithDefaults

`func NewProjectRateLimitUpdateRequestWithDefaults() *ProjectRateLimitUpdateRequest`

NewProjectRateLimitUpdateRequestWithDefaults instantiates a new ProjectRateLimitUpdateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMaxRequestsPer1Minute

`func (o *ProjectRateLimitUpdateRequest) GetMaxRequestsPer1Minute() int32`

GetMaxRequestsPer1Minute returns the MaxRequestsPer1Minute field if non-nil, zero value otherwise.

### GetMaxRequestsPer1MinuteOk

`func (o *ProjectRateLimitUpdateRequest) GetMaxRequestsPer1MinuteOk() (*int32, bool)`

GetMaxRequestsPer1MinuteOk returns a tuple with the MaxRequestsPer1Minute field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxRequestsPer1Minute

`func (o *ProjectRateLimitUpdateRequest) SetMaxRequestsPer1Minute(v int32)`

SetMaxRequestsPer1Minute sets MaxRequestsPer1Minute field to given value.

### HasMaxRequestsPer1Minute

`func (o *ProjectRateLimitUpdateRequest) HasMaxRequestsPer1Minute() bool`

HasMaxRequestsPer1Minute returns a boolean if a field has been set.

### GetMaxTokensPer1Minute

`func (o *ProjectRateLimitUpdateRequest) GetMaxTokensPer1Minute() int32`

GetMaxTokensPer1Minute returns the MaxTokensPer1Minute field if non-nil, zero value otherwise.

### GetMaxTokensPer1MinuteOk

`func (o *ProjectRateLimitUpdateRequest) GetMaxTokensPer1MinuteOk() (*int32, bool)`

GetMaxTokensPer1MinuteOk returns a tuple with the MaxTokensPer1Minute field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxTokensPer1Minute

`func (o *ProjectRateLimitUpdateRequest) SetMaxTokensPer1Minute(v int32)`

SetMaxTokensPer1Minute sets MaxTokensPer1Minute field to given value.

### HasMaxTokensPer1Minute

`func (o *ProjectRateLimitUpdateRequest) HasMaxTokensPer1Minute() bool`

HasMaxTokensPer1Minute returns a boolean if a field has been set.

### GetMaxImagesPer1Minute

`func (o *ProjectRateLimitUpdateRequest) GetMaxImagesPer1Minute() int32`

GetMaxImagesPer1Minute returns the MaxImagesPer1Minute field if non-nil, zero value otherwise.

### GetMaxImagesPer1MinuteOk

`func (o *ProjectRateLimitUpdateRequest) GetMaxImagesPer1MinuteOk() (*int32, bool)`

GetMaxImagesPer1MinuteOk returns a tuple with the MaxImagesPer1Minute field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxImagesPer1Minute

`func (o *ProjectRateLimitUpdateRequest) SetMaxImagesPer1Minute(v int32)`

SetMaxImagesPer1Minute sets MaxImagesPer1Minute field to given value.

### HasMaxImagesPer1Minute

`func (o *ProjectRateLimitUpdateRequest) HasMaxImagesPer1Minute() bool`

HasMaxImagesPer1Minute returns a boolean if a field has been set.

### GetMaxAudioMegabytesPer1Minute

`func (o *ProjectRateLimitUpdateRequest) GetMaxAudioMegabytesPer1Minute() int32`

GetMaxAudioMegabytesPer1Minute returns the MaxAudioMegabytesPer1Minute field if non-nil, zero value otherwise.

### GetMaxAudioMegabytesPer1MinuteOk

`func (o *ProjectRateLimitUpdateRequest) GetMaxAudioMegabytesPer1MinuteOk() (*int32, bool)`

GetMaxAudioMegabytesPer1MinuteOk returns a tuple with the MaxAudioMegabytesPer1Minute field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxAudioMegabytesPer1Minute

`func (o *ProjectRateLimitUpdateRequest) SetMaxAudioMegabytesPer1Minute(v int32)`

SetMaxAudioMegabytesPer1Minute sets MaxAudioMegabytesPer1Minute field to given value.

### HasMaxAudioMegabytesPer1Minute

`func (o *ProjectRateLimitUpdateRequest) HasMaxAudioMegabytesPer1Minute() bool`

HasMaxAudioMegabytesPer1Minute returns a boolean if a field has been set.

### GetMaxRequestsPer1Day

`func (o *ProjectRateLimitUpdateRequest) GetMaxRequestsPer1Day() int32`

GetMaxRequestsPer1Day returns the MaxRequestsPer1Day field if non-nil, zero value otherwise.

### GetMaxRequestsPer1DayOk

`func (o *ProjectRateLimitUpdateRequest) GetMaxRequestsPer1DayOk() (*int32, bool)`

GetMaxRequestsPer1DayOk returns a tuple with the MaxRequestsPer1Day field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxRequestsPer1Day

`func (o *ProjectRateLimitUpdateRequest) SetMaxRequestsPer1Day(v int32)`

SetMaxRequestsPer1Day sets MaxRequestsPer1Day field to given value.

### HasMaxRequestsPer1Day

`func (o *ProjectRateLimitUpdateRequest) HasMaxRequestsPer1Day() bool`

HasMaxRequestsPer1Day returns a boolean if a field has been set.

### GetBatch1DayMaxInputTokens

`func (o *ProjectRateLimitUpdateRequest) GetBatch1DayMaxInputTokens() int32`

GetBatch1DayMaxInputTokens returns the Batch1DayMaxInputTokens field if non-nil, zero value otherwise.

### GetBatch1DayMaxInputTokensOk

`func (o *ProjectRateLimitUpdateRequest) GetBatch1DayMaxInputTokensOk() (*int32, bool)`

GetBatch1DayMaxInputTokensOk returns a tuple with the Batch1DayMaxInputTokens field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBatch1DayMaxInputTokens

`func (o *ProjectRateLimitUpdateRequest) SetBatch1DayMaxInputTokens(v int32)`

SetBatch1DayMaxInputTokens sets Batch1DayMaxInputTokens field to given value.

### HasBatch1DayMaxInputTokens

`func (o *ProjectRateLimitUpdateRequest) HasBatch1DayMaxInputTokens() bool`

HasBatch1DayMaxInputTokens returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


