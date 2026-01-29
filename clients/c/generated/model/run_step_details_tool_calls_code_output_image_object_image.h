/*
 * run_step_details_tool_calls_code_output_image_object_image.h
 *
 * 
 */

#ifndef _run_step_details_tool_calls_code_output_image_object_image_H_
#define _run_step_details_tool_calls_code_output_image_object_image_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct run_step_details_tool_calls_code_output_image_object_image_t run_step_details_tool_calls_code_output_image_object_image_t;




typedef struct run_step_details_tool_calls_code_output_image_object_image_t {
    char *file_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} run_step_details_tool_calls_code_output_image_object_image_t;

__attribute__((deprecated)) run_step_details_tool_calls_code_output_image_object_image_t *run_step_details_tool_calls_code_output_image_object_image_create(
    char *file_id
);

void run_step_details_tool_calls_code_output_image_object_image_free(run_step_details_tool_calls_code_output_image_object_image_t *run_step_details_tool_calls_code_output_image_object_image);

run_step_details_tool_calls_code_output_image_object_image_t *run_step_details_tool_calls_code_output_image_object_image_parseFromJSON(cJSON *run_step_details_tool_calls_code_output_image_object_imageJSON);

cJSON *run_step_details_tool_calls_code_output_image_object_image_convertToJSON(run_step_details_tool_calls_code_output_image_object_image_t *run_step_details_tool_calls_code_output_image_object_image);

#endif /* _run_step_details_tool_calls_code_output_image_object_image_H_ */

