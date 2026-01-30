# StaticChunkingStrategy

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | Always &#x60;static&#x60;. | 
**Static** | [**StaticChunkingStrategyStatic**](StaticChunkingStrategyStatic.md) |  | 

## Methods

### NewStaticChunkingStrategy

`func NewStaticChunkingStrategy(type_ string, static StaticChunkingStrategyStatic, ) *StaticChunkingStrategy`

NewStaticChunkingStrategy instantiates a new StaticChunkingStrategy object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewStaticChunkingStrategyWithDefaults

`func NewStaticChunkingStrategyWithDefaults() *StaticChunkingStrategy`

NewStaticChunkingStrategyWithDefaults instantiates a new StaticChunkingStrategy object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *StaticChunkingStrategy) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *StaticChunkingStrategy) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *StaticChunkingStrategy) SetType(v string)`

SetType sets Type field to given value.


### GetStatic

`func (o *StaticChunkingStrategy) GetStatic() StaticChunkingStrategyStatic`

GetStatic returns the Static field if non-nil, zero value otherwise.

### GetStaticOk

`func (o *StaticChunkingStrategy) GetStaticOk() (*StaticChunkingStrategyStatic, bool)`

GetStaticOk returns a tuple with the Static field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatic

`func (o *StaticChunkingStrategy) SetStatic(v StaticChunkingStrategyStatic)`

SetStatic sets Static field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


