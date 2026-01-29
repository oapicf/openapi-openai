#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "run_step_details_tool_calls_code_output_image_object_image.h"



static run_step_details_tool_calls_code_output_image_object_image_t *run_step_details_tool_calls_code_output_image_object_image_create_internal(
    char *file_id
    ) {
    run_step_details_tool_calls_code_output_image_object_image_t *run_step_details_tool_calls_code_output_image_object_image_local_var = malloc(sizeof(run_step_details_tool_calls_code_output_image_object_image_t));
    if (!run_step_details_tool_calls_code_output_image_object_image_local_var) {
        return NULL;
    }
    run_step_details_tool_calls_code_output_image_object_image_local_var->file_id = file_id;

    run_step_details_tool_calls_code_output_image_object_image_local_var->_library_owned = 1;
    return run_step_details_tool_calls_code_output_image_object_image_local_var;
}

__attribute__((deprecated)) run_step_details_tool_calls_code_output_image_object_image_t *run_step_details_tool_calls_code_output_image_object_image_create(
    char *file_id
    ) {
    return run_step_details_tool_calls_code_output_image_object_image_create_internal (
        file_id
        );
}

void run_step_details_tool_calls_code_output_image_object_image_free(run_step_details_tool_calls_code_output_image_object_image_t *run_step_details_tool_calls_code_output_image_object_image) {
    if(NULL == run_step_details_tool_calls_code_output_image_object_image){
        return ;
    }
    if(run_step_details_tool_calls_code_output_image_object_image->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "run_step_details_tool_calls_code_output_image_object_image_free");
        return ;
    }
    listEntry_t *listEntry;
    if (run_step_details_tool_calls_code_output_image_object_image->file_id) {
        free(run_step_details_tool_calls_code_output_image_object_image->file_id);
        run_step_details_tool_calls_code_output_image_object_image->file_id = NULL;
    }
    free(run_step_details_tool_calls_code_output_image_object_image);
}

cJSON *run_step_details_tool_calls_code_output_image_object_image_convertToJSON(run_step_details_tool_calls_code_output_image_object_image_t *run_step_details_tool_calls_code_output_image_object_image) {
    cJSON *item = cJSON_CreateObject();

    // run_step_details_tool_calls_code_output_image_object_image->file_id
    if (!run_step_details_tool_calls_code_output_image_object_image->file_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "file_id", run_step_details_tool_calls_code_output_image_object_image->file_id) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

run_step_details_tool_calls_code_output_image_object_image_t *run_step_details_tool_calls_code_output_image_object_image_parseFromJSON(cJSON *run_step_details_tool_calls_code_output_image_object_imageJSON){

    run_step_details_tool_calls_code_output_image_object_image_t *run_step_details_tool_calls_code_output_image_object_image_local_var = NULL;

    // run_step_details_tool_calls_code_output_image_object_image->file_id
    cJSON *file_id = cJSON_GetObjectItemCaseSensitive(run_step_details_tool_calls_code_output_image_object_imageJSON, "file_id");
    if (cJSON_IsNull(file_id)) {
        file_id = NULL;
    }
    if (!file_id) {
        goto end;
    }

    
    if(!cJSON_IsString(file_id))
    {
    goto end; //String
    }


    run_step_details_tool_calls_code_output_image_object_image_local_var = run_step_details_tool_calls_code_output_image_object_image_create_internal (
        strdup(file_id->valuestring)
        );

    return run_step_details_tool_calls_code_output_image_object_image_local_var;
end:
    return NULL;

}
