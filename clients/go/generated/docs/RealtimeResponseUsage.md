# RealtimeResponseUsage

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TotalTokens** | Pointer to **int32** | The total number of tokens in the Response including input and output  text and audio tokens.  | [optional] 
**InputTokens** | Pointer to **int32** | The number of input tokens used in the Response, including text and  audio tokens.  | [optional] 
**OutputTokens** | Pointer to **int32** | The number of output tokens sent in the Response, including text and  audio tokens.  | [optional] 
**InputTokenDetails** | Pointer to [**RealtimeResponseUsageInputTokenDetails**](RealtimeResponseUsageInputTokenDetails.md) |  | [optional] 
**OutputTokenDetails** | Pointer to [**RealtimeResponseUsageOutputTokenDetails**](RealtimeResponseUsageOutputTokenDetails.md) |  | [optional] 

## Methods

### NewRealtimeResponseUsage

`func NewRealtimeResponseUsage() *RealtimeResponseUsage`

NewRealtimeResponseUsage instantiates a new RealtimeResponseUsage object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRealtimeResponseUsageWithDefaults

`func NewRealtimeResponseUsageWithDefaults() *RealtimeResponseUsage`

NewRealtimeResponseUsageWithDefaults instantiates a new RealtimeResponseUsage object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetTotalTokens

`func (o *RealtimeResponseUsage) GetTotalTokens() int32`

GetTotalTokens returns the TotalTokens field if non-nil, zero value otherwise.

### GetTotalTokensOk

`func (o *RealtimeResponseUsage) GetTotalTokensOk() (*int32, bool)`

GetTotalTokensOk returns a tuple with the TotalTokens field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalTokens

`func (o *RealtimeResponseUsage) SetTotalTokens(v int32)`

SetTotalTokens sets TotalTokens field to given value.

### HasTotalTokens

`func (o *RealtimeResponseUsage) HasTotalTokens() bool`

HasTotalTokens returns a boolean if a field has been set.

### GetInputTokens

`func (o *RealtimeResponseUsage) GetInputTokens() int32`

GetInputTokens returns the InputTokens field if non-nil, zero value otherwise.

### GetInputTokensOk

`func (o *RealtimeResponseUsage) GetInputTokensOk() (*int32, bool)`

GetInputTokensOk returns a tuple with the InputTokens field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInputTokens

`func (o *RealtimeResponseUsage) SetInputTokens(v int32)`

SetInputTokens sets InputTokens field to given value.

### HasInputTokens

`func (o *RealtimeResponseUsage) HasInputTokens() bool`

HasInputTokens returns a boolean if a field has been set.

### GetOutputTokens

`func (o *RealtimeResponseUsage) GetOutputTokens() int32`

GetOutputTokens returns the OutputTokens field if non-nil, zero value otherwise.

### GetOutputTokensOk

`func (o *RealtimeResponseUsage) GetOutputTokensOk() (*int32, bool)`

GetOutputTokensOk returns a tuple with the OutputTokens field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOutputTokens

`func (o *RealtimeResponseUsage) SetOutputTokens(v int32)`

SetOutputTokens sets OutputTokens field to given value.

### HasOutputTokens

`func (o *RealtimeResponseUsage) HasOutputTokens() bool`

HasOutputTokens returns a boolean if a field has been set.

### GetInputTokenDetails

`func (o *RealtimeResponseUsage) GetInputTokenDetails() RealtimeResponseUsageInputTokenDetails`

GetInputTokenDetails returns the InputTokenDetails field if non-nil, zero value otherwise.

### GetInputTokenDetailsOk

`func (o *RealtimeResponseUsage) GetInputTokenDetailsOk() (*RealtimeResponseUsageInputTokenDetails, bool)`

GetInputTokenDetailsOk returns a tuple with the InputTokenDetails field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInputTokenDetails

`func (o *RealtimeResponseUsage) SetInputTokenDetails(v RealtimeResponseUsageInputTokenDetails)`

SetInputTokenDetails sets InputTokenDetails field to given value.

### HasInputTokenDetails

`func (o *RealtimeResponseUsage) HasInputTokenDetails() bool`

HasInputTokenDetails returns a boolean if a field has been set.

### GetOutputTokenDetails

`func (o *RealtimeResponseUsage) GetOutputTokenDetails() RealtimeResponseUsageOutputTokenDetails`

GetOutputTokenDetails returns the OutputTokenDetails field if non-nil, zero value otherwise.

### GetOutputTokenDetailsOk

`func (o *RealtimeResponseUsage) GetOutputTokenDetailsOk() (*RealtimeResponseUsageOutputTokenDetails, bool)`

GetOutputTokenDetailsOk returns a tuple with the OutputTokenDetails field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOutputTokenDetails

`func (o *RealtimeResponseUsage) SetOutputTokenDetails(v RealtimeResponseUsageOutputTokenDetails)`

SetOutputTokenDetails sets OutputTokenDetails field to given value.

### HasOutputTokenDetails

`func (o *RealtimeResponseUsage) HasOutputTokenDetails() bool`

HasOutputTokenDetails returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


