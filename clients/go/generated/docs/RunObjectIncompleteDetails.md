# RunObjectIncompleteDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Reason** | Pointer to **string** | The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run. | [optional] 

## Methods

### NewRunObjectIncompleteDetails

`func NewRunObjectIncompleteDetails() *RunObjectIncompleteDetails`

NewRunObjectIncompleteDetails instantiates a new RunObjectIncompleteDetails object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRunObjectIncompleteDetailsWithDefaults

`func NewRunObjectIncompleteDetailsWithDefaults() *RunObjectIncompleteDetails`

NewRunObjectIncompleteDetailsWithDefaults instantiates a new RunObjectIncompleteDetails object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetReason

`func (o *RunObjectIncompleteDetails) GetReason() string`

GetReason returns the Reason field if non-nil, zero value otherwise.

### GetReasonOk

`func (o *RunObjectIncompleteDetails) GetReasonOk() (*string, bool)`

GetReasonOk returns a tuple with the Reason field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReason

`func (o *RunObjectIncompleteDetails) SetReason(v string)`

SetReason sets Reason field to given value.

### HasReason

`func (o *RunObjectIncompleteDetails) HasReason() bool`

HasReason returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


