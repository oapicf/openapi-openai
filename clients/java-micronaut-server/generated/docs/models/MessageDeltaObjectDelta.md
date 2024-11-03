

# MessageDeltaObjectDelta

The delta containing the fields that have changed on the Message.

The class is defined in **[MessageDeltaObjectDelta.java](../../src/main/java/org/openapitools/model/MessageDeltaObjectDelta.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role** | [**RoleEnum**](#RoleEnum) | The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;. |  [optional property]
**content** | [`List&lt;MessageDeltaObjectDeltaContentInner&gt;`](MessageDeltaObjectDeltaContentInner.md) | The content of the message in array of text and/or images. |  [optional property]
**fileIds** | `List&lt;String&gt;` | A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message. |  [optional property]

## RoleEnum

Name | Value
---- | -----
USER | `"user"`
ASSISTANT | `"assistant"`




