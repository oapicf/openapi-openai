
# Table `ListFineTuneEventsResponse`
(mapped from: ListFineTuneEventsResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**object** | object | text NOT NULL |  | **kotlin.String** |  | 
**data** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;FineTuneEvent&gt;**](FineTuneEvent.md) |  | 



# **Table `ListFineTuneEventsResponseFineTuneEvent`**
(mapped from: ListFineTuneEventsResponseFineTuneEvent)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
listFineTuneEventsResponse | listFineTuneEventsResponse | long | | kotlin.Long | Primary Key | *one*
fineTuneEvent | fineTuneEvent | long | | kotlin.Long | Foreign Key | *many*



