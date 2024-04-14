
# Table `ListFineTuningJobCheckpointsResponse`
(mapped from: ListFineTuningJobCheckpointsResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**data** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;FineTuningJobCheckpoint&gt;**](FineTuningJobCheckpoint.md) |  | 
**object** | object | text NOT NULL |  | [**object**](#Object) |  | 
**hasMore** | has_more | boolean NOT NULL |  | **kotlin.Boolean** |  | 
**firstId** | first_id | text |  | **kotlin.String** |  |  [optional]
**lastId** | last_id | text |  | **kotlin.String** |  |  [optional]


# **Table `ListFineTuningJobCheckpointsResponseFineTuningJobCheckpoint`**
(mapped from: ListFineTuningJobCheckpointsResponseFineTuningJobCheckpoint)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
listFineTuningJobCheckpointsResponse | listFineTuningJobCheckpointsResponse | long | | kotlin.Long | Primary Key | *one*
fineTuningJobCheckpoint | fineTuningJobCheckpoint | long | | kotlin.Long | Foreign Key | *many*







