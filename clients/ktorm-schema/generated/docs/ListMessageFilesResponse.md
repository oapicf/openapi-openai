
# Table `ListMessageFilesResponse`
(mapped from: ListMessageFilesResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**object** | object | text NOT NULL |  | **kotlin.String** |  | 
**data** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MessageFileObject&gt;**](MessageFileObject.md) |  | 
**firstId** | first_id | text NOT NULL |  | **kotlin.String** |  | 
**lastId** | last_id | text NOT NULL |  | **kotlin.String** |  | 
**hasMore** | has_more | boolean NOT NULL |  | **kotlin.Boolean** |  | 



# **Table `ListMessageFilesResponseMessageFileObject`**
(mapped from: ListMessageFilesResponseMessageFileObject)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
listMessageFilesResponse | listMessageFilesResponse | long | | kotlin.Long | Primary Key | *one*
messageFileObject | messageFileObject | long | | kotlin.Long | Foreign Key | *many*






