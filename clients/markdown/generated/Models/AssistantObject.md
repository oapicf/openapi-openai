# AssistantObject
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **String** | The identifier, which can be referenced in API endpoints. | [default to null] |
| **object** | **String** | The object type, which is always &#x60;assistant&#x60;. | [default to null] |
| **created\_at** | **Integer** | The Unix timestamp (in seconds) for when the assistant was created. | [default to null] |
| **name** | **String** | The name of the assistant. The maximum length is 256 characters.  | [default to null] |
| **description** | **String** | The description of the assistant. The maximum length is 512 characters.  | [default to null] |
| **model** | **String** | ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them.  | [default to null] |
| **instructions** | **String** | The system instructions that the assistant uses. The maximum length is 256,000 characters.  | [default to null] |
| **tools** | [**List**](AssistantObject_tools_inner.md) | A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;.  | [default to []] |
| **file\_ids** | **List** | A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order.  | [default to []] |
| **metadata** | [**Object**](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

