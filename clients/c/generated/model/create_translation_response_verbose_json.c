#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_translation_response_verbose_json.h"



create_translation_response_verbose_json_t *create_translation_response_verbose_json_create(
    char *language,
    char *duration,
    char *text,
    list_t *segments
    ) {
    create_translation_response_verbose_json_t *create_translation_response_verbose_json_local_var = malloc(sizeof(create_translation_response_verbose_json_t));
    if (!create_translation_response_verbose_json_local_var) {
        return NULL;
    }
    create_translation_response_verbose_json_local_var->language = language;
    create_translation_response_verbose_json_local_var->duration = duration;
    create_translation_response_verbose_json_local_var->text = text;
    create_translation_response_verbose_json_local_var->segments = segments;

    return create_translation_response_verbose_json_local_var;
}


void create_translation_response_verbose_json_free(create_translation_response_verbose_json_t *create_translation_response_verbose_json) {
    if(NULL == create_translation_response_verbose_json){
        return ;
    }
    listEntry_t *listEntry;
    if (create_translation_response_verbose_json->language) {
        free(create_translation_response_verbose_json->language);
        create_translation_response_verbose_json->language = NULL;
    }
    if (create_translation_response_verbose_json->duration) {
        free(create_translation_response_verbose_json->duration);
        create_translation_response_verbose_json->duration = NULL;
    }
    if (create_translation_response_verbose_json->text) {
        free(create_translation_response_verbose_json->text);
        create_translation_response_verbose_json->text = NULL;
    }
    if (create_translation_response_verbose_json->segments) {
        list_ForEach(listEntry, create_translation_response_verbose_json->segments) {
            transcription_segment_free(listEntry->data);
        }
        list_freeList(create_translation_response_verbose_json->segments);
        create_translation_response_verbose_json->segments = NULL;
    }
    free(create_translation_response_verbose_json);
}

cJSON *create_translation_response_verbose_json_convertToJSON(create_translation_response_verbose_json_t *create_translation_response_verbose_json) {
    cJSON *item = cJSON_CreateObject();

    // create_translation_response_verbose_json->language
    if (!create_translation_response_verbose_json->language) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "language", create_translation_response_verbose_json->language) == NULL) {
    goto fail; //String
    }


    // create_translation_response_verbose_json->duration
    if (!create_translation_response_verbose_json->duration) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "duration", create_translation_response_verbose_json->duration) == NULL) {
    goto fail; //String
    }


    // create_translation_response_verbose_json->text
    if (!create_translation_response_verbose_json->text) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "text", create_translation_response_verbose_json->text) == NULL) {
    goto fail; //String
    }


    // create_translation_response_verbose_json->segments
    if(create_translation_response_verbose_json->segments) {
    cJSON *segments = cJSON_AddArrayToObject(item, "segments");
    if(segments == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *segmentsListEntry;
    if (create_translation_response_verbose_json->segments) {
    list_ForEach(segmentsListEntry, create_translation_response_verbose_json->segments) {
    cJSON *itemLocal = transcription_segment_convertToJSON(segmentsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(segments, itemLocal);
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

create_translation_response_verbose_json_t *create_translation_response_verbose_json_parseFromJSON(cJSON *create_translation_response_verbose_jsonJSON){

    create_translation_response_verbose_json_t *create_translation_response_verbose_json_local_var = NULL;

    // define the local list for create_translation_response_verbose_json->segments
    list_t *segmentsList = NULL;

    // create_translation_response_verbose_json->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(create_translation_response_verbose_jsonJSON, "language");
    if (!language) {
        goto end;
    }

    
    if(!cJSON_IsString(language))
    {
    goto end; //String
    }

    // create_translation_response_verbose_json->duration
    cJSON *duration = cJSON_GetObjectItemCaseSensitive(create_translation_response_verbose_jsonJSON, "duration");
    if (!duration) {
        goto end;
    }

    
    if(!cJSON_IsString(duration))
    {
    goto end; //String
    }

    // create_translation_response_verbose_json->text
    cJSON *text = cJSON_GetObjectItemCaseSensitive(create_translation_response_verbose_jsonJSON, "text");
    if (!text) {
        goto end;
    }

    
    if(!cJSON_IsString(text))
    {
    goto end; //String
    }

    // create_translation_response_verbose_json->segments
    cJSON *segments = cJSON_GetObjectItemCaseSensitive(create_translation_response_verbose_jsonJSON, "segments");
    if (segments) { 
    cJSON *segments_local_nonprimitive = NULL;
    if(!cJSON_IsArray(segments)){
        goto end; //nonprimitive container
    }

    segmentsList = list_createList();

    cJSON_ArrayForEach(segments_local_nonprimitive,segments )
    {
        if(!cJSON_IsObject(segments_local_nonprimitive)){
            goto end;
        }
        transcription_segment_t *segmentsItem = transcription_segment_parseFromJSON(segments_local_nonprimitive);

        list_addElement(segmentsList, segmentsItem);
    }
    }


    create_translation_response_verbose_json_local_var = create_translation_response_verbose_json_create (
        strdup(language->valuestring),
        strdup(duration->valuestring),
        strdup(text->valuestring),
        segments ? segmentsList : NULL
        );

    return create_translation_response_verbose_json_local_var;
end:
    if (segmentsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, segmentsList) {
            transcription_segment_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(segmentsList);
        segmentsList = NULL;
    }
    return NULL;

}
