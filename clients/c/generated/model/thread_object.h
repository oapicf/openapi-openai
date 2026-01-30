/*
 * thread_object.h
 *
 * Represents a thread that contains [messages](/docs/api-reference/messages).
 */

#ifndef _thread_object_H_
#define _thread_object_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct thread_object_t thread_object_t;

#include "modify_thread_request_tool_resources.h"
#include "object.h"

// Enum OBJECT for thread_object

typedef enum  { openai_api_thread_object_OBJECT_NULL = 0, openai_api_thread_object_OBJECT_thread } openai_api_thread_object_OBJECT_e;

char* thread_object_object_ToString(openai_api_thread_object_OBJECT_e object);

openai_api_thread_object_OBJECT_e thread_object_object_FromString(char* object);



typedef struct thread_object_t {
    char *id; // string
    openai_api_thread_object_OBJECT_e object; //enum
    int created_at; //numeric
    struct modify_thread_request_tool_resources_t *tool_resources; //model
    object_t *metadata; //object

    int _library_owned; // Is the library responsible for freeing this object?
} thread_object_t;

__attribute__((deprecated)) thread_object_t *thread_object_create(
    char *id,
    openai_api_thread_object_OBJECT_e object,
    int created_at,
    modify_thread_request_tool_resources_t *tool_resources,
    object_t *metadata
);

void thread_object_free(thread_object_t *thread_object);

thread_object_t *thread_object_parseFromJSON(cJSON *thread_objectJSON);

cJSON *thread_object_convertToJSON(thread_object_t *thread_object);

#endif /* _thread_object_H_ */

