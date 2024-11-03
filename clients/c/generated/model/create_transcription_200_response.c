#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_transcription_200_response.h"



create_transcription_200_response_t *create_transcription_200_response_create(
    char *text,
    char *language,
    char *duration,
    list_t *words,
    list_t *segments
    ) {
    create_transcription_200_response_t *create_transcription_200_response_local_var = malloc(sizeof(create_transcription_200_response_t));
    if (!create_transcription_200_response_local_var) {
        return NULL;
    }
    create_transcription_200_response_local_var->text = text;
    create_transcription_200_response_local_var->language = language;
    create_transcription_200_response_local_var->duration = duration;
    create_transcription_200_response_local_var->words = words;
    create_transcription_200_response_local_var->segments = segments;

    return create_transcription_200_response_local_var;
}


void create_transcription_200_response_free(create_transcription_200_response_t *create_transcription_200_response) {
    if(NULL == create_transcription_200_response){
        return ;
    }
    listEntry_t *listEntry;
    if (create_transcription_200_response->text) {
        free(create_transcription_200_response->text);
        create_transcription_200_response->text = NULL;
    }
    if (create_transcription_200_response->language) {
        free(create_transcription_200_response->language);
        create_transcription_200_response->language = NULL;
    }
    if (create_transcription_200_response->duration) {
        free(create_transcription_200_response->duration);
        create_transcription_200_response->duration = NULL;
    }
    if (create_transcription_200_response->words) {
        list_ForEach(listEntry, create_transcription_200_response->words) {
            transcription_word_free(listEntry->data);
        }
        list_freeList(create_transcription_200_response->words);
        create_transcription_200_response->words = NULL;
    }
    if (create_transcription_200_response->segments) {
        list_ForEach(listEntry, create_transcription_200_response->segments) {
            transcription_segment_free(listEntry->data);
        }
        list_freeList(create_transcription_200_response->segments);
        create_transcription_200_response->segments = NULL;
    }
    free(create_transcription_200_response);
}

cJSON *create_transcription_200_response_convertToJSON(create_transcription_200_response_t *create_transcription_200_response) {
    cJSON *item = cJSON_CreateObject();

    // create_transcription_200_response->text
    if (!create_transcription_200_response->text) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "text", create_transcription_200_response->text) == NULL) {
    goto fail; //String
    }


    // create_transcription_200_response->language
    if (!create_transcription_200_response->language) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "language", create_transcription_200_response->language) == NULL) {
    goto fail; //String
    }


    // create_transcription_200_response->duration
    if (!create_transcription_200_response->duration) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "duration", create_transcription_200_response->duration) == NULL) {
    goto fail; //String
    }


    // create_transcription_200_response->words
    if(create_transcription_200_response->words) {
    cJSON *words = cJSON_AddArrayToObject(item, "words");
    if(words == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *wordsListEntry;
    if (create_transcription_200_response->words) {
    list_ForEach(wordsListEntry, create_transcription_200_response->words) {
    cJSON *itemLocal = transcription_word_convertToJSON(wordsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(words, itemLocal);
    }
    }
    }


    // create_transcription_200_response->segments
    if(create_transcription_200_response->segments) {
    cJSON *segments = cJSON_AddArrayToObject(item, "segments");
    if(segments == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *segmentsListEntry;
    if (create_transcription_200_response->segments) {
    list_ForEach(segmentsListEntry, create_transcription_200_response->segments) {
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

create_transcription_200_response_t *create_transcription_200_response_parseFromJSON(cJSON *create_transcription_200_responseJSON){

    create_transcription_200_response_t *create_transcription_200_response_local_var = NULL;

    // define the local list for create_transcription_200_response->words
    list_t *wordsList = NULL;

    // define the local list for create_transcription_200_response->segments
    list_t *segmentsList = NULL;

    // create_transcription_200_response->text
    cJSON *text = cJSON_GetObjectItemCaseSensitive(create_transcription_200_responseJSON, "text");
    if (!text) {
        goto end;
    }

    
    if(!cJSON_IsString(text))
    {
    goto end; //String
    }

    // create_transcription_200_response->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(create_transcription_200_responseJSON, "language");
    if (!language) {
        goto end;
    }

    
    if(!cJSON_IsString(language))
    {
    goto end; //String
    }

    // create_transcription_200_response->duration
    cJSON *duration = cJSON_GetObjectItemCaseSensitive(create_transcription_200_responseJSON, "duration");
    if (!duration) {
        goto end;
    }

    
    if(!cJSON_IsString(duration))
    {
    goto end; //String
    }

    // create_transcription_200_response->words
    cJSON *words = cJSON_GetObjectItemCaseSensitive(create_transcription_200_responseJSON, "words");
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

    // create_transcription_200_response->segments
    cJSON *segments = cJSON_GetObjectItemCaseSensitive(create_transcription_200_responseJSON, "segments");
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


    create_transcription_200_response_local_var = create_transcription_200_response_create (
        strdup(text->valuestring),
        strdup(language->valuestring),
        strdup(duration->valuestring),
        words ? wordsList : NULL,
        segments ? segmentsList : NULL
        );

    return create_transcription_200_response_local_var;
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
