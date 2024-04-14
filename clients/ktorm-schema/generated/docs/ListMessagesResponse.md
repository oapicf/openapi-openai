
# Table `ListMessagesResponse`
(mapped from: ListMessagesResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**object** | object | text NOT NULL |  | **kotlin.String** |  | 
**data** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MessageObject&gt;**](MessageObject.md) |  | 
**firstId** | first_id | text NOT NULL |  | **kotlin.String** |  | 
**lastId** | last_id | text NOT NULL |  | **kotlin.String** |  | 
**hasMore** | has_more | boolean NOT NULL |  | **kotlin.Boolean** |  | 



# **Table `ListMessagesResponseMessageObject`**
(mapped from: ListMessagesResponseMessageObject)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
listMessagesResponse | listMessagesResponse | long | | kotlin.Long | Primary Key | *one*
messageObject | messageObject | long | | kotlin.Long | Foreign Key | *many*






