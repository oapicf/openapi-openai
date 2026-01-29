
# Table `ListAssistantFilesResponse`
(mapped from: ListAssistantFilesResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**object** | object | text NOT NULL |  | **kotlin.String** |  | 
**data** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AssistantFileObject&gt;**](AssistantFileObject.md) |  | 
**firstId** | first_id | text NOT NULL |  | **kotlin.String** |  | 
**lastId** | last_id | text NOT NULL |  | **kotlin.String** |  | 
**hasMore** | has_more | boolean NOT NULL |  | **kotlin.Boolean** |  | 



# **Table `ListAssistantFilesResponseAssistantFileObject`**
(mapped from: ListAssistantFilesResponseAssistantFileObject)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
listAssistantFilesResponse | listAssistantFilesResponse | long | | kotlin.Long | Primary Key | *one*
assistantFileObject | assistantFileObject | long | | kotlin.Long | Foreign Key | *many*






