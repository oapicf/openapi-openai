
# MessageDeltaObjectDelta

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **role** | [**inline**](#Role) | The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;. |  [optional] |
| **content** | [**kotlin.collections.List&lt;MessageDeltaObjectDeltaContentInner&gt;**](MessageDeltaObjectDeltaContentInner.md) | The content of the message in array of text and/or images. |  [optional] |
| **fileIds** | **kotlin.collections.List&lt;kotlin.String&gt;** | A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message. |  [optional] |


<a id="Role"></a>
## Enum: role
| Name | Value |
| ---- | ----- |
| role | user, assistant |



