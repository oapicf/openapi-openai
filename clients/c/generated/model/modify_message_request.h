/*
 * modify_message_request.h
 *
 * 
 */

#ifndef _modify_message_request_H_
#define _modify_message_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct modify_message_request_t modify_message_request_t;

#include "object.h"



typedef struct modify_message_request_t {
    object_t *metadata; //object

} modify_message_request_t;

modify_message_request_t *modify_message_request_create(
    object_t *metadata
);

void modify_message_request_free(modify_message_request_t *modify_message_request);

modify_message_request_t *modify_message_request_parseFromJSON(cJSON *modify_message_requestJSON);

cJSON *modify_message_request_convertToJSON(modify_message_request_t *modify_message_request);

#endif /* _modify_message_request_H_ */

