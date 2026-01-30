#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_thread_request_tool_resources.h"



static create_thread_request_tool_resources_t *create_thread_request_tool_resources_create_internal(
    create_assistant_request_tool_resources_code_interpreter_t *code_interpreter,
    create_thread_request_tool_resources_file_search_t *file_search
    ) {
    create_thread_request_tool_resources_t *create_thread_request_tool_resources_local_var = malloc(sizeof(create_thread_request_tool_resources_t));
    if (!create_thread_request_tool_resources_local_var) {
        return NULL;
    }
    create_thread_request_tool_resources_local_var->code_interpreter = code_interpreter;
    create_thread_request_tool_resources_local_var->file_search = file_search;

    create_thread_request_tool_resources_local_var->_library_owned = 1;
    return create_thread_request_tool_resources_local_var;
}

__attribute__((deprecated)) create_thread_request_tool_resources_t *create_thread_request_tool_resources_create(
    create_assistant_request_tool_resources_code_interpreter_t *code_interpreter,
    create_thread_request_tool_resources_file_search_t *file_search
    ) {
    return create_thread_request_tool_resources_create_internal (
        code_interpreter,
        file_search
        );
}

void create_thread_request_tool_resources_free(create_thread_request_tool_resources_t *create_thread_request_tool_resources) {
    if(NULL == create_thread_request_tool_resources){
        return ;
    }
    if(create_thread_request_tool_resources->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "create_thread_request_tool_resources_free");
        return ;
    }
    listEntry_t *listEntry;
    if (create_thread_request_tool_resources->code_interpreter) {
        create_assistant_request_tool_resources_code_interpreter_free(create_thread_request_tool_resources->code_interpreter);
        create_thread_request_tool_resources->code_interpreter = NULL;
    }
    if (create_thread_request_tool_resources->file_search) {
        create_thread_request_tool_resources_file_search_free(create_thread_request_tool_resources->file_search);
        create_thread_request_tool_resources->file_search = NULL;
    }
    free(create_thread_request_tool_resources);
}

cJSON *create_thread_request_tool_resources_convertToJSON(create_thread_request_tool_resources_t *create_thread_request_tool_resources) {
    cJSON *item = cJSON_CreateObject();

    // create_thread_request_tool_resources->code_interpreter
    if(create_thread_request_tool_resources->code_interpreter) {
    cJSON *code_interpreter_local_JSON = create_assistant_request_tool_resources_code_interpreter_convertToJSON(create_thread_request_tool_resources->code_interpreter);
    if(code_interpreter_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "code_interpreter", code_interpreter_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // create_thread_request_tool_resources->file_search
    if(create_thread_request_tool_resources->file_search) {
    cJSON *file_search_local_JSON = create_thread_request_tool_resources_file_search_convertToJSON(create_thread_request_tool_resources->file_search);
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

create_thread_request_tool_resources_t *create_thread_request_tool_resources_parseFromJSON(cJSON *create_thread_request_tool_resourcesJSON){

    create_thread_request_tool_resources_t *create_thread_request_tool_resources_local_var = NULL;

    // define the local variable for create_thread_request_tool_resources->code_interpreter
    create_assistant_request_tool_resources_code_interpreter_t *code_interpreter_local_nonprim = NULL;

    // define the local variable for create_thread_request_tool_resources->file_search
    create_thread_request_tool_resources_file_search_t *file_search_local_nonprim = NULL;

    // create_thread_request_tool_resources->code_interpreter
    cJSON *code_interpreter = cJSON_GetObjectItemCaseSensitive(create_thread_request_tool_resourcesJSON, "code_interpreter");
    if (cJSON_IsNull(code_interpreter)) {
        code_interpreter = NULL;
    }
    if (code_interpreter) { 
    code_interpreter_local_nonprim = create_assistant_request_tool_resources_code_interpreter_parseFromJSON(code_interpreter); //nonprimitive
    }

    // create_thread_request_tool_resources->file_search
    cJSON *file_search = cJSON_GetObjectItemCaseSensitive(create_thread_request_tool_resourcesJSON, "file_search");
    if (cJSON_IsNull(file_search)) {
        file_search = NULL;
    }
    if (file_search) { 
    file_search_local_nonprim = create_thread_request_tool_resources_file_search_parseFromJSON(file_search); //nonprimitive
    }


    create_thread_request_tool_resources_local_var = create_thread_request_tool_resources_create_internal (
        code_interpreter ? code_interpreter_local_nonprim : NULL,
        file_search ? file_search_local_nonprim : NULL
        );

    return create_thread_request_tool_resources_local_var;
end:
    if (code_interpreter_local_nonprim) {
        create_assistant_request_tool_resources_code_interpreter_free(code_interpreter_local_nonprim);
        code_interpreter_local_nonprim = NULL;
    }
    if (file_search_local_nonprim) {
        create_thread_request_tool_resources_file_search_free(file_search_local_nonprim);
        file_search_local_nonprim = NULL;
    }
    return NULL;

}
