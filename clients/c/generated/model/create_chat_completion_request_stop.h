/*
 * create_chat_completion_request_stop.h
 *
 * Up to 4 sequences where the API will stop generating further tokens. 
 */

#ifndef _create_chat_completion_request_stop_H_
#define _create_chat_completion_request_stop_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_chat_completion_request_stop_t create_chat_completion_request_stop_t;




typedef struct create_chat_completion_request_stop_t {

    int _library_owned; // Is the library responsible for freeing this object?
} create_chat_completion_request_stop_t;

__attribute__((deprecated)) create_chat_completion_request_stop_t *create_chat_completion_request_stop_create(
);

void create_chat_completion_request_stop_free(create_chat_completion_request_stop_t *create_chat_completion_request_stop);

create_chat_completion_request_stop_t *create_chat_completion_request_stop_parseFromJSON(cJSON *create_chat_completion_request_stopJSON);

cJSON *create_chat_completion_request_stop_convertToJSON(create_chat_completion_request_stop_t *create_chat_completion_request_stop);

#endif /* _create_chat_completion_request_stop_H_ */

