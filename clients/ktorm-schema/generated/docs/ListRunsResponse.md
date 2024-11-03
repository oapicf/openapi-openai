
# Table `ListRunsResponse`
(mapped from: ListRunsResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**object** | object | text NOT NULL |  | **kotlin.String** |  | 
**data** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;RunObject&gt;**](RunObject.md) |  | 
**firstId** | first_id | text NOT NULL |  | **kotlin.String** |  | 
**lastId** | last_id | text NOT NULL |  | **kotlin.String** |  | 
**hasMore** | has_more | boolean NOT NULL |  | **kotlin.Boolean** |  | 



# **Table `ListRunsResponseRunObject`**
(mapped from: ListRunsResponseRunObject)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
listRunsResponse | listRunsResponse | long | | kotlin.Long | Primary Key | *one*
runObject | runObject | long | | kotlin.Long | Foreign Key | *many*






