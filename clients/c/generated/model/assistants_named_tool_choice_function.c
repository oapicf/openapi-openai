#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "assistants_named_tool_choice_function.h"



static assistants_named_tool_choice_function_t *assistants_named_tool_choice_function_create_internal(
    char *name
    ) {
    assistants_named_tool_choice_function_t *assistants_named_tool_choice_function_local_var = malloc(sizeof(assistants_named_tool_choice_function_t));
    if (!assistants_named_tool_choice_function_local_var) {
        return NULL;
    }
    assistants_named_tool_choice_function_local_var->name = name;

    assistants_named_tool_choice_function_local_var->_library_owned = 1;
    return assistants_named_tool_choice_function_local_var;
}

__attribute__((deprecated)) assistants_named_tool_choice_function_t *assistants_named_tool_choice_function_create(
    char *name
    ) {
    return assistants_named_tool_choice_function_create_internal (
        name
        );
}

void assistants_named_tool_choice_function_free(assistants_named_tool_choice_function_t *assistants_named_tool_choice_function) {
    if(NULL == assistants_named_tool_choice_function){
        return ;
    }
    if(assistants_named_tool_choice_function->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "assistants_named_tool_choice_function_free");
        return ;
    }
    listEntry_t *listEntry;
    if (assistants_named_tool_choice_function->name) {
        free(assistants_named_tool_choice_function->name);
        assistants_named_tool_choice_function->name = NULL;
    }
    free(assistants_named_tool_choice_function);
}

cJSON *assistants_named_tool_choice_function_convertToJSON(assistants_named_tool_choice_function_t *assistants_named_tool_choice_function) {
    cJSON *item = cJSON_CreateObject();

    // assistants_named_tool_choice_function->name
    if (!assistants_named_tool_choice_function->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", assistants_named_tool_choice_function->name) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

assistants_named_tool_choice_function_t *assistants_named_tool_choice_function_parseFromJSON(cJSON *assistants_named_tool_choice_functionJSON){

    assistants_named_tool_choice_function_t *assistants_named_tool_choice_function_local_var = NULL;

    // assistants_named_tool_choice_function->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(assistants_named_tool_choice_functionJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }


    assistants_named_tool_choice_function_local_var = assistants_named_tool_choice_function_create_internal (
        strdup(name->valuestring)
        );

    return assistants_named_tool_choice_function_local_var;
end:
    return NULL;

}
