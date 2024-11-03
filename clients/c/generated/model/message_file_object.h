/*
 * message_file_object.h
 *
 * A list of files attached to a &#x60;message&#x60;.
 */

#ifndef _message_file_object_H_
#define _message_file_object_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct message_file_object_t message_file_object_t;


// Enum OBJECT for message_file_object

typedef enum  { openai_api_message_file_object_OBJECT_NULL = 0, openai_api_message_file_object_OBJECT_thread.message.file } openai_api_message_file_object_OBJECT_e;

char* message_file_object_object_ToString(openai_api_message_file_object_OBJECT_e object);

openai_api_message_file_object_OBJECT_e message_file_object_object_FromString(char* object);



typedef struct message_file_object_t {
    char *id; // string
    openai_api_message_file_object_OBJECT_e object; //enum
    int created_at; //numeric
    char *message_id; // string

} message_file_object_t;

message_file_object_t *message_file_object_create(
    char *id,
    openai_api_message_file_object_OBJECT_e object,
    int created_at,
    char *message_id
);

void message_file_object_free(message_file_object_t *message_file_object);

message_file_object_t *message_file_object_parseFromJSON(cJSON *message_file_objectJSON);

cJSON *message_file_object_convertToJSON(message_file_object_t *message_file_object);

#endif /* _message_file_object_H_ */

