

# ThreadObject

Represents a thread that contains [messages](/docs/api-reference/messages).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The identifier, which can be referenced in API endpoints. |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The object type, which is always &#x60;thread&#x60;. |  |
|**createdAt** | **Integer** | The Unix timestamp (in seconds) for when the thread was created. |  |
|**metadata** | **Object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  |  |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| THREAD | &quot;thread&quot; |



