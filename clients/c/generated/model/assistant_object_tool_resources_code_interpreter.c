#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "assistant_object_tool_resources_code_interpreter.h"



static assistant_object_tool_resources_code_interpreter_t *assistant_object_tool_resources_code_interpreter_create_internal(
    list_t *file_ids
    ) {
    assistant_object_tool_resources_code_interpreter_t *assistant_object_tool_resources_code_interpreter_local_var = malloc(sizeof(assistant_object_tool_resources_code_interpreter_t));
    if (!assistant_object_tool_resources_code_interpreter_local_var) {
        return NULL;
    }
    assistant_object_tool_resources_code_interpreter_local_var->file_ids = file_ids;

    assistant_object_tool_resources_code_interpreter_local_var->_library_owned = 1;
    return assistant_object_tool_resources_code_interpreter_local_var;
}

__attribute__((deprecated)) assistant_object_tool_resources_code_interpreter_t *assistant_object_tool_resources_code_interpreter_create(
    list_t *file_ids
    ) {
    return assistant_object_tool_resources_code_interpreter_create_internal (
        file_ids
        );
}

void assistant_object_tool_resources_code_interpreter_free(assistant_object_tool_resources_code_interpreter_t *assistant_object_tool_resources_code_interpreter) {
    if(NULL == assistant_object_tool_resources_code_interpreter){
        return ;
    }
    if(assistant_object_tool_resources_code_interpreter->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "assistant_object_tool_resources_code_interpreter_free");
        return ;
    }
    listEntry_t *listEntry;
    if (assistant_object_tool_resources_code_interpreter->file_ids) {
        list_ForEach(listEntry, assistant_object_tool_resources_code_interpreter->file_ids) {
            free(listEntry->data);
        }
        list_freeList(assistant_object_tool_resources_code_interpreter->file_ids);
        assistant_object_tool_resources_code_interpreter->file_ids = NULL;
    }
    free(assistant_object_tool_resources_code_interpreter);
}

cJSON *assistant_object_tool_resources_code_interpreter_convertToJSON(assistant_object_tool_resources_code_interpreter_t *assistant_object_tool_resources_code_interpreter) {
    cJSON *item = cJSON_CreateObject();

    // assistant_object_tool_resources_code_interpreter->file_ids
    if(assistant_object_tool_resources_code_interpreter->file_ids) {
    cJSON *file_ids = cJSON_AddArrayToObject(item, "file_ids");
    if(file_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *file_idsListEntry;
    list_ForEach(file_idsListEntry, assistant_object_tool_resources_code_interpreter->file_ids) {
    if(cJSON_AddStringToObject(file_ids, "", file_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

assistant_object_tool_resources_code_interpreter_t *assistant_object_tool_resources_code_interpreter_parseFromJSON(cJSON *assistant_object_tool_resources_code_interpreterJSON){

    assistant_object_tool_resources_code_interpreter_t *assistant_object_tool_resources_code_interpreter_local_var = NULL;

    // define the local list for assistant_object_tool_resources_code_interpreter->file_ids
    list_t *file_idsList = NULL;

    // assistant_object_tool_resources_code_interpreter->file_ids
    cJSON *file_ids = cJSON_GetObjectItemCaseSensitive(assistant_object_tool_resources_code_interpreterJSON, "file_ids");
    if (cJSON_IsNull(file_ids)) {
        file_ids = NULL;
    }
    if (file_ids) { 
    cJSON *file_ids_local = NULL;
    if(!cJSON_IsArray(file_ids)) {
        goto end;//primitive container
    }
    file_idsList = list_createList();

    cJSON_ArrayForEach(file_ids_local, file_ids)
    {
        if(!cJSON_IsString(file_ids_local))
        {
            goto end;
        }
        list_addElement(file_idsList , strdup(file_ids_local->valuestring));
    }
    }


    assistant_object_tool_resources_code_interpreter_local_var = assistant_object_tool_resources_code_interpreter_create_internal (
        file_ids ? file_idsList : NULL
        );

    return assistant_object_tool_resources_code_interpreter_local_var;
end:
    if (file_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, file_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(file_idsList);
        file_idsList = NULL;
    }
    return NULL;

}
