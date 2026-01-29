
# Table `AssistantObject`
(mapped from: AssistantObject)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | The identifier, which can be referenced in API endpoints. | 
**object** | object | text NOT NULL |  | [**object**](#Object) | The object type, which is always &#x60;assistant&#x60;. | 
**createdAt** | created_at | int NOT NULL |  | **kotlin.Int** | The Unix timestamp (in seconds) for when the assistant was created. | 
**name** | name | text NOT NULL |  | **kotlin.String** | The name of the assistant. The maximum length is 256 characters.  | 
**description** | description | text NOT NULL |  | **kotlin.String** | The description of the assistant. The maximum length is 512 characters.  | 
**model** | model | text NOT NULL |  | **kotlin.String** | ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them.  | 
**instructions** | instructions | text NOT NULL |  | **kotlin.String** | The system instructions that the assistant uses. The maximum length is 256,000 characters.  | 
**tools** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AssistantObjectToolsInner&gt;**](AssistantObjectToolsInner.md) | A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;.  | 
**fileIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order.  | 
**metadata** | metadata | blob NOT NULL |  | [**kotlin.Any**](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  | 









# **Table `AssistantObjectAssistantObjectToolsInner`**
(mapped from: AssistantObjectAssistantObjectToolsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
assistantObject | assistantObject | long | | kotlin.Long | Primary Key | *one*
assistantObjectToolsInner | assistantObjectToolsInner | long | | kotlin.Long | Foreign Key | *many*



# **Table `AssistantObjectFileIds`**
(mapped from: AssistantObjectFileIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
assistantObject | assistantObject | long | | kotlin.Long | Primary Key | *one*
fileIds | fileIds | text | | kotlin.String | Foreign Key | *many*




