
# Table `CreateThreadRequest`
(mapped from: CreateThreadRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**messages** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CreateMessageRequest&gt;**](CreateMessageRequest.md) | A list of [messages](/docs/api-reference/messages) to start the thread with. |  [optional]
**metadata** | metadata | blob |  | [**kotlin.Any**](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  |  [optional]


# **Table `CreateThreadRequestCreateMessageRequest`**
(mapped from: CreateThreadRequestCreateMessageRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
createThreadRequest | createThreadRequest | long | | kotlin.Long | Primary Key | *one*
createMessageRequest | createMessageRequest | long | | kotlin.Long | Foreign Key | *many*




