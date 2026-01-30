# FineTunePreferenceRequestInput

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Input** | Pointer to [**FineTunePreferenceRequestInputInput**](FineTunePreferenceRequestInputInput.md) |  | [optional] 
**PreferredCompletion** | Pointer to [**[]FineTunePreferenceRequestInputPreferredCompletionInner**](FineTunePreferenceRequestInputPreferredCompletionInner.md) | The preferred completion message for the output. | [optional] 
**NonPreferredCompletion** | Pointer to [**[]FineTunePreferenceRequestInputPreferredCompletionInner**](FineTunePreferenceRequestInputPreferredCompletionInner.md) | The non-preferred completion message for the output. | [optional] 

## Methods

### NewFineTunePreferenceRequestInput

`func NewFineTunePreferenceRequestInput() *FineTunePreferenceRequestInput`

NewFineTunePreferenceRequestInput instantiates a new FineTunePreferenceRequestInput object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFineTunePreferenceRequestInputWithDefaults

`func NewFineTunePreferenceRequestInputWithDefaults() *FineTunePreferenceRequestInput`

NewFineTunePreferenceRequestInputWithDefaults instantiates a new FineTunePreferenceRequestInput object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetInput

`func (o *FineTunePreferenceRequestInput) GetInput() FineTunePreferenceRequestInputInput`

GetInput returns the Input field if non-nil, zero value otherwise.

### GetInputOk

`func (o *FineTunePreferenceRequestInput) GetInputOk() (*FineTunePreferenceRequestInputInput, bool)`

GetInputOk returns a tuple with the Input field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInput

`func (o *FineTunePreferenceRequestInput) SetInput(v FineTunePreferenceRequestInputInput)`

SetInput sets Input field to given value.

### HasInput

`func (o *FineTunePreferenceRequestInput) HasInput() bool`

HasInput returns a boolean if a field has been set.

### GetPreferredCompletion

`func (o *FineTunePreferenceRequestInput) GetPreferredCompletion() []FineTunePreferenceRequestInputPreferredCompletionInner`

GetPreferredCompletion returns the PreferredCompletion field if non-nil, zero value otherwise.

### GetPreferredCompletionOk

`func (o *FineTunePreferenceRequestInput) GetPreferredCompletionOk() (*[]FineTunePreferenceRequestInputPreferredCompletionInner, bool)`

GetPreferredCompletionOk returns a tuple with the PreferredCompletion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreferredCompletion

`func (o *FineTunePreferenceRequestInput) SetPreferredCompletion(v []FineTunePreferenceRequestInputPreferredCompletionInner)`

SetPreferredCompletion sets PreferredCompletion field to given value.

### HasPreferredCompletion

`func (o *FineTunePreferenceRequestInput) HasPreferredCompletion() bool`

HasPreferredCompletion returns a boolean if a field has been set.

### GetNonPreferredCompletion

`func (o *FineTunePreferenceRequestInput) GetNonPreferredCompletion() []FineTunePreferenceRequestInputPreferredCompletionInner`

GetNonPreferredCompletion returns the NonPreferredCompletion field if non-nil, zero value otherwise.

### GetNonPreferredCompletionOk

`func (o *FineTunePreferenceRequestInput) GetNonPreferredCompletionOk() (*[]FineTunePreferenceRequestInputPreferredCompletionInner, bool)`

GetNonPreferredCompletionOk returns a tuple with the NonPreferredCompletion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNonPreferredCompletion

`func (o *FineTunePreferenceRequestInput) SetNonPreferredCompletion(v []FineTunePreferenceRequestInputPreferredCompletionInner)`

SetNonPreferredCompletion sets NonPreferredCompletion field to given value.

### HasNonPreferredCompletion

`func (o *FineTunePreferenceRequestInput) HasNonPreferredCompletion() bool`

HasNonPreferredCompletion returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


