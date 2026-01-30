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

static chat_completion_request_system_message_t *chat_completion_request_system_message_create_internal(
    chat_completion_request_system_message_content_t *content,
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

    chat_completion_request_system_message_local_var->_library_owned = 1;
    return chat_completion_request_system_message_local_var;
}

__attribute__((deprecated)) chat_completion_request_system_message_t *chat_completion_request_system_message_create(
    chat_completion_request_system_message_content_t *content,
    openai_api_chat_completion_request_system_message_ROLE_e role,
    char *name
    ) {
    return chat_completion_request_system_message_create_internal (
        content,
        role,
        name
        );
}

void chat_completion_request_system_message_free(chat_completion_request_system_message_t *chat_completion_request_system_message) {
    if(NULL == chat_completion_request_system_message){
        return ;
    }
    if(chat_completion_request_system_message->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "chat_completion_request_system_message_free");
        return ;
    }
    listEntry_t *listEntry;
    if (chat_completion_request_system_message->content) {
        chat_completion_request_system_message_content_free(chat_completion_request_system_message->content);
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
    cJSON *content_local_JSON = chat_completion_request_system_message_content_convertToJSON(chat_completion_request_system_message->content);
    if(content_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "content", content_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // chat_completion_request_system_message->role
    if (openai_api_chat_completion_request_system_message_ROLE_NULL == chat_completion_request_system_message->role) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "role", chat_completion_request_system_message_role_ToString(chat_completion_request_system_message->role)) == NULL)
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

    // define the local variable for chat_completion_request_system_message->content
    chat_completion_request_system_message_content_t *content_local_nonprim = NULL;

    // chat_completion_request_system_message->content
    cJSON *content = cJSON_GetObjectItemCaseSensitive(chat_completion_request_system_messageJSON, "content");
    if (cJSON_IsNull(content)) {
        content = NULL;
    }
    if (!content) {
        goto end;
    }

    
    content_local_nonprim = chat_completion_request_system_message_content_parseFromJSON(content); //nonprimitive

    // chat_completion_request_system_message->role
    cJSON *role = cJSON_GetObjectItemCaseSensitive(chat_completion_request_system_messageJSON, "role");
    if (cJSON_IsNull(role)) {
        role = NULL;
    }
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
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }


    chat_completion_request_system_message_local_var = chat_completion_request_system_message_create_internal (
        content_local_nonprim,
        roleVariable,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL
        );

    return chat_completion_request_system_message_local_var;
end:
    if (content_local_nonprim) {
        chat_completion_request_system_message_content_free(content_local_nonprim);
        content_local_nonprim = NULL;
    }
    return NULL;

}
