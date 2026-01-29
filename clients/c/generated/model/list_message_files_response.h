/*
 * list_message_files_response.h
 *
 * 
 */

#ifndef _list_message_files_response_H_
#define _list_message_files_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct list_message_files_response_t list_message_files_response_t;

#include "message_file_object.h"



typedef struct list_message_files_response_t {
    char *object; // string
    list_t *data; //nonprimitive container
    char *first_id; // string
    char *last_id; // string
    int has_more; //boolean

    int _library_owned; // Is the library responsible for freeing this object?
} list_message_files_response_t;

__attribute__((deprecated)) list_message_files_response_t *list_message_files_response_create(
    char *object,
    list_t *data,
    char *first_id,
    char *last_id,
    int has_more
);

void list_message_files_response_free(list_message_files_response_t *list_message_files_response);

list_message_files_response_t *list_message_files_response_parseFromJSON(cJSON *list_message_files_responseJSON);

cJSON *list_message_files_response_convertToJSON(list_message_files_response_t *list_message_files_response);

#endif /* _list_message_files_response_H_ */

