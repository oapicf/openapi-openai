#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "message_delta_content_image_url_object_image_url.h"


char* message_delta_content_image_url_object_image_url_detail_ToString(openai_api_message_delta_content_image_url_object_image_url_DETAIL_e detail) {
    char* detailArray[] =  { "NULL", "auto", "low", "high" };
    return detailArray[detail];
}

openai_api_message_delta_content_image_url_object_image_url_DETAIL_e message_delta_content_image_url_object_image_url_detail_FromString(char* detail){
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

static message_delta_content_image_url_object_image_url_t *message_delta_content_image_url_object_image_url_create_internal(
    char *url,
    openai_api_message_delta_content_image_url_object_image_url_DETAIL_e detail
    ) {
    message_delta_content_image_url_object_image_url_t *message_delta_content_image_url_object_image_url_local_var = malloc(sizeof(message_delta_content_image_url_object_image_url_t));
    if (!message_delta_content_image_url_object_image_url_local_var) {
        return NULL;
    }
    message_delta_content_image_url_object_image_url_local_var->url = url;
    message_delta_content_image_url_object_image_url_local_var->detail = detail;

    message_delta_content_image_url_object_image_url_local_var->_library_owned = 1;
    return message_delta_content_image_url_object_image_url_local_var;
}

__attribute__((deprecated)) message_delta_content_image_url_object_image_url_t *message_delta_content_image_url_object_image_url_create(
    char *url,
    openai_api_message_delta_content_image_url_object_image_url_DETAIL_e detail
    ) {
    return message_delta_content_image_url_object_image_url_create_internal (
        url,
        detail
        );
}

void message_delta_content_image_url_object_image_url_free(message_delta_content_image_url_object_image_url_t *message_delta_content_image_url_object_image_url) {
    if(NULL == message_delta_content_image_url_object_image_url){
        return ;
    }
    if(message_delta_content_image_url_object_image_url->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "message_delta_content_image_url_object_image_url_free");
        return ;
    }
    listEntry_t *listEntry;
    if (message_delta_content_image_url_object_image_url->url) {
        free(message_delta_content_image_url_object_image_url->url);
        message_delta_content_image_url_object_image_url->url = NULL;
    }
    free(message_delta_content_image_url_object_image_url);
}

cJSON *message_delta_content_image_url_object_image_url_convertToJSON(message_delta_content_image_url_object_image_url_t *message_delta_content_image_url_object_image_url) {
    cJSON *item = cJSON_CreateObject();

    // message_delta_content_image_url_object_image_url->url
    if(message_delta_content_image_url_object_image_url->url) {
    if(cJSON_AddStringToObject(item, "url", message_delta_content_image_url_object_image_url->url) == NULL) {
    goto fail; //String
    }
    }


    // message_delta_content_image_url_object_image_url->detail
    if(message_delta_content_image_url_object_image_url->detail != openai_api_message_delta_content_image_url_object_image_url_DETAIL_NULL) {
    if(cJSON_AddStringToObject(item, "detail", message_delta_content_image_url_object_image_url_detail_ToString(message_delta_content_image_url_object_image_url->detail)) == NULL)
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

message_delta_content_image_url_object_image_url_t *message_delta_content_image_url_object_image_url_parseFromJSON(cJSON *message_delta_content_image_url_object_image_urlJSON){

    message_delta_content_image_url_object_image_url_t *message_delta_content_image_url_object_image_url_local_var = NULL;

    // message_delta_content_image_url_object_image_url->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(message_delta_content_image_url_object_image_urlJSON, "url");
    if (cJSON_IsNull(url)) {
        url = NULL;
    }
    if (url) { 
    if(!cJSON_IsString(url) && !cJSON_IsNull(url))
    {
    goto end; //String
    }
    }

    // message_delta_content_image_url_object_image_url->detail
    cJSON *detail = cJSON_GetObjectItemCaseSensitive(message_delta_content_image_url_object_image_urlJSON, "detail");
    if (cJSON_IsNull(detail)) {
        detail = NULL;
    }
    openai_api_message_delta_content_image_url_object_image_url_DETAIL_e detailVariable;
    if (detail) { 
    if(!cJSON_IsString(detail))
    {
    goto end; //Enum
    }
    detailVariable = message_delta_content_image_url_object_image_url_detail_FromString(detail->valuestring);
    }


    message_delta_content_image_url_object_image_url_local_var = message_delta_content_image_url_object_image_url_create_internal (
        url && !cJSON_IsNull(url) ? strdup(url->valuestring) : NULL,
        detail ? detailVariable : openai_api_message_delta_content_image_url_object_image_url_DETAIL_NULL
        );

    return message_delta_content_image_url_object_image_url_local_var;
end:
    return NULL;

}
