/*
 * list_files_response.h
 *
 * 
 */

#ifndef _list_files_response_H_
#define _list_files_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct list_files_response_t list_files_response_t;

#include "open_ai_file.h"



typedef struct list_files_response_t {
    char *object; // string
    list_t *data; //nonprimitive container

} list_files_response_t;

list_files_response_t *list_files_response_create(
    char *object,
    list_t *data
);

void list_files_response_free(list_files_response_t *list_files_response);

list_files_response_t *list_files_response_parseFromJSON(cJSON *list_files_responseJSON);

cJSON *list_files_response_convertToJSON(list_files_response_t *list_files_response);

#endif /* _list_files_response_H_ */

