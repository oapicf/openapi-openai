/*
 * realtime_conversation_item.h
 *
 * The item to add to the conversation.
 */

#ifndef _realtime_conversation_item_H_
#define _realtime_conversation_item_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct realtime_conversation_item_t realtime_conversation_item_t;

#include "realtime_conversation_item_content_inner.h"

// Enum TYPE for realtime_conversation_item

typedef enum  { openai_api_realtime_conversation_item_TYPE_NULL = 0, openai_api_realtime_conversation_item_TYPE_message, openai_api_realtime_conversation_item_TYPE_function_call, openai_api_realtime_conversation_item_TYPE_function_call_output } openai_api_realtime_conversation_item_TYPE_e;

char* realtime_conversation_item_type_ToString(openai_api_realtime_conversation_item_TYPE_e type);

openai_api_realtime_conversation_item_TYPE_e realtime_conversation_item_type_FromString(char* type);

// Enum OBJECT for realtime_conversation_item

typedef enum  { openai_api_realtime_conversation_item_OBJECT_NULL = 0, openai_api_realtime_conversation_item_OBJECT_realtime.item } openai_api_realtime_conversation_item_OBJECT_e;

char* realtime_conversation_item_object_ToString(openai_api_realtime_conversation_item_OBJECT_e object);

openai_api_realtime_conversation_item_OBJECT_e realtime_conversation_item_object_FromString(char* object);

// Enum STATUS for realtime_conversation_item

typedef enum  { openai_api_realtime_conversation_item_STATUS_NULL = 0, openai_api_realtime_conversation_item_STATUS_completed, openai_api_realtime_conversation_item_STATUS_incomplete } openai_api_realtime_conversation_item_STATUS_e;

char* realtime_conversation_item_status_ToString(openai_api_realtime_conversation_item_STATUS_e status);

openai_api_realtime_conversation_item_STATUS_e realtime_conversation_item_status_FromString(char* status);

// Enum ROLE for realtime_conversation_item

typedef enum  { openai_api_realtime_conversation_item_ROLE_NULL = 0, openai_api_realtime_conversation_item_ROLE_user, openai_api_realtime_conversation_item_ROLE_assistant, openai_api_realtime_conversation_item_ROLE_system } openai_api_realtime_conversation_item_ROLE_e;

char* realtime_conversation_item_role_ToString(openai_api_realtime_conversation_item_ROLE_e role);

openai_api_realtime_conversation_item_ROLE_e realtime_conversation_item_role_FromString(char* role);



typedef struct realtime_conversation_item_t {
    char *id; // string
    openai_api_realtime_conversation_item_TYPE_e type; //enum
    openai_api_realtime_conversation_item_OBJECT_e object; //enum
    openai_api_realtime_conversation_item_STATUS_e status; //enum
    openai_api_realtime_conversation_item_ROLE_e role; //enum
    list_t *content; //nonprimitive container
    char *call_id; // string
    char *name; // string
    char *arguments; // string
    char *output; // string

    int _library_owned; // Is the library responsible for freeing this object?
} realtime_conversation_item_t;

__attribute__((deprecated)) realtime_conversation_item_t *realtime_conversation_item_create(
    char *id,
    openai_api_realtime_conversation_item_TYPE_e type,
    openai_api_realtime_conversation_item_OBJECT_e object,
    openai_api_realtime_conversation_item_STATUS_e status,
    openai_api_realtime_conversation_item_ROLE_e role,
    list_t *content,
    char *call_id,
    char *name,
    char *arguments,
    char *output
);

void realtime_conversation_item_free(realtime_conversation_item_t *realtime_conversation_item);

realtime_conversation_item_t *realtime_conversation_item_parseFromJSON(cJSON *realtime_conversation_itemJSON);

cJSON *realtime_conversation_item_convertToJSON(realtime_conversation_item_t *realtime_conversation_item);

#endif /* _realtime_conversation_item_H_ */

