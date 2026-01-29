/*
 * message_object.h
 *
 * Represents a message within a [thread](/docs/api-reference/threads).
 */

#ifndef _message_object_H_
#define _message_object_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct message_object_t message_object_t;

#include "message_object_content_inner.h"
#include "message_object_incomplete_details.h"
#include "object.h"

// Enum OBJECT for message_object

typedef enum  { openai_api_message_object_OBJECT_NULL = 0, openai_api_message_object_OBJECT_thread.message } openai_api_message_object_OBJECT_e;

char* message_object_object_ToString(openai_api_message_object_OBJECT_e object);

openai_api_message_object_OBJECT_e message_object_object_FromString(char* object);

// Enum STATUS for message_object

typedef enum  { openai_api_message_object_STATUS_NULL = 0, openai_api_message_object_STATUS_in_progress, openai_api_message_object_STATUS_incomplete, openai_api_message_object_STATUS_completed } openai_api_message_object_STATUS_e;

char* message_object_status_ToString(openai_api_message_object_STATUS_e status);

openai_api_message_object_STATUS_e message_object_status_FromString(char* status);

// Enum ROLE for message_object

typedef enum  { openai_api_message_object_ROLE_NULL = 0, openai_api_message_object_ROLE_user, openai_api_message_object_ROLE_assistant } openai_api_message_object_ROLE_e;

char* message_object_role_ToString(openai_api_message_object_ROLE_e role);

openai_api_message_object_ROLE_e message_object_role_FromString(char* role);



typedef struct message_object_t {
    char *id; // string
    openai_api_message_object_OBJECT_e object; //enum
    int created_at; //numeric
    char *thread_id; // string
    openai_api_message_object_STATUS_e status; //enum
    struct message_object_incomplete_details_t *incomplete_details; //model
    int completed_at; //numeric
    int incomplete_at; //numeric
    openai_api_message_object_ROLE_e role; //enum
    list_t *content; //nonprimitive container
    char *assistant_id; // string
    char *run_id; // string
    list_t *file_ids; //primitive container
    object_t *metadata; //object

    int _library_owned; // Is the library responsible for freeing this object?
} message_object_t;

__attribute__((deprecated)) message_object_t *message_object_create(
    char *id,
    openai_api_message_object_OBJECT_e object,
    int created_at,
    char *thread_id,
    openai_api_message_object_STATUS_e status,
    message_object_incomplete_details_t *incomplete_details,
    int completed_at,
    int incomplete_at,
    openai_api_message_object_ROLE_e role,
    list_t *content,
    char *assistant_id,
    char *run_id,
    list_t *file_ids,
    object_t *metadata
);

void message_object_free(message_object_t *message_object);

message_object_t *message_object_parseFromJSON(cJSON *message_objectJSON);

cJSON *message_object_convertToJSON(message_object_t *message_object);

#endif /* _message_object_H_ */

