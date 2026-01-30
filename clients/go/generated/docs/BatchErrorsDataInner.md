# BatchErrorsDataInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | Pointer to **string** | An error code identifying the error type. | [optional] 
**Message** | Pointer to **string** | A human-readable message providing more details about the error. | [optional] 
**Param** | Pointer to **NullableString** | The name of the parameter that caused the error, if applicable. | [optional] 
**Line** | Pointer to **NullableInt32** | The line number of the input file where the error occurred, if applicable. | [optional] 

## Methods

### NewBatchErrorsDataInner

`func NewBatchErrorsDataInner() *BatchErrorsDataInner`

NewBatchErrorsDataInner instantiates a new BatchErrorsDataInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBatchErrorsDataInnerWithDefaults

`func NewBatchErrorsDataInnerWithDefaults() *BatchErrorsDataInner`

NewBatchErrorsDataInnerWithDefaults instantiates a new BatchErrorsDataInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCode

`func (o *BatchErrorsDataInner) GetCode() string`

GetCode returns the Code field if non-nil, zero value otherwise.

### GetCodeOk

`func (o *BatchErrorsDataInner) GetCodeOk() (*string, bool)`

GetCodeOk returns a tuple with the Code field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCode

`func (o *BatchErrorsDataInner) SetCode(v string)`

SetCode sets Code field to given value.

### HasCode

`func (o *BatchErrorsDataInner) HasCode() bool`

HasCode returns a boolean if a field has been set.

### GetMessage

`func (o *BatchErrorsDataInner) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *BatchErrorsDataInner) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *BatchErrorsDataInner) SetMessage(v string)`

SetMessage sets Message field to given value.

### HasMessage

`func (o *BatchErrorsDataInner) HasMessage() bool`

HasMessage returns a boolean if a field has been set.

### GetParam

`func (o *BatchErrorsDataInner) GetParam() string`

GetParam returns the Param field if non-nil, zero value otherwise.

### GetParamOk

`func (o *BatchErrorsDataInner) GetParamOk() (*string, bool)`

GetParamOk returns a tuple with the Param field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParam

`func (o *BatchErrorsDataInner) SetParam(v string)`

SetParam sets Param field to given value.

### HasParam

`func (o *BatchErrorsDataInner) HasParam() bool`

HasParam returns a boolean if a field has been set.

### SetParamNil

`func (o *BatchErrorsDataInner) SetParamNil(b bool)`

 SetParamNil sets the value for Param to be an explicit nil

### UnsetParam
`func (o *BatchErrorsDataInner) UnsetParam()`

UnsetParam ensures that no value is present for Param, not even an explicit nil
### GetLine

`func (o *BatchErrorsDataInner) GetLine() int32`

GetLine returns the Line field if non-nil, zero value otherwise.

### GetLineOk

`func (o *BatchErrorsDataInner) GetLineOk() (*int32, bool)`

GetLineOk returns a tuple with the Line field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLine

`func (o *BatchErrorsDataInner) SetLine(v int32)`

SetLine sets Line field to given value.

### HasLine

`func (o *BatchErrorsDataInner) HasLine() bool`

HasLine returns a boolean if a field has been set.

### SetLineNil

`func (o *BatchErrorsDataInner) SetLineNil(b bool)`

 SetLineNil sets the value for Line to be an explicit nil

### UnsetLine
`func (o *BatchErrorsDataInner) UnsetLine()`

UnsetLine ensures that no value is present for Line, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


