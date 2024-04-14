#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/create_fine_tuning_job_request.h"
#include "../model/fine_tuning_job.h"
#include "../model/list_fine_tuning_job_checkpoints_response.h"
#include "../model/list_fine_tuning_job_events_response.h"
#include "../model/list_paginated_fine_tuning_jobs_response.h"


// Immediately cancel a fine-tune job. 
//
fine_tuning_job_t*
FineTuningAPI_cancelFineTuningJob(apiClient_t *apiClient, char *fine_tuning_job_id);


// Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
//
fine_tuning_job_t*
FineTuningAPI_createFineTuningJob(apiClient_t *apiClient, create_fine_tuning_job_request_t *create_fine_tuning_job_request);


// Get status updates for a fine-tuning job. 
//
list_fine_tuning_job_events_response_t*
FineTuningAPI_listFineTuningEvents(apiClient_t *apiClient, char *fine_tuning_job_id, char *after, int *limit);


// List checkpoints for a fine-tuning job. 
//
list_fine_tuning_job_checkpoints_response_t*
FineTuningAPI_listFineTuningJobCheckpoints(apiClient_t *apiClient, char *fine_tuning_job_id, char *after, int *limit);


// List your organization's fine-tuning jobs 
//
list_paginated_fine_tuning_jobs_response_t*
FineTuningAPI_listPaginatedFineTuningJobs(apiClient_t *apiClient, char *after, int *limit);


// Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
//
fine_tuning_job_t*
FineTuningAPI_retrieveFineTuningJob(apiClient_t *apiClient, char *fine_tuning_job_id);


