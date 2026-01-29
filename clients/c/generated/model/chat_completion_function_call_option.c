#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "chat_completion_function_call_option.h"



static chat_completion_function_call_option_t *chat_completion_function_call_option_create_internal(
    char *name
    ) {
    chat_completion_function_call_option_t *chat_completion_function_call_option_local_var = malloc(sizeof(chat_completion_function_call_option_t));
    if (!chat_completion_function_call_option_local_var) {
        return NULL;
    }
    chat_completion_function_call_option_local_var->name = name;

    chat_completion_function_call_option_local_var->_library_owned = 1;
    return chat_completion_function_call_option_local_var;
}

__attribute__((deprecated)) chat_completion_function_call_option_t *chat_completion_function_call_option_create(
    char *name
    ) {
    return chat_completion_function_call_option_create_internal (
        name
        );
}

void chat_completion_function_call_option_free(chat_completion_function_call_option_t *chat_completion_function_call_option) {
    if(NULL == chat_completion_function_call_option){
        return ;
    }
    if(chat_completion_function_call_option->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "chat_completion_function_call_option_free");
        return ;
    }
    listEntry_t *listEntry;
    if (chat_completion_function_call_option->name) {
        free(chat_completion_function_call_option->name);
        chat_completion_function_call_option->name = NULL;
    }
    free(chat_completion_function_call_option);
}

cJSON *chat_completion_function_call_option_convertToJSON(chat_completion_function_call_option_t *chat_completion_function_call_option) {
    cJSON *item = cJSON_CreateObject();

    // chat_completion_function_call_option->name
    if (!chat_completion_function_call_option->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", chat_completion_function_call_option->name) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

chat_completion_function_call_option_t *chat_completion_function_call_option_parseFromJSON(cJSON *chat_completion_function_call_optionJSON){

    chat_completion_function_call_option_t *chat_completion_function_call_option_local_var = NULL;

    // chat_completion_function_call_option->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(chat_completion_function_call_optionJSON, "name");
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


    chat_completion_function_call_option_local_var = chat_completion_function_call_option_create_internal (
        strdup(name->valuestring)
        );

    return chat_completion_function_call_option_local_var;
end:
    return NULL;

}
