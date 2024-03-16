/*
OpenAI API

APIs for sampling from and fine-tuning language models

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

// checks if the FineTune type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &FineTune{}

// FineTune struct for FineTune
type FineTune struct {
	Id string `json:"id"`
	Object string `json:"object"`
	CreatedAt int32 `json:"created_at"`
	UpdatedAt int32 `json:"updated_at"`
	Model string `json:"model"`
	FineTunedModel NullableString `json:"fine_tuned_model"`
	OrganizationId string `json:"organization_id"`
	Status string `json:"status"`
	Hyperparams map[string]interface{} `json:"hyperparams"`
	TrainingFiles []OpenAIFile `json:"training_files"`
	ValidationFiles []OpenAIFile `json:"validation_files"`
	ResultFiles []OpenAIFile `json:"result_files"`
	Events []FineTuneEvent `json:"events,omitempty"`
}

type _FineTune FineTune

// NewFineTune instantiates a new FineTune object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewFineTune(id string, object string, createdAt int32, updatedAt int32, model string, fineTunedModel NullableString, organizationId string, status string, hyperparams map[string]interface{}, trainingFiles []OpenAIFile, validationFiles []OpenAIFile, resultFiles []OpenAIFile) *FineTune {
	this := FineTune{}
	this.Id = id
	this.Object = object
	this.CreatedAt = createdAt
	this.UpdatedAt = updatedAt
	this.Model = model
	this.FineTunedModel = fineTunedModel
	this.OrganizationId = organizationId
	this.Status = status
	this.Hyperparams = hyperparams
	this.TrainingFiles = trainingFiles
	this.ValidationFiles = validationFiles
	this.ResultFiles = resultFiles
	return &this
}

// NewFineTuneWithDefaults instantiates a new FineTune object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewFineTuneWithDefaults() *FineTune {
	this := FineTune{}
	return &this
}

// GetId returns the Id field value
func (o *FineTune) GetId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *FineTune) GetIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *FineTune) SetId(v string) {
	o.Id = v
}

// GetObject returns the Object field value
func (o *FineTune) GetObject() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Object
}

// GetObjectOk returns a tuple with the Object field value
// and a boolean to check if the value has been set.
func (o *FineTune) GetObjectOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Object, true
}

// SetObject sets field value
func (o *FineTune) SetObject(v string) {
	o.Object = v
}

// GetCreatedAt returns the CreatedAt field value
func (o *FineTune) GetCreatedAt() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.CreatedAt
}

// GetCreatedAtOk returns a tuple with the CreatedAt field value
// and a boolean to check if the value has been set.
func (o *FineTune) GetCreatedAtOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.CreatedAt, true
}

// SetCreatedAt sets field value
func (o *FineTune) SetCreatedAt(v int32) {
	o.CreatedAt = v
}

// GetUpdatedAt returns the UpdatedAt field value
func (o *FineTune) GetUpdatedAt() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.UpdatedAt
}

// GetUpdatedAtOk returns a tuple with the UpdatedAt field value
// and a boolean to check if the value has been set.
func (o *FineTune) GetUpdatedAtOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.UpdatedAt, true
}

// SetUpdatedAt sets field value
func (o *FineTune) SetUpdatedAt(v int32) {
	o.UpdatedAt = v
}

// GetModel returns the Model field value
func (o *FineTune) GetModel() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Model
}

// GetModelOk returns a tuple with the Model field value
// and a boolean to check if the value has been set.
func (o *FineTune) GetModelOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Model, true
}

// SetModel sets field value
func (o *FineTune) SetModel(v string) {
	o.Model = v
}

// GetFineTunedModel returns the FineTunedModel field value
// If the value is explicit nil, the zero value for string will be returned
func (o *FineTune) GetFineTunedModel() string {
	if o == nil || o.FineTunedModel.Get() == nil {
		var ret string
		return ret
	}

	return *o.FineTunedModel.Get()
}

// GetFineTunedModelOk returns a tuple with the FineTunedModel field value
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *FineTune) GetFineTunedModelOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.FineTunedModel.Get(), o.FineTunedModel.IsSet()
}

// SetFineTunedModel sets field value
func (o *FineTune) SetFineTunedModel(v string) {
	o.FineTunedModel.Set(&v)
}

// GetOrganizationId returns the OrganizationId field value
func (o *FineTune) GetOrganizationId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.OrganizationId
}

// GetOrganizationIdOk returns a tuple with the OrganizationId field value
// and a boolean to check if the value has been set.
func (o *FineTune) GetOrganizationIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.OrganizationId, true
}

// SetOrganizationId sets field value
func (o *FineTune) SetOrganizationId(v string) {
	o.OrganizationId = v
}

// GetStatus returns the Status field value
func (o *FineTune) GetStatus() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Status
}

// GetStatusOk returns a tuple with the Status field value
// and a boolean to check if the value has been set.
func (o *FineTune) GetStatusOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Status, true
}

// SetStatus sets field value
func (o *FineTune) SetStatus(v string) {
	o.Status = v
}

// GetHyperparams returns the Hyperparams field value
func (o *FineTune) GetHyperparams() map[string]interface{} {
	if o == nil {
		var ret map[string]interface{}
		return ret
	}

	return o.Hyperparams
}

// GetHyperparamsOk returns a tuple with the Hyperparams field value
// and a boolean to check if the value has been set.
func (o *FineTune) GetHyperparamsOk() (map[string]interface{}, bool) {
	if o == nil {
		return map[string]interface{}{}, false
	}
	return o.Hyperparams, true
}

// SetHyperparams sets field value
func (o *FineTune) SetHyperparams(v map[string]interface{}) {
	o.Hyperparams = v
}

// GetTrainingFiles returns the TrainingFiles field value
func (o *FineTune) GetTrainingFiles() []OpenAIFile {
	if o == nil {
		var ret []OpenAIFile
		return ret
	}

	return o.TrainingFiles
}

// GetTrainingFilesOk returns a tuple with the TrainingFiles field value
// and a boolean to check if the value has been set.
func (o *FineTune) GetTrainingFilesOk() ([]OpenAIFile, bool) {
	if o == nil {
		return nil, false
	}
	return o.TrainingFiles, true
}

// SetTrainingFiles sets field value
func (o *FineTune) SetTrainingFiles(v []OpenAIFile) {
	o.TrainingFiles = v
}

// GetValidationFiles returns the ValidationFiles field value
func (o *FineTune) GetValidationFiles() []OpenAIFile {
	if o == nil {
		var ret []OpenAIFile
		return ret
	}

	return o.ValidationFiles
}

// GetValidationFilesOk returns a tuple with the ValidationFiles field value
// and a boolean to check if the value has been set.
func (o *FineTune) GetValidationFilesOk() ([]OpenAIFile, bool) {
	if o == nil {
		return nil, false
	}
	return o.ValidationFiles, true
}

// SetValidationFiles sets field value
func (o *FineTune) SetValidationFiles(v []OpenAIFile) {
	o.ValidationFiles = v
}

// GetResultFiles returns the ResultFiles field value
func (o *FineTune) GetResultFiles() []OpenAIFile {
	if o == nil {
		var ret []OpenAIFile
		return ret
	}

	return o.ResultFiles
}

// GetResultFilesOk returns a tuple with the ResultFiles field value
// and a boolean to check if the value has been set.
func (o *FineTune) GetResultFilesOk() ([]OpenAIFile, bool) {
	if o == nil {
		return nil, false
	}
	return o.ResultFiles, true
}

// SetResultFiles sets field value
func (o *FineTune) SetResultFiles(v []OpenAIFile) {
	o.ResultFiles = v
}

// GetEvents returns the Events field value if set, zero value otherwise.
func (o *FineTune) GetEvents() []FineTuneEvent {
	if o == nil || IsNil(o.Events) {
		var ret []FineTuneEvent
		return ret
	}
	return o.Events
}

// GetEventsOk returns a tuple with the Events field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *FineTune) GetEventsOk() ([]FineTuneEvent, bool) {
	if o == nil || IsNil(o.Events) {
		return nil, false
	}
	return o.Events, true
}

// HasEvents returns a boolean if a field has been set.
func (o *FineTune) HasEvents() bool {
	if o != nil && !IsNil(o.Events) {
		return true
	}

	return false
}

// SetEvents gets a reference to the given []FineTuneEvent and assigns it to the Events field.
func (o *FineTune) SetEvents(v []FineTuneEvent) {
	o.Events = v
}

func (o FineTune) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o FineTune) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["id"] = o.Id
	toSerialize["object"] = o.Object
	toSerialize["created_at"] = o.CreatedAt
	toSerialize["updated_at"] = o.UpdatedAt
	toSerialize["model"] = o.Model
	toSerialize["fine_tuned_model"] = o.FineTunedModel.Get()
	toSerialize["organization_id"] = o.OrganizationId
	toSerialize["status"] = o.Status
	toSerialize["hyperparams"] = o.Hyperparams
	toSerialize["training_files"] = o.TrainingFiles
	toSerialize["validation_files"] = o.ValidationFiles
	toSerialize["result_files"] = o.ResultFiles
	if !IsNil(o.Events) {
		toSerialize["events"] = o.Events
	}
	return toSerialize, nil
}

func (o *FineTune) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"id",
		"object",
		"created_at",
		"updated_at",
		"model",
		"fine_tuned_model",
		"organization_id",
		"status",
		"hyperparams",
		"training_files",
		"validation_files",
		"result_files",
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

	varFineTune := _FineTune{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varFineTune)

	if err != nil {
		return err
	}

	*o = FineTune(varFineTune)

	return err
}

type NullableFineTune struct {
	value *FineTune
	isSet bool
}

func (v NullableFineTune) Get() *FineTune {
	return v.value
}

func (v *NullableFineTune) Set(val *FineTune) {
	v.value = val
	v.isSet = true
}

func (v NullableFineTune) IsSet() bool {
	return v.isSet
}

func (v *NullableFineTune) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableFineTune(val *FineTune) *NullableFineTune {
	return &NullableFineTune{value: val, isSet: true}
}

func (v NullableFineTune) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableFineTune) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


