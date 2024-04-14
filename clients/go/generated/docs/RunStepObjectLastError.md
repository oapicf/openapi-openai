# RunStepObjectLastError

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | **string** | One of &#x60;server_error&#x60; or &#x60;rate_limit_exceeded&#x60;. | 
**Message** | **string** | A human-readable description of the error. | 

## Methods

### NewRunStepObjectLastError

`func NewRunStepObjectLastError(code string, message string, ) *RunStepObjectLastError`

NewRunStepObjectLastError instantiates a new RunStepObjectLastError object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRunStepObjectLastErrorWithDefaults

`func NewRunStepObjectLastErrorWithDefaults() *RunStepObjectLastError`

NewRunStepObjectLastErrorWithDefaults instantiates a new RunStepObjectLastError object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCode

`func (o *RunStepObjectLastError) GetCode() string`

GetCode returns the Code field if non-nil, zero value otherwise.

### GetCodeOk

`func (o *RunStepObjectLastError) GetCodeOk() (*string, bool)`

GetCodeOk returns a tuple with the Code field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCode

`func (o *RunStepObjectLastError) SetCode(v string)`

SetCode sets Code field to given value.


### GetMessage

`func (o *RunStepObjectLastError) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *RunStepObjectLastError) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *RunStepObjectLastError) SetMessage(v string)`

SetMessage sets Message field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


