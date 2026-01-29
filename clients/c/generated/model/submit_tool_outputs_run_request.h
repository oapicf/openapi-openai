/*
 * submit_tool_outputs_run_request.h
 *
 * 
 */

#ifndef _submit_tool_outputs_run_request_H_
#define _submit_tool_outputs_run_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct submit_tool_outputs_run_request_t submit_tool_outputs_run_request_t;

#include "submit_tool_outputs_run_request_tool_outputs_inner.h"



typedef struct submit_tool_outputs_run_request_t {
    list_t *tool_outputs; //nonprimitive container
    int stream; //boolean

    int _library_owned; // Is the library responsible for freeing this object?
} submit_tool_outputs_run_request_t;

__attribute__((deprecated)) submit_tool_outputs_run_request_t *submit_tool_outputs_run_request_create(
    list_t *tool_outputs,
    int stream
);

void submit_tool_outputs_run_request_free(submit_tool_outputs_run_request_t *submit_tool_outputs_run_request);

submit_tool_outputs_run_request_t *submit_tool_outputs_run_request_parseFromJSON(cJSON *submit_tool_outputs_run_requestJSON);

cJSON *submit_tool_outputs_run_request_convertToJSON(submit_tool_outputs_run_request_t *submit_tool_outputs_run_request);

#endif /* _submit_tool_outputs_run_request_H_ */

