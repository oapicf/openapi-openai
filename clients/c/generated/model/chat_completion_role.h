/*
 * chat_completion_role.h
 *
 * The role of the author of a message
 */

#ifndef _chat_completion_role_H_
#define _chat_completion_role_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct chat_completion_role_t chat_completion_role_t;


// Enum  for chat_completion_role

typedef enum { openai_api_chat_completion_role__NULL = 0, openai_api_chat_completion_role__system, openai_api_chat_completion_role__user, openai_api_chat_completion_role__assistant, openai_api_chat_completion_role__tool, openai_api_chat_completion_role__function } openai_api_chat_completion_role__e;

char* chat_completion_role_chat_completion_role_ToString(openai_api_chat_completion_role__e chat_completion_role);

openai_api_chat_completion_role__e chat_completion_role_chat_completion_role_FromString(char* chat_completion_role);

//cJSON *chat_completion_role_chat_completion_role_convertToJSON(openai_api_chat_completion_role__e chat_completion_role);

//openai_api_chat_completion_role__e chat_completion_role_chat_completion_role_parseFromJSON(cJSON *chat_completion_roleJSON);

#endif /* _chat_completion_role_H_ */

