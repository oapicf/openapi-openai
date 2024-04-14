
# Table `ListThreadsResponse`
(mapped from: ListThreadsResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**object** | object | text NOT NULL |  | **kotlin.String** |  | 
**data** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ThreadObject&gt;**](ThreadObject.md) |  | 
**firstId** | first_id | text NOT NULL |  | **kotlin.String** |  | 
**lastId** | last_id | text NOT NULL |  | **kotlin.String** |  | 
**hasMore** | has_more | boolean NOT NULL |  | **kotlin.Boolean** |  | 



# **Table `ListThreadsResponseThreadObject`**
(mapped from: ListThreadsResponseThreadObject)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
listThreadsResponse | listThreadsResponse | long | | kotlin.Long | Primary Key | *one*
threadObject | threadObject | long | | kotlin.Long | Foreign Key | *many*






