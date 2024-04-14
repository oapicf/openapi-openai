
# Table `ListFineTuningJobEventsResponse`
(mapped from: ListFineTuningJobEventsResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**data** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;FineTuningJobEvent&gt;**](FineTuningJobEvent.md) |  | 
**object** | object | text NOT NULL |  | [**object**](#Object) |  | 


# **Table `ListFineTuningJobEventsResponseFineTuningJobEvent`**
(mapped from: ListFineTuningJobEventsResponseFineTuningJobEvent)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
listFineTuningJobEventsResponse | listFineTuningJobEventsResponse | long | | kotlin.Long | Primary Key | *one*
fineTuningJobEvent | fineTuningJobEvent | long | | kotlin.Long | Foreign Key | *many*




