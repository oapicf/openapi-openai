/*
 * list_fine_tuning_job_checkpoints_response.h
 *
 * 
 */

#ifndef _list_fine_tuning_job_checkpoints_response_H_
#define _list_fine_tuning_job_checkpoints_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct list_fine_tuning_job_checkpoints_response_t list_fine_tuning_job_checkpoints_response_t;

#include "fine_tuning_job_checkpoint.h"

// Enum OBJECT for list_fine_tuning_job_checkpoints_response

typedef enum  { openai_api_list_fine_tuning_job_checkpoints_response_OBJECT_NULL = 0, openai_api_list_fine_tuning_job_checkpoints_response_OBJECT_list } openai_api_list_fine_tuning_job_checkpoints_response_OBJECT_e;

char* list_fine_tuning_job_checkpoints_response_object_ToString(openai_api_list_fine_tuning_job_checkpoints_response_OBJECT_e object);

openai_api_list_fine_tuning_job_checkpoints_response_OBJECT_e list_fine_tuning_job_checkpoints_response_object_FromString(char* object);



typedef struct list_fine_tuning_job_checkpoints_response_t {
    list_t *data; //nonprimitive container
    openai_api_list_fine_tuning_job_checkpoints_response_OBJECT_e object; //enum
    char *first_id; // string
    char *last_id; // string
    int has_more; //boolean

    int _library_owned; // Is the library responsible for freeing this object?
} list_fine_tuning_job_checkpoints_response_t;

__attribute__((deprecated)) list_fine_tuning_job_checkpoints_response_t *list_fine_tuning_job_checkpoints_response_create(
    list_t *data,
    openai_api_list_fine_tuning_job_checkpoints_response_OBJECT_e object,
    char *first_id,
    char *last_id,
    int has_more
);

void list_fine_tuning_job_checkpoints_response_free(list_fine_tuning_job_checkpoints_response_t *list_fine_tuning_job_checkpoints_response);

list_fine_tuning_job_checkpoints_response_t *list_fine_tuning_job_checkpoints_response_parseFromJSON(cJSON *list_fine_tuning_job_checkpoints_responseJSON);

cJSON *list_fine_tuning_job_checkpoints_response_convertToJSON(list_fine_tuning_job_checkpoints_response_t *list_fine_tuning_job_checkpoints_response);

#endif /* _list_fine_tuning_job_checkpoints_response_H_ */

