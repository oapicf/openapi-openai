# BatchErrors

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | Pointer to **string** | The object type, which is always &#x60;list&#x60;. | [optional] 
**Data** | Pointer to [**[]BatchErrorsDataInner**](BatchErrorsDataInner.md) |  | [optional] 

## Methods

### NewBatchErrors

`func NewBatchErrors() *BatchErrors`

NewBatchErrors instantiates a new BatchErrors object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBatchErrorsWithDefaults

`func NewBatchErrorsWithDefaults() *BatchErrors`

NewBatchErrorsWithDefaults instantiates a new BatchErrors object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetObject

`func (o *BatchErrors) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *BatchErrors) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *BatchErrors) SetObject(v string)`

SetObject sets Object field to given value.

### HasObject

`func (o *BatchErrors) HasObject() bool`

HasObject returns a boolean if a field has been set.

### GetData

`func (o *BatchErrors) GetData() []BatchErrorsDataInner`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *BatchErrors) GetDataOk() (*[]BatchErrorsDataInner, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *BatchErrors) SetData(v []BatchErrorsDataInner)`

SetData sets Data field to given value.

### HasData

`func (o *BatchErrors) HasData() bool`

HasData returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


