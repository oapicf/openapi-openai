# RunStepStreamEventOneOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Event** | **string** |  | 
**Data** | [**RunStepObject**](RunStepObject.md) |  | 

## Methods

### NewRunStepStreamEventOneOf

`func NewRunStepStreamEventOneOf(event string, data RunStepObject, ) *RunStepStreamEventOneOf`

NewRunStepStreamEventOneOf instantiates a new RunStepStreamEventOneOf object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRunStepStreamEventOneOfWithDefaults

`func NewRunStepStreamEventOneOfWithDefaults() *RunStepStreamEventOneOf`

NewRunStepStreamEventOneOfWithDefaults instantiates a new RunStepStreamEventOneOf object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEvent

`func (o *RunStepStreamEventOneOf) GetEvent() string`

GetEvent returns the Event field if non-nil, zero value otherwise.

### GetEventOk

`func (o *RunStepStreamEventOneOf) GetEventOk() (*string, bool)`

GetEventOk returns a tuple with the Event field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEvent

`func (o *RunStepStreamEventOneOf) SetEvent(v string)`

SetEvent sets Event field to given value.


### GetData

`func (o *RunStepStreamEventOneOf) GetData() RunStepObject`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *RunStepStreamEventOneOf) GetDataOk() (*RunStepObject, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *RunStepStreamEventOneOf) SetData(v RunStepObject)`

SetData sets Data field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


