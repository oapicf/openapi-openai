
# Table `ListPaginatedFineTuningJobsResponse`
(mapped from: ListPaginatedFineTuningJobsResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**data** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;FineTuningJob&gt;**](FineTuningJob.md) |  | 
**hasMore** | has_more | boolean NOT NULL |  | **kotlin.Boolean** |  | 
**object** | object | text NOT NULL |  | [**object**](#Object) |  | 


# **Table `ListPaginatedFineTuningJobsResponseFineTuningJob`**
(mapped from: ListPaginatedFineTuningJobsResponseFineTuningJob)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
listPaginatedFineTuningJobsResponse | listPaginatedFineTuningJobsResponse | long | | kotlin.Long | Primary Key | *one*
fineTuningJob | fineTuningJob | long | | kotlin.Long | Foreign Key | *many*





