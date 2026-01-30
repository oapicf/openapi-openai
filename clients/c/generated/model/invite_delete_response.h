/*
 * invite_delete_response.h
 *
 * 
 */

#ifndef _invite_delete_response_H_
#define _invite_delete_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct invite_delete_response_t invite_delete_response_t;


// Enum OBJECT for invite_delete_response

typedef enum  { openai_api_invite_delete_response_OBJECT_NULL = 0, openai_api_invite_delete_response_OBJECT_organization.invite.deleted } openai_api_invite_delete_response_OBJECT_e;

char* invite_delete_response_object_ToString(openai_api_invite_delete_response_OBJECT_e object);

openai_api_invite_delete_response_OBJECT_e invite_delete_response_object_FromString(char* object);



typedef struct invite_delete_response_t {
    openai_api_invite_delete_response_OBJECT_e object; //enum
    char *id; // string
    int deleted; //boolean

    int _library_owned; // Is the library responsible for freeing this object?
} invite_delete_response_t;

__attribute__((deprecated)) invite_delete_response_t *invite_delete_response_create(
    openai_api_invite_delete_response_OBJECT_e object,
    char *id,
    int deleted
);

void invite_delete_response_free(invite_delete_response_t *invite_delete_response);

invite_delete_response_t *invite_delete_response_parseFromJSON(cJSON *invite_delete_responseJSON);

cJSON *invite_delete_response_convertToJSON(invite_delete_response_t *invite_delete_response);

#endif /* _invite_delete_response_H_ */

