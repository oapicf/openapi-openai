/*
 * run_step_delta_step_details_tool_calls_code_output_image_object.h
 *
 * 
 */

#ifndef _run_step_delta_step_details_tool_calls_code_output_image_object_H_
#define _run_step_delta_step_details_tool_calls_code_output_image_object_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct run_step_delta_step_details_tool_calls_code_output_image_object_t run_step_delta_step_details_tool_calls_code_output_image_object_t;

#include "run_step_delta_step_details_tool_calls_code_output_image_object_image.h"

// Enum TYPE for run_step_delta_step_details_tool_calls_code_output_image_object

typedef enum  { openai_api_run_step_delta_step_details_tool_calls_code_output_image_object_TYPE_NULL = 0, openai_api_run_step_delta_step_details_tool_calls_code_output_image_object_TYPE_image } openai_api_run_step_delta_step_details_tool_calls_code_output_image_object_TYPE_e;

char* run_step_delta_step_details_tool_calls_code_output_image_object_type_ToString(openai_api_run_step_delta_step_details_tool_calls_code_output_image_object_TYPE_e type);

openai_api_run_step_delta_step_details_tool_calls_code_output_image_object_TYPE_e run_step_delta_step_details_tool_calls_code_output_image_object_type_FromString(char* type);



typedef struct run_step_delta_step_details_tool_calls_code_output_image_object_t {
    int index; //numeric
    openai_api_run_step_delta_step_details_tool_calls_code_output_image_object_TYPE_e type; //enum
    struct run_step_delta_step_details_tool_calls_code_output_image_object_image_t *image; //model

} run_step_delta_step_details_tool_calls_code_output_image_object_t;

run_step_delta_step_details_tool_calls_code_output_image_object_t *run_step_delta_step_details_tool_calls_code_output_image_object_create(
    int index,
    openai_api_run_step_delta_step_details_tool_calls_code_output_image_object_TYPE_e type,
    run_step_delta_step_details_tool_calls_code_output_image_object_image_t *image
);

void run_step_delta_step_details_tool_calls_code_output_image_object_free(run_step_delta_step_details_tool_calls_code_output_image_object_t *run_step_delta_step_details_tool_calls_code_output_image_object);

run_step_delta_step_details_tool_calls_code_output_image_object_t *run_step_delta_step_details_tool_calls_code_output_image_object_parseFromJSON(cJSON *run_step_delta_step_details_tool_calls_code_output_image_objectJSON);

cJSON *run_step_delta_step_details_tool_calls_code_output_image_object_convertToJSON(run_step_delta_step_details_tool_calls_code_output_image_object_t *run_step_delta_step_details_tool_calls_code_output_image_object);

#endif /* _run_step_delta_step_details_tool_calls_code_output_image_object_H_ */
