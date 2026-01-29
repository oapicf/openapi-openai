#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_transcription_response_verbose_json.h"



static create_transcription_response_verbose_json_t *create_transcription_response_verbose_json_create_internal(
    char *language,
    char *duration,
    char *text,
    list_t *words,
    list_t *segments
    ) {
    create_transcription_response_verbose_json_t *create_transcription_response_verbose_json_local_var = malloc(sizeof(create_transcription_response_verbose_json_t));
    if (!create_transcription_response_verbose_json_local_var) {
        return NULL;
    }
    create_transcription_response_verbose_json_local_var->language = language;
    create_transcription_response_verbose_json_local_var->duration = duration;
    create_transcription_response_verbose_json_local_var->text = text;
    create_transcription_response_verbose_json_local_var->words = words;
    create_transcription_response_verbose_json_local_var->segments = segments;

    create_transcription_response_verbose_json_local_var->_library_owned = 1;
    return create_transcription_response_verbose_json_local_var;
}

__attribute__((deprecated)) create_transcription_response_verbose_json_t *create_transcription_response_verbose_json_create(
    char *language,
    char *duration,
    char *text,
    list_t *words,
    list_t *segments
    ) {
    return create_transcription_response_verbose_json_create_internal (
        language,
        duration,
        text,
        words,
        segments
        );
}

void create_transcription_response_verbose_json_free(create_transcription_response_verbose_json_t *create_transcription_response_verbose_json) {
    if(NULL == create_transcription_response_verbose_json){
        return ;
    }
    if(create_transcription_response_verbose_json->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "create_transcription_response_verbose_json_free");
        return ;
    }
    listEntry_t *listEntry;
    if (create_transcription_response_verbose_json->language) {
        free(create_transcription_response_verbose_json->language);
        create_transcription_response_verbose_json->language = NULL;
    }
    if (create_transcription_response_verbose_json->duration) {
        free(create_transcription_response_verbose_json->duration);
        create_transcription_response_verbose_json->duration = NULL;
    }
    if (create_transcription_response_verbose_json->text) {
        free(create_transcription_response_verbose_json->text);
        create_transcription_response_verbose_json->text = NULL;
    }
    if (create_transcription_response_verbose_json->words) {
        list_ForEach(listEntry, create_transcription_response_verbose_json->words) {
            transcription_word_free(listEntry->data);
        }
        list_freeList(create_transcription_response_verbose_json->words);
        create_transcription_response_verbose_json->words = NULL;
    }
    if (create_transcription_response_verbose_json->segments) {
        list_ForEach(listEntry, create_transcription_response_verbose_json->segments) {
            transcription_segment_free(listEntry->data);
        }
        list_freeList(create_transcription_response_verbose_json->segments);
        create_transcription_response_verbose_json->segments = NULL;
    }
    free(create_transcription_response_verbose_json);
}

cJSON *create_transcription_response_verbose_json_convertToJSON(create_transcription_response_verbose_json_t *create_transcription_response_verbose_json) {
    cJSON *item = cJSON_CreateObject();

    // create_transcription_response_verbose_json->language
    if (!create_transcription_response_verbose_json->language) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "language", create_transcription_response_verbose_json->language) == NULL) {
    goto fail; //String
    }


    // create_transcription_response_verbose_json->duration
    if (!create_transcription_response_verbose_json->duration) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "duration", create_transcription_response_verbose_json->duration) == NULL) {
    goto fail; //String
    }


    // create_transcription_response_verbose_json->text
    if (!create_transcription_response_verbose_json->text) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "text", create_transcription_response_verbose_json->text) == NULL) {
    goto fail; //String
    }


    // create_transcription_response_verbose_json->words
    if(create_transcription_response_verbose_json->words) {
    cJSON *words = cJSON_AddArrayToObject(item, "words");
    if(words == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *wordsListEntry;
    if (create_transcription_response_verbose_json->words) {
    list_ForEach(wordsListEntry, create_transcription_response_verbose_json->words) {
    cJSON *itemLocal = transcription_word_convertToJSON(wordsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(words, itemLocal);
    }
    }
    }


    // create_transcription_response_verbose_json->segments
    if(create_transcription_response_verbose_json->segments) {
    cJSON *segments = cJSON_AddArrayToObject(item, "segments");
    if(segments == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *segmentsListEntry;
    if (create_transcription_response_verbose_json->segments) {
    list_ForEach(segmentsListEntry, create_transcription_response_verbose_json->segments) {
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

create_transcription_response_verbose_json_t *create_transcription_response_verbose_json_parseFromJSON(cJSON *create_transcription_response_verbose_jsonJSON){

    create_transcription_response_verbose_json_t *create_transcription_response_verbose_json_local_var = NULL;

    // define the local list for create_transcription_response_verbose_json->words
    list_t *wordsList = NULL;

    // define the local list for create_transcription_response_verbose_json->segments
    list_t *segmentsList = NULL;

    // create_transcription_response_verbose_json->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(create_transcription_response_verbose_jsonJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    if(!cJSON_IsString(language))
    {
    goto end; //String
    }

    // create_transcription_response_verbose_json->duration
    cJSON *duration = cJSON_GetObjectItemCaseSensitive(create_transcription_response_verbose_jsonJSON, "duration");
    if (cJSON_IsNull(duration)) {
        duration = NULL;
    }
    if (!duration) {
        goto end;
    }

    
    if(!cJSON_IsString(duration))
    {
    goto end; //String
    }

    // create_transcription_response_verbose_json->text
    cJSON *text = cJSON_GetObjectItemCaseSensitive(create_transcription_response_verbose_jsonJSON, "text");
    if (cJSON_IsNull(text)) {
        text = NULL;
    }
    if (!text) {
        goto end;
    }

    
    if(!cJSON_IsString(text))
    {
    goto end; //String
    }

    // create_transcription_response_verbose_json->words
    cJSON *words = cJSON_GetObjectItemCaseSensitive(create_transcription_response_verbose_jsonJSON, "words");
    if (cJSON_IsNull(words)) {
        words = NULL;
    }
    if (words) { 
    cJSON *words_local_nonprimitive = NULL;
    if(!cJSON_IsArray(words)){
        goto end; //nonprimitive container
    }

    wordsList = list_createList();

    cJSON_ArrayForEach(words_local_nonprimitive,words )
    {
        if(!cJSON_IsObject(words_local_nonprimitive)){
            goto end;
        }
        transcription_word_t *wordsItem = transcription_word_parseFromJSON(words_local_nonprimitive);

        list_addElement(wordsList, wordsItem);
    }
    }

    // create_transcription_response_verbose_json->segments
    cJSON *segments = cJSON_GetObjectItemCaseSensitive(create_transcription_response_verbose_jsonJSON, "segments");
    if (cJSON_IsNull(segments)) {
        segments = NULL;
    }
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


    create_transcription_response_verbose_json_local_var = create_transcription_response_verbose_json_create_internal (
        strdup(language->valuestring),
        strdup(duration->valuestring),
        strdup(text->valuestring),
        words ? wordsList : NULL,
        segments ? segmentsList : NULL
        );

    return create_transcription_response_verbose_json_local_var;
end:
    if (wordsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, wordsList) {
            transcription_word_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(wordsList);
        wordsList = NULL;
    }
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
