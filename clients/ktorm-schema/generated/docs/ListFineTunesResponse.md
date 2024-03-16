
# Table `ListFineTunesResponse`
(mapped from: ListFineTunesResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**object** | object | text NOT NULL |  | **kotlin.String** |  | 
**data** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;FineTune&gt;**](FineTune.md) |  | 



# **Table `ListFineTunesResponseFineTune`**
(mapped from: ListFineTunesResponseFineTune)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
listFineTunesResponse | listFineTunesResponse | long | | kotlin.Long | Primary Key | *one*
fineTune | fineTune | long | | kotlin.Long | Foreign Key | *many*



