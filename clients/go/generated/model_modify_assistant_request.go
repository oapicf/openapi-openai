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
)

// checks if the ModifyAssistantRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ModifyAssistantRequest{}

// ModifyAssistantRequest struct for ModifyAssistantRequest
type ModifyAssistantRequest struct {
	Model *string `json:"model,omitempty"`
	// The name of the assistant. The maximum length is 256 characters. 
	Name NullableString `json:"name,omitempty"`
	// The description of the assistant. The maximum length is 512 characters. 
	Description NullableString `json:"description,omitempty"`
	// The system instructions that the assistant uses. The maximum length is 256,000 characters. 
	Instructions NullableString `json:"instructions,omitempty"`
	// A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`. 
	Tools []AssistantObjectToolsInner `json:"tools,omitempty"`
	// A list of [File](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. If a file was previously attached to the list but does not show up in the list, it will be deleted from the assistant. 
	FileIds []string `json:"file_ids,omitempty"`
	// Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
	Metadata map[string]interface{} `json:"metadata,omitempty"`
}

// NewModifyAssistantRequest instantiates a new ModifyAssistantRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewModifyAssistantRequest() *ModifyAssistantRequest {
	this := ModifyAssistantRequest{}
	return &this
}

// NewModifyAssistantRequestWithDefaults instantiates a new ModifyAssistantRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewModifyAssistantRequestWithDefaults() *ModifyAssistantRequest {
	this := ModifyAssistantRequest{}
	return &this
}

// GetModel returns the Model field value if set, zero value otherwise.
func (o *ModifyAssistantRequest) GetModel() string {
	if o == nil || IsNil(o.Model) {
		var ret string
		return ret
	}
	return *o.Model
}

// GetModelOk returns a tuple with the Model field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModifyAssistantRequest) GetModelOk() (*string, bool) {
	if o == nil || IsNil(o.Model) {
		return nil, false
	}
	return o.Model, true
}

// HasModel returns a boolean if a field has been set.
func (o *ModifyAssistantRequest) HasModel() bool {
	if o != nil && !IsNil(o.Model) {
		return true
	}

	return false
}

// SetModel gets a reference to the given string and assigns it to the Model field.
func (o *ModifyAssistantRequest) SetModel(v string) {
	o.Model = &v
}

// GetName returns the Name field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *ModifyAssistantRequest) GetName() string {
	if o == nil || IsNil(o.Name.Get()) {
		var ret string
		return ret
	}
	return *o.Name.Get()
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *ModifyAssistantRequest) GetNameOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Name.Get(), o.Name.IsSet()
}

// HasName returns a boolean if a field has been set.
func (o *ModifyAssistantRequest) HasName() bool {
	if o != nil && o.Name.IsSet() {
		return true
	}

	return false
}

// SetName gets a reference to the given NullableString and assigns it to the Name field.
func (o *ModifyAssistantRequest) SetName(v string) {
	o.Name.Set(&v)
}
// SetNameNil sets the value for Name to be an explicit nil
func (o *ModifyAssistantRequest) SetNameNil() {
	o.Name.Set(nil)
}

// UnsetName ensures that no value is present for Name, not even an explicit nil
func (o *ModifyAssistantRequest) UnsetName() {
	o.Name.Unset()
}

// GetDescription returns the Description field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *ModifyAssistantRequest) GetDescription() string {
	if o == nil || IsNil(o.Description.Get()) {
		var ret string
		return ret
	}
	return *o.Description.Get()
}

// GetDescriptionOk returns a tuple with the Description field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *ModifyAssistantRequest) GetDescriptionOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Description.Get(), o.Description.IsSet()
}

// HasDescription returns a boolean if a field has been set.
func (o *ModifyAssistantRequest) HasDescription() bool {
	if o != nil && o.Description.IsSet() {
		return true
	}

	return false
}

// SetDescription gets a reference to the given NullableString and assigns it to the Description field.
func (o *ModifyAssistantRequest) SetDescription(v string) {
	o.Description.Set(&v)
}
// SetDescriptionNil sets the value for Description to be an explicit nil
func (o *ModifyAssistantRequest) SetDescriptionNil() {
	o.Description.Set(nil)
}

// UnsetDescription ensures that no value is present for Description, not even an explicit nil
func (o *ModifyAssistantRequest) UnsetDescription() {
	o.Description.Unset()
}

// GetInstructions returns the Instructions field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *ModifyAssistantRequest) GetInstructions() string {
	if o == nil || IsNil(o.Instructions.Get()) {
		var ret string
		return ret
	}
	return *o.Instructions.Get()
}

// GetInstructionsOk returns a tuple with the Instructions field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *ModifyAssistantRequest) GetInstructionsOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Instructions.Get(), o.Instructions.IsSet()
}

