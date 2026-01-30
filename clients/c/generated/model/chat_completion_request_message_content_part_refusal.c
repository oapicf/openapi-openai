#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "chat_completion_request_message_content_part_refusal.h"


char* chat_completion_request_message_content_part_refusal_type_ToString(openai_api_chat_completion_request_message_content_part_refusal_TYPE_e type) {
    char* typeArray[] =  { "NULL", "refusal" };
    return typeArray[type];
}

openai_api_chat_completion_request_message_content_part_refusal_TYPE_e chat_completion_request_message_content_part_refusal_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "refusal" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static chat_completion_request_message_content_part_refusal_t *chat_completion_request_message_content_part_refusal_create_internal(
    openai_api_chat_completion_request_message_content_part_refusal_TYPE_e type,
    char *refusal
    ) {
    chat_completion_request_message_content_part_refusal_t *chat_completion_request_message_content_part_refusal_local_var = malloc(sizeof(chat_completion_request_message_content_part_refusal_t));
    if (!chat_completion_request_message_content_part_refusal_local_var) {
        return NULL;
    }
    chat_completion_request_message_content_part_refusal_local_var->type = type;
    chat_completion_request_message_content_part_refusal_local_var->refusal = refusal;

    chat_completion_request_message_content_part_refusal_local_var->_library_owned = 1;
    return chat_completion_request_message_content_part_refusal_local_var;
}

__attribute__((deprecated)) chat_completion_request_message_content_part_refusal_t *chat_completion_request_message_content_part_refusal_create(
    openai_api_chat_completion_request_message_content_part_refusal_TYPE_e type,
    char *refusal
    ) {
    return chat_completion_request_message_content_part_refusal_create_internal (
        type,
        refusal
        );
}

void chat_completion_request_message_content_part_refusal_free(chat_completion_request_message_content_part_refusal_t *chat_completion_request_message_content_part_refusal) {
    if(NULL == chat_completion_request_message_content_part_refusal){
        return ;
    }
    if(chat_completion_request_message_content_part_refusal->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "chat_completion_request_message_content_part_refusal_free");
        return ;
    }
    listEntry_t *listEntry;
    if (chat_completion_request_message_content_part_refusal->refusal) {
        free(chat_completion_request_message_content_part_refusal->refusal);
        chat_completion_request_message_content_part_refusal->refusal = NULL;
    }
    free(chat_completion_request_message_content_part_refusal);
}

cJSON *chat_completion_request_message_content_part_refusal_convertToJSON(chat_completion_request_message_content_part_refusal_t *chat_completion_request_message_content_part_refusal) {
    cJSON *item = cJSON_CreateObject();

    // chat_completion_request_message_content_part_refusal->type
    if (openai_api_chat_completion_request_message_content_part_refusal_TYPE_NULL == chat_completion_request_message_content_part_refusal->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", chat_completion_request_message_content_part_refusal_type_ToString(chat_completion_request_message_content_part_refusal->type)) == NULL)
    {
    goto fail; //Enum
    }


    // chat_completion_request_message_content_part_refusal->refusal
    if (!chat_completion_request_message_content_part_refusal->refusal) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "refusal", chat_completion_request_message_content_part_refusal->refusal) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

chat_completion_request_message_content_part_refusal_t *chat_completion_request_message_content_part_refusal_parseFromJSON(cJSON *chat_completion_request_message_content_part_refusalJSON){

    chat_completion_request_message_content_part_refusal_t *chat_completion_request_message_content_part_refusal_local_var = NULL;

    // chat_completion_request_message_content_part_refusal->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(chat_completion_request_message_content_part_refusalJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_chat_completion_request_message_content_part_refusal_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = chat_completion_request_message_content_part_refusal_type_FromString(type->valuestring);

    // chat_completion_request_message_content_part_refusal->refusal
    cJSON *refusal = cJSON_GetObjectItemCaseSensitive(chat_completion_request_message_content_part_refusalJSON, "refusal");
    if (cJSON_IsNull(refusal)) {
        refusal = NULL;
    }
    if (!refusal) {
        goto end;
    }

    
    if(!cJSON_IsString(refusal))
    {
    goto end; //String
    }


    chat_completion_request_message_content_part_refusal_local_var = chat_completion_request_message_content_part_refusal_create_internal (
        typeVariable,
        strdup(refusal->valuestring)
        );

    return chat_completion_request_message_content_part_refusal_local_var;
end:
    return NULL;

}
