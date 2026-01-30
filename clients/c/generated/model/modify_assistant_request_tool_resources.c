#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "modify_assistant_request_tool_resources.h"



static modify_assistant_request_tool_resources_t *modify_assistant_request_tool_resources_create_internal(
    modify_assistant_request_tool_resources_code_interpreter_t *code_interpreter,
    modify_assistant_request_tool_resources_file_search_t *file_search
    ) {
    modify_assistant_request_tool_resources_t *modify_assistant_request_tool_resources_local_var = malloc(sizeof(modify_assistant_request_tool_resources_t));
    if (!modify_assistant_request_tool_resources_local_var) {
        return NULL;
    }
    modify_assistant_request_tool_resources_local_var->code_interpreter = code_interpreter;
    modify_assistant_request_tool_resources_local_var->file_search = file_search;

    modify_assistant_request_tool_resources_local_var->_library_owned = 1;
    return modify_assistant_request_tool_resources_local_var;
}

__attribute__((deprecated)) modify_assistant_request_tool_resources_t *modify_assistant_request_tool_resources_create(
    modify_assistant_request_tool_resources_code_interpreter_t *code_interpreter,
    modify_assistant_request_tool_resources_file_search_t *file_search
    ) {
    return modify_assistant_request_tool_resources_create_internal (
        code_interpreter,
        file_search
        );
}

void modify_assistant_request_tool_resources_free(modify_assistant_request_tool_resources_t *modify_assistant_request_tool_resources) {
    if(NULL == modify_assistant_request_tool_resources){
        return ;
    }
    if(modify_assistant_request_tool_resources->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "modify_assistant_request_tool_resources_free");
        return ;
    }
    listEntry_t *listEntry;
    if (modify_assistant_request_tool_resources->code_interpreter) {
        modify_assistant_request_tool_resources_code_interpreter_free(modify_assistant_request_tool_resources->code_interpreter);
        modify_assistant_request_tool_resources->code_interpreter = NULL;
    }
    if (modify_assistant_request_tool_resources->file_search) {
        modify_assistant_request_tool_resources_file_search_free(modify_assistant_request_tool_resources->file_search);
        modify_assistant_request_tool_resources->file_search = NULL;
    }
    free(modify_assistant_request_tool_resources);
}

cJSON *modify_assistant_request_tool_resources_convertToJSON(modify_assistant_request_tool_resources_t *modify_assistant_request_tool_resources) {
    cJSON *item = cJSON_CreateObject();

    // modify_assistant_request_tool_resources->code_interpreter
    if(modify_assistant_request_tool_resources->code_interpreter) {
    cJSON *code_interpreter_local_JSON = modify_assistant_request_tool_resources_code_interpreter_convertToJSON(modify_assistant_request_tool_resources->code_interpreter);
    if(code_interpreter_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "code_interpreter", code_interpreter_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // modify_assistant_request_tool_resources->file_search
    if(modify_assistant_request_tool_resources->file_search) {
    cJSON *file_search_local_JSON = modify_assistant_request_tool_resources_file_search_convertToJSON(modify_assistant_request_tool_resources->file_search);
    if(file_search_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "file_search", file_search_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

modify_assistant_request_tool_resources_t *modify_assistant_request_tool_resources_parseFromJSON(cJSON *modify_assistant_request_tool_resourcesJSON){

    modify_assistant_request_tool_resources_t *modify_assistant_request_tool_resources_local_var = NULL;

    // define the local variable for modify_assistant_request_tool_resources->code_interpreter
    modify_assistant_request_tool_resources_code_interpreter_t *code_interpreter_local_nonprim = NULL;

    // define the local variable for modify_assistant_request_tool_resources->file_search
    modify_assistant_request_tool_resources_file_search_t *file_search_local_nonprim = NULL;

    // modify_assistant_request_tool_resources->code_interpreter
    cJSON *code_interpreter = cJSON_GetObjectItemCaseSensitive(modify_assistant_request_tool_resourcesJSON, "code_interpreter");
    if (cJSON_IsNull(code_interpreter)) {
        code_interpreter = NULL;
    }
    if (code_interpreter) { 
    code_interpreter_local_nonprim = modify_assistant_request_tool_resources_code_interpreter_parseFromJSON(code_interpreter); //nonprimitive
    }

    // modify_assistant_request_tool_resources->file_search
    cJSON *file_search = cJSON_GetObjectItemCaseSensitive(modify_assistant_request_tool_resourcesJSON, "file_search");
    if (cJSON_IsNull(file_search)) {
        file_search = NULL;
    }
    if (file_search) { 
    file_search_local_nonprim = modify_assistant_request_tool_resources_file_search_parseFromJSON(file_search); //nonprimitive
    }


    modify_assistant_request_tool_resources_local_var = modify_assistant_request_tool_resources_create_internal (
        code_interpreter ? code_interpreter_local_nonprim : NULL,
        file_search ? file_search_local_nonprim : NULL
        );

    return modify_assistant_request_tool_resources_local_var;
end:
    if (code_interpreter_local_nonprim) {
        modify_assistant_request_tool_resources_code_interpreter_free(code_interpreter_local_nonprim);
        code_interpreter_local_nonprim = NULL;
    }
    if (file_search_local_nonprim) {
        modify_assistant_request_tool_resources_file_search_free(file_search_local_nonprim);
        file_search_local_nonprim = NULL;
    }
    return NULL;

}
