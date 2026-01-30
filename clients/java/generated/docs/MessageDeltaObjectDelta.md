

# MessageDeltaObjectDelta

The delta containing the fields that have changed on the Message.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**role** | [**RoleEnum**](#RoleEnum) | The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;. |  [optional] |
|**content** | [**List&lt;MessageDeltaObjectDeltaContentInner&gt;**](MessageDeltaObjectDeltaContentInner.md) | The content of the message in array of text and/or images. |  [optional] |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| USER | &quot;user&quot; |
| ASSISTANT | &quot;assistant&quot; |



