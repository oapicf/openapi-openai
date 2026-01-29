#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "message_delta_content_text_annotations_file_path_object_file_path.h"



static message_delta_content_text_annotations_file_path_object_file_path_t *message_delta_content_text_annotations_file_path_object_file_path_create_internal(
    char *file_id
    ) {
    message_delta_content_text_annotations_file_path_object_file_path_t *message_delta_content_text_annotations_file_path_object_file_path_local_var = malloc(sizeof(message_delta_content_text_annotations_file_path_object_file_path_t));
    if (!message_delta_content_text_annotations_file_path_object_file_path_local_var) {
        return NULL;
    }
    message_delta_content_text_annotations_file_path_object_file_path_local_var->file_id = file_id;

    message_delta_content_text_annotations_file_path_object_file_path_local_var->_library_owned = 1;
    return message_delta_content_text_annotations_file_path_object_file_path_local_var;
}

__attribute__((deprecated)) message_delta_content_text_annotations_file_path_object_file_path_t *message_delta_content_text_annotations_file_path_object_file_path_create(
    char *file_id
    ) {
    return message_delta_content_text_annotations_file_path_object_file_path_create_internal (
        file_id
        );
}

void message_delta_content_text_annotations_file_path_object_file_path_free(message_delta_content_text_annotations_file_path_object_file_path_t *message_delta_content_text_annotations_file_path_object_file_path) {
    if(NULL == message_delta_content_text_annotations_file_path_object_file_path){
        return ;
    }
    if(message_delta_content_text_annotations_file_path_object_file_path->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "message_delta_content_text_annotations_file_path_object_file_path_free");
        return ;
    }
    listEntry_t *listEntry;
    if (message_delta_content_text_annotations_file_path_object_file_path->file_id) {
        free(message_delta_content_text_annotations_file_path_object_file_path->file_id);
        message_delta_content_text_annotations_file_path_object_file_path->file_id = NULL;
    }
    free(message_delta_content_text_annotations_file_path_object_file_path);
}

cJSON *message_delta_content_text_annotations_file_path_object_file_path_convertToJSON(message_delta_content_text_annotations_file_path_object_file_path_t *message_delta_content_text_annotations_file_path_object_file_path) {
    cJSON *item = cJSON_CreateObject();

    // message_delta_content_text_annotations_file_path_object_file_path->file_id
    if(message_delta_content_text_annotations_file_path_object_file_path->file_id) {
    if(cJSON_AddStringToObject(item, "file_id", message_delta_content_text_annotations_file_path_object_file_path->file_id) == NULL) {
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

message_delta_content_text_annotations_file_path_object_file_path_t *message_delta_content_text_annotations_file_path_object_file_path_parseFromJSON(cJSON *message_delta_content_text_annotations_file_path_object_file_pathJSON){

    message_delta_content_text_annotations_file_path_object_file_path_t *message_delta_content_text_annotations_file_path_object_file_path_local_var = NULL;

    // message_delta_content_text_annotations_file_path_object_file_path->file_id
    cJSON *file_id = cJSON_GetObjectItemCaseSensitive(message_delta_content_text_annotations_file_path_object_file_pathJSON, "file_id");
    if (cJSON_IsNull(file_id)) {
        file_id = NULL;
    }
    if (file_id) { 
    if(!cJSON_IsString(file_id) && !cJSON_IsNull(file_id))
    {
    goto end; //String
    }
    }


    message_delta_content_text_annotations_file_path_object_file_path_local_var = message_delta_content_text_annotations_file_path_object_file_path_create_internal (
        file_id && !cJSON_IsNull(file_id) ? strdup(file_id->valuestring) : NULL
        );

    return message_delta_content_text_annotations_file_path_object_file_path_local_var;
end:
    return NULL;

}
