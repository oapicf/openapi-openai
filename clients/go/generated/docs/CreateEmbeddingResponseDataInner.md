# CreateEmbeddingResponseDataInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Index** | **int32** |  | 
**Object** | **string** |  | 
**Embedding** | **[]float32** |  | 

## Methods

### NewCreateEmbeddingResponseDataInner

`func NewCreateEmbeddingResponseDataInner(index int32, object string, embedding []float32, ) *CreateEmbeddingResponseDataInner`

NewCreateEmbeddingResponseDataInner instantiates a new CreateEmbeddingResponseDataInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateEmbeddingResponseDataInnerWithDefaults

`func NewCreateEmbeddingResponseDataInnerWithDefaults() *CreateEmbeddingResponseDataInner`

NewCreateEmbeddingResponseDataInnerWithDefaults instantiates a new CreateEmbeddingResponseDataInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetIndex

`func (o *CreateEmbeddingResponseDataInner) GetIndex() int32`

GetIndex returns the Index field if non-nil, zero value otherwise.

### GetIndexOk

`func (o *CreateEmbeddingResponseDataInner) GetIndexOk() (*int32, bool)`

GetIndexOk returns a tuple with the Index field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIndex

`func (o *CreateEmbeddingResponseDataInner) SetIndex(v int32)`

SetIndex sets Index field to given value.


### GetObject

`func (o *CreateEmbeddingResponseDataInner) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *CreateEmbeddingResponseDataInner) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *CreateEmbeddingResponseDataInner) SetObject(v string)`

SetObject sets Object field to given value.


### GetEmbedding

`func (o *CreateEmbeddingResponseDataInner) GetEmbedding() []float32`

GetEmbedding returns the Embedding field if non-nil, zero value otherwise.

### GetEmbeddingOk

`func (o *CreateEmbeddingResponseDataInner) GetEmbeddingOk() (*[]float32, bool)`

GetEmbeddingOk returns a tuple with the Embedding field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmbedding

`func (o *CreateEmbeddingResponseDataInner) SetEmbedding(v []float32)`

SetEmbedding sets Embedding field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


