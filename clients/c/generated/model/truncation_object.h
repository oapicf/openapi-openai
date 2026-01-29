/*
 * truncation_object.h
 *
 * 
 */

#ifndef _truncation_object_H_
#define _truncation_object_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct truncation_object_t truncation_object_t;


// Enum TYPE for truncation_object

typedef enum  { openai_api_truncation_object_TYPE_NULL = 0, openai_api_truncation_object_TYPE__auto, openai_api_truncation_object_TYPE_last_messages } openai_api_truncation_object_TYPE_e;

char* truncation_object_type_ToString(openai_api_truncation_object_TYPE_e type);

openai_api_truncation_object_TYPE_e truncation_object_type_FromString(char* type);



typedef struct truncation_object_t {
    openai_api_truncation_object_TYPE_e type; //enum
    int last_messages; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} truncation_object_t;

__attribute__((deprecated)) truncation_object_t *truncation_object_create(
    openai_api_truncation_object_TYPE_e type,
    int last_messages
);

void truncation_object_free(truncation_object_t *truncation_object);

truncation_object_t *truncation_object_parseFromJSON(cJSON *truncation_objectJSON);

cJSON *truncation_object_convertToJSON(truncation_object_t *truncation_object);

#endif /* _truncation_object_H_ */

