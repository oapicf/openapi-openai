# RealtimeServerEventSessionUpdated

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **string** | The unique ID of the server event. | 
**Type** | **string** | The event type, must be &#x60;session.updated&#x60;. | 
**Session** | [**RealtimeSession**](RealtimeSession.md) |  | 

## Methods

### NewRealtimeServerEventSessionUpdated

`func NewRealtimeServerEventSessionUpdated(eventId string, type_ string, session RealtimeSession, ) *RealtimeServerEventSessionUpdated`

NewRealtimeServerEventSessionUpdated instantiates a new RealtimeServerEventSessionUpdated object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRealtimeServerEventSessionUpdatedWithDefaults

`func NewRealtimeServerEventSessionUpdatedWithDefaults() *RealtimeServerEventSessionUpdated`

NewRealtimeServerEventSessionUpdatedWithDefaults instantiates a new RealtimeServerEventSessionUpdated object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEventId

`func (o *RealtimeServerEventSessionUpdated) GetEventId() string`

GetEventId returns the EventId field if non-nil, zero value otherwise.

### GetEventIdOk

`func (o *RealtimeServerEventSessionUpdated) GetEventIdOk() (*string, bool)`

GetEventIdOk returns a tuple with the EventId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventId

`func (o *RealtimeServerEventSessionUpdated) SetEventId(v string)`

SetEventId sets EventId field to given value.


### GetType

`func (o *RealtimeServerEventSessionUpdated) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RealtimeServerEventSessionUpdated) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RealtimeServerEventSessionUpdated) SetType(v string)`

SetType sets Type field to given value.


### GetSession

`func (o *RealtimeServerEventSessionUpdated) GetSession() RealtimeSession`

GetSession returns the Session field if non-nil, zero value otherwise.

### GetSessionOk

`func (o *RealtimeServerEventSessionUpdated) GetSessionOk() (*RealtimeSession, bool)`

GetSessionOk returns a tuple with the Session field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSession

`func (o *RealtimeServerEventSessionUpdated) SetSession(v RealtimeSession)`

SetSession sets Session field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


