# ThreadStreamEventOneOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Event** | **string** |  | 
**Data** | [**ThreadObject**](ThreadObject.md) |  | 

## Methods

### NewThreadStreamEventOneOf

`func NewThreadStreamEventOneOf(event string, data ThreadObject, ) *ThreadStreamEventOneOf`

NewThreadStreamEventOneOf instantiates a new ThreadStreamEventOneOf object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewThreadStreamEventOneOfWithDefaults

`func NewThreadStreamEventOneOfWithDefaults() *ThreadStreamEventOneOf`

NewThreadStreamEventOneOfWithDefaults instantiates a new ThreadStreamEventOneOf object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEvent

`func (o *ThreadStreamEventOneOf) GetEvent() string`

GetEvent returns the Event field if non-nil, zero value otherwise.

### GetEventOk

`func (o *ThreadStreamEventOneOf) GetEventOk() (*string, bool)`

GetEventOk returns a tuple with the Event field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEvent

`func (o *ThreadStreamEventOneOf) SetEvent(v string)`

SetEvent sets Event field to given value.


### GetData

`func (o *ThreadStreamEventOneOf) GetData() ThreadObject`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *ThreadStreamEventOneOf) GetDataOk() (*ThreadObject, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *ThreadStreamEventOneOf) SetData(v ThreadObject)`

SetData sets Data field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


