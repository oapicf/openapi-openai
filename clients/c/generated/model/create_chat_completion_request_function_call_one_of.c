#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_chat_completion_request_function_call_one_of.h"



create_chat_completion_request_function_call_one_of_t *create_chat_completion_request_function_call_one_of_create(
    char *name
    ) {
    create_chat_completion_request_function_call_one_of_t *create_chat_completion_request_function_call_one_of_local_var = malloc(sizeof(create_chat_completion_request_function_call_one_of_t));
    if (!create_chat_completion_request_function_call_one_of_local_var) {
        return NULL;
    }
    create_chat_completion_request_function_call_one_of_local_var->name = name;

    return create_chat_completion_request_function_call_one_of_local_var;
}


void create_chat_completion_request_function_call_one_of_free(create_chat_completion_request_function_call_one_of_t *create_chat_completion_request_function_call_one_of) {
    if(NULL == create_chat_completion_request_function_call_one_of){
        return ;
    }
    listEntry_t *listEntry;
    if (create_chat_completion_request_function_call_one_of->name) {
        free(create_chat_completion_request_function_call_one_of->name);
        create_chat_completion_request_function_call_one_of->name = NULL;
    }
    free(create_chat_completion_request_function_call_one_of);
}

cJSON *create_chat_completion_request_function_call_one_of_convertToJSON(create_chat_completion_request_function_call_one_of_t *create_chat_completion_request_function_call_one_of) {
    cJSON *item = cJSON_CreateObject();

    // create_chat_completion_request_function_call_one_of->name
    if (!create_chat_completion_request_function_call_one_of->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", create_chat_completion_request_function_call_one_of->name) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_chat_completion_request_function_call_one_of_t *create_chat_completion_request_function_call_one_of_parseFromJSON(cJSON *create_chat_completion_request_function_call_one_ofJSON){

    create_chat_completion_request_function_call_one_of_t *create_chat_completion_request_function_call_one_of_local_var = NULL;

    // create_chat_completion_request_function_call_one_of->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(create_chat_completion_request_function_call_one_ofJSON, "name");
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }


    create_chat_completion_request_function_call_one_of_local_var = create_chat_completion_request_function_call_one_of_create (
        strdup(name->valuestring)
        );

    return create_chat_completion_request_function_call_one_of_local_var;
end:
    return NULL;

}
