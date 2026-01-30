#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "chat_completion_request_assistant_message_content_part.h"


char* chat_completion_request_assistant_message_content_part_type_ToString(openai_api_chat_completion_request_assistant_message_content_part_TYPE_e type) {
    char* typeArray[] =  { "NULL", "text", "refusal" };
    return typeArray[type];
}

openai_api_chat_completion_request_assistant_message_content_part_TYPE_e chat_completion_request_assistant_message_content_part_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "text", "refusal" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static chat_completion_request_assistant_message_content_part_t *chat_completion_request_assistant_message_content_part_create_internal(
    openai_api_chat_completion_request_assistant_message_content_part_TYPE_e type,
    char *text,
    char *refusal
    ) {
    chat_completion_request_assistant_message_content_part_t *chat_completion_request_assistant_message_content_part_local_var = malloc(sizeof(chat_completion_request_assistant_message_content_part_t));
    if (!chat_completion_request_assistant_message_content_part_local_var) {
        return NULL;
    }
    chat_completion_request_assistant_message_content_part_local_var->type = type;
    chat_completion_request_assistant_message_content_part_local_var->text = text;
    chat_completion_request_assistant_message_content_part_local_var->refusal = refusal;

    chat_completion_request_assistant_message_content_part_local_var->_library_owned = 1;
    return chat_completion_request_assistant_message_content_part_local_var;
}

__attribute__((deprecated)) chat_completion_request_assistant_message_content_part_t *chat_completion_request_assistant_message_content_part_create(
    openai_api_chat_completion_request_assistant_message_content_part_TYPE_e type,
    char *text,
    char *refusal
    ) {
    return chat_completion_request_assistant_message_content_part_create_internal (
        type,
        text,
        refusal
        );
}

void chat_completion_request_assistant_message_content_part_free(chat_completion_request_assistant_message_content_part_t *chat_completion_request_assistant_message_content_part) {
    if(NULL == chat_completion_request_assistant_message_content_part){
        return ;
    }
    if(chat_completion_request_assistant_message_content_part->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "chat_completion_request_assistant_message_content_part_free");
        return ;
    }
    listEntry_t *listEntry;
    if (chat_completion_request_assistant_message_content_part->text) {
        free(chat_completion_request_assistant_message_content_part->text);
        chat_completion_request_assistant_message_content_part->text = NULL;
    }
    if (chat_completion_request_assistant_message_content_part->refusal) {
        free(chat_completion_request_assistant_message_content_part->refusal);
        chat_completion_request_assistant_message_content_part->refusal = NULL;
    }
    free(chat_completion_request_assistant_message_content_part);
}

cJSON *chat_completion_request_assistant_message_content_part_convertToJSON(chat_completion_request_assistant_message_content_part_t *chat_completion_request_assistant_message_content_part) {
    cJSON *item = cJSON_CreateObject();

    // chat_completion_request_assistant_message_content_part->type
    if (openai_api_chat_completion_request_assistant_message_content_part_TYPE_NULL == chat_completion_request_assistant_message_content_part->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", chat_completion_request_assistant_message_content_part_type_ToString(chat_completion_request_assistant_message_content_part->type)) == NULL)
    {
    goto fail; //Enum
    }


    // chat_completion_request_assistant_message_content_part->text
    if (!chat_completion_request_assistant_message_content_part->text) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "text", chat_completion_request_assistant_message_content_part->text) == NULL) {
    goto fail; //String
    }


    // chat_completion_request_assistant_message_content_part->refusal
    if (!chat_completion_request_assistant_message_content_part->refusal) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "refusal", chat_completion_request_assistant_message_content_part->refusal) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

chat_completion_request_assistant_message_content_part_t *chat_completion_request_assistant_message_content_part_parseFromJSON(cJSON *chat_completion_request_assistant_message_content_partJSON){

    chat_completion_request_assistant_message_content_part_t *chat_completion_request_assistant_message_content_part_local_var = NULL;

    // chat_completion_request_assistant_message_content_part->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(chat_completion_request_assistant_message_content_partJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_chat_completion_request_assistant_message_content_part_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = chat_completion_request_assistant_message_content_part_type_FromString(type->valuestring);

    // chat_completion_request_assistant_message_content_part->text
    cJSON *text = cJSON_GetObjectItemCaseSensitive(chat_completion_request_assistant_message_content_partJSON, "text");
    if (cJSON_IsNull(text)) {
        text = NULL;
    }
    if (!text) {
        goto end;
    }

    
    if(!cJSON_IsString(text))
    {
    goto end; //String
    }

    // chat_completion_request_assistant_message_content_part->refusal
    cJSON *refusal = cJSON_GetObjectItemCaseSensitive(chat_completion_request_assistant_message_content_partJSON, "refusal");
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


    chat_completion_request_assistant_message_content_part_local_var = chat_completion_request_assistant_message_content_part_create_internal (
        typeVariable,
        strdup(text->valuestring),
        strdup(refusal->valuestring)
        );

    return chat_completion_request_assistant_message_content_part_local_var;
end:
    return NULL;

}
