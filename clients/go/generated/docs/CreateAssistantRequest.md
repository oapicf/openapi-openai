# CreateAssistantRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Model** | [**CreateAssistantRequestModel**](CreateAssistantRequestModel.md) |  | 
**Name** | Pointer to **NullableString** | The name of the assistant. The maximum length is 256 characters.  | [optional] 
**Description** | Pointer to **NullableString** | The description of the assistant. The maximum length is 512 characters.  | [optional] 
**Instructions** | Pointer to **NullableString** | The system instructions that the assistant uses. The maximum length is 256,000 characters.  | [optional] 
**Tools** | Pointer to [**[]AssistantObjectToolsInner**](AssistantObjectToolsInner.md) | A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types &#x60;code_interpreter&#x60;, &#x60;file_search&#x60;, or &#x60;function&#x60;.  | [optional] [default to {}]
**ToolResources** | Pointer to [**NullableCreateAssistantRequestToolResources**](CreateAssistantRequestToolResources.md) |  | [optional] 
**Metadata** | Pointer to **map[string]interface{}** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [optional] 
**Temperature** | Pointer to **NullableFloat32** | What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  | [optional] [default to 1]
**TopP** | Pointer to **NullableFloat32** | An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both.  | [optional] [default to 1]
**ResponseFormat** | Pointer to [**AssistantsApiResponseFormatOption**](AssistantsApiResponseFormatOption.md) |  | [optional] 

## Methods

### NewCreateAssistantRequest

`func NewCreateAssistantRequest(model CreateAssistantRequestModel, ) *CreateAssistantRequest`

NewCreateAssistantRequest instantiates a new CreateAssistantRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateAssistantRequestWithDefaults

`func NewCreateAssistantRequestWithDefaults() *CreateAssistantRequest`

NewCreateAssistantRequestWithDefaults instantiates a new CreateAssistantRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetModel

`func (o *CreateAssistantRequest) GetModel() CreateAssistantRequestModel`

GetModel returns the Model field if non-nil, zero value otherwise.

### GetModelOk

`func (o *CreateAssistantRequest) GetModelOk() (*CreateAssistantRequestModel, bool)`

GetModelOk returns a tuple with the Model field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModel

`func (o *CreateAssistantRequest) SetModel(v CreateAssistantRequestModel)`

SetModel sets Model field to given value.


### GetName

`func (o *CreateAssistantRequest) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CreateAssistantRequest) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CreateAssistantRequest) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CreateAssistantRequest) HasName() bool`

HasName returns a boolean if a field has been set.

### SetNameNil

`func (o *CreateAssistantRequest) SetNameNil(b bool)`

 SetNameNil sets the value for Name to be an explicit nil

### UnsetName
`func (o *CreateAssistantRequest) UnsetName()`

UnsetName ensures that no value is present for Name, not even an explicit nil
### GetDescription

