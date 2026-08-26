#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_chat_completion_request_function_call.h"



static create_chat_completion_request_function_call_t *create_chat_completion_request_function_call_create_internal(
    char *name
    ) {
    create_chat_completion_request_function_call_t *create_chat_completion_request_function_call_local_var = malloc(sizeof(create_chat_completion_request_function_call_t));
    if (!create_chat_completion_request_function_call_local_var) {
        return NULL;
    }
    memset(create_chat_completion_request_function_call_local_var, 0, sizeof(create_chat_completion_request_function_call_t));
    create_chat_completion_request_function_call_local_var->_library_owned = 1;
    create_chat_completion_request_function_call_local_var->name = name;
    return create_chat_completion_request_function_call_local_var;
}

__attribute__((deprecated)) create_chat_completion_request_function_call_t *create_chat_completion_request_function_call_create(
    char *name
    ) {
    create_chat_completion_request_function_call_t *result = create_chat_completion_request_function_call_create_internal (
        name
        );
    if (!result) {
    }
    return result;
}

void create_chat_completion_request_function_call_free(create_chat_completion_request_function_call_t *create_chat_completion_request_function_call) {
    if(NULL == create_chat_completion_request_function_call){
        return ;
    }
    if(create_chat_completion_request_function_call->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "create_chat_completion_request_function_call_free");
        return ;
    }
    listEntry_t *listEntry;
    if (create_chat_completion_request_function_call->name) {
        free(create_chat_completion_request_function_call->name);
        create_chat_completion_request_function_call->name = NULL;
    }
    free(create_chat_completion_request_function_call);
}

cJSON *create_chat_completion_request_function_call_convertToJSON(create_chat_completion_request_function_call_t *create_chat_completion_request_function_call) {
    cJSON *item = cJSON_CreateObject();

    // create_chat_completion_request_function_call->name
    if (!create_chat_completion_request_function_call->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", create_chat_completion_request_function_call->name) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_chat_completion_request_function_call_t *create_chat_completion_request_function_call_parseFromJSON(cJSON *create_chat_completion_request_function_callJSON){

    create_chat_completion_request_function_call_t *create_chat_completion_request_function_call_local_var = NULL;

    char *name_local_str = NULL;

    // create_chat_completion_request_function_call->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(create_chat_completion_request_function_callJSON, "name");
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


    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);

    create_chat_completion_request_function_call_local_var = create_chat_completion_request_function_call_create_internal (
        name_local_str
        );

    if (!create_chat_completion_request_function_call_local_var) {
        goto end;
    }

    return create_chat_completion_request_function_call_local_var;
end:
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    return NULL;

}
