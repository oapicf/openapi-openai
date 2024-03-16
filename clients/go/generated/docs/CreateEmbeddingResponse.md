# CreateEmbeddingResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **string** |  | 
**Model** | **string** |  | 
**Data** | [**[]CreateEmbeddingResponseDataInner**](CreateEmbeddingResponseDataInner.md) |  | 
**Usage** | [**CreateEmbeddingResponseUsage**](CreateEmbeddingResponseUsage.md) |  | 

## Methods

### NewCreateEmbeddingResponse

`func NewCreateEmbeddingResponse(object string, model string, data []CreateEmbeddingResponseDataInner, usage CreateEmbeddingResponseUsage, ) *CreateEmbeddingResponse`

NewCreateEmbeddingResponse instantiates a new CreateEmbeddingResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateEmbeddingResponseWithDefaults

`func NewCreateEmbeddingResponseWithDefaults() *CreateEmbeddingResponse`

NewCreateEmbeddingResponseWithDefaults instantiates a new CreateEmbeddingResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetObject

`func (o *CreateEmbeddingResponse) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *CreateEmbeddingResponse) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *CreateEmbeddingResponse) SetObject(v string)`

SetObject sets Object field to given value.


### GetModel

`func (o *CreateEmbeddingResponse) GetModel() string`

GetModel returns the Model field if non-nil, zero value otherwise.

### GetModelOk

`func (o *CreateEmbeddingResponse) GetModelOk() (*string, bool)`

GetModelOk returns a tuple with the Model field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModel

`func (o *CreateEmbeddingResponse) SetModel(v string)`

SetModel sets Model field to given value.


### GetData

`func (o *CreateEmbeddingResponse) GetData() []CreateEmbeddingResponseDataInner`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *CreateEmbeddingResponse) GetDataOk() (*[]CreateEmbeddingResponseDataInner, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *CreateEmbeddingResponse) SetData(v []CreateEmbeddingResponseDataInner)`

SetData sets Data field to given value.


### GetUsage

`func (o *CreateEmbeddingResponse) GetUsage() CreateEmbeddingResponseUsage`

GetUsage returns the Usage field if non-nil, zero value otherwise.

### GetUsageOk

`func (o *CreateEmbeddingResponse) GetUsageOk() (*CreateEmbeddingResponseUsage, bool)`

GetUsageOk returns a tuple with the Usage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsage

`func (o *CreateEmbeddingResponse) SetUsage(v CreateEmbeddingResponseUsage)`

SetUsage sets Usage field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


