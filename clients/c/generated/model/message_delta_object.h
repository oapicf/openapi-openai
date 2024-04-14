/*
 * message_delta_object.h
 *
 * Represents a message delta i.e. any changed fields on a message during streaming. 
 */

#ifndef _message_delta_object_H_
#define _message_delta_object_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct message_delta_object_t message_delta_object_t;

#include "message_delta_object_delta.h"

// Enum OBJECT for message_delta_object

typedef enum  { openai_api_message_delta_object_OBJECT_NULL = 0, openai_api_message_delta_object_OBJECT_thread.message.delta } openai_api_message_delta_object_OBJECT_e;

char* message_delta_object_object_ToString(openai_api_message_delta_object_OBJECT_e object);

openai_api_message_delta_object_OBJECT_e message_delta_object_object_FromString(char* object);



typedef struct message_delta_object_t {
    char *id; // string
    openai_api_message_delta_object_OBJECT_e object; //enum
    struct message_delta_object_delta_t *delta; //model

} message_delta_object_t;

message_delta_object_t *message_delta_object_create(
    char *id,
    openai_api_message_delta_object_OBJECT_e object,
    message_delta_object_delta_t *delta
);

void message_delta_object_free(message_delta_object_t *message_delta_object);

message_delta_object_t *message_delta_object_parseFromJSON(cJSON *message_delta_objectJSON);

cJSON *message_delta_object_convertToJSON(message_delta_object_t *message_delta_object);

#endif /* _message_delta_object_H_ */

