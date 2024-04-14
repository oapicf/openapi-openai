/*
 * assistant_file_object.h
 *
 * A list of [Files](/docs/api-reference/files) attached to an &#x60;assistant&#x60;.
 */

#ifndef _assistant_file_object_H_
#define _assistant_file_object_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct assistant_file_object_t assistant_file_object_t;


// Enum OBJECT for assistant_file_object

typedef enum  { openai_api_assistant_file_object_OBJECT_NULL = 0, openai_api_assistant_file_object_OBJECT_assistant.file } openai_api_assistant_file_object_OBJECT_e;

char* assistant_file_object_object_ToString(openai_api_assistant_file_object_OBJECT_e object);

openai_api_assistant_file_object_OBJECT_e assistant_file_object_object_FromString(char* object);



typedef struct assistant_file_object_t {
    char *id; // string
    openai_api_assistant_file_object_OBJECT_e object; //enum
    int created_at; //numeric
    char *assistant_id; // string

} assistant_file_object_t;

assistant_file_object_t *assistant_file_object_create(
    char *id,
    openai_api_assistant_file_object_OBJECT_e object,
    int created_at,
    char *assistant_id
);

void assistant_file_object_free(assistant_file_object_t *assistant_file_object);

assistant_file_object_t *assistant_file_object_parseFromJSON(cJSON *assistant_file_objectJSON);

cJSON *assistant_file_object_convertToJSON(assistant_file_object_t *assistant_file_object);

#endif /* _assistant_file_object_H_ */

