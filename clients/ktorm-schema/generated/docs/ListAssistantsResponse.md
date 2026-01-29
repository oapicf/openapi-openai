
# Table `ListAssistantsResponse`
(mapped from: ListAssistantsResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**object** | object | text NOT NULL |  | **kotlin.String** |  | 
**data** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AssistantObject&gt;**](AssistantObject.md) |  | 
**firstId** | first_id | text NOT NULL |  | **kotlin.String** |  | 
**lastId** | last_id | text NOT NULL |  | **kotlin.String** |  | 
**hasMore** | has_more | boolean NOT NULL |  | **kotlin.Boolean** |  | 



# **Table `ListAssistantsResponseAssistantObject`**
(mapped from: ListAssistantsResponseAssistantObject)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
listAssistantsResponse | listAssistantsResponse | long | | kotlin.Long | Primary Key | *one*
assistantObject | assistantObject | long | | kotlin.Long | Foreign Key | *many*






