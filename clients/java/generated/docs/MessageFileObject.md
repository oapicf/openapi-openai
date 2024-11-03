

# MessageFileObject

A list of files attached to a `message`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The identifier, which can be referenced in API endpoints. |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The object type, which is always &#x60;thread.message.file&#x60;. |  |
|**createdAt** | **Integer** | The Unix timestamp (in seconds) for when the message file was created. |  |
|**messageId** | **String** | The ID of the [message](/docs/api-reference/messages) that the [File](/docs/api-reference/files) is attached to. |  |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| THREAD_MESSAGE_FILE | &quot;thread.message.file&quot; |



