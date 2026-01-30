# StaticChunkingStrategyStatic

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MaxChunkSizeTokens** | **int32** | The maximum number of tokens in each chunk. The default value is &#x60;800&#x60;. The minimum value is &#x60;100&#x60; and the maximum value is &#x60;4096&#x60;. | 
**ChunkOverlapTokens** | **int32** | The number of tokens that overlap between chunks. The default value is &#x60;400&#x60;.  Note that the overlap must not exceed half of &#x60;max_chunk_size_tokens&#x60;.  | 

## Methods

### NewStaticChunkingStrategyStatic

`func NewStaticChunkingStrategyStatic(maxChunkSizeTokens int32, chunkOverlapTokens int32, ) *StaticChunkingStrategyStatic`

NewStaticChunkingStrategyStatic instantiates a new StaticChunkingStrategyStatic object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewStaticChunkingStrategyStaticWithDefaults

`func NewStaticChunkingStrategyStaticWithDefaults() *StaticChunkingStrategyStatic`

NewStaticChunkingStrategyStaticWithDefaults instantiates a new StaticChunkingStrategyStatic object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMaxChunkSizeTokens

`func (o *StaticChunkingStrategyStatic) GetMaxChunkSizeTokens() int32`

GetMaxChunkSizeTokens returns the MaxChunkSizeTokens field if non-nil, zero value otherwise.

### GetMaxChunkSizeTokensOk

`func (o *StaticChunkingStrategyStatic) GetMaxChunkSizeTokensOk() (*int32, bool)`

GetMaxChunkSizeTokensOk returns a tuple with the MaxChunkSizeTokens field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxChunkSizeTokens

`func (o *StaticChunkingStrategyStatic) SetMaxChunkSizeTokens(v int32)`

SetMaxChunkSizeTokens sets MaxChunkSizeTokens field to given value.


### GetChunkOverlapTokens

`func (o *StaticChunkingStrategyStatic) GetChunkOverlapTokens() int32`

GetChunkOverlapTokens returns the ChunkOverlapTokens field if non-nil, zero value otherwise.

### GetChunkOverlapTokensOk

`func (o *StaticChunkingStrategyStatic) GetChunkOverlapTokensOk() (*int32, bool)`

GetChunkOverlapTokensOk returns a tuple with the ChunkOverlapTokens field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChunkOverlapTokens

`func (o *StaticChunkingStrategyStatic) SetChunkOverlapTokens(v int32)`

SetChunkOverlapTokens sets ChunkOverlapTokens field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


