# RealtimeClientEventResponseCancel

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | Pointer to **string** | Optional client-generated ID used to identify this event. | [optional] 
**Type** | **string** | The event type, must be &#x60;response.cancel&#x60;. | 
**ResponseId** | Pointer to **string** | A specific response ID to cancel - if not provided, will cancel an  in-progress response in the default conversation.  | [optional] 

## Methods

### NewRealtimeClientEventResponseCancel

`func NewRealtimeClientEventResponseCancel(type_ string, ) *RealtimeClientEventResponseCancel`

NewRealtimeClientEventResponseCancel instantiates a new RealtimeClientEventResponseCancel object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRealtimeClientEventResponseCancelWithDefaults

`func NewRealtimeClientEventResponseCancelWithDefaults() *RealtimeClientEventResponseCancel`

NewRealtimeClientEventResponseCancelWithDefaults instantiates a new RealtimeClientEventResponseCancel object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEventId

`func (o *RealtimeClientEventResponseCancel) GetEventId() string`

GetEventId returns the EventId field if non-nil, zero value otherwise.

### GetEventIdOk

`func (o *RealtimeClientEventResponseCancel) GetEventIdOk() (*string, bool)`

GetEventIdOk returns a tuple with the EventId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventId

`func (o *RealtimeClientEventResponseCancel) SetEventId(v string)`

SetEventId sets EventId field to given value.

### HasEventId

`func (o *RealtimeClientEventResponseCancel) HasEventId() bool`

HasEventId returns a boolean if a field has been set.

### GetType

`func (o *RealtimeClientEventResponseCancel) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RealtimeClientEventResponseCancel) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RealtimeClientEventResponseCancel) SetType(v string)`

SetType sets Type field to given value.


### GetResponseId

`func (o *RealtimeClientEventResponseCancel) GetResponseId() string`

GetResponseId returns the ResponseId field if non-nil, zero value otherwise.

### GetResponseIdOk

`func (o *RealtimeClientEventResponseCancel) GetResponseIdOk() (*string, bool)`

GetResponseIdOk returns a tuple with the ResponseId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponseId

`func (o *RealtimeClientEventResponseCancel) SetResponseId(v string)`

SetResponseId sets ResponseId field to given value.

### HasResponseId

`func (o *RealtimeClientEventResponseCancel) HasResponseId() bool`

HasResponseId returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


