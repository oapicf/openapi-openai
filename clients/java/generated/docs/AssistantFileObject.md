

# AssistantFileObject

A list of [Files](/docs/api-reference/files) attached to an `assistant`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The identifier, which can be referenced in API endpoints. |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The object type, which is always &#x60;assistant.file&#x60;. |  |
|**createdAt** | **Integer** | The Unix timestamp (in seconds) for when the assistant file was created. |  |
|**assistantId** | **String** | The assistant ID that the file is attached to. |  |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| ASSISTANT_FILE | &quot;assistant.file&quot; |



