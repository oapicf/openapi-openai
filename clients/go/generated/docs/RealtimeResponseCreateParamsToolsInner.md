# RealtimeResponseCreateParamsToolsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | Pointer to **string** | The type of the tool, i.e. &#x60;function&#x60;. | [optional] 
**Name** | Pointer to **string** | The name of the function. | [optional] 
**Description** | Pointer to **string** | The description of the function, including guidance on when and how  to call it, and guidance about what to tell the user when calling  (if anything).  | [optional] 
**Parameters** | Pointer to **map[string]interface{}** | Parameters of the function in JSON Schema. | [optional] 

## Methods

### NewRealtimeResponseCreateParamsToolsInner

`func NewRealtimeResponseCreateParamsToolsInner() *RealtimeResponseCreateParamsToolsInner`

NewRealtimeResponseCreateParamsToolsInner instantiates a new RealtimeResponseCreateParamsToolsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRealtimeResponseCreateParamsToolsInnerWithDefaults

`func NewRealtimeResponseCreateParamsToolsInnerWithDefaults() *RealtimeResponseCreateParamsToolsInner`

NewRealtimeResponseCreateParamsToolsInnerWithDefaults instantiates a new RealtimeResponseCreateParamsToolsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *RealtimeResponseCreateParamsToolsInner) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RealtimeResponseCreateParamsToolsInner) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RealtimeResponseCreateParamsToolsInner) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *RealtimeResponseCreateParamsToolsInner) HasType() bool`

HasType returns a boolean if a field has been set.

### GetName

`func (o *RealtimeResponseCreateParamsToolsInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *RealtimeResponseCreateParamsToolsInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *RealtimeResponseCreateParamsToolsInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *RealtimeResponseCreateParamsToolsInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetDescription

`func (o *RealtimeResponseCreateParamsToolsInner) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *RealtimeResponseCreateParamsToolsInner) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *RealtimeResponseCreateParamsToolsInner) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *RealtimeResponseCreateParamsToolsInner) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetParameters

`func (o *RealtimeResponseCreateParamsToolsInner) GetParameters() map[string]interface{}`

GetParameters returns the Parameters field if non-nil, zero value otherwise.

### GetParametersOk

`func (o *RealtimeResponseCreateParamsToolsInner) GetParametersOk() (*map[string]interface{}, bool)`

GetParametersOk returns a tuple with the Parameters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParameters

`func (o *RealtimeResponseCreateParamsToolsInner) SetParameters(v map[string]interface{})`

SetParameters sets Parameters field to given value.

### HasParameters

`func (o *RealtimeResponseCreateParamsToolsInner) HasParameters() bool`

HasParameters returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


