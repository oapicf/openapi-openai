# FunctionObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Description** | Pointer to **string** | A description of what the function does, used by the model to choose when and how to call the function. | [optional] 
**Name** | **string** | The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64. | 
**Parameters** | Pointer to **map[string]interface{}** | The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.   Omitting &#x60;parameters&#x60; defines a function with an empty parameter list. | [optional] 
**Strict** | Pointer to **NullableBool** | Whether to enable strict schema adherence when generating the function call. If set to true, the model will follow the exact schema defined in the &#x60;parameters&#x60; field. Only a subset of JSON Schema is supported when &#x60;strict&#x60; is &#x60;true&#x60;. Learn more about Structured Outputs in the [function calling guide](docs/guides/function-calling). | [optional] [default to false]

## Methods

### NewFunctionObject

`func NewFunctionObject(name string, ) *FunctionObject`

NewFunctionObject instantiates a new FunctionObject object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFunctionObjectWithDefaults

`func NewFunctionObjectWithDefaults() *FunctionObject`

NewFunctionObjectWithDefaults instantiates a new FunctionObject object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDescription

`func (o *FunctionObject) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *FunctionObject) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *FunctionObject) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *FunctionObject) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetName

`func (o *FunctionObject) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *FunctionObject) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *FunctionObject) SetName(v string)`

SetName sets Name field to given value.


### GetParameters

`func (o *FunctionObject) GetParameters() map[string]interface{}`

GetParameters returns the Parameters field if non-nil, zero value otherwise.

### GetParametersOk

`func (o *FunctionObject) GetParametersOk() (*map[string]interface{}, bool)`

GetParametersOk returns a tuple with the Parameters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParameters

`func (o *FunctionObject) SetParameters(v map[string]interface{})`

SetParameters sets Parameters field to given value.

### HasParameters

`func (o *FunctionObject) HasParameters() bool`

HasParameters returns a boolean if a field has been set.

### GetStrict

`func (o *FunctionObject) GetStrict() bool`

GetStrict returns the Strict field if non-nil, zero value otherwise.

### GetStrictOk

`func (o *FunctionObject) GetStrictOk() (*bool, bool)`

GetStrictOk returns a tuple with the Strict field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStrict

`func (o *FunctionObject) SetStrict(v bool)`

SetStrict sets Strict field to given value.

### HasStrict

`func (o *FunctionObject) HasStrict() bool`

HasStrict returns a boolean if a field has been set.

### SetStrictNil

`func (o *FunctionObject) SetStrictNil(b bool)`

 SetStrictNil sets the value for Strict to be an explicit nil

### UnsetStrict
`func (o *FunctionObject) UnsetStrict()`

UnsetStrict ensures that no value is present for Strict, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


