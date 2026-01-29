# RunStepDeltaObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | The identifier of the run step, which can be referenced in API endpoints. | 
**Object** | **string** | The object type, which is always &#x60;thread.run.step.delta&#x60;. | 
**Delta** | [**RunStepDeltaObjectDelta**](RunStepDeltaObjectDelta.md) |  | 

## Methods

### NewRunStepDeltaObject

`func NewRunStepDeltaObject(id string, object string, delta RunStepDeltaObjectDelta, ) *RunStepDeltaObject`

NewRunStepDeltaObject instantiates a new RunStepDeltaObject object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRunStepDeltaObjectWithDefaults

`func NewRunStepDeltaObjectWithDefaults() *RunStepDeltaObject`

NewRunStepDeltaObjectWithDefaults instantiates a new RunStepDeltaObject object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *RunStepDeltaObject) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *RunStepDeltaObject) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *RunStepDeltaObject) SetId(v string)`

SetId sets Id field to given value.


### GetObject

`func (o *RunStepDeltaObject) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *RunStepDeltaObject) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *RunStepDeltaObject) SetObject(v string)`

SetObject sets Object field to given value.


### GetDelta

`func (o *RunStepDeltaObject) GetDelta() RunStepDeltaObjectDelta`

GetDelta returns the Delta field if non-nil, zero value otherwise.

### GetDeltaOk

`func (o *RunStepDeltaObject) GetDeltaOk() (*RunStepDeltaObjectDelta, bool)`

GetDeltaOk returns a tuple with the Delta field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDelta

`func (o *RunStepDeltaObject) SetDelta(v RunStepDeltaObjectDelta)`

SetDelta sets Delta field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


