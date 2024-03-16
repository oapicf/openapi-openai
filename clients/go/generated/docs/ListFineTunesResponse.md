# ListFineTunesResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **string** |  | 
**Data** | [**[]FineTune**](FineTune.md) |  | 

## Methods

### NewListFineTunesResponse

`func NewListFineTunesResponse(object string, data []FineTune, ) *ListFineTunesResponse`

NewListFineTunesResponse instantiates a new ListFineTunesResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewListFineTunesResponseWithDefaults

`func NewListFineTunesResponseWithDefaults() *ListFineTunesResponse`

NewListFineTunesResponseWithDefaults instantiates a new ListFineTunesResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetObject

`func (o *ListFineTunesResponse) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *ListFineTunesResponse) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *ListFineTunesResponse) SetObject(v string)`

SetObject sets Object field to given value.


### GetData

`func (o *ListFineTunesResponse) GetData() []FineTune`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *ListFineTunesResponse) GetDataOk() (*[]FineTune, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *ListFineTunesResponse) SetData(v []FineTune)`

SetData sets Data field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


