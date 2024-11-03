#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "chat_completion_request_user_message.h"


char* chat_completion_request_user_message_role_ToString(openai_api_chat_completion_request_user_message_ROLE_e role) {
    char* roleArray[] =  { "NULL", "user" };
    return roleArray[role];
}

openai_api_chat_completion_request_user_message_ROLE_e chat_completion_request_user_message_role_FromString(char* role){
    int stringToReturn = 0;
    char *roleArray[] =  { "NULL", "user" };
    size_t sizeofArray = sizeof(roleArray) / sizeof(roleArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(role, roleArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

chat_completion_request_user_message_t *chat_completion_request_user_message_create(
    chat_completion_request_user_message_content_t *content,
    openai_api_chat_completion_request_user_message_ROLE_e role,
    char *name
    ) {
    chat_completion_request_user_message_t *chat_completion_request_user_message_local_var = malloc(sizeof(chat_completion_request_user_message_t));
    if (!chat_completion_request_user_message_local_var) {
        return NULL;
    }
    chat_completion_request_user_message_local_var->content = content;
    chat_completion_request_user_message_local_var->role = role;
    chat_completion_request_user_message_local_var->name = name;

    return chat_completion_request_user_message_local_var;
}


void chat_completion_request_user_message_free(chat_completion_request_user_message_t *chat_completion_request_user_message) {
    if(NULL == chat_completion_request_user_message){
        return ;
    }
    listEntry_t *listEntry;
    if (chat_completion_request_user_message->content) {
        chat_completion_request_user_message_content_free(chat_completion_request_user_message->content);
        chat_completion_request_user_message->content = NULL;
    }
    if (chat_completion_request_user_message->name) {
        free(chat_completion_request_user_message->name);
        chat_completion_request_user_message->name = NULL;
    }
    free(chat_completion_request_user_message);
}

cJSON *chat_completion_request_user_message_convertToJSON(chat_completion_request_user_message_t *chat_completion_request_user_message) {
    cJSON *item = cJSON_CreateObject();

    // chat_completion_request_user_message->content
    if (!chat_completion_request_user_message->content) {
        goto fail;
    }
    cJSON *content_local_JSON = chat_completion_request_user_message_content_convertToJSON(chat_completion_request_user_message->content);
    if(content_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "content", content_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // chat_completion_request_user_message->role
    if (openai_api_chat_completion_request_user_message_ROLE_NULL == chat_completion_request_user_message->role) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "role", rolechat_completion_request_user_message_ToString(chat_completion_request_user_message->role)) == NULL)
    {
    goto fail; //Enum
    }


    // chat_completion_request_user_message->name
    if(chat_completion_request_user_message->name) {
    if(cJSON_AddStringToObject(item, "name", chat_completion_request_user_message->name) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

chat_completion_request_user_message_t *chat_completion_request_user_message_parseFromJSON(cJSON *chat_completion_request_user_messageJSON){

    chat_completion_request_user_message_t *chat_completion_request_user_message_local_var = NULL;

    // define the local variable for chat_completion_request_user_message->content
    chat_completion_request_user_message_content_t *content_local_nonprim = NULL;

    // chat_completion_request_user_message->content
    cJSON *content = cJSON_GetObjectItemCaseSensitive(chat_completion_request_user_messageJSON, "content");
    if (!content) {
        goto end;
    }

    
    content_local_nonprim = chat_completion_request_user_message_content_parseFromJSON(content); //nonprimitive

    // chat_completion_request_user_message->role
    cJSON *role = cJSON_GetObjectItemCaseSensitive(chat_completion_request_user_messageJSON, "role");
    if (!role) {
        goto end;
    }

    openai_api_chat_completion_request_user_message_ROLE_e roleVariable;
    
    if(!cJSON_IsString(role))
    {
    goto end; //Enum
    }
    roleVariable = chat_completion_request_user_message_role_FromString(role->valuestring);

    // chat_completion_request_user_message->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(chat_completion_request_user_messageJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }


    chat_completion_request_user_message_local_var = chat_completion_request_user_message_create (
        content_local_nonprim,
        roleVariable,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL
        );

    return chat_completion_request_user_message_local_var;
end:
    if (content_local_nonprim) {
        chat_completion_request_user_message_content_free(content_local_nonprim);
        content_local_nonprim = NULL;
    }
    return NULL;

}
