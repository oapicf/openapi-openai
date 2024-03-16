# ListModelsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **string** |  | 
**Data** | [**[]Model**](Model.md) |  | 

## Methods

### NewListModelsResponse

`func NewListModelsResponse(object string, data []Model, ) *ListModelsResponse`

NewListModelsResponse instantiates a new ListModelsResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewListModelsResponseWithDefaults

`func NewListModelsResponseWithDefaults() *ListModelsResponse`

NewListModelsResponseWithDefaults instantiates a new ListModelsResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetObject

`func (o *ListModelsResponse) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *ListModelsResponse) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *ListModelsResponse) SetObject(v string)`

SetObject sets Object field to given value.


### GetData

`func (o *ListModelsResponse) GetData() []Model`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *ListModelsResponse) GetDataOk() (*[]Model, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *ListModelsResponse) SetData(v []Model)`

SetData sets Data field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


