#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "transcription_word.h"



static transcription_word_t *transcription_word_create_internal(
    char *word,
    float start,
    float end
    ) {
    transcription_word_t *transcription_word_local_var = malloc(sizeof(transcription_word_t));
    if (!transcription_word_local_var) {
        return NULL;
    }
    transcription_word_local_var->word = word;
    transcription_word_local_var->start = start;
    transcription_word_local_var->end = end;

    transcription_word_local_var->_library_owned = 1;
    return transcription_word_local_var;
}

__attribute__((deprecated)) transcription_word_t *transcription_word_create(
    char *word,
    float start,
    float end
    ) {
    return transcription_word_create_internal (
        word,
        start,
        end
        );
}

void transcription_word_free(transcription_word_t *transcription_word) {
    if(NULL == transcription_word){
        return ;
    }
    if(transcription_word->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "transcription_word_free");
        return ;
    }
    listEntry_t *listEntry;
    if (transcription_word->word) {
        free(transcription_word->word);
        transcription_word->word = NULL;
    }
    free(transcription_word);
}

cJSON *transcription_word_convertToJSON(transcription_word_t *transcription_word) {
    cJSON *item = cJSON_CreateObject();

    // transcription_word->word
    if (!transcription_word->word) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "word", transcription_word->word) == NULL) {
    goto fail; //String
    }


    // transcription_word->start
    if (!transcription_word->start) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "start", transcription_word->start) == NULL) {
    goto fail; //Numeric
    }


    // transcription_word->end
    if (!transcription_word->end) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "end", transcription_word->end) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

transcription_word_t *transcription_word_parseFromJSON(cJSON *transcription_wordJSON){

    transcription_word_t *transcription_word_local_var = NULL;

    // transcription_word->word
    cJSON *word = cJSON_GetObjectItemCaseSensitive(transcription_wordJSON, "word");
    if (cJSON_IsNull(word)) {
        word = NULL;
    }
    if (!word) {
        goto end;
    }

    
    if(!cJSON_IsString(word))
    {
    goto end; //String
    }

    // transcription_word->start
    cJSON *start = cJSON_GetObjectItemCaseSensitive(transcription_wordJSON, "start");
    if (cJSON_IsNull(start)) {
        start = NULL;
    }
    if (!start) {
        goto end;
    }

    
    if(!cJSON_IsNumber(start))
    {
    goto end; //Numeric
    }

    // transcription_word->end
    cJSON *end = cJSON_GetObjectItemCaseSensitive(transcription_wordJSON, "end");
    if (cJSON_IsNull(end)) {
        end = NULL;
    }
    if (!end) {
        goto end;
    }

    
    if(!cJSON_IsNumber(end))
    {
    goto end; //Numeric
    }


    transcription_word_local_var = transcription_word_create_internal (
        strdup(word->valuestring),
        start->valuedouble,
        end->valuedouble
        );

    return transcription_word_local_var;
end:
    return NULL;

}
