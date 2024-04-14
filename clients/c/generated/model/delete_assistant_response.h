/*
 * delete_assistant_response.h
 *
 * 
 */

#ifndef _delete_assistant_response_H_
#define _delete_assistant_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct delete_assistant_response_t delete_assistant_response_t;


// Enum OBJECT for delete_assistant_response

typedef enum  { openai_api_delete_assistant_response_OBJECT_NULL = 0, openai_api_delete_assistant_response_OBJECT_assistant.deleted } openai_api_delete_assistant_response_OBJECT_e;

char* delete_assistant_response_object_ToString(openai_api_delete_assistant_response_OBJECT_e object);

openai_api_delete_assistant_response_OBJECT_e delete_assistant_response_object_FromString(char* object);



typedef struct delete_assistant_response_t {
    char *id; // string
    int deleted; //boolean
    openai_api_delete_assistant_response_OBJECT_e object; //enum

} delete_assistant_response_t;

delete_assistant_response_t *delete_assistant_response_create(
    char *id,
    int deleted,
    openai_api_delete_assistant_response_OBJECT_e object
);

void delete_assistant_response_free(delete_assistant_response_t *delete_assistant_response);

delete_assistant_response_t *delete_assistant_response_parseFromJSON(cJSON *delete_assistant_responseJSON);

cJSON *delete_assistant_response_convertToJSON(delete_assistant_response_t *delete_assistant_response);

#endif /* _delete_assistant_response_H_ */

