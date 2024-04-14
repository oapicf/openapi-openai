
# Table `MessageDeltaObject_delta`
(mapped from: MessageDeltaObjectDelta)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**role** | role | text |  | [**role**](#Role) | The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;. |  [optional]
**content** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MessageDeltaObjectDeltaContentInner&gt;**](MessageDeltaObjectDeltaContentInner.md) | The content of the message in array of text and/or images. |  [optional]
**fileIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message. |  [optional]



# **Table `MessageDeltaObjectDeltaMessageDeltaObjectDeltaContentInner`**
(mapped from: MessageDeltaObjectDeltaMessageDeltaObjectDeltaContentInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
messageDeltaObjectDelta | messageDeltaObjectDelta | long | | kotlin.Long | Primary Key | *one*
messageDeltaObjectDeltaContentInner | messageDeltaObjectDeltaContentInner | long | | kotlin.Long | Foreign Key | *many*



# **Table `MessageDeltaObjectDeltaFileIds`**
(mapped from: MessageDeltaObjectDeltaFileIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
messageDeltaObjectDelta | messageDeltaObjectDelta | long | | kotlin.Long | Primary Key | *one*
fileIds | fileIds | text | | kotlin.String | Foreign Key | *many*



