/*
 * fine_tuning_job_event.h
 *
 * Fine-tuning job event object
 */

#ifndef _fine_tuning_job_event_H_
#define _fine_tuning_job_event_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct fine_tuning_job_event_t fine_tuning_job_event_t;


// Enum LEVEL for fine_tuning_job_event

typedef enum  { openai_api_fine_tuning_job_event_LEVEL_NULL = 0, openai_api_fine_tuning_job_event_LEVEL_info, openai_api_fine_tuning_job_event_LEVEL_warn, openai_api_fine_tuning_job_event_LEVEL_error } openai_api_fine_tuning_job_event_LEVEL_e;

char* fine_tuning_job_event_level_ToString(openai_api_fine_tuning_job_event_LEVEL_e level);

openai_api_fine_tuning_job_event_LEVEL_e fine_tuning_job_event_level_FromString(char* level);

// Enum OBJECT for fine_tuning_job_event

typedef enum  { openai_api_fine_tuning_job_event_OBJECT_NULL = 0, openai_api_fine_tuning_job_event_OBJECT_fine_tuning.job.event } openai_api_fine_tuning_job_event_OBJECT_e;

char* fine_tuning_job_event_object_ToString(openai_api_fine_tuning_job_event_OBJECT_e object);

openai_api_fine_tuning_job_event_OBJECT_e fine_tuning_job_event_object_FromString(char* object);



typedef struct fine_tuning_job_event_t {
    char *id; // string
    int created_at; //numeric
    openai_api_fine_tuning_job_event_LEVEL_e level; //enum
    char *message; // string
    openai_api_fine_tuning_job_event_OBJECT_e object; //enum

    int _library_owned; // Is the library responsible for freeing this object?
} fine_tuning_job_event_t;

__attribute__((deprecated)) fine_tuning_job_event_t *fine_tuning_job_event_create(
    char *id,
    int created_at,
    openai_api_fine_tuning_job_event_LEVEL_e level,
    char *message,
    openai_api_fine_tuning_job_event_OBJECT_e object
);

void fine_tuning_job_event_free(fine_tuning_job_event_t *fine_tuning_job_event);

fine_tuning_job_event_t *fine_tuning_job_event_parseFromJSON(cJSON *fine_tuning_job_eventJSON);

cJSON *fine_tuning_job_event_convertToJSON(fine_tuning_job_event_t *fine_tuning_job_event);

#endif /* _fine_tuning_job_event_H_ */

