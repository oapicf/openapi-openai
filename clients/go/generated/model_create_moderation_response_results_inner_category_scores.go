/*
OpenAI API

The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

API version: 2.0.0
Contact: blah+oapicf@cliffano.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
	"bytes"
	"fmt"
)

// checks if the CreateModerationResponseResultsInnerCategoryScores type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CreateModerationResponseResultsInnerCategoryScores{}

// CreateModerationResponseResultsInnerCategoryScores A list of the categories along with their scores as predicted by model.
type CreateModerationResponseResultsInnerCategoryScores struct {
	// The score for the category 'hate'.
	Hate float32 `json:"hate"`
	// The score for the category 'hate/threatening'.
	HateThreatening float32 `json:"hate/threatening"`
	// The score for the category 'harassment'.
	Harassment float32 `json:"harassment"`
	// The score for the category 'harassment/threatening'.
	HarassmentThreatening float32 `json:"harassment/threatening"`
	// The score for the category 'self-harm'.
	SelfHarm float32 `json:"self-harm"`
	// The score for the category 'self-harm/intent'.
	SelfHarmIntent float32 `json:"self-harm/intent"`
	// The score for the category 'self-harm/instructions'.
	SelfHarmInstructions float32 `json:"self-harm/instructions"`
	// The score for the category 'sexual'.
	Sexual float32 `json:"sexual"`
	// The score for the category 'sexual/minors'.
	SexualMinors float32 `json:"sexual/minors"`
	// The score for the category 'violence'.
	Violence float32 `json:"violence"`
	// The score for the category 'violence/graphic'.
	ViolenceGraphic float32 `json:"violence/graphic"`
}

type _CreateModerationResponseResultsInnerCategoryScores CreateModerationResponseResultsInnerCategoryScores

// NewCreateModerationResponseResultsInnerCategoryScores instantiates a new CreateModerationResponseResultsInnerCategoryScores object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCreateModerationResponseResultsInnerCategoryScores(hate float32, hateThreatening float32, harassment float32, harassmentThreatening float32, selfHarm float32, selfHarmIntent float32, selfHarmInstructions float32, sexual float32, sexualMinors float32, violence float32, violenceGraphic float32) *CreateModerationResponseResultsInnerCategoryScores {
	this := CreateModerationResponseResultsInnerCategoryScores{}
	this.Hate = hate
	this.HateThreatening = hateThreatening
	this.Harassment = harassment
	this.HarassmentThreatening = harassmentThreatening
	this.SelfHarm = selfHarm
	this.SelfHarmIntent = selfHarmIntent
	this.SelfHarmInstructions = selfHarmInstructions
	this.Sexual = sexual
	this.SexualMinors = sexualMinors
	this.Violence = violence
	this.ViolenceGraphic = violenceGraphic
	return &this
}

// NewCreateModerationResponseResultsInnerCategoryScoresWithDefaults instantiates a new CreateModerationResponseResultsInnerCategoryScores object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCreateModerationResponseResultsInnerCategoryScoresWithDefaults() *CreateModerationResponseResultsInnerCategoryScores {
	this := CreateModerationResponseResultsInnerCategoryScores{}
	return &this
}

// GetHate returns the Hate field value
func (o *CreateModerationResponseResultsInnerCategoryScores) GetHate() float32 {
	if o == nil {
		var ret float32
		return ret
	}

	return o.Hate
}

// GetHateOk returns a tuple with the Hate field value
// and a boolean to check if the value has been set.
func (o *CreateModerationResponseResultsInnerCategoryScores) GetHateOk() (*float32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Hate, true
}

// SetHate sets field value
func (o *CreateModerationResponseResultsInnerCategoryScores) SetHate(v float32) {
	o.Hate = v
}

// GetHateThreatening returns the HateThreatening field value
func (o *CreateModerationResponseResultsInnerCategoryScores) GetHateThreatening() float32 {
	if o == nil {
		var ret float32
		return ret
	}

	return o.HateThreatening
}

// GetHateThreateningOk returns a tuple with the HateThreatening field value
// and a boolean to check if the value has been set.
func (o *CreateModerationResponseResultsInnerCategoryScores) GetHateThreateningOk() (*float32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.HateThreatening, true
}

// SetHateThreatening sets field value
func (o *CreateModerationResponseResultsInnerCategoryScores) SetHateThreatening(v float32) {
	o.HateThreatening = v
}

// GetHarassment returns the Harassment field value
func (o *CreateModerationResponseResultsInnerCategoryScores) GetHarassment() float32 {
	if o == nil {
		var ret float32
		return ret
	}

	return o.Harassment
}

// GetHarassmentOk returns a tuple with the Harassment field value
// and a boolean to check if the value has been set.
func (o *CreateModerationResponseResultsInnerCategoryScores) GetHarassmentOk() (*float32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Harassment, true
}

// SetHarassment sets field value
func (o *CreateModerationResponseResultsInnerCategoryScores) SetHarassment(v float32) {
	o.Harassment = v
}

// GetHarassmentThreatening returns the HarassmentThreatening field value
func (o *CreateModerationResponseResultsInnerCategoryScores) GetHarassmentThreatening() float32 {
	if o == nil {
		var ret float32
		return ret
	}

	return o.HarassmentThreatening
}

// GetHarassmentThreateningOk returns a tuple with the HarassmentThreatening field value
// and a boolean to check if the value has been set.
func (o *CreateModerationResponseResultsInnerCategoryScores) GetHarassmentThreateningOk() (*float32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.HarassmentThreatening, true
}

// SetHarassmentThreatening sets field value
func (o *CreateModerationResponseResultsInnerCategoryScores) SetHarassmentThreatening(v float32) {
	o.HarassmentThreatening = v
}

// GetSelfHarm returns the SelfHarm field value
func (o *CreateModerationResponseResultsInnerCategoryScores) GetSelfHarm() float32 {
	if o == nil {
		var ret float32
		return ret
	}

	return o.SelfHarm
}

// GetSelfHarmOk returns a tuple with the SelfHarm field value
// and a boolean to check if the value has been set.
func (o *CreateModerationResponseResultsInnerCategoryScores) GetSelfHarmOk() (*float32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.SelfHarm, true
}

// SetSelfHarm sets field value
func (o *CreateModerationResponseResultsInnerCategoryScores) SetSelfHarm(v float32) {
	o.SelfHarm = v
}

// GetSelfHarmIntent returns the SelfHarmIntent field value
func (o *CreateModerationResponseResultsInnerCategoryScores) GetSelfHarmIntent() float32 {
	if o == nil {
		var ret float32
		return ret
	}

	return o.SelfHarmIntent
}

// GetSelfHarmIntentOk returns a tuple with the SelfHarmIntent field value
// and a boolean to check if the value has been set.
func (o *CreateModerationResponseResultsInnerCategoryScores) GetSelfHarmIntentOk() (*float32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.SelfHarmIntent, true
}

// SetSelfHarmIntent sets field value
func (o *CreateModerationResponseResultsInnerCategoryScores) SetSelfHarmIntent(v float32) {
	o.SelfHarmIntent = v
}

// GetSelfHarmInstructions returns the SelfHarmInstructions field value
func (o *CreateModerationResponseResultsInnerCategoryScores) GetSelfHarmInstructions() float32 {
	if o == nil {
		var ret float32
		return ret
	}

	return o.SelfHarmInstructions
}

// GetSelfHarmInstructionsOk returns a tuple with the SelfHarmInstructions field value
// and a boolean to check if the value has been set.
func (o *CreateModerationResponseResultsInnerCategoryScores) GetSelfHarmInstructionsOk() (*float32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.SelfHarmInstructions, true
}

// SetSelfHarmInstructions sets field value
func (o *CreateModerationResponseResultsInnerCategoryScores) SetSelfHarmInstructions(v float32) {
	o.SelfHarmInstructions = v
}

// GetSexual returns the Sexual field value
func (o *CreateModerationResponseResultsInnerCategoryScores) GetSexual() float32 {
	if o == nil {
		var ret float32
		return ret
	}

	return o.Sexual
}

// GetSexualOk returns a tuple with the Sexual field value
// and a boolean to check if the value has been set.
func (o *CreateModerationResponseResultsInnerCategoryScores) GetSexualOk() (*float32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Sexual, true
}

// SetSexual sets field value
func (o *CreateModerationResponseResultsInnerCategoryScores) SetSexual(v float32) {
	o.Sexual = v
}

// GetSexualMinors returns the SexualMinors field value
func (o *CreateModerationResponseResultsInnerCategoryScores) GetSexualMinors() float32 {
	if o == nil {
		var ret float32
		return ret
	}

	return o.SexualMinors
}

// GetSexualMinorsOk returns a tuple with the SexualMinors field value
// and a boolean to check if the value has been set.
func (o *CreateModerationResponseResultsInnerCategoryScores) GetSexualMinorsOk() (*float32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.SexualMinors, true
}

// SetSexualMinors sets field value
func (o *CreateModerationResponseResultsInnerCategoryScores) SetSexualMinors(v float32) {
	o.SexualMinors = v
}

// GetViolence returns the Violence field value
func (o *CreateModerationResponseResultsInnerCategoryScores) GetViolence() float32 {
	if o == nil {
		var ret float32
		return ret
	}

	return o.Violence
}

// GetViolenceOk returns a tuple with the Violence field value
// and a boolean to check if the value has been set.
func (o *CreateModerationResponseResultsInnerCategoryScores) GetViolenceOk() (*float32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Violence, true
}

// SetViolence sets field value
func (o *CreateModerationResponseResultsInnerCategoryScores) SetViolence(v float32) {
	o.Violence = v
}

// GetViolenceGraphic returns the ViolenceGraphic field value
func (o *CreateModerationResponseResultsInnerCategoryScores) GetViolenceGraphic() float32 {
	if o == nil {
		var ret float32
		return ret
	}

	return o.ViolenceGraphic
}

// GetViolenceGraphicOk returns a tuple with the ViolenceGraphic field value
// and a boolean to check if the value has been set.
func (o *CreateModerationResponseResultsInnerCategoryScores) GetViolenceGraphicOk() (*float32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.ViolenceGraphic, true
}

// SetViolenceGraphic sets field value
func (o *CreateModerationResponseResultsInnerCategoryScores) SetViolenceGraphic(v float32) {
	o.ViolenceGraphic = v
}

func (o CreateModerationResponseResultsInnerCategoryScores) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CreateModerationResponseResultsInnerCategoryScores) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["hate"] = o.Hate
	toSerialize["hate/threatening"] = o.HateThreatening
	toSerialize["harassment"] = o.Harassment
	toSerialize["harassment/threatening"] = o.HarassmentThreatening
	toSerialize["self-harm"] = o.SelfHarm
	toSerialize["self-harm/intent"] = o.SelfHarmIntent
	toSerialize["self-harm/instructions"] = o.SelfHarmInstructions
	toSerialize["sexual"] = o.Sexual
	toSerialize["sexual/minors"] = o.SexualMinors
	toSerialize["violence"] = o.Violence
	toSerialize["violence/graphic"] = o.ViolenceGraphic
	return toSerialize, nil
}

func (o *CreateModerationResponseResultsInnerCategoryScores) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"hate",
		"hate/threatening",
		"harassment",
		"harassment/threatening",
		"self-harm",
		"self-harm/intent",
		"self-harm/instructions",
		"sexual",
		"sexual/minors",
		"violence",
		"violence/graphic",
	}

	allProperties := make(map[string]interface{})

	err = json.Unmarshal(data, &allProperties)

	if err != nil {
		return err;
	}

	for _, requiredProperty := range(requiredProperties) {
		if _, exists := allProperties[requiredProperty]; !exists {
			return fmt.Errorf("no value given for required property %v", requiredProperty)
		}
	}

	varCreateModerationResponseResultsInnerCategoryScores := _CreateModerationResponseResultsInnerCategoryScores{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCreateModerationResponseResultsInnerCategoryScores)

	if err != nil {
		return err
	}

	*o = CreateModerationResponseResultsInnerCategoryScores(varCreateModerationResponseResultsInnerCategoryScores)

	return err
}

type NullableCreateModerationResponseResultsInnerCategoryScores struct {
	value *CreateModerationResponseResultsInnerCategoryScores
	isSet bool
}

func (v NullableCreateModerationResponseResultsInnerCategoryScores) Get() *CreateModerationResponseResultsInnerCategoryScores {
	return v.value
}

func (v *NullableCreateModerationResponseResultsInnerCategoryScores) Set(val *CreateModerationResponseResultsInnerCategoryScores) {
	v.value = val
	v.isSet = true
}

func (v NullableCreateModerationResponseResultsInnerCategoryScores) IsSet() bool {
	return v.isSet
}

func (v *NullableCreateModerationResponseResultsInnerCategoryScores) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCreateModerationResponseResultsInnerCategoryScores(val *CreateModerationResponseResultsInnerCategoryScores) *NullableCreateModerationResponseResultsInnerCategoryScores {
	return &NullableCreateModerationResponseResultsInnerCategoryScores{value: val, isSet: true}
}

func (v NullableCreateModerationResponseResultsInnerCategoryScores) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCreateModerationResponseResultsInnerCategoryScores) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


