/*
 * fine_tune_preference_request_input_input.h
 *
 * 
 */

#ifndef _fine_tune_preference_request_input_input_H_
#define _fine_tune_preference_request_input_input_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct fine_tune_preference_request_input_input_t fine_tune_preference_request_input_input_t;

#include "chat_completion_tool.h"
#include "fine_tune_chat_request_input_messages_inner.h"



typedef struct fine_tune_preference_request_input_input_t {
    list_t *messages; //nonprimitive container
    list_t *tools; //nonprimitive container
    int parallel_tool_calls; //boolean

    int _library_owned; // Is the library responsible for freeing this object?
} fine_tune_preference_request_input_input_t;

__attribute__((deprecated)) fine_tune_preference_request_input_input_t *fine_tune_preference_request_input_input_create(
    list_t *messages,
    list_t *tools,
    int parallel_tool_calls
);

void fine_tune_preference_request_input_input_free(fine_tune_preference_request_input_input_t *fine_tune_preference_request_input_input);

fine_tune_preference_request_input_input_t *fine_tune_preference_request_input_input_parseFromJSON(cJSON *fine_tune_preference_request_input_inputJSON);

cJSON *fine_tune_preference_request_input_input_convertToJSON(fine_tune_preference_request_input_input_t *fine_tune_preference_request_input_input);

#endif /* _fine_tune_preference_request_input_input_H_ */

