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



typedef struct list_models_response_t {
    char *object; // string
    list_t *data; //nonprimitive container

} list_models_response_t;

list_models_response_t *list_models_response_create(
    char *object,
    list_t *data
);

void list_models_response_free(list_models_response_t *list_models_response);

list_models_response_t *list_models_response_parseFromJSON(cJSON *list_models_responseJSON);

cJSON *list_models_response_convertToJSON(list_models_response_t *list_models_response);

#endif /* _list_models_response_H_ */

