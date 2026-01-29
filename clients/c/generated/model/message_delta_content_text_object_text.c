#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "message_delta_content_text_object_text.h"



static message_delta_content_text_object_text_t *message_delta_content_text_object_text_create_internal(
    char *value,
    list_t *annotations
    ) {
    message_delta_content_text_object_text_t *message_delta_content_text_object_text_local_var = malloc(sizeof(message_delta_content_text_object_text_t));
    if (!message_delta_content_text_object_text_local_var) {
        return NULL;
    }
    message_delta_content_text_object_text_local_var->value = value;
    message_delta_content_text_object_text_local_var->annotations = annotations;

    message_delta_content_text_object_text_local_var->_library_owned = 1;
    return message_delta_content_text_object_text_local_var;
}

__attribute__((deprecated)) message_delta_content_text_object_text_t *message_delta_content_text_object_text_create(
    char *value,
    list_t *annotations
    ) {
    return message_delta_content_text_object_text_create_internal (
        value,
        annotations
        );
}

void message_delta_content_text_object_text_free(message_delta_content_text_object_text_t *message_delta_content_text_object_text) {
    if(NULL == message_delta_content_text_object_text){
        return ;
    }
    if(message_delta_content_text_object_text->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "message_delta_content_text_object_text_free");
        return ;
    }
    listEntry_t *listEntry;
    if (message_delta_content_text_object_text->value) {
        free(message_delta_content_text_object_text->value);
        message_delta_content_text_object_text->value = NULL;
    }
    if (message_delta_content_text_object_text->annotations) {
        list_ForEach(listEntry, message_delta_content_text_object_text->annotations) {
            message_delta_content_text_object_text_annotations_inner_free(listEntry->data);
        }
        list_freeList(message_delta_content_text_object_text->annotations);
        message_delta_content_text_object_text->annotations = NULL;
    }
    free(message_delta_content_text_object_text);
}

cJSON *message_delta_content_text_object_text_convertToJSON(message_delta_content_text_object_text_t *message_delta_content_text_object_text) {
    cJSON *item = cJSON_CreateObject();

    // message_delta_content_text_object_text->value
    if(message_delta_content_text_object_text->value) {
    if(cJSON_AddStringToObject(item, "value", message_delta_content_text_object_text->value) == NULL) {
    goto fail; //String
    }
    }


    // message_delta_content_text_object_text->annotations
    if(message_delta_content_text_object_text->annotations) {
    cJSON *annotations = cJSON_AddArrayToObject(item, "annotations");
    if(annotations == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *annotationsListEntry;
    if (message_delta_content_text_object_text->annotations) {
    list_ForEach(annotationsListEntry, message_delta_content_text_object_text->annotations) {
    cJSON *itemLocal = message_delta_content_text_object_text_annotations_inner_convertToJSON(annotationsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(annotations, itemLocal);
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

message_delta_content_text_object_text_t *message_delta_content_text_object_text_parseFromJSON(cJSON *message_delta_content_text_object_textJSON){

    message_delta_content_text_object_text_t *message_delta_content_text_object_text_local_var = NULL;

    // define the local list for message_delta_content_text_object_text->annotations
    list_t *annotationsList = NULL;

    // message_delta_content_text_object_text->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(message_delta_content_text_object_textJSON, "value");
    if (cJSON_IsNull(value)) {
        value = NULL;
    }
    if (value) { 
    if(!cJSON_IsString(value) && !cJSON_IsNull(value))
    {
    goto end; //String
    }
    }

    // message_delta_content_text_object_text->annotations
    cJSON *annotations = cJSON_GetObjectItemCaseSensitive(message_delta_content_text_object_textJSON, "annotations");
    if (cJSON_IsNull(annotations)) {
        annotations = NULL;
    }
    if (annotations) { 
    cJSON *annotations_local_nonprimitive = NULL;
    if(!cJSON_IsArray(annotations)){
        goto end; //nonprimitive container
    }

    annotationsList = list_createList();

    cJSON_ArrayForEach(annotations_local_nonprimitive,annotations )
    {
        if(!cJSON_IsObject(annotations_local_nonprimitive)){
            goto end;
        }
        message_delta_content_text_object_text_annotations_inner_t *annotationsItem = message_delta_content_text_object_text_annotations_inner_parseFromJSON(annotations_local_nonprimitive);

        list_addElement(annotationsList, annotationsItem);
    }
    }


    message_delta_content_text_object_text_local_var = message_delta_content_text_object_text_create_internal (
        value && !cJSON_IsNull(value) ? strdup(value->valuestring) : NULL,
        annotations ? annotationsList : NULL
        );

    return message_delta_content_text_object_text_local_var;
end:
    if (annotationsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, annotationsList) {
            message_delta_content_text_object_text_annotations_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(annotationsList);
        annotationsList = NULL;
    }
    return NULL;

}
