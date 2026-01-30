/*
 * list_batches_response.h
 *
 * 
 */

#ifndef _list_batches_response_H_
#define _list_batches_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct list_batches_response_t list_batches_response_t;

#include "batch.h"

// Enum OBJECT for list_batches_response

typedef enum  { openai_api_list_batches_response_OBJECT_NULL = 0, openai_api_list_batches_response_OBJECT_list } openai_api_list_batches_response_OBJECT_e;

char* list_batches_response_object_ToString(openai_api_list_batches_response_OBJECT_e object);

openai_api_list_batches_response_OBJECT_e list_batches_response_object_FromString(char* object);



typedef struct list_batches_response_t {
    list_t *data; //nonprimitive container
    char *first_id; // string
    char *last_id; // string
    int has_more; //boolean
    openai_api_list_batches_response_OBJECT_e object; //enum

    int _library_owned; // Is the library responsible for freeing this object?
} list_batches_response_t;

__attribute__((deprecated)) list_batches_response_t *list_batches_response_create(
    list_t *data,
    char *first_id,
    char *last_id,
    int has_more,
    openai_api_list_batches_response_OBJECT_e object
);

void list_batches_response_free(list_batches_response_t *list_batches_response);

list_batches_response_t *list_batches_response_parseFromJSON(cJSON *list_batches_responseJSON);

cJSON *list_batches_response_convertToJSON(list_batches_response_t *list_batches_response);

#endif /* _list_batches_response_H_ */

