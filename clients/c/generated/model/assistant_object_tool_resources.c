#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "assistant_object_tool_resources.h"



static assistant_object_tool_resources_t *assistant_object_tool_resources_create_internal(
    assistant_object_tool_resources_code_interpreter_t *code_interpreter,
    assistant_object_tool_resources_file_search_t *file_search
    ) {
    assistant_object_tool_resources_t *assistant_object_tool_resources_local_var = malloc(sizeof(assistant_object_tool_resources_t));
    if (!assistant_object_tool_resources_local_var) {
        return NULL;
    }
    assistant_object_tool_resources_local_var->code_interpreter = code_interpreter;
    assistant_object_tool_resources_local_var->file_search = file_search;

    assistant_object_tool_resources_local_var->_library_owned = 1;
    return assistant_object_tool_resources_local_var;
}

__attribute__((deprecated)) assistant_object_tool_resources_t *assistant_object_tool_resources_create(
    assistant_object_tool_resources_code_interpreter_t *code_interpreter,
    assistant_object_tool_resources_file_search_t *file_search
    ) {
    return assistant_object_tool_resources_create_internal (
        code_interpreter,
        file_search
        );
}

void assistant_object_tool_resources_free(assistant_object_tool_resources_t *assistant_object_tool_resources) {
    if(NULL == assistant_object_tool_resources){
        return ;
    }
    if(assistant_object_tool_resources->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "assistant_object_tool_resources_free");
        return ;
    }
    listEntry_t *listEntry;
    if (assistant_object_tool_resources->code_interpreter) {
        assistant_object_tool_resources_code_interpreter_free(assistant_object_tool_resources->code_interpreter);
        assistant_object_tool_resources->code_interpreter = NULL;
    }
    if (assistant_object_tool_resources->file_search) {
        assistant_object_tool_resources_file_search_free(assistant_object_tool_resources->file_search);
        assistant_object_tool_resources->file_search = NULL;
    }
    free(assistant_object_tool_resources);
}

cJSON *assistant_object_tool_resources_convertToJSON(assistant_object_tool_resources_t *assistant_object_tool_resources) {
    cJSON *item = cJSON_CreateObject();

    // assistant_object_tool_resources->code_interpreter
    if(assistant_object_tool_resources->code_interpreter) {
    cJSON *code_interpreter_local_JSON = assistant_object_tool_resources_code_interpreter_convertToJSON(assistant_object_tool_resources->code_interpreter);
    if(code_interpreter_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "code_interpreter", code_interpreter_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // assistant_object_tool_resources->file_search
    if(assistant_object_tool_resources->file_search) {
    cJSON *file_search_local_JSON = assistant_object_tool_resources_file_search_convertToJSON(assistant_object_tool_resources->file_search);
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

assistant_object_tool_resources_t *assistant_object_tool_resources_parseFromJSON(cJSON *assistant_object_tool_resourcesJSON){

    assistant_object_tool_resources_t *assistant_object_tool_resources_local_var = NULL;

    // define the local variable for assistant_object_tool_resources->code_interpreter
    assistant_object_tool_resources_code_interpreter_t *code_interpreter_local_nonprim = NULL;

    // define the local variable for assistant_object_tool_resources->file_search
    assistant_object_tool_resources_file_search_t *file_search_local_nonprim = NULL;

    // assistant_object_tool_resources->code_interpreter
    cJSON *code_interpreter = cJSON_GetObjectItemCaseSensitive(assistant_object_tool_resourcesJSON, "code_interpreter");
    if (cJSON_IsNull(code_interpreter)) {
        code_interpreter = NULL;
    }
    if (code_interpreter) { 
    code_interpreter_local_nonprim = assistant_object_tool_resources_code_interpreter_parseFromJSON(code_interpreter); //nonprimitive
    }

    // assistant_object_tool_resources->file_search
    cJSON *file_search = cJSON_GetObjectItemCaseSensitive(assistant_object_tool_resourcesJSON, "file_search");
    if (cJSON_IsNull(file_search)) {
        file_search = NULL;
    }
    if (file_search) { 
    file_search_local_nonprim = assistant_object_tool_resources_file_search_parseFromJSON(file_search); //nonprimitive
    }


    assistant_object_tool_resources_local_var = assistant_object_tool_resources_create_internal (
        code_interpreter ? code_interpreter_local_nonprim : NULL,
        file_search ? file_search_local_nonprim : NULL
        );

    return assistant_object_tool_resources_local_var;
end:
    if (code_interpreter_local_nonprim) {
        assistant_object_tool_resources_code_interpreter_free(code_interpreter_local_nonprim);
        code_interpreter_local_nonprim = NULL;
    }
    if (file_search_local_nonprim) {
        assistant_object_tool_resources_file_search_free(file_search_local_nonprim);
        file_search_local_nonprim = NULL;
    }
    return NULL;

}
