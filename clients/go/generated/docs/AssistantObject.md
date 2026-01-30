# AssistantObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | The identifier, which can be referenced in API endpoints. | 
**Object** | **string** | The object type, which is always &#x60;assistant&#x60;. | 
**CreatedAt** | **int32** | The Unix timestamp (in seconds) for when the assistant was created. | 
**Name** | **NullableString** | The name of the assistant. The maximum length is 256 characters.  | 
**Description** | **NullableString** | The description of the assistant. The maximum length is 512 characters.  | 
**Model** | **string** | ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models) for descriptions of them.  | 
**Instructions** | **NullableString** | The system instructions that the assistant uses. The maximum length is 256,000 characters.  | 
**Tools** | [**[]AssistantObjectToolsInner**](AssistantObjectToolsInner.md) | A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types &#x60;code_interpreter&#x60;, &#x60;file_search&#x60;, or &#x60;function&#x60;.  | [default to {}]
**ToolResources** | Pointer to [**NullableAssistantObjectToolResources**](AssistantObjectToolResources.md) |  | [optional] 
**Metadata** | **map[string]interface{}** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | 
**Temperature** | Pointer to **NullableFloat32** | What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  | [optional] [default to 1]
**TopP** | Pointer to **NullableFloat32** | An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both.  | [optional] [default to 1]
**ResponseFormat** | Pointer to [**AssistantsApiResponseFormatOption**](AssistantsApiResponseFormatOption.md) |  | [optional] 

## Methods

### NewAssistantObject

`func NewAssistantObject(id string, object string, createdAt int32, name NullableString, description NullableString, model string, instructions NullableString, tools []AssistantObjectToolsInner, metadata map[string]interface{}, ) *AssistantObject`

NewAssistantObject instantiates a new AssistantObject object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAssistantObjectWithDefaults

`func NewAssistantObjectWithDefaults() *AssistantObject`

NewAssistantObjectWithDefaults instantiates a new AssistantObject object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *AssistantObject) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *AssistantObject) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *AssistantObject) SetId(v string)`

SetId sets Id field to given value.


### GetObject

`func (o *AssistantObject) GetObject() string`

GetObject returns the Object field if non-nil, zero value otherwise.

### GetObjectOk

`func (o *AssistantObject) GetObjectOk() (*string, bool)`

GetObjectOk returns a tuple with the Object field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObject

`func (o *AssistantObject) SetObject(v string)`

SetObject sets Object field to given value.


### GetCreatedAt

`func (o *AssistantObject) GetCreatedAt() int32`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *AssistantObject) GetCreatedAtOk() (*int32, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *AssistantObject) SetCreatedAt(v int32)`

SetCreatedAt sets CreatedAt field to given value.


### GetName

`func (o *AssistantObject) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *AssistantObject) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *AssistantObject) SetName(v string)`

SetName sets Name field to given value.


### SetNameNil

`func (o *AssistantObject) SetNameNil(b bool)`

 SetNameNil sets the value for Name to be an explicit nil

### UnsetName
`func (o *AssistantObject) UnsetName()`

UnsetName ensures that no value is present for Name, not even an explicit nil
### GetDescription

`func (o *AssistantObject) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *AssistantObject) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *AssistantObject) SetDescription(v string)`

SetDescription sets Description field to given value.


### SetDescriptionNil

`func (o *AssistantObject) SetDescriptionNil(b bool)`

 SetDescriptionNil sets the value for Description to be an explicit nil

### UnsetDescription
`func (o *AssistantObject) UnsetDescription()`

UnsetDescription ensures that no value is present for Description, not even an explicit nil
### GetModel

`func (o *AssistantObject) GetModel() string`

GetModel returns the Model field if non-nil, zero value otherwise.

### GetModelOk

`func (o *AssistantObject) GetModelOk() (*string, bool)`

GetModelOk returns a tuple with the Model field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModel

`func (o *AssistantObject) SetModel(v string)`

SetModel sets Model field to given value.


### GetInstructions

`func (o *AssistantObject) GetInstructions() string`

GetInstructions returns the Instructions field if non-nil, zero value otherwise.

### GetInstructionsOk

`func (o *AssistantObject) GetInstructionsOk() (*string, bool)`

GetInstructionsOk returns a tuple with the Instructions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstructions

`func (o *AssistantObject) SetInstructions(v string)`

SetInstructions sets Instructions field to given value.


### SetInstructionsNil

`func (o *AssistantObject) SetInstructionsNil(b bool)`

 SetInstructionsNil sets the value for Instructions to be an explicit nil

### UnsetInstructions
`func (o *AssistantObject) UnsetInstructions()`

UnsetInstructions ensures that no value is present for Instructions, not even an explicit nil
### GetTools