`func (o *CreateAssistantRequest) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CreateAssistantRequest) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CreateAssistantRequest) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CreateAssistantRequest) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### SetDescriptionNil

`func (o *CreateAssistantRequest) SetDescriptionNil(b bool)`

 SetDescriptionNil sets the value for Description to be an explicit nil

### UnsetDescription
`func (o *CreateAssistantRequest) UnsetDescription()`

UnsetDescription ensures that no value is present for Description, not even an explicit nil
### GetInstructions

`func (o *CreateAssistantRequest) GetInstructions() string`

GetInstructions returns the Instructions field if non-nil, zero value otherwise.

### GetInstructionsOk

`func (o *CreateAssistantRequest) GetInstructionsOk() (*string, bool)`

GetInstructionsOk returns a tuple with the Instructions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstructions

`func (o *CreateAssistantRequest) SetInstructions(v string)`

SetInstructions sets Instructions field to given value.

### HasInstructions

`func (o *CreateAssistantRequest) HasInstructions() bool`

HasInstructions returns a boolean if a field has been set.

### SetInstructionsNil

`func (o *CreateAssistantRequest) SetInstructionsNil(b bool)`

 SetInstructionsNil sets the value for Instructions to be an explicit nil

### UnsetInstructions
`func (o *CreateAssistantRequest) UnsetInstructions()`

UnsetInstructions ensures that no value is present for Instructions, not even an explicit nil
### GetTools

`func (o *CreateAssistantRequest) GetTools() []AssistantObjectToolsInner`

GetTools returns the Tools field if non-nil, zero value otherwise.

### GetToolsOk

`func (o *CreateAssistantRequest) GetToolsOk() (*[]AssistantObjectToolsInner, bool)`

GetToolsOk returns a tuple with the Tools field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTools

`func (o *CreateAssistantRequest) SetTools(v []AssistantObjectToolsInner)`

SetTools sets Tools field to given value.

### HasTools

`func (o *CreateAssistantRequest) HasTools() bool`

HasTools returns a boolean if a field has been set.

### GetToolResources

`func (o *CreateAssistantRequest) GetToolResources() CreateAssistantRequestToolResources`

GetToolResources returns the ToolResources field if non-nil, zero value otherwise.

### GetToolResourcesOk

`func (o *CreateAssistantRequest) GetToolResourcesOk() (*CreateAssistantRequestToolResources, bool)`

GetToolResourcesOk returns a tuple with the ToolResources field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToolResources

`func (o *CreateAssistantRequest) SetToolResources(v CreateAssistantRequestToolResources)`

SetToolResources sets ToolResources field to given value.

### HasToolResources

`func (o *CreateAssistantRequest) HasToolResources() bool`

HasToolResources returns a boolean if a field has been set.

### SetToolResourcesNil

`func (o *CreateAssistantRequest) SetToolResourcesNil(b bool)`

 SetToolResourcesNil sets the value for ToolResources to be an explicit nil

### UnsetToolResources
`func (o *CreateAssistantRequest) UnsetToolResources()`

UnsetToolResources ensures that no value is present for ToolResources, not even an explicit nil
### GetMetadata

`func (o *CreateAssistantRequest) GetMetadata() map[string]interface{}`

GetMetadata returns the Metadata field if non-nil, zero value otherwise.

### GetMetadataOk

`func (o *CreateAssistantRequest) GetMetadataOk() (*map[string]interface{}, bool)`

GetMetadataOk returns a tuple with the Metadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMetadata

`func (o *CreateAssistantRequest) SetMetadata(v map[string]interface{})`

SetMetadata sets Metadata field to given value.

### HasMetadata

`func (o *CreateAssistantRequest) HasMetadata() bool`

HasMetadata returns a boolean if a field has been set.

### SetMetadataNil

`func (o *CreateAssistantRequest) SetMetadataNil(b bool)`

 SetMetadataNil sets the value for Metadata to be an explicit nil

### UnsetMetadata
`func (o *CreateAssistantRequest) UnsetMetadata()`

UnsetMetadata ensures that no value is present for Metadata, not even an explicit nil
### GetTemperature

`func (o *CreateAssistantRequest) GetTemperature() float32`

GetTemperature returns the Temperature field if non-nil, zero value otherwise.

### GetTemperatureOk

`func (o *CreateAssistantRequest) GetTemperatureOk() (*float32, bool)`

GetTemperatureOk returns a tuple with the Temperature field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTemperature

`func (o *CreateAssistantRequest) SetTemperature(v float32)`

SetTemperature sets Temperature field to given value.

### HasTemperature

`func (o *CreateAssistantRequest) HasTemperature() bool`

HasTemperature returns a boolean if a field has been set.

### SetTemperatureNil

`func (o *CreateAssistantRequest) SetTemperatureNil(b bool)`

 SetTemperatureNil sets the value for Temperature to be an explicit nil

### UnsetTemperature
`func (o *CreateAssistantRequest) UnsetTemperature()`

UnsetTemperature ensures that no value is present for Temperature, not even an explicit nil
### GetTopP

`func (o *CreateAssistantRequest) GetTopP() float32`

GetTopP returns the TopP field if non-nil, zero value otherwise.

### GetTopPOk

`func (o *CreateAssistantRequest) GetTopPOk() (*float32, bool)`

GetTopPOk returns a tuple with the TopP field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTopP

`func (o *CreateAssistantRequest) SetTopP(v float32)`

SetTopP sets TopP field to given value.

### HasTopP

`func (o *CreateAssistantRequest) HasTopP() bool`

HasTopP returns a boolean if a field has been set.

### SetTopPNil

`func (o *CreateAssistantRequest) SetTopPNil(b bool)`

 SetTopPNil sets the value for TopP to be an explicit nil

### UnsetTopP
`func (o *CreateAssistantRequest) UnsetTopP()`

UnsetTopP ensures that no value is present for TopP, not even an explicit nil
### GetResponseFormat

`func (o *CreateAssistantRequest) GetResponseFormat() AssistantsApiResponseFormatOption`

GetResponseFormat returns the ResponseFormat field if non-nil, zero value otherwise.

### GetResponseFormatOk

`func (o *CreateAssistantRequest) GetResponseFormatOk() (*AssistantsApiResponseFormatOption, bool)`

GetResponseFormatOk returns a tuple with the ResponseFormat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponseFormat

`func (o *CreateAssistantRequest) SetResponseFormat(v AssistantsApiResponseFormatOption)`

SetResponseFormat sets ResponseFormat field to given value.

### HasResponseFormat

`func (o *CreateAssistantRequest) HasResponseFormat() bool`

HasResponseFormat returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


