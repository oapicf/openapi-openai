/*
 * list_models_response.h
 *
 * 
 */

#ifndef _list_models_response_H_
#define _list_models_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct list_models_response_t list_models_response_t;

#include "model.h"

// Enum OBJECT for list_models_response

typedef enum  { openai_api_list_models_response_OBJECT_NULL = 0, openai_api_list_models_response_OBJECT_list } openai_api_list_models_response_OBJECT_e;

char* list_models_response_object_ToString(openai_api_list_models_response_OBJECT_e object);

openai_api_list_models_response_OBJECT_e list_models_response_object_FromString(char* object);



typedef struct list_models_response_t {
    openai_api_list_models_response_OBJECT_e object; //enum
    list_t *data; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} list_models_response_t;

__attribute__((deprecated)) list_models_response_t *list_models_response_create(
    openai_api_list_models_response_OBJECT_e object,
    list_t *data
);

void list_models_response_free(list_models_response_t *list_models_response);

list_models_response_t *list_models_response_parseFromJSON(cJSON *list_models_responseJSON);

cJSON *list_models_response_convertToJSON(list_models_response_t *list_models_response);

#endif /* _list_models_response_H_ */