// HasInstructions returns a boolean if a field has been set.
func (o *ModifyAssistantRequest) HasInstructions() bool {
	if o != nil && o.Instructions.IsSet() {
		return true
	}

	return false
}

// SetInstructions gets a reference to the given NullableString and assigns it to the Instructions field.
func (o *ModifyAssistantRequest) SetInstructions(v string) {
	o.Instructions.Set(&v)
}
// SetInstructionsNil sets the value for Instructions to be an explicit nil
func (o *ModifyAssistantRequest) SetInstructionsNil() {
	o.Instructions.Set(nil)
}

// UnsetInstructions ensures that no value is present for Instructions, not even an explicit nil
func (o *ModifyAssistantRequest) UnsetInstructions() {
	o.Instructions.Unset()
}

// GetTools returns the Tools field value if set, zero value otherwise.
func (o *ModifyAssistantRequest) GetTools() []AssistantObjectToolsInner {
	if o == nil || IsNil(o.Tools) {
		var ret []AssistantObjectToolsInner
		return ret
	}
	return o.Tools
}

// GetToolsOk returns a tuple with the Tools field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModifyAssistantRequest) GetToolsOk() ([]AssistantObjectToolsInner, bool) {
	if o == nil || IsNil(o.Tools) {
		return nil, false
	}
	return o.Tools, true
}

// HasTools returns a boolean if a field has been set.
func (o *ModifyAssistantRequest) HasTools() bool {
	if o != nil && !IsNil(o.Tools) {
		return true
	}

	return false
}

// SetTools gets a reference to the given []AssistantObjectToolsInner and assigns it to the Tools field.
func (o *ModifyAssistantRequest) SetTools(v []AssistantObjectToolsInner) {
	o.Tools = v
}

// GetFileIds returns the FileIds field value if set, zero value otherwise.
func (o *ModifyAssistantRequest) GetFileIds() []string {
	if o == nil || IsNil(o.FileIds) {
		var ret []string
		return ret
	}
	return o.FileIds
}

// GetFileIdsOk returns a tuple with the FileIds field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ModifyAssistantRequest) GetFileIdsOk() ([]string, bool) {
	if o == nil || IsNil(o.FileIds) {
		return nil, false
	}
	return o.FileIds, true
}

// HasFileIds returns a boolean if a field has been set.
func (o *ModifyAssistantRequest) HasFileIds() bool {
	if o != nil && !IsNil(o.FileIds) {
		return true
	}

	return false
}

// SetFileIds gets a reference to the given []string and assigns it to the FileIds field.
func (o *ModifyAssistantRequest) SetFileIds(v []string) {
	o.FileIds = v
}

// GetMetadata returns the Metadata field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *ModifyAssistantRequest) GetMetadata() map[string]interface{} {
	if o == nil {
		var ret map[string]interface{}
		return ret
	}
	return o.Metadata
}

// GetMetadataOk returns a tuple with the Metadata field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *ModifyAssistantRequest) GetMetadataOk() (map[string]interface{}, bool) {
	if o == nil || IsNil(o.Metadata) {
		return map[string]interface{}{}, false
	}
	return o.Metadata, true
}

// HasMetadata returns a boolean if a field has been set.
func (o *ModifyAssistantRequest) HasMetadata() bool {
	if o != nil && !IsNil(o.Metadata) {
		return true
	}

	return false
}

// SetMetadata gets a reference to the given map[string]interface{} and assigns it to the Metadata field.
func (o *ModifyAssistantRequest) SetMetadata(v map[string]interface{}) {
	o.Metadata = v
}

func (o ModifyAssistantRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ModifyAssistantRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Model) {
		toSerialize["model"] = o.Model
	}
	if o.Name.IsSet() {
		toSerialize["name"] = o.Name.Get()
	}
	if o.Description.IsSet() {
		toSerialize["description"] = o.Description.Get()
	}
	if o.Instructions.IsSet() {
		toSerialize["instructions"] = o.Instructions.Get()
	}
	if !IsNil(o.Tools) {
		toSerialize["tools"] = o.Tools
	}
	if !IsNil(o.FileIds) {
		toSerialize["file_ids"] = o.FileIds
	}
	if o.Metadata != nil {
		toSerialize["metadata"] = o.Metadata
	}
	return toSerialize, nil
}

type NullableModifyAssistantRequest struct {
	value *ModifyAssistantRequest
	isSet bool
}

func (v NullableModifyAssistantRequest) Get() *ModifyAssistantRequest {
	return v.value
}

func (v *NullableModifyAssistantRequest) Set(val *ModifyAssistantRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableModifyAssistantRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableModifyAssistantRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableModifyAssistantRequest(val *ModifyAssistantRequest) *NullableModifyAssistantRequest {
	return &NullableModifyAssistantRequest{value: val, isSet: true}
}

func (v NullableModifyAssistantRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableModifyAssistantRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


