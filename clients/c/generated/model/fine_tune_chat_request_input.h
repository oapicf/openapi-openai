/*
 * fine_tune_chat_request_input.h
 *
 * The per-line training example of a fine-tuning input file for chat models using the supervised method.
 */

#ifndef _fine_tune_chat_request_input_H_
#define _fine_tune_chat_request_input_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct fine_tune_chat_request_input_t fine_tune_chat_request_input_t;

#include "chat_completion_functions.h"
#include "chat_completion_tool.h"
#include "fine_tune_chat_request_input_messages_inner.h"



typedef struct fine_tune_chat_request_input_t {
    list_t *messages; //nonprimitive container
    list_t *tools; //nonprimitive container
    int parallel_tool_calls; //boolean
    list_t *functions; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} fine_tune_chat_request_input_t;

__attribute__((deprecated)) fine_tune_chat_request_input_t *fine_tune_chat_request_input_create(
    list_t *messages,
    list_t *tools,
    int parallel_tool_calls,
    list_t *functions
);

void fine_tune_chat_request_input_free(fine_tune_chat_request_input_t *fine_tune_chat_request_input);

fine_tune_chat_request_input_t *fine_tune_chat_request_input_parseFromJSON(cJSON *fine_tune_chat_request_inputJSON);

cJSON *fine_tune_chat_request_input_convertToJSON(fine_tune_chat_request_input_t *fine_tune_chat_request_input);

#endif /* _fine_tune_chat_request_input_H_ */

