/*
 * function_object.h
 *
 * 
 */

#ifndef _function_object_H_
#define _function_object_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct function_object_t function_object_t;

#include "any_type.h"



typedef struct function_object_t {
    char *description; // string
    char *name; // string
    list_t* parameters; //map

} function_object_t;

function_object_t *function_object_create(
    char *description,
    char *name,
    list_t* parameters
);

void function_object_free(function_object_t *function_object);

function_object_t *function_object_parseFromJSON(cJSON *function_objectJSON);

cJSON *function_object_convertToJSON(function_object_t *function_object);

#endif /* _function_object_H_ */

