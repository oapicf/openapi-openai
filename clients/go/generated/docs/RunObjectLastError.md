# RunObjectLastError

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | **string** | One of &#x60;server_error&#x60;, &#x60;rate_limit_exceeded&#x60;, or &#x60;invalid_prompt&#x60;. | 
**Message** | **string** | A human-readable description of the error. | 

## Methods

### NewRunObjectLastError

`func NewRunObjectLastError(code string, message string, ) *RunObjectLastError`

NewRunObjectLastError instantiates a new RunObjectLastError object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRunObjectLastErrorWithDefaults

`func NewRunObjectLastErrorWithDefaults() *RunObjectLastError`

NewRunObjectLastErrorWithDefaults instantiates a new RunObjectLastError object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCode

`func (o *RunObjectLastError) GetCode() string`

GetCode returns the Code field if non-nil, zero value otherwise.

### GetCodeOk

`func (o *RunObjectLastError) GetCodeOk() (*string, bool)`

GetCodeOk returns a tuple with the Code field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCode

`func (o *RunObjectLastError) SetCode(v string)`

SetCode sets Code field to given value.


### GetMessage

`func (o *RunObjectLastError) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *RunObjectLastError) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *RunObjectLastError) SetMessage(v string)`

SetMessage sets Message field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


