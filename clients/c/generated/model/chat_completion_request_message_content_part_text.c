#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "chat_completion_request_message_content_part_text.h"


char* chat_completion_request_message_content_part_text_type_ToString(openai_api_chat_completion_request_message_content_part_text_TYPE_e type) {
    char* typeArray[] =  { "NULL", "text" };
    return typeArray[type];
}

openai_api_chat_completion_request_message_content_part_text_TYPE_e chat_completion_request_message_content_part_text_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "text" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

chat_completion_request_message_content_part_text_t *chat_completion_request_message_content_part_text_create(
    openai_api_chat_completion_request_message_content_part_text_TYPE_e type,
    char *text
    ) {
    chat_completion_request_message_content_part_text_t *chat_completion_request_message_content_part_text_local_var = malloc(sizeof(chat_completion_request_message_content_part_text_t));
    if (!chat_completion_request_message_content_part_text_local_var) {
        return NULL;
    }
    chat_completion_request_message_content_part_text_local_var->type = type;
    chat_completion_request_message_content_part_text_local_var->text = text;

    return chat_completion_request_message_content_part_text_local_var;
}


void chat_completion_request_message_content_part_text_free(chat_completion_request_message_content_part_text_t *chat_completion_request_message_content_part_text) {
    if(NULL == chat_completion_request_message_content_part_text){
        return ;
    }
    listEntry_t *listEntry;
    if (chat_completion_request_message_content_part_text->text) {
        free(chat_completion_request_message_content_part_text->text);
        chat_completion_request_message_content_part_text->text = NULL;
    }
    free(chat_completion_request_message_content_part_text);
}

cJSON *chat_completion_request_message_content_part_text_convertToJSON(chat_completion_request_message_content_part_text_t *chat_completion_request_message_content_part_text) {
    cJSON *item = cJSON_CreateObject();

    // chat_completion_request_message_content_part_text->type
    if (openai_api_chat_completion_request_message_content_part_text_TYPE_NULL == chat_completion_request_message_content_part_text->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", typechat_completion_request_message_content_part_text_ToString(chat_completion_request_message_content_part_text->type)) == NULL)
    {
    goto fail; //Enum
    }


    // chat_completion_request_message_content_part_text->text
    if (!chat_completion_request_message_content_part_text->text) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "text", chat_completion_request_message_content_part_text->text) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

chat_completion_request_message_content_part_text_t *chat_completion_request_message_content_part_text_parseFromJSON(cJSON *chat_completion_request_message_content_part_textJSON){

    chat_completion_request_message_content_part_text_t *chat_completion_request_message_content_part_text_local_var = NULL;

    // chat_completion_request_message_content_part_text->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(chat_completion_request_message_content_part_textJSON, "type");
    if (!type) {
        goto end;
    }

    openai_api_chat_completion_request_message_content_part_text_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = chat_completion_request_message_content_part_text_type_FromString(type->valuestring);

    // chat_completion_request_message_content_part_text->text
    cJSON *text = cJSON_GetObjectItemCaseSensitive(chat_completion_request_message_content_part_textJSON, "text");
    if (!text) {
        goto end;
    }

    
    if(!cJSON_IsString(text))
    {
    goto end; //String
    }


    chat_completion_request_message_content_part_text_local_var = chat_completion_request_message_content_part_text_create (
        typeVariable,
        strdup(text->valuestring)
        );

    return chat_completion_request_message_content_part_text_local_var;
end:
    return NULL;

}
