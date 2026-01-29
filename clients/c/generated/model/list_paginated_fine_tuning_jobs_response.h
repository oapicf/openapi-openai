/*
 * list_paginated_fine_tuning_jobs_response.h
 *
 * 
 */

#ifndef _list_paginated_fine_tuning_jobs_response_H_
#define _list_paginated_fine_tuning_jobs_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct list_paginated_fine_tuning_jobs_response_t list_paginated_fine_tuning_jobs_response_t;

#include "fine_tuning_job.h"

// Enum OBJECT for list_paginated_fine_tuning_jobs_response

typedef enum  { openai_api_list_paginated_fine_tuning_jobs_response_OBJECT_NULL = 0, openai_api_list_paginated_fine_tuning_jobs_response_OBJECT_list } openai_api_list_paginated_fine_tuning_jobs_response_OBJECT_e;

char* list_paginated_fine_tuning_jobs_response_object_ToString(openai_api_list_paginated_fine_tuning_jobs_response_OBJECT_e object);

openai_api_list_paginated_fine_tuning_jobs_response_OBJECT_e list_paginated_fine_tuning_jobs_response_object_FromString(char* object);



typedef struct list_paginated_fine_tuning_jobs_response_t {
    list_t *data; //nonprimitive container
    int has_more; //boolean
    openai_api_list_paginated_fine_tuning_jobs_response_OBJECT_e object; //enum

    int _library_owned; // Is the library responsible for freeing this object?
} list_paginated_fine_tuning_jobs_response_t;

__attribute__((deprecated)) list_paginated_fine_tuning_jobs_response_t *list_paginated_fine_tuning_jobs_response_create(
    list_t *data,
    int has_more,
    openai_api_list_paginated_fine_tuning_jobs_response_OBJECT_e object
);

void list_paginated_fine_tuning_jobs_response_free(list_paginated_fine_tuning_jobs_response_t *list_paginated_fine_tuning_jobs_response);

list_paginated_fine_tuning_jobs_response_t *list_paginated_fine_tuning_jobs_response_parseFromJSON(cJSON *list_paginated_fine_tuning_jobs_responseJSON);

cJSON *list_paginated_fine_tuning_jobs_response_convertToJSON(list_paginated_fine_tuning_jobs_response_t *list_paginated_fine_tuning_jobs_response);

#endif /* _list_paginated_fine_tuning_jobs_response_H_ */

