#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "chat_completion_named_tool_choice_function.h"



static chat_completion_named_tool_choice_function_t *chat_completion_named_tool_choice_function_create_internal(
    char *name
    ) {
    chat_completion_named_tool_choice_function_t *chat_completion_named_tool_choice_function_local_var = malloc(sizeof(chat_completion_named_tool_choice_function_t));
    if (!chat_completion_named_tool_choice_function_local_var) {
        return NULL;
    }
    chat_completion_named_tool_choice_function_local_var->name = name;

    chat_completion_named_tool_choice_function_local_var->_library_owned = 1;
    return chat_completion_named_tool_choice_function_local_var;
}

__attribute__((deprecated)) chat_completion_named_tool_choice_function_t *chat_completion_named_tool_choice_function_create(
    char *name
    ) {
    return chat_completion_named_tool_choice_function_create_internal (
        name
        );
}

void chat_completion_named_tool_choice_function_free(chat_completion_named_tool_choice_function_t *chat_completion_named_tool_choice_function) {
    if(NULL == chat_completion_named_tool_choice_function){
        return ;
    }
    if(chat_completion_named_tool_choice_function->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "chat_completion_named_tool_choice_function_free");
        return ;
    }
    listEntry_t *listEntry;
    if (chat_completion_named_tool_choice_function->name) {
        free(chat_completion_named_tool_choice_function->name);
        chat_completion_named_tool_choice_function->name = NULL;
    }
    free(chat_completion_named_tool_choice_function);
}

cJSON *chat_completion_named_tool_choice_function_convertToJSON(chat_completion_named_tool_choice_function_t *chat_completion_named_tool_choice_function) {
    cJSON *item = cJSON_CreateObject();

    // chat_completion_named_tool_choice_function->name
    if (!chat_completion_named_tool_choice_function->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", chat_completion_named_tool_choice_function->name) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

chat_completion_named_tool_choice_function_t *chat_completion_named_tool_choice_function_parseFromJSON(cJSON *chat_completion_named_tool_choice_functionJSON){

    chat_completion_named_tool_choice_function_t *chat_completion_named_tool_choice_function_local_var = NULL;

    // chat_completion_named_tool_choice_function->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(chat_completion_named_tool_choice_functionJSON, "name");
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


    chat_completion_named_tool_choice_function_local_var = chat_completion_named_tool_choice_function_create_internal (
        strdup(name->valuestring)
        );

    return chat_completion_named_tool_choice_function_local_var;
end:
    return NULL;

}
