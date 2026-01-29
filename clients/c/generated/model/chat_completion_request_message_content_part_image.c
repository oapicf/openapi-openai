#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "chat_completion_request_message_content_part_image.h"


char* chat_completion_request_message_content_part_image_type_ToString(openai_api_chat_completion_request_message_content_part_image_TYPE_e type) {
    char* typeArray[] =  { "NULL", "image_url" };
    return typeArray[type];
}

openai_api_chat_completion_request_message_content_part_image_TYPE_e chat_completion_request_message_content_part_image_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "image_url" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static chat_completion_request_message_content_part_image_t *chat_completion_request_message_content_part_image_create_internal(
    openai_api_chat_completion_request_message_content_part_image_TYPE_e type,
    chat_completion_request_message_content_part_image_image_url_t *image_url
    ) {
    chat_completion_request_message_content_part_image_t *chat_completion_request_message_content_part_image_local_var = malloc(sizeof(chat_completion_request_message_content_part_image_t));
    if (!chat_completion_request_message_content_part_image_local_var) {
        return NULL;
    }
    chat_completion_request_message_content_part_image_local_var->type = type;
    chat_completion_request_message_content_part_image_local_var->image_url = image_url;

    chat_completion_request_message_content_part_image_local_var->_library_owned = 1;
    return chat_completion_request_message_content_part_image_local_var;
}

__attribute__((deprecated)) chat_completion_request_message_content_part_image_t *chat_completion_request_message_content_part_image_create(
    openai_api_chat_completion_request_message_content_part_image_TYPE_e type,
    chat_completion_request_message_content_part_image_image_url_t *image_url
    ) {
    return chat_completion_request_message_content_part_image_create_internal (
        type,
        image_url
        );
}

void chat_completion_request_message_content_part_image_free(chat_completion_request_message_content_part_image_t *chat_completion_request_message_content_part_image) {
    if(NULL == chat_completion_request_message_content_part_image){
        return ;
    }
    if(chat_completion_request_message_content_part_image->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "chat_completion_request_message_content_part_image_free");
        return ;
    }
    listEntry_t *listEntry;
    if (chat_completion_request_message_content_part_image->image_url) {
        chat_completion_request_message_content_part_image_image_url_free(chat_completion_request_message_content_part_image->image_url);
        chat_completion_request_message_content_part_image->image_url = NULL;
    }
    free(chat_completion_request_message_content_part_image);
}

cJSON *chat_completion_request_message_content_part_image_convertToJSON(chat_completion_request_message_content_part_image_t *chat_completion_request_message_content_part_image) {
    cJSON *item = cJSON_CreateObject();

    // chat_completion_request_message_content_part_image->type
    if (openai_api_chat_completion_request_message_content_part_image_TYPE_NULL == chat_completion_request_message_content_part_image->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", chat_completion_request_message_content_part_image_type_ToString(chat_completion_request_message_content_part_image->type)) == NULL)
    {
    goto fail; //Enum
    }


    // chat_completion_request_message_content_part_image->image_url
    if (!chat_completion_request_message_content_part_image->image_url) {
        goto fail;
    }
    cJSON *image_url_local_JSON = chat_completion_request_message_content_part_image_image_url_convertToJSON(chat_completion_request_message_content_part_image->image_url);
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

chat_completion_request_message_content_part_image_t *chat_completion_request_message_content_part_image_parseFromJSON(cJSON *chat_completion_request_message_content_part_imageJSON){

    chat_completion_request_message_content_part_image_t *chat_completion_request_message_content_part_image_local_var = NULL;

    // define the local variable for chat_completion_request_message_content_part_image->image_url
    chat_completion_request_message_content_part_image_image_url_t *image_url_local_nonprim = NULL;

    // chat_completion_request_message_content_part_image->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(chat_completion_request_message_content_part_imageJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_chat_completion_request_message_content_part_image_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = chat_completion_request_message_content_part_image_type_FromString(type->valuestring);

    // chat_completion_request_message_content_part_image->image_url
    cJSON *image_url = cJSON_GetObjectItemCaseSensitive(chat_completion_request_message_content_part_imageJSON, "image_url");
    if (cJSON_IsNull(image_url)) {
        image_url = NULL;
    }
    if (!image_url) {
        goto end;
    }

    
    image_url_local_nonprim = chat_completion_request_message_content_part_image_image_url_parseFromJSON(image_url); //nonprimitive


    chat_completion_request_message_content_part_image_local_var = chat_completion_request_message_content_part_image_create_internal (
        typeVariable,
        image_url_local_nonprim
        );

    return chat_completion_request_message_content_part_image_local_var;
end:
    if (image_url_local_nonprim) {
        chat_completion_request_message_content_part_image_image_url_free(image_url_local_nonprim);
        image_url_local_nonprim = NULL;
    }
    return NULL;

}
