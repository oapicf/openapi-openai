# RealtimeServerEventSessionCreated

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **string** | The unique ID of the server event. | 
**Type** | **string** | The event type, must be &#x60;session.created&#x60;. | 
**Session** | [**RealtimeSession**](RealtimeSession.md) |  | 

## Methods

### NewRealtimeServerEventSessionCreated

`func NewRealtimeServerEventSessionCreated(eventId string, type_ string, session RealtimeSession, ) *RealtimeServerEventSessionCreated`

NewRealtimeServerEventSessionCreated instantiates a new RealtimeServerEventSessionCreated object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRealtimeServerEventSessionCreatedWithDefaults

`func NewRealtimeServerEventSessionCreatedWithDefaults() *RealtimeServerEventSessionCreated`

NewRealtimeServerEventSessionCreatedWithDefaults instantiates a new RealtimeServerEventSessionCreated object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEventId

`func (o *RealtimeServerEventSessionCreated) GetEventId() string`

GetEventId returns the EventId field if non-nil, zero value otherwise.

### GetEventIdOk

`func (o *RealtimeServerEventSessionCreated) GetEventIdOk() (*string, bool)`

GetEventIdOk returns a tuple with the EventId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventId

`func (o *RealtimeServerEventSessionCreated) SetEventId(v string)`

SetEventId sets EventId field to given value.


### GetType

`func (o *RealtimeServerEventSessionCreated) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RealtimeServerEventSessionCreated) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RealtimeServerEventSessionCreated) SetType(v string)`

SetType sets Type field to given value.


### GetSession

`func (o *RealtimeServerEventSessionCreated) GetSession() RealtimeSession`

GetSession returns the Session field if non-nil, zero value otherwise.

### GetSessionOk

`func (o *RealtimeServerEventSessionCreated) GetSessionOk() (*RealtimeSession, bool)`

GetSessionOk returns a tuple with the Session field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSession

`func (o *RealtimeServerEventSessionCreated) SetSession(v RealtimeSession)`

SetSession sets Session field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


