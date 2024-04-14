/*
 * assistant_object.h
 *
 * Represents an &#x60;assistant&#x60; that can call the model and use tools.
 */

#ifndef _assistant_object_H_
#define _assistant_object_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct assistant_object_t assistant_object_t;

#include "assistant_object_tools_inner.h"
#include "object.h"

// Enum OBJECT for assistant_object

typedef enum  { openai_api_assistant_object_OBJECT_NULL = 0, openai_api_assistant_object_OBJECT_assistant } openai_api_assistant_object_OBJECT_e;

char* assistant_object_object_ToString(openai_api_assistant_object_OBJECT_e object);

openai_api_assistant_object_OBJECT_e assistant_object_object_FromString(char* object);



typedef struct assistant_object_t {
    char *id; // string
    openai_api_assistant_object_OBJECT_e object; //enum
    int created_at; //numeric
    char *name; // string
    char *description; // string
    char *model; // string
    char *instructions; // string
    list_t *tools; //nonprimitive container
    list_t *file_ids; //primitive container
    object_t *metadata; //object

} assistant_object_t;

assistant_object_t *assistant_object_create(
    char *id,
    openai_api_assistant_object_OBJECT_e object,
    int created_at,
    char *name,
    char *description,
    char *model,
    char *instructions,
    list_t *tools,
    list_t *file_ids,
    object_t *metadata
);

void assistant_object_free(assistant_object_t *assistant_object);

assistant_object_t *assistant_object_parseFromJSON(cJSON *assistant_objectJSON);

cJSON *assistant_object_convertToJSON(assistant_object_t *assistant_object);

#endif /* _assistant_object_H_ */

