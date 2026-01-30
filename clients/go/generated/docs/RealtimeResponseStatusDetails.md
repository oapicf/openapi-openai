# RealtimeResponseStatusDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | Pointer to **string** | The type of error that caused the response to fail, corresponding  with the &#x60;status&#x60; field (&#x60;completed&#x60;, &#x60;cancelled&#x60;, &#x60;incomplete&#x60;,  &#x60;failed&#x60;).  | [optional] 
**Reason** | Pointer to **string** | The reason the Response did not complete. For a &#x60;cancelled&#x60; Response,  one of &#x60;turn_detected&#x60; (the server VAD detected a new start of speech)  or &#x60;client_cancelled&#x60; (the client sent a cancel event). For an  &#x60;incomplete&#x60; Response, one of &#x60;max_output_tokens&#x60; or &#x60;content_filter&#x60;  (the server-side safety filter activated and cut off the response).  | [optional] 
**Error** | Pointer to [**RealtimeResponseStatusDetailsError**](RealtimeResponseStatusDetailsError.md) |  | [optional] 

## Methods

### NewRealtimeResponseStatusDetails

`func NewRealtimeResponseStatusDetails() *RealtimeResponseStatusDetails`

NewRealtimeResponseStatusDetails instantiates a new RealtimeResponseStatusDetails object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRealtimeResponseStatusDetailsWithDefaults

`func NewRealtimeResponseStatusDetailsWithDefaults() *RealtimeResponseStatusDetails`

NewRealtimeResponseStatusDetailsWithDefaults instantiates a new RealtimeResponseStatusDetails object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *RealtimeResponseStatusDetails) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *RealtimeResponseStatusDetails) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *RealtimeResponseStatusDetails) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *RealtimeResponseStatusDetails) HasType() bool`

HasType returns a boolean if a field has been set.

### GetReason

`func (o *RealtimeResponseStatusDetails) GetReason() string`

GetReason returns the Reason field if non-nil, zero value otherwise.

### GetReasonOk

`func (o *RealtimeResponseStatusDetails) GetReasonOk() (*string, bool)`

GetReasonOk returns a tuple with the Reason field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReason

`func (o *RealtimeResponseStatusDetails) SetReason(v string)`

SetReason sets Reason field to given value.

### HasReason

`func (o *RealtimeResponseStatusDetails) HasReason() bool`

HasReason returns a boolean if a field has been set.

### GetError

`func (o *RealtimeResponseStatusDetails) GetError() RealtimeResponseStatusDetailsError`

GetError returns the Error field if non-nil, zero value otherwise.

### GetErrorOk

`func (o *RealtimeResponseStatusDetails) GetErrorOk() (*RealtimeResponseStatusDetailsError, bool)`

GetErrorOk returns a tuple with the Error field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetError

`func (o *RealtimeResponseStatusDetails) SetError(v RealtimeResponseStatusDetailsError)`

SetError sets Error field to given value.

### HasError

`func (o *RealtimeResponseStatusDetails) HasError() bool`

HasError returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


