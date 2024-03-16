
# Table `CreateEditResponse`
(mapped from: CreateEditResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**object** | object | text NOT NULL |  | **kotlin.String** |  | 
**created** | created | int NOT NULL |  | **kotlin.Int** |  | 
**choices** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CreateEditResponseChoicesInner&gt;**](CreateEditResponseChoicesInner.md) |  | 
**usage** | usage | long NOT NULL |  | [**CreateCompletionResponseUsage**](CreateCompletionResponseUsage.md) |  |  [foreignkey]




# **Table `CreateEditResponseCreateEditResponseChoicesInner`**
(mapped from: CreateEditResponseCreateEditResponseChoicesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
createEditResponse | createEditResponse | long | | kotlin.Long | Primary Key | *one*
createEditResponseChoicesInner | createEditResponseChoicesInner | long | | kotlin.Long | Foreign Key | *many*




