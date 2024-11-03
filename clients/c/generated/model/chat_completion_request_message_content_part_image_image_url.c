#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "chat_completion_request_message_content_part_image_image_url.h"


char* chat_completion_request_message_content_part_image_image_url_detail_ToString(openai_api_chat_completion_request_message_content_part_image_image_url_DETAIL_e detail) {
    char* detailArray[] =  { "NULL", "auto", "low", "high" };
    return detailArray[detail];
}

openai_api_chat_completion_request_message_content_part_image_image_url_DETAIL_e chat_completion_request_message_content_part_image_image_url_detail_FromString(char* detail){
    int stringToReturn = 0;
    char *detailArray[] =  { "NULL", "auto", "low", "high" };
    size_t sizeofArray = sizeof(detailArray) / sizeof(detailArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(detail, detailArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

chat_completion_request_message_content_part_image_image_url_t *chat_completion_request_message_content_part_image_image_url_create(
    char *url,
    openai_api_chat_completion_request_message_content_part_image_image_url_DETAIL_e detail
    ) {
    chat_completion_request_message_content_part_image_image_url_t *chat_completion_request_message_content_part_image_image_url_local_var = malloc(sizeof(chat_completion_request_message_content_part_image_image_url_t));
    if (!chat_completion_request_message_content_part_image_image_url_local_var) {
        return NULL;
    }
    chat_completion_request_message_content_part_image_image_url_local_var->url = url;
    chat_completion_request_message_content_part_image_image_url_local_var->detail = detail;

    return chat_completion_request_message_content_part_image_image_url_local_var;
}


void chat_completion_request_message_content_part_image_image_url_free(chat_completion_request_message_content_part_image_image_url_t *chat_completion_request_message_content_part_image_image_url) {
    if(NULL == chat_completion_request_message_content_part_image_image_url){
        return ;
    }
    listEntry_t *listEntry;
    if (chat_completion_request_message_content_part_image_image_url->url) {
        free(chat_completion_request_message_content_part_image_image_url->url);
        chat_completion_request_message_content_part_image_image_url->url = NULL;
    }
    free(chat_completion_request_message_content_part_image_image_url);
}

cJSON *chat_completion_request_message_content_part_image_image_url_convertToJSON(chat_completion_request_message_content_part_image_image_url_t *chat_completion_request_message_content_part_image_image_url) {
    cJSON *item = cJSON_CreateObject();

    // chat_completion_request_message_content_part_image_image_url->url
    if (!chat_completion_request_message_content_part_image_image_url->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", chat_completion_request_message_content_part_image_image_url->url) == NULL) {
    goto fail; //String
    }


    // chat_completion_request_message_content_part_image_image_url->detail
    if(chat_completion_request_message_content_part_image_image_url->detail != openai_api_chat_completion_request_message_content_part_image_image_url_DETAIL_NULL) {
    if(cJSON_AddStringToObject(item, "detail", detailchat_completion_request_message_content_part_image_image_url_ToString(chat_completion_request_message_content_part_image_image_url->detail)) == NULL)
    {
    goto fail; //Enum
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

chat_completion_request_message_content_part_image_image_url_t *chat_completion_request_message_content_part_image_image_url_parseFromJSON(cJSON *chat_completion_request_message_content_part_image_image_urlJSON){

    chat_completion_request_message_content_part_image_image_url_t *chat_completion_request_message_content_part_image_image_url_local_var = NULL;

    // chat_completion_request_message_content_part_image_image_url->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(chat_completion_request_message_content_part_image_image_urlJSON, "url");
    if (!url) {
        goto end;
    }

    
    if(!cJSON_IsString(url))
    {
    goto end; //String
    }

    // chat_completion_request_message_content_part_image_image_url->detail
    cJSON *detail = cJSON_GetObjectItemCaseSensitive(chat_completion_request_message_content_part_image_image_urlJSON, "detail");
    openai_api_chat_completion_request_message_content_part_image_image_url_DETAIL_e detailVariable;
    if (detail) { 
    if(!cJSON_IsString(detail))
    {
    goto end; //Enum
    }
    detailVariable = chat_completion_request_message_content_part_image_image_url_detail_FromString(detail->valuestring);
    }


    chat_completion_request_message_content_part_image_image_url_local_var = chat_completion_request_message_content_part_image_image_url_create (
        strdup(url->valuestring),
        detail ? detailVariable : openai_api_chat_completion_request_message_content_part_image_image_url_DETAIL_NULL
        );

    return chat_completion_request_message_content_part_image_image_url_local_var;
end:
    return NULL;

}
