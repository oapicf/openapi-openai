#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "message_content_text_object_text.h"



message_content_text_object_text_t *message_content_text_object_text_create(
    char *value,
    list_t *annotations
    ) {
    message_content_text_object_text_t *message_content_text_object_text_local_var = malloc(sizeof(message_content_text_object_text_t));
    if (!message_content_text_object_text_local_var) {
        return NULL;
    }
    message_content_text_object_text_local_var->value = value;
    message_content_text_object_text_local_var->annotations = annotations;

    return message_content_text_object_text_local_var;
}


void message_content_text_object_text_free(message_content_text_object_text_t *message_content_text_object_text) {
    if(NULL == message_content_text_object_text){
        return ;
    }
    listEntry_t *listEntry;
    if (message_content_text_object_text->value) {
        free(message_content_text_object_text->value);
        message_content_text_object_text->value = NULL;
    }
    if (message_content_text_object_text->annotations) {
        list_ForEach(listEntry, message_content_text_object_text->annotations) {
            message_content_text_object_text_annotations_inner_free(listEntry->data);
        }
        list_freeList(message_content_text_object_text->annotations);
        message_content_text_object_text->annotations = NULL;
    }
    free(message_content_text_object_text);
}

cJSON *message_content_text_object_text_convertToJSON(message_content_text_object_text_t *message_content_text_object_text) {
    cJSON *item = cJSON_CreateObject();

    // message_content_text_object_text->value
    if (!message_content_text_object_text->value) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "value", message_content_text_object_text->value) == NULL) {
    goto fail; //String
    }


    // message_content_text_object_text->annotations
    if (!message_content_text_object_text->annotations) {
        goto fail;
    }
    cJSON *annotations = cJSON_AddArrayToObject(item, "annotations");
    if(annotations == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *annotationsListEntry;
    if (message_content_text_object_text->annotations) {
    list_ForEach(annotationsListEntry, message_content_text_object_text->annotations) {
    cJSON *itemLocal = message_content_text_object_text_annotations_inner_convertToJSON(annotationsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(annotations, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

message_content_text_object_text_t *message_content_text_object_text_parseFromJSON(cJSON *message_content_text_object_textJSON){

    message_content_text_object_text_t *message_content_text_object_text_local_var = NULL;

    // define the local list for message_content_text_object_text->annotations
    list_t *annotationsList = NULL;

    // message_content_text_object_text->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(message_content_text_object_textJSON, "value");
    if (!value) {
        goto end;
    }

    
    if(!cJSON_IsString(value))
    {
    goto end; //String
    }

    // message_content_text_object_text->annotations
    cJSON *annotations = cJSON_GetObjectItemCaseSensitive(message_content_text_object_textJSON, "annotations");
    if (!annotations) {
        goto end;
    }

    
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
        message_content_text_object_text_annotations_inner_t *annotationsItem = message_content_text_object_text_annotations_inner_parseFromJSON(annotations_local_nonprimitive);

        list_addElement(annotationsList, annotationsItem);
    }


    message_content_text_object_text_local_var = message_content_text_object_text_create (
        strdup(value->valuestring),
        annotationsList
        );

    return message_content_text_object_text_local_var;
end:
    if (annotationsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, annotationsList) {
            message_content_text_object_text_annotations_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(annotationsList);
        annotationsList = NULL;
    }
    return NULL;

}
