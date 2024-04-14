# CreateModerationResponseResultsInnerCategoryScores

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Hate** | **float32** | The score for the category &#39;hate&#39;. | 
**HateThreatening** | **float32** | The score for the category &#39;hate/threatening&#39;. | 
**Harassment** | **float32** | The score for the category &#39;harassment&#39;. | 
**HarassmentThreatening** | **float32** | The score for the category &#39;harassment/threatening&#39;. | 
**SelfHarm** | **float32** | The score for the category &#39;self-harm&#39;. | 
**SelfHarmIntent** | **float32** | The score for the category &#39;self-harm/intent&#39;. | 
**SelfHarmInstructions** | **float32** | The score for the category &#39;self-harm/instructions&#39;. | 
**Sexual** | **float32** | The score for the category &#39;sexual&#39;. | 
**SexualMinors** | **float32** | The score for the category &#39;sexual/minors&#39;. | 
**Violence** | **float32** | The score for the category &#39;violence&#39;. | 
**ViolenceGraphic** | **float32** | The score for the category &#39;violence/graphic&#39;. | 

## Methods

### NewCreateModerationResponseResultsInnerCategoryScores

`func NewCreateModerationResponseResultsInnerCategoryScores(hate float32, hateThreatening float32, harassment float32, harassmentThreatening float32, selfHarm float32, selfHarmIntent float32, selfHarmInstructions float32, sexual float32, sexualMinors float32, violence float32, violenceGraphic float32, ) *CreateModerationResponseResultsInnerCategoryScores`

NewCreateModerationResponseResultsInnerCategoryScores instantiates a new CreateModerationResponseResultsInnerCategoryScores object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateModerationResponseResultsInnerCategoryScoresWithDefaults

`func NewCreateModerationResponseResultsInnerCategoryScoresWithDefaults() *CreateModerationResponseResultsInnerCategoryScores`

NewCreateModerationResponseResultsInnerCategoryScoresWithDefaults instantiates a new CreateModerationResponseResultsInnerCategoryScores object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetHate

`func (o *CreateModerationResponseResultsInnerCategoryScores) GetHate() float32`

GetHate returns the Hate field if non-nil, zero value otherwise.

### GetHateOk

`func (o *CreateModerationResponseResultsInnerCategoryScores) GetHateOk() (*float32, bool)`

GetHateOk returns a tuple with the Hate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHate

`func (o *CreateModerationResponseResultsInnerCategoryScores) SetHate(v float32)`

SetHate sets Hate field to given value.


### GetHateThreatening

`func (o *CreateModerationResponseResultsInnerCategoryScores) GetHateThreatening() float32`

GetHateThreatening returns the HateThreatening field if non-nil, zero value otherwise.

### GetHateThreateningOk

`func (o *CreateModerationResponseResultsInnerCategoryScores) GetHateThreateningOk() (*float32, bool)`

GetHateThreateningOk returns a tuple with the HateThreatening field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHateThreatening

`func (o *CreateModerationResponseResultsInnerCategoryScores) SetHateThreatening(v float32)`

SetHateThreatening sets HateThreatening field to given value.


### GetHarassment

`func (o *CreateModerationResponseResultsInnerCategoryScores) GetHarassment() float32`

GetHarassment returns the Harassment field if non-nil, zero value otherwise.

### GetHarassmentOk

`func (o *CreateModerationResponseResultsInnerCategoryScores) GetHarassmentOk() (*float32, bool)`

GetHarassmentOk returns a tuple with the Harassment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHarassment

`func (o *CreateModerationResponseResultsInnerCategoryScores) SetHarassment(v float32)`

SetHarassment sets Harassment field to given value.


### GetHarassmentThreatening

`func (o *CreateModerationResponseResultsInnerCategoryScores) GetHarassmentThreatening() float32`

GetHarassmentThreatening returns the HarassmentThreatening field if non-nil, zero value otherwise.

### GetHarassmentThreateningOk

`func (o *CreateModerationResponseResultsInnerCategoryScores) GetHarassmentThreateningOk() (*float32, bool)`

GetHarassmentThreateningOk returns a tuple with the HarassmentThreatening field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHarassmentThreatening

`func (o *CreateModerationResponseResultsInnerCategoryScores) SetHarassmentThreatening(v float32)`

SetHarassmentThreatening sets HarassmentThreatening field to given value.


