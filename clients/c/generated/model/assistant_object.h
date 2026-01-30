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

#include "assistant_object_tool_resources.h"
#include "assistant_object_tools_inner.h"
#include "assistants_api_response_format_option.h"
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
    struct assistant_object_tool_resources_t *tool_resources; //model
    object_t *metadata; //object
    double temperature; //numeric
    double top_p; //numeric
    struct assistants_api_response_format_option_t *response_format; //model

    int _library_owned; // Is the library responsible for freeing this object?
} assistant_object_t;

__attribute__((deprecated)) assistant_object_t *assistant_object_create(
    char *id,
    openai_api_assistant_object_OBJECT_e object,
    int created_at,
    char *name,
    char *description,
    char *model,
    char *instructions,
    list_t *tools,
    assistant_object_tool_resources_t *tool_resources,
    object_t *metadata,
    double temperature,
    double top_p,
    assistants_api_response_format_option_t *response_format
);

void assistant_object_free(assistant_object_t *assistant_object);

assistant_object_t *assistant_object_parseFromJSON(cJSON *assistant_objectJSON);

cJSON *assistant_object_convertToJSON(assistant_object_t *assistant_object);

#endif /* _assistant_object_H_ */

