#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "chat_completion_role.h"


char* chat_completion_role_chat_completion_role_ToString(openai_api_chat_completion_role__e chat_completion_role) {
    char *chat_completion_roleArray[] =  { "NULL", "system", "user", "assistant", "tool", "function" };
    return chat_completion_roleArray[chat_completion_role];
}

openai_api_chat_completion_role__e chat_completion_role_chat_completion_role_FromString(char* chat_completion_role) {
    int stringToReturn = 0;
    char *chat_completion_roleArray[] =  { "NULL", "system", "user", "assistant", "tool", "function" };
    size_t sizeofArray = sizeof(chat_completion_roleArray) / sizeof(chat_completion_roleArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(chat_completion_role, chat_completion_roleArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *chat_completion_role_chat_completion_role_convertToJSON(openai_api_chat_completion_role__e chat_completion_role) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "chat_completion_role", chat_completion_role_chat_completion_role_ToString(chat_completion_role)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

openai_api_chat_completion_role__e chat_completion_role_chat_completion_role_parseFromJSON(cJSON *chat_completion_roleJSON) {
    openai_api_chat_completion_role__e *chat_completion_role = NULL;
    openai_api_chat_completion_role__e chat_completion_roleVariable;
    cJSON *chat_completion_roleVar = cJSON_GetObjectItemCaseSensitive(chat_completion_roleJSON, "chat_completion_role");
    if(!cJSON_IsString(chat_completion_roleVar) || (chat_completion_roleVar->valuestring == NULL)){
        goto end;
    }
    chat_completion_roleVariable = chat_completion_role_chat_completion_role_FromString(chat_completion_roleVar->valuestring);
    return chat_completion_roleVariable;
end:
    return 0;
}
