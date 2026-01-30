/*
 * fine_tuning_job.h
 *
 * The &#x60;fine_tuning.job&#x60; object represents a fine-tuning job that has been created through the API. 
 */

#ifndef _fine_tuning_job_H_
#define _fine_tuning_job_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct fine_tuning_job_t fine_tuning_job_t;

#include "fine_tune_method.h"
#include "fine_tuning_job_error.h"
#include "fine_tuning_job_hyperparameters.h"
#include "fine_tuning_job_integrations_inner.h"

// Enum OBJECT for fine_tuning_job

typedef enum  { openai_api_fine_tuning_job_OBJECT_NULL = 0, openai_api_fine_tuning_job_OBJECT_fine_tuning.job } openai_api_fine_tuning_job_OBJECT_e;

char* fine_tuning_job_object_ToString(openai_api_fine_tuning_job_OBJECT_e object);

openai_api_fine_tuning_job_OBJECT_e fine_tuning_job_object_FromString(char* object);

// Enum STATUS for fine_tuning_job

typedef enum  { openai_api_fine_tuning_job_STATUS_NULL = 0, openai_api_fine_tuning_job_STATUS_validating_files, openai_api_fine_tuning_job_STATUS_queued, openai_api_fine_tuning_job_STATUS_running, openai_api_fine_tuning_job_STATUS_succeeded, openai_api_fine_tuning_job_STATUS_failed, openai_api_fine_tuning_job_STATUS_cancelled } openai_api_fine_tuning_job_STATUS_e;

char* fine_tuning_job_status_ToString(openai_api_fine_tuning_job_STATUS_e status);

openai_api_fine_tuning_job_STATUS_e fine_tuning_job_status_FromString(char* status);



typedef struct fine_tuning_job_t {
    char *id; // string
    int created_at; //numeric
    struct fine_tuning_job_error_t *error; //model
    char *fine_tuned_model; // string
    int finished_at; //numeric
    struct fine_tuning_job_hyperparameters_t *hyperparameters; //model
    char *model; // string
    openai_api_fine_tuning_job_OBJECT_e object; //enum
    char *organization_id; // string
    list_t *result_files; //primitive container
    openai_api_fine_tuning_job_STATUS_e status; //enum
    int trained_tokens; //numeric
    char *training_file; // string
    char *validation_file; // string
    list_t *integrations; //nonprimitive container
    int seed; //numeric
    int estimated_finish; //numeric
    struct fine_tune_method_t *method; //model

    int _library_owned; // Is the library responsible for freeing this object?
} fine_tuning_job_t;

__attribute__((deprecated)) fine_tuning_job_t *fine_tuning_job_create(
    char *id,
    int created_at,
    fine_tuning_job_error_t *error,
    char *fine_tuned_model,
    int finished_at,
    fine_tuning_job_hyperparameters_t *hyperparameters,
    char *model,
    openai_api_fine_tuning_job_OBJECT_e object,
    char *organization_id,
    list_t *result_files,
    openai_api_fine_tuning_job_STATUS_e status,
    int trained_tokens,
    char *training_file,
    char *validation_file,
    list_t *integrations,
    int seed,
    int estimated_finish,
    fine_tune_method_t *method
);

void fine_tuning_job_free(fine_tuning_job_t *fine_tuning_job);

fine_tuning_job_t *fine_tuning_job_parseFromJSON(cJSON *fine_tuning_jobJSON);

cJSON *fine_tuning_job_convertToJSON(fine_tuning_job_t *fine_tuning_job);

#endif /* _fine_tuning_job_H_ */

