# fine_tuning_api

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CancelFineTuningJob**](fine_tuning_api.md#CancelFineTuningJob) | **POST** /fine_tuning/jobs/{fine_tuning_job_id}/cancel | Immediately cancel a fine-tune job. 
[**CreateFineTuningJob**](fine_tuning_api.md#CreateFineTuningJob) | **POST** /fine_tuning/jobs | Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
[**ListFineTuningEvents**](fine_tuning_api.md#ListFineTuningEvents) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/events | Get status updates for a fine-tuning job. 
[**ListFineTuningJobCheckpoints**](fine_tuning_api.md#ListFineTuningJobCheckpoints) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/checkpoints | List checkpoints for a fine-tuning job. 
[**ListPaginatedFineTuningJobs**](fine_tuning_api.md#ListPaginatedFineTuningJobs) | **GET** /fine_tuning/jobs | List your organization&#39;s fine-tuning jobs 
[**RetrieveFineTuningJob**](fine_tuning_api.md#RetrieveFineTuningJob) | **GET** /fine_tuning/jobs/{fine_tuning_job_id} | Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 


<a name="CancelFineTuningJob"></a>
# **CancelFineTuningJob**
> FineTuningJob CancelFineTuningJob(fineTuningJobId)

Immediately cancel a fine-tune job. 
<a name="CreateFineTuningJob"></a>
# **CreateFineTuningJob**
> FineTuningJob CreateFineTuningJob(createFineTuningJobRequest)

Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
<a name="ListFineTuningEvents"></a>
# **ListFineTuningEvents**
> ListFineTuningJobEventsResponse ListFineTuningEvents(fineTuningJobId, after, limit)

Get status updates for a fine-tuning job. 
<a name="ListFineTuningJobCheckpoints"></a>
# **ListFineTuningJobCheckpoints**
> ListFineTuningJobCheckpointsResponse ListFineTuningJobCheckpoints(fineTuningJobId, after, limit)

List checkpoints for a fine-tuning job. 
<a name="ListPaginatedFineTuningJobs"></a>
# **ListPaginatedFineTuningJobs**
> ListPaginatedFineTuningJobsResponse ListPaginatedFineTuningJobs(after, limit)

List your organization&#39;s fine-tuning jobs 
<a name="RetrieveFineTuningJob"></a>
# **RetrieveFineTuningJob**
> FineTuningJob RetrieveFineTuningJob(fineTuningJobId)

Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
