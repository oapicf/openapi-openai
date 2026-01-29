# ThreadStreamEvent

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Event** | **string** |  | 
**Data** | [**ThreadObject**](ThreadObject.md) |  | 

## Methods

### NewThreadStreamEvent

`func NewThreadStreamEvent(event string, data ThreadObject, ) *ThreadStreamEvent`

NewThreadStreamEvent instantiates a new ThreadStreamEvent object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewThreadStreamEventWithDefaults

`func NewThreadStreamEventWithDefaults() *ThreadStreamEvent`

NewThreadStreamEventWithDefaults instantiates a new ThreadStreamEvent object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEvent

`func (o *ThreadStreamEvent) GetEvent() string`

GetEvent returns the Event field if non-nil, zero value otherwise.

### GetEventOk

`func (o *ThreadStreamEvent) GetEventOk() (*string, bool)`

GetEventOk returns a tuple with the Event field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEvent

`func (o *ThreadStreamEvent) SetEvent(v string)`

SetEvent sets Event field to given value.


### GetData

`func (o *ThreadStreamEvent) GetData() ThreadObject`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *ThreadStreamEvent) GetDataOk() (*ThreadObject, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *ThreadStreamEvent) SetData(v ThreadObject)`

SetData sets Data field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


