
# Table `ListRunStepsResponse`
(mapped from: ListRunStepsResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**object** | object | text NOT NULL |  | **kotlin.String** |  | 
**data** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;RunStepObject&gt;**](RunStepObject.md) |  | 
**firstId** | first_id | text NOT NULL |  | **kotlin.String** |  | 
**lastId** | last_id | text NOT NULL |  | **kotlin.String** |  | 
**hasMore** | has_more | boolean NOT NULL |  | **kotlin.Boolean** |  | 



# **Table `ListRunStepsResponseRunStepObject`**
(mapped from: ListRunStepsResponseRunStepObject)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
listRunStepsResponse | listRunStepsResponse | long | | kotlin.Long | Primary Key | *one*
runStepObject | runStepObject | long | | kotlin.Long | Foreign Key | *many*






