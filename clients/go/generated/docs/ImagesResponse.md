# ImagesResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Created** | **int32** |  | 
**Data** | [**[]ImagesResponseDataInner**](ImagesResponseDataInner.md) |  | 

## Methods

### NewImagesResponse

`func NewImagesResponse(created int32, data []ImagesResponseDataInner, ) *ImagesResponse`

NewImagesResponse instantiates a new ImagesResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewImagesResponseWithDefaults

`func NewImagesResponseWithDefaults() *ImagesResponse`

NewImagesResponseWithDefaults instantiates a new ImagesResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCreated

`func (o *ImagesResponse) GetCreated() int32`

GetCreated returns the Created field if non-nil, zero value otherwise.

### GetCreatedOk

`func (o *ImagesResponse) GetCreatedOk() (*int32, bool)`

GetCreatedOk returns a tuple with the Created field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreated

`func (o *ImagesResponse) SetCreated(v int32)`

SetCreated sets Created field to given value.


### GetData

`func (o *ImagesResponse) GetData() []ImagesResponseDataInner`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *ImagesResponse) GetDataOk() (*[]ImagesResponseDataInner, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *ImagesResponse) SetData(v []ImagesResponseDataInner)`

SetData sets Data field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


