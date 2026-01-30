#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "message_delta_content_image_file_object_image_file.h"


char* message_delta_content_image_file_object_image_file_detail_ToString(openai_api_message_delta_content_image_file_object_image_file_DETAIL_e detail) {
    char* detailArray[] =  { "NULL", "auto", "low", "high" };
    return detailArray[detail];
}

openai_api_message_delta_content_image_file_object_image_file_DETAIL_e message_delta_content_image_file_object_image_file_detail_FromString(char* detail){
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

static message_delta_content_image_file_object_image_file_t *message_delta_content_image_file_object_image_file_create_internal(
    char *file_id,
    openai_api_message_delta_content_image_file_object_image_file_DETAIL_e detail
    ) {
    message_delta_content_image_file_object_image_file_t *message_delta_content_image_file_object_image_file_local_var = malloc(sizeof(message_delta_content_image_file_object_image_file_t));
    if (!message_delta_content_image_file_object_image_file_local_var) {
        return NULL;
    }
    message_delta_content_image_file_object_image_file_local_var->file_id = file_id;
    message_delta_content_image_file_object_image_file_local_var->detail = detail;

    message_delta_content_image_file_object_image_file_local_var->_library_owned = 1;
    return message_delta_content_image_file_object_image_file_local_var;
}

__attribute__((deprecated)) message_delta_content_image_file_object_image_file_t *message_delta_content_image_file_object_image_file_create(
    char *file_id,
    openai_api_message_delta_content_image_file_object_image_file_DETAIL_e detail
    ) {
    return message_delta_content_image_file_object_image_file_create_internal (
        file_id,
        detail
        );
}

void message_delta_content_image_file_object_image_file_free(message_delta_content_image_file_object_image_file_t *message_delta_content_image_file_object_image_file) {
    if(NULL == message_delta_content_image_file_object_image_file){
        return ;
    }
    if(message_delta_content_image_file_object_image_file->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "message_delta_content_image_file_object_image_file_free");
        return ;
    }
    listEntry_t *listEntry;
    if (message_delta_content_image_file_object_image_file->file_id) {
        free(message_delta_content_image_file_object_image_file->file_id);
        message_delta_content_image_file_object_image_file->file_id = NULL;
    }
    free(message_delta_content_image_file_object_image_file);
}

cJSON *message_delta_content_image_file_object_image_file_convertToJSON(message_delta_content_image_file_object_image_file_t *message_delta_content_image_file_object_image_file) {
    cJSON *item = cJSON_CreateObject();

    // message_delta_content_image_file_object_image_file->file_id
    if(message_delta_content_image_file_object_image_file->file_id) {
    if(cJSON_AddStringToObject(item, "file_id", message_delta_content_image_file_object_image_file->file_id) == NULL) {
    goto fail; //String
    }
    }


    // message_delta_content_image_file_object_image_file->detail
    if(message_delta_content_image_file_object_image_file->detail != openai_api_message_delta_content_image_file_object_image_file_DETAIL_NULL) {
    if(cJSON_AddStringToObject(item, "detail", message_delta_content_image_file_object_image_file_detail_ToString(message_delta_content_image_file_object_image_file->detail)) == NULL)
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

message_delta_content_image_file_object_image_file_t *message_delta_content_image_file_object_image_file_parseFromJSON(cJSON *message_delta_content_image_file_object_image_fileJSON){

    message_delta_content_image_file_object_image_file_t *message_delta_content_image_file_object_image_file_local_var = NULL;

    // message_delta_content_image_file_object_image_file->file_id
    cJSON *file_id = cJSON_GetObjectItemCaseSensitive(message_delta_content_image_file_object_image_fileJSON, "file_id");
    if (cJSON_IsNull(file_id)) {
        file_id = NULL;
    }
    if (file_id) { 
    if(!cJSON_IsString(file_id) && !cJSON_IsNull(file_id))
    {
    goto end; //String
    }
    }

    // message_delta_content_image_file_object_image_file->detail
    cJSON *detail = cJSON_GetObjectItemCaseSensitive(message_delta_content_image_file_object_image_fileJSON, "detail");
    if (cJSON_IsNull(detail)) {
        detail = NULL;
    }
    openai_api_message_delta_content_image_file_object_image_file_DETAIL_e detailVariable;
    if (detail) { 
    if(!cJSON_IsString(detail))
    {
    goto end; //Enum
    }
    detailVariable = message_delta_content_image_file_object_image_file_detail_FromString(detail->valuestring);
    }


    message_delta_content_image_file_object_image_file_local_var = message_delta_content_image_file_object_image_file_create_internal (
        file_id && !cJSON_IsNull(file_id) ? strdup(file_id->valuestring) : NULL,
        detail ? detailVariable : openai_api_message_delta_content_image_file_object_image_file_DETAIL_NULL
        );

    return message_delta_content_image_file_object_image_file_local_var;
end:
    return NULL;

}
