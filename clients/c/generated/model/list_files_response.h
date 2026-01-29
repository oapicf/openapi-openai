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

// Enum OBJECT for list_files_response

typedef enum  { openai_api_list_files_response_OBJECT_NULL = 0, openai_api_list_files_response_OBJECT_list } openai_api_list_files_response_OBJECT_e;

char* list_files_response_object_ToString(openai_api_list_files_response_OBJECT_e object);

openai_api_list_files_response_OBJECT_e list_files_response_object_FromString(char* object);



typedef struct list_files_response_t {
    list_t *data; //nonprimitive container
    openai_api_list_files_response_OBJECT_e object; //enum

    int _library_owned; // Is the library responsible for freeing this object?
} list_files_response_t;

__attribute__((deprecated)) list_files_response_t *list_files_response_create(
    list_t *data,
    openai_api_list_files_response_OBJECT_e object
);

void list_files_response_free(list_files_response_t *list_files_response);

list_files_response_t *list_files_response_parseFromJSON(cJSON *list_files_responseJSON);

cJSON *list_files_response_convertToJSON(list_files_response_t *list_files_response);

#endif /* _list_files_response_H_ */