### GetSelfHarm

`func (o *CreateModerationResponseResultsInnerCategoryScores) GetSelfHarm() float32`

GetSelfHarm returns the SelfHarm field if non-nil, zero value otherwise.

### GetSelfHarmOk

`func (o *CreateModerationResponseResultsInnerCategoryScores) GetSelfHarmOk() (*float32, bool)`

GetSelfHarmOk returns a tuple with the SelfHarm field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSelfHarm

`func (o *CreateModerationResponseResultsInnerCategoryScores) SetSelfHarm(v float32)`

SetSelfHarm sets SelfHarm field to given value.


### GetSelfHarmIntent

`func (o *CreateModerationResponseResultsInnerCategoryScores) GetSelfHarmIntent() float32`

GetSelfHarmIntent returns the SelfHarmIntent field if non-nil, zero value otherwise.

### GetSelfHarmIntentOk

`func (o *CreateModerationResponseResultsInnerCategoryScores) GetSelfHarmIntentOk() (*float32, bool)`

GetSelfHarmIntentOk returns a tuple with the SelfHarmIntent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSelfHarmIntent

`func (o *CreateModerationResponseResultsInnerCategoryScores) SetSelfHarmIntent(v float32)`

SetSelfHarmIntent sets SelfHarmIntent field to given value.


### GetSelfHarmInstructions

`func (o *CreateModerationResponseResultsInnerCategoryScores) GetSelfHarmInstructions() float32`

GetSelfHarmInstructions returns the SelfHarmInstructions field if non-nil, zero value otherwise.

### GetSelfHarmInstructionsOk

`func (o *CreateModerationResponseResultsInnerCategoryScores) GetSelfHarmInstructionsOk() (*float32, bool)`

GetSelfHarmInstructionsOk returns a tuple with the SelfHarmInstructions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSelfHarmInstructions

`func (o *CreateModerationResponseResultsInnerCategoryScores) SetSelfHarmInstructions(v float32)`

SetSelfHarmInstructions sets SelfHarmInstructions field to given value.


### GetSexual

`func (o *CreateModerationResponseResultsInnerCategoryScores) GetSexual() float32`

GetSexual returns the Sexual field if non-nil, zero value otherwise.

### GetSexualOk

`func (o *CreateModerationResponseResultsInnerCategoryScores) GetSexualOk() (*float32, bool)`

GetSexualOk returns a tuple with the Sexual field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSexual

`func (o *CreateModerationResponseResultsInnerCategoryScores) SetSexual(v float32)`

SetSexual sets Sexual field to given value.


### GetSexualMinors

`func (o *CreateModerationResponseResultsInnerCategoryScores) GetSexualMinors() float32`

GetSexualMinors returns the SexualMinors field if non-nil, zero value otherwise.

### GetSexualMinorsOk

`func (o *CreateModerationResponseResultsInnerCategoryScores) GetSexualMinorsOk() (*float32, bool)`

GetSexualMinorsOk returns a tuple with the SexualMinors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSexualMinors

`func (o *CreateModerationResponseResultsInnerCategoryScores) SetSexualMinors(v float32)`

SetSexualMinors sets SexualMinors field to given value.


### GetViolence

`func (o *CreateModerationResponseResultsInnerCategoryScores) GetViolence() float32`

GetViolence returns the Violence field if non-nil, zero value otherwise.

### GetViolenceOk

`func (o *CreateModerationResponseResultsInnerCategoryScores) GetViolenceOk() (*float32, bool)`

GetViolenceOk returns a tuple with the Violence field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetViolence

`func (o *CreateModerationResponseResultsInnerCategoryScores) SetViolence(v float32)`

SetViolence sets Violence field to given value.


### GetViolenceGraphic

`func (o *CreateModerationResponseResultsInnerCategoryScores) GetViolenceGraphic() float32`

GetViolenceGraphic returns the ViolenceGraphic field if non-nil, zero value otherwise.

### GetViolenceGraphicOk

`func (o *CreateModerationResponseResultsInnerCategoryScores) GetViolenceGraphicOk() (*float32, bool)`

GetViolenceGraphicOk returns a tuple with the ViolenceGraphic field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetViolenceGraphic

`func (o *CreateModerationResponseResultsInnerCategoryScores) SetViolenceGraphic(v float32)`

SetViolenceGraphic sets ViolenceGraphic field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