`func (o *AssistantObject) GetTools() []AssistantObjectToolsInner`

GetTools returns the Tools field if non-nil, zero value otherwise.

### GetToolsOk

`func (o *AssistantObject) GetToolsOk() (*[]AssistantObjectToolsInner, bool)`

GetToolsOk returns a tuple with the Tools field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTools

`func (o *AssistantObject) SetTools(v []AssistantObjectToolsInner)`

SetTools sets Tools field to given value.


### GetToolResources

`func (o *AssistantObject) GetToolResources() AssistantObjectToolResources`

GetToolResources returns the ToolResources field if non-nil, zero value otherwise.

### GetToolResourcesOk

`func (o *AssistantObject) GetToolResourcesOk() (*AssistantObjectToolResources, bool)`

GetToolResourcesOk returns a tuple with the ToolResources field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToolResources

`func (o *AssistantObject) SetToolResources(v AssistantObjectToolResources)`

SetToolResources sets ToolResources field to given value.

### HasToolResources

`func (o *AssistantObject) HasToolResources() bool`

HasToolResources returns a boolean if a field has been set.

### SetToolResourcesNil

`func (o *AssistantObject) SetToolResourcesNil(b bool)`

 SetToolResourcesNil sets the value for ToolResources to be an explicit nil

### UnsetToolResources
`func (o *AssistantObject) UnsetToolResources()`

UnsetToolResources ensures that no value is present for ToolResources, not even an explicit nil
### GetMetadata

`func (o *AssistantObject) GetMetadata() map[string]interface{}`

GetMetadata returns the Metadata field if non-nil, zero value otherwise.

### GetMetadataOk

`func (o *AssistantObject) GetMetadataOk() (*map[string]interface{}, bool)`

GetMetadataOk returns a tuple with the Metadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMetadata

`func (o *AssistantObject) SetMetadata(v map[string]interface{})`

SetMetadata sets Metadata field to given value.


### SetMetadataNil

`func (o *AssistantObject) SetMetadataNil(b bool)`

 SetMetadataNil sets the value for Metadata to be an explicit nil

### UnsetMetadata
`func (o *AssistantObject) UnsetMetadata()`

UnsetMetadata ensures that no value is present for Metadata, not even an explicit nil
### GetTemperature

`func (o *AssistantObject) GetTemperature() float32`

GetTemperature returns the Temperature field if non-nil, zero value otherwise.

### GetTemperatureOk

`func (o *AssistantObject) GetTemperatureOk() (*float32, bool)`

GetTemperatureOk returns a tuple with the Temperature field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTemperature

`func (o *AssistantObject) SetTemperature(v float32)`

SetTemperature sets Temperature field to given value.

### HasTemperature

`func (o *AssistantObject) HasTemperature() bool`

HasTemperature returns a boolean if a field has been set.

### SetTemperatureNil

`func (o *AssistantObject) SetTemperatureNil(b bool)`

 SetTemperatureNil sets the value for Temperature to be an explicit nil

### UnsetTemperature
`func (o *AssistantObject) UnsetTemperature()`

UnsetTemperature ensures that no value is present for Temperature, not even an explicit nil
### GetTopP

`func (o *AssistantObject) GetTopP() float32`

GetTopP returns the TopP field if non-nil, zero value otherwise.

### GetTopPOk

`func (o *AssistantObject) GetTopPOk() (*float32, bool)`

GetTopPOk returns a tuple with the TopP field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTopP

`func (o *AssistantObject) SetTopP(v float32)`

SetTopP sets TopP field to given value.

### HasTopP

`func (o *AssistantObject) HasTopP() bool`

HasTopP returns a boolean if a field has been set.

### SetTopPNil

`func (o *AssistantObject) SetTopPNil(b bool)`

 SetTopPNil sets the value for TopP to be an explicit nil

### UnsetTopP
`func (o *AssistantObject) UnsetTopP()`

UnsetTopP ensures that no value is present for TopP, not even an explicit nil
### GetResponseFormat

`func (o *AssistantObject) GetResponseFormat() AssistantsApiResponseFormatOption`

GetResponseFormat returns the ResponseFormat field if non-nil, zero value otherwise.

### GetResponseFormatOk

`func (o *AssistantObject) GetResponseFormatOk() (*AssistantsApiResponseFormatOption, bool)`

GetResponseFormatOk returns a tuple with the ResponseFormat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponseFormat

`func (o *AssistantObject) SetResponseFormat(v AssistantsApiResponseFormatOption)`

SetResponseFormat sets ResponseFormat field to given value.

### HasResponseFormat

`func (o *AssistantObject) HasResponseFormat() bool`

HasResponseFormat returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


