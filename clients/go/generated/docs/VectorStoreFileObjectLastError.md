# VectorStoreFileObjectLastError

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | **string** | One of &#x60;server_error&#x60; or &#x60;rate_limit_exceeded&#x60;. | 
**Message** | **string** | A human-readable description of the error. | 

## Methods

### NewVectorStoreFileObjectLastError

`func NewVectorStoreFileObjectLastError(code string, message string, ) *VectorStoreFileObjectLastError`

NewVectorStoreFileObjectLastError instantiates a new VectorStoreFileObjectLastError object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewVectorStoreFileObjectLastErrorWithDefaults

`func NewVectorStoreFileObjectLastErrorWithDefaults() *VectorStoreFileObjectLastError`

NewVectorStoreFileObjectLastErrorWithDefaults instantiates a new VectorStoreFileObjectLastError object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCode

`func (o *VectorStoreFileObjectLastError) GetCode() string`

GetCode returns the Code field if non-nil, zero value otherwise.

### GetCodeOk

`func (o *VectorStoreFileObjectLastError) GetCodeOk() (*string, bool)`

GetCodeOk returns a tuple with the Code field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCode

`func (o *VectorStoreFileObjectLastError) SetCode(v string)`

SetCode sets Code field to given value.


### GetMessage

`func (o *VectorStoreFileObjectLastError) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *VectorStoreFileObjectLastError) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *VectorStoreFileObjectLastError) SetMessage(v string)`

SetMessage sets Message field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


