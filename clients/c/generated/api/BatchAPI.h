#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/batch.h"
#include "../model/create_batch_request.h"
#include "../model/list_batches_response.h"


// Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.
//
batch_t*
BatchAPI_cancelBatch(apiClient_t *apiClient, char *batch_id);


// Creates and executes a batch from an uploaded file of requests
//
batch_t*
BatchAPI_createBatch(apiClient_t *apiClient, create_batch_request_t *create_batch_request);


// List your organization's batches.
//
list_batches_response_t*
BatchAPI_listBatches(apiClient_t *apiClient, char *after, int *limit);


// Retrieves a batch.
//
batch_t*
BatchAPI_retrieveBatch(apiClient_t *apiClient, char *batch_id);


