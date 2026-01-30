/*
 * create_message_request_attachments_inner.h
 *
 * 
 */

#ifndef _create_message_request_attachments_inner_H_
#define _create_message_request_attachments_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_message_request_attachments_inner_t create_message_request_attachments_inner_t;

#include "create_message_request_attachments_inner_tools_inner.h"



typedef struct create_message_request_attachments_inner_t {
    char *file_id; // string
    list_t *tools; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} create_message_request_attachments_inner_t;

__attribute__((deprecated)) create_message_request_attachments_inner_t *create_message_request_attachments_inner_create(
    char *file_id,
    list_t *tools
);

void create_message_request_attachments_inner_free(create_message_request_attachments_inner_t *create_message_request_attachments_inner);

create_message_request_attachments_inner_t *create_message_request_attachments_inner_parseFromJSON(cJSON *create_message_request_attachments_innerJSON);

cJSON *create_message_request_attachments_inner_convertToJSON(create_message_request_attachments_inner_t *create_message_request_attachments_inner);

#endif /* _create_message_request_attachments_inner_H_ */

