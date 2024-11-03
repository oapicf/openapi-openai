/*
 * list_threads_response.h
 *
 * 
 */

#ifndef _list_threads_response_H_
#define _list_threads_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct list_threads_response_t list_threads_response_t;

#include "thread_object.h"



typedef struct list_threads_response_t {
    char *object; // string
    list_t *data; //nonprimitive container
    char *first_id; // string
    char *last_id; // string
    int has_more; //boolean

} list_threads_response_t;

list_threads_response_t *list_threads_response_create(
    char *object,
    list_t *data,
    char *first_id,
    char *last_id,
    int has_more
);

void list_threads_response_free(list_threads_response_t *list_threads_response);

list_threads_response_t *list_threads_response_parseFromJSON(cJSON *list_threads_responseJSON);

cJSON *list_threads_response_convertToJSON(list_threads_response_t *list_threads_response);

#endif /* _list_threads_response_H_ */

