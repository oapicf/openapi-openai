#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "message_delta_content_image_file_object_image_file.h"



message_delta_content_image_file_object_image_file_t *message_delta_content_image_file_object_image_file_create(
    char *file_id
    ) {
    message_delta_content_image_file_object_image_file_t *message_delta_content_image_file_object_image_file_local_var = malloc(sizeof(message_delta_content_image_file_object_image_file_t));
    if (!message_delta_content_image_file_object_image_file_local_var) {
        return NULL;
    }
    message_delta_content_image_file_object_image_file_local_var->file_id = file_id;

    return message_delta_content_image_file_object_image_file_local_var;
}


void message_delta_content_image_file_object_image_file_free(message_delta_content_image_file_object_image_file_t *message_delta_content_image_file_object_image_file) {
    if(NULL == message_delta_content_image_file_object_image_file){
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
    if (file_id) { 
    if(!cJSON_IsString(file_id) && !cJSON_IsNull(file_id))
    {
    goto end; //String
    }
    }


    message_delta_content_image_file_object_image_file_local_var = message_delta_content_image_file_object_image_file_create (
        file_id && !cJSON_IsNull(file_id) ? strdup(file_id->valuestring) : NULL
        );

    return message_delta_content_image_file_object_image_file_local_var;
end:
    return NULL;

}
