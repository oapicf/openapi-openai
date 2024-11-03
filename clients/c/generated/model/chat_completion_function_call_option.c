#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "chat_completion_function_call_option.h"



chat_completion_function_call_option_t *chat_completion_function_call_option_create(
    char *name
    ) {
    chat_completion_function_call_option_t *chat_completion_function_call_option_local_var = malloc(sizeof(chat_completion_function_call_option_t));
    if (!chat_completion_function_call_option_local_var) {
        return NULL;
    }
    chat_completion_function_call_option_local_var->name = name;

    return chat_completion_function_call_option_local_var;
}


void chat_completion_function_call_option_free(chat_completion_function_call_option_t *chat_completion_function_call_option) {
    if(NULL == chat_completion_function_call_option){
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
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }


    chat_completion_function_call_option_local_var = chat_completion_function_call_option_create (
        strdup(name->valuestring)
        );

    return chat_completion_function_call_option_local_var;
end:
    return NULL;

}
