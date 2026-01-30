# ChunkingStrategyRequestParam

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | Always &#x60;auto&#x60;. | 
**Static** | [**StaticChunkingStrategy**](StaticChunkingStrategy.md) |  | 

## Methods

### NewChunkingStrategyRequestParam

`func NewChunkingStrategyRequestParam(type_ string, static StaticChunkingStrategy, ) *ChunkingStrategyRequestParam`

NewChunkingStrategyRequestParam instantiates a new ChunkingStrategyRequestParam object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewChunkingStrategyRequestParamWithDefaults

`func NewChunkingStrategyRequestParamWithDefaults() *ChunkingStrategyRequestParam`

NewChunkingStrategyRequestParamWithDefaults instantiates a new ChunkingStrategyRequestParam object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *ChunkingStrategyRequestParam) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *ChunkingStrategyRequestParam) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *ChunkingStrategyRequestParam) SetType(v string)`

SetType sets Type field to given value.


### GetStatic

`func (o *ChunkingStrategyRequestParam) GetStatic() StaticChunkingStrategy`

GetStatic returns the Static field if non-nil, zero value otherwise.

### GetStaticOk

`func (o *ChunkingStrategyRequestParam) GetStaticOk() (*StaticChunkingStrategy, bool)`

GetStaticOk returns a tuple with the Static field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatic

`func (o *ChunkingStrategyRequestParam) SetStatic(v StaticChunkingStrategy)`

SetStatic sets Static field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


