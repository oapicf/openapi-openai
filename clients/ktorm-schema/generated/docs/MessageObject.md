
# Table `MessageObject`
(mapped from: MessageObject)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | The identifier, which can be referenced in API endpoints. | 
**object** | object | text NOT NULL |  | [**object**](#Object) | The object type, which is always &#x60;thread.message&#x60;. | 
**createdAt** | created_at | int NOT NULL |  | **kotlin.Int** | The Unix timestamp (in seconds) for when the message was created. | 
**threadId** | thread_id | text NOT NULL |  | **kotlin.String** | The [thread](/docs/api-reference/threads) ID that this message belongs to. | 
**status** | status | text NOT NULL |  | [**status**](#Status) | The status of the message, which can be either &#x60;in_progress&#x60;, &#x60;incomplete&#x60;, or &#x60;completed&#x60;. | 
**incompleteDetails** | incomplete_details | long NOT NULL |  | [**MessageObjectIncompleteDetails**](MessageObjectIncompleteDetails.md) |  |  [foreignkey]
**completedAt** | completed_at | int NOT NULL |  | **kotlin.Int** | The Unix timestamp (in seconds) for when the message was completed. | 
**incompleteAt** | incomplete_at | int NOT NULL |  | **kotlin.Int** | The Unix timestamp (in seconds) for when the message was marked as incomplete. | 
**role** | role | text NOT NULL |  | [**role**](#Role) | The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;. | 
**content** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MessageObjectContentInner&gt;**](MessageObjectContentInner.md) | The content of the message in array of text and/or images. | 
**assistantId** | assistant_id | text NOT NULL |  | **kotlin.String** | If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message. | 
**runId** | run_id | text NOT NULL |  | **kotlin.String** | The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is &#x60;null&#x60; when messages are created manually using the create message or create thread endpoints. | 
**fileIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message. | 
**metadata** | metadata | blob NOT NULL |  | [**kotlin.Any**](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  | 











# **Table `MessageObjectMessageObjectContentInner`**
(mapped from: MessageObjectMessageObjectContentInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
messageObject | messageObject | long | | kotlin.Long | Primary Key | *one*
messageObjectContentInner | messageObjectContentInner | long | | kotlin.Long | Foreign Key | *many*





# **Table `MessageObjectFileIds`**
(mapped from: MessageObjectFileIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
messageObject | messageObject | long | | kotlin.Long | Primary Key | *one*
fileIds | fileIds | text | | kotlin.String | Foreign Key | *many*




