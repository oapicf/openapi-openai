/*
 * create_chat_completion_request_model.h
 *
 * ID of the model to use. See the [model endpoint compatibility](/docs/models#model-endpoint-compatibility) table for details on which models work with the Chat API.
 */

#ifndef _create_chat_completion_request_model_H_
#define _create_chat_completion_request_model_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_chat_completion_request_model_t create_chat_completion_request_model_t;




typedef struct create_chat_completion_request_model_t {

    int _library_owned; // Is the library responsible for freeing this object?
} create_chat_completion_request_model_t;

__attribute__((deprecated)) create_chat_completion_request_model_t *create_chat_completion_request_model_create(
);

void create_chat_completion_request_model_free(create_chat_completion_request_model_t *create_chat_completion_request_model);

create_chat_completion_request_model_t *create_chat_completion_request_model_parseFromJSON(cJSON *create_chat_completion_request_modelJSON);

cJSON *create_chat_completion_request_model_convertToJSON(create_chat_completion_request_model_t *create_chat_completion_request_model);

#endif /* _create_chat_completion_request_model_H_ */

