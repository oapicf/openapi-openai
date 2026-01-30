# StaticChunkingStrategyResponseParam

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | Always &#x60;static&#x60;. | 
**Static** | [**StaticChunkingStrategy**](StaticChunkingStrategy.md) |  | 

## Methods

### NewStaticChunkingStrategyResponseParam

`func NewStaticChunkingStrategyResponseParam(type_ string, static StaticChunkingStrategy, ) *StaticChunkingStrategyResponseParam`

NewStaticChunkingStrategyResponseParam instantiates a new StaticChunkingStrategyResponseParam object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewStaticChunkingStrategyResponseParamWithDefaults

`func NewStaticChunkingStrategyResponseParamWithDefaults() *StaticChunkingStrategyResponseParam`

NewStaticChunkingStrategyResponseParamWithDefaults instantiates a new StaticChunkingStrategyResponseParam object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *StaticChunkingStrategyResponseParam) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *StaticChunkingStrategyResponseParam) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *StaticChunkingStrategyResponseParam) SetType(v string)`

SetType sets Type field to given value.


### GetStatic

`func (o *StaticChunkingStrategyResponseParam) GetStatic() StaticChunkingStrategy`

GetStatic returns the Static field if non-nil, zero value otherwise.

### GetStaticOk

`func (o *StaticChunkingStrategyResponseParam) GetStaticOk() (*StaticChunkingStrategy, bool)`

GetStaticOk returns a tuple with the Static field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatic

`func (o *StaticChunkingStrategyResponseParam) SetStatic(v StaticChunkingStrategy)`

SetStatic sets Static field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


