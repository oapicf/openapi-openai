/*
 * batch.h
 *
 * 
 */

#ifndef _batch_H_
#define _batch_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct batch_t batch_t;

#include "batch_errors.h"
#include "batch_request_counts.h"
#include "object.h"

// Enum OBJECT for batch

typedef enum  { openai_api_batch_OBJECT_NULL = 0, openai_api_batch_OBJECT_batch } openai_api_batch_OBJECT_e;

char* batch_object_ToString(openai_api_batch_OBJECT_e object);

openai_api_batch_OBJECT_e batch_object_FromString(char* object);

// Enum STATUS for batch

typedef enum  { openai_api_batch_STATUS_NULL = 0, openai_api_batch_STATUS_validating, openai_api_batch_STATUS_failed, openai_api_batch_STATUS_in_progress, openai_api_batch_STATUS_finalizing, openai_api_batch_STATUS_completed, openai_api_batch_STATUS_expired, openai_api_batch_STATUS_cancelling, openai_api_batch_STATUS_cancelled } openai_api_batch_STATUS_e;

char* batch_status_ToString(openai_api_batch_STATUS_e status);

openai_api_batch_STATUS_e batch_status_FromString(char* status);



typedef struct batch_t {
    char *id; // string
    openai_api_batch_OBJECT_e object; //enum
    char *endpoint; // string
    struct batch_errors_t *errors; //model
    char *input_file_id; // string
    char *completion_window; // string
    openai_api_batch_STATUS_e status; //enum
    char *output_file_id; // string
    char *error_file_id; // string
    int created_at; //numeric
    int in_progress_at; //numeric
    int expires_at; //numeric
    int finalizing_at; //numeric
    int completed_at; //numeric
    int failed_at; //numeric
    int expired_at; //numeric
    int cancelling_at; //numeric
    int cancelled_at; //numeric
    struct batch_request_counts_t *request_counts; //model
    object_t *metadata; //object

    int _library_owned; // Is the library responsible for freeing this object?
} batch_t;

__attribute__((deprecated)) batch_t *batch_create(
    char *id,
    openai_api_batch_OBJECT_e object,
    char *endpoint,
    batch_errors_t *errors,
    char *input_file_id,
    char *completion_window,
    openai_api_batch_STATUS_e status,
    char *output_file_id,
    char *error_file_id,
    int created_at,
    int in_progress_at,
    int expires_at,
    int finalizing_at,
    int completed_at,
    int failed_at,
    int expired_at,
    int cancelling_at,
    int cancelled_at,
    batch_request_counts_t *request_counts,
    object_t *metadata
);

void batch_free(batch_t *batch);

batch_t *batch_parseFromJSON(cJSON *batchJSON);

cJSON *batch_convertToJSON(batch_t *batch);

#endif /* _batch_H_ */

