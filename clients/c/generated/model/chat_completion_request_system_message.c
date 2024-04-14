#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "chat_completion_request_system_message.h"


char* chat_completion_request_system_message_role_ToString(openai_api_chat_completion_request_system_message_ROLE_e role) {
    char* roleArray[] =  { "NULL", "system" };
    return roleArray[role];
}

openai_api_chat_completion_request_system_message_ROLE_e chat_completion_request_system_message_role_FromString(char* role){
    int stringToReturn = 0;
    char *roleArray[] =  { "NULL", "system" };
    size_t sizeofArray = sizeof(roleArray) / sizeof(roleArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(role, roleArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

chat_completion_request_system_message_t *chat_completion_request_system_message_create(
    char *content,
    openai_api_chat_completion_request_system_message_ROLE_e role,
    char *name
    ) {
    chat_completion_request_system_message_t *chat_completion_request_system_message_local_var = malloc(sizeof(chat_completion_request_system_message_t));
    if (!chat_completion_request_system_message_local_var) {
        return NULL;
    }
    chat_completion_request_system_message_local_var->content = content;
    chat_completion_request_system_message_local_var->role = role;
    chat_completion_request_system_message_local_var->name = name;

    return chat_completion_request_system_message_local_var;
}


void chat_completion_request_system_message_free(chat_completion_request_system_message_t *chat_completion_request_system_message) {
    if(NULL == chat_completion_request_system_message){
        return ;
    }
    listEntry_t *listEntry;
    if (chat_completion_request_system_message->content) {
        free(chat_completion_request_system_message->content);
        chat_completion_request_system_message->content = NULL;
    }
    if (chat_completion_request_system_message->name) {
        free(chat_completion_request_system_message->name);
        chat_completion_request_system_message->name = NULL;
    }
    free(chat_completion_request_system_message);
}

cJSON *chat_completion_request_system_message_convertToJSON(chat_completion_request_system_message_t *chat_completion_request_system_message) {
    cJSON *item = cJSON_CreateObject();

    // chat_completion_request_system_message->content
    if (!chat_completion_request_system_message->content) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "content", chat_completion_request_system_message->content) == NULL) {
    goto fail; //String
    }


    // chat_completion_request_system_message->role
    if (openai_api_chat_completion_request_system_message_ROLE_NULL == chat_completion_request_system_message->role) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "role", rolechat_completion_request_system_message_ToString(chat_completion_request_system_message->role)) == NULL)
    {
    goto fail; //Enum
    }


    // chat_completion_request_system_message->name
    if(chat_completion_request_system_message->name) {
    if(cJSON_AddStringToObject(item, "name", chat_completion_request_system_message->name) == NULL) {
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

chat_completion_request_system_message_t *chat_completion_request_system_message_parseFromJSON(cJSON *chat_completion_request_system_messageJSON){

    chat_completion_request_system_message_t *chat_completion_request_system_message_local_var = NULL;

    // chat_completion_request_system_message->content
    cJSON *content = cJSON_GetObjectItemCaseSensitive(chat_completion_request_system_messageJSON, "content");
    if (!content) {
        goto end;
    }

    
    if(!cJSON_IsString(content))
    {
    goto end; //String
    }

    // chat_completion_request_system_message->role
    cJSON *role = cJSON_GetObjectItemCaseSensitive(chat_completion_request_system_messageJSON, "role");
    if (!role) {
        goto end;
    }

    openai_api_chat_completion_request_system_message_ROLE_e roleVariable;
    
    if(!cJSON_IsString(role))
    {
    goto end; //Enum
    }
    roleVariable = chat_completion_request_system_message_role_FromString(role->valuestring);

    // chat_completion_request_system_message->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(chat_completion_request_system_messageJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }


    chat_completion_request_system_message_local_var = chat_completion_request_system_message_create (
        strdup(content->valuestring),
        roleVariable,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL
        );

    return chat_completion_request_system_message_local_var;
end:
    return NULL;

}
