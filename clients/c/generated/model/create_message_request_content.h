/*
 * create_message_request_content.h
 *
 * 
 */

#ifndef _create_message_request_content_H_
#define _create_message_request_content_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_message_request_content_t create_message_request_content_t;

#include "array_of_content_parts_inner.h"



typedef struct create_message_request_content_t {

    int _library_owned; // Is the library responsible for freeing this object?
} create_message_request_content_t;

__attribute__((deprecated)) create_message_request_content_t *create_message_request_content_create(
);

void create_message_request_content_free(create_message_request_content_t *create_message_request_content);

create_message_request_content_t *create_message_request_content_parseFromJSON(cJSON *create_message_request_contentJSON);

cJSON *create_message_request_content_convertToJSON(create_message_request_content_t *create_message_request_content);

#endif /* _create_message_request_content_H_ */

