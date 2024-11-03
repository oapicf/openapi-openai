#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "chat_completion_request_message_content_part.h"


char* chat_completion_request_message_content_part_type_ToString(openai_api_chat_completion_request_message_content_part_TYPE_e type) {
    char* typeArray[] =  { "NULL", "text", "image_url" };
    return typeArray[type];
}

openai_api_chat_completion_request_message_content_part_TYPE_e chat_completion_request_message_content_part_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "text", "image_url" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

chat_completion_request_message_content_part_t *chat_completion_request_message_content_part_create(
    openai_api_chat_completion_request_message_content_part_TYPE_e type,
    char *text,
    chat_completion_request_message_content_part_image_image_url_t *image_url
    ) {
    chat_completion_request_message_content_part_t *chat_completion_request_message_content_part_local_var = malloc(sizeof(chat_completion_request_message_content_part_t));
    if (!chat_completion_request_message_content_part_local_var) {
        return NULL;
    }
    chat_completion_request_message_content_part_local_var->type = type;
    chat_completion_request_message_content_part_local_var->text = text;
    chat_completion_request_message_content_part_local_var->image_url = image_url;

    return chat_completion_request_message_content_part_local_var;
}


void chat_completion_request_message_content_part_free(chat_completion_request_message_content_part_t *chat_completion_request_message_content_part) {
    if(NULL == chat_completion_request_message_content_part){
        return ;
    }
    listEntry_t *listEntry;
    if (chat_completion_request_message_content_part->text) {
        free(chat_completion_request_message_content_part->text);
        chat_completion_request_message_content_part->text = NULL;
    }
    if (chat_completion_request_message_content_part->image_url) {
        chat_completion_request_message_content_part_image_image_url_free(chat_completion_request_message_content_part->image_url);
        chat_completion_request_message_content_part->image_url = NULL;
    }
    free(chat_completion_request_message_content_part);
}

cJSON *chat_completion_request_message_content_part_convertToJSON(chat_completion_request_message_content_part_t *chat_completion_request_message_content_part) {
    cJSON *item = cJSON_CreateObject();

    // chat_completion_request_message_content_part->type
    if (openai_api_chat_completion_request_message_content_part_TYPE_NULL == chat_completion_request_message_content_part->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", typechat_completion_request_message_content_part_ToString(chat_completion_request_message_content_part->type)) == NULL)
    {
    goto fail; //Enum
    }


    // chat_completion_request_message_content_part->text
    if (!chat_completion_request_message_content_part->text) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "text", chat_completion_request_message_content_part->text) == NULL) {
    goto fail; //String
    }


    // chat_completion_request_message_content_part->image_url
    if (!chat_completion_request_message_content_part->image_url) {
        goto fail;
    }
    cJSON *image_url_local_JSON = chat_completion_request_message_content_part_image_image_url_convertToJSON(chat_completion_request_message_content_part->image_url);
    if(image_url_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "image_url", image_url_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

chat_completion_request_message_content_part_t *chat_completion_request_message_content_part_parseFromJSON(cJSON *chat_completion_request_message_content_partJSON){

    chat_completion_request_message_content_part_t *chat_completion_request_message_content_part_local_var = NULL;

    // define the local variable for chat_completion_request_message_content_part->image_url
    chat_completion_request_message_content_part_image_image_url_t *image_url_local_nonprim = NULL;

    // chat_completion_request_message_content_part->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(chat_completion_request_message_content_partJSON, "type");
    if (!type) {
        goto end;
    }

    openai_api_chat_completion_request_message_content_part_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = chat_completion_request_message_content_part_type_FromString(type->valuestring);

    // chat_completion_request_message_content_part->text
    cJSON *text = cJSON_GetObjectItemCaseSensitive(chat_completion_request_message_content_partJSON, "text");
    if (!text) {
        goto end;
    }

    
    if(!cJSON_IsString(text))
    {
    goto end; //String
    }

    // chat_completion_request_message_content_part->image_url
    cJSON *image_url = cJSON_GetObjectItemCaseSensitive(chat_completion_request_message_content_partJSON, "image_url");
    if (!image_url) {
        goto end;
    }

    
    image_url_local_nonprim = chat_completion_request_message_content_part_image_image_url_parseFromJSON(image_url); //nonprimitive


    chat_completion_request_message_content_part_local_var = chat_completion_request_message_content_part_create (
        typeVariable,
        strdup(text->valuestring),
        image_url_local_nonprim
        );

    return chat_completion_request_message_content_part_local_var;
end:
    if (image_url_local_nonprim) {
        chat_completion_request_message_content_part_image_image_url_free(image_url_local_nonprim);
        image_url_local_nonprim = NULL;
    }
    return NULL;

}
