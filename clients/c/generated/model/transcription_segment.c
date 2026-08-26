#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "transcription_segment.h"



static transcription_segment_t *transcription_segment_create_internal(
    int *id,
    int *seek,
    float *start,
    float *end,
    char *text,
    list_t *tokens,
    float *temperature,
    float *avg_logprob,
    float *compression_ratio,
    float *no_speech_prob
    ) {
    transcription_segment_t *transcription_segment_local_var = malloc(sizeof(transcription_segment_t));
    if (!transcription_segment_local_var) {
        return NULL;
    }
    memset(transcription_segment_local_var, 0, sizeof(transcription_segment_t));
    transcription_segment_local_var->_library_owned = 1;
    transcription_segment_local_var->id = id;
    transcription_segment_local_var->seek = seek;
    transcription_segment_local_var->start = start;
    transcription_segment_local_var->end = end;
    transcription_segment_local_var->text = text;
    transcription_segment_local_var->tokens = tokens;
    transcription_segment_local_var->temperature = temperature;
    transcription_segment_local_var->avg_logprob = avg_logprob;
    transcription_segment_local_var->compression_ratio = compression_ratio;
    transcription_segment_local_var->no_speech_prob = no_speech_prob;
    return transcription_segment_local_var;
}

__attribute__((deprecated)) transcription_segment_t *transcription_segment_create(
    int *id,
    int *seek,
    float *start,
    float *end,
    char *text,
    list_t *tokens,
    float *temperature,
    float *avg_logprob,
    float *compression_ratio,
    float *no_speech_prob
    ) {
    int *id_copy = NULL;
    if (id) {
        id_copy = malloc(sizeof(int));
        if (id_copy) *id_copy = *id;
    }
    int *seek_copy = NULL;
    if (seek) {
        seek_copy = malloc(sizeof(int));
        if (seek_copy) *seek_copy = *seek;
    }
    float *start_copy = NULL;
    if (start) {
        start_copy = malloc(sizeof(float));
        if (start_copy) *start_copy = *start;
    }
    float *end_copy = NULL;
    if (end) {
        end_copy = malloc(sizeof(float));
        if (end_copy) *end_copy = *end;
    }
    float *temperature_copy = NULL;
    if (temperature) {
        temperature_copy = malloc(sizeof(float));
        if (temperature_copy) *temperature_copy = *temperature;
    }
    float *avg_logprob_copy = NULL;
    if (avg_logprob) {
        avg_logprob_copy = malloc(sizeof(float));
        if (avg_logprob_copy) *avg_logprob_copy = *avg_logprob;
    }
    float *compression_ratio_copy = NULL;
    if (compression_ratio) {
        compression_ratio_copy = malloc(sizeof(float));
        if (compression_ratio_copy) *compression_ratio_copy = *compression_ratio;
    }
    float *no_speech_prob_copy = NULL;
    if (no_speech_prob) {
        no_speech_prob_copy = malloc(sizeof(float));
        if (no_speech_prob_copy) *no_speech_prob_copy = *no_speech_prob;
    }
    transcription_segment_t *result = transcription_segment_create_internal (
        id_copy,
        seek_copy,
        start_copy,
        end_copy,
        text,
        tokens,
        temperature_copy,
        avg_logprob_copy,
        compression_ratio_copy,
        no_speech_prob_copy
        );
    if (!result) {
        free(id_copy);
        free(seek_copy);
        free(start_copy);
        free(end_copy);
        free(temperature_copy);
        free(avg_logprob_copy);
        free(compression_ratio_copy);
        free(no_speech_prob_copy);
    }
    return result;
}

void transcription_segment_free(transcription_segment_t *transcription_segment) {
    if(NULL == transcription_segment){
        return ;
    }
    if(transcription_segment->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "transcription_segment_free");
        return ;
    }
    listEntry_t *listEntry;
    if (transcription_segment->id) {
        free(transcription_segment->id);
        transcription_segment->id = NULL;
    }
    if (transcription_segment->seek) {
        free(transcription_segment->seek);
        transcription_segment->seek = NULL;
    }
    if (transcription_segment->start) {
        free(transcription_segment->start);
        transcription_segment->start = NULL;
    }
    if (transcription_segment->end) {
        free(transcription_segment->end);
        transcription_segment->end = NULL;
    }
    if (transcription_segment->text) {
        free(transcription_segment->text);
        transcription_segment->text = NULL;
    }
    if (transcription_segment->tokens) {
        list_ForEach(listEntry, transcription_segment->tokens) {
            free(listEntry->data);
        }
        list_freeList(transcription_segment->tokens);
        transcription_segment->tokens = NULL;
    }
    if (transcription_segment->temperature) {
        free(transcription_segment->temperature);
        transcription_segment->temperature = NULL;
    }
    if (transcription_segment->avg_logprob) {
        free(transcription_segment->avg_logprob);
        transcription_segment->avg_logprob = NULL;
    }
    if (transcription_segment->compression_ratio) {
        free(transcription_segment->compression_ratio);
        transcription_segment->compression_ratio = NULL;
    }
    if (transcription_segment->no_speech_prob) {
        free(transcription_segment->no_speech_prob);
        transcription_segment->no_speech_prob = NULL;
    }
    free(transcription_segment);
}

cJSON *transcription_segment_convertToJSON(transcription_segment_t *transcription_segment) {
    cJSON *item = cJSON_CreateObject();

    // transcription_segment->id
    if (!transcription_segment->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", *transcription_segment->id) == NULL) {
    goto fail; //Numeric
    }


    // transcription_segment->seek
    if (!transcription_segment->seek) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "seek", *transcription_segment->seek) == NULL) {
    goto fail; //Numeric
    }


    // transcription_segment->start
    if (!transcription_segment->start) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "start", *transcription_segment->start) == NULL) {
    goto fail; //Numeric
    }


    // transcription_segment->end
    if (!transcription_segment->end) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "end", *transcription_segment->end) == NULL) {
    goto fail; //Numeric
    }


    // transcription_segment->text
    if (!transcription_segment->text) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "text", transcription_segment->text) == NULL) {
    goto fail; //String
    }


    // transcription_segment->tokens
    if (!transcription_segment->tokens) {
        goto fail;
    }
    cJSON *tokens = cJSON_AddArrayToObject(item, "tokens");
    if(tokens == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *tokensListEntry;
    list_ForEach(tokensListEntry, transcription_segment->tokens) {
    if(cJSON_AddNumberToObject(tokens, "", *(double *)tokensListEntry->data) == NULL)
    {
        goto fail;
    }
    }


    // transcription_segment->temperature
    if (!transcription_segment->temperature) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "temperature", *transcription_segment->temperature) == NULL) {
    goto fail; //Numeric
    }


    // transcription_segment->avg_logprob
    if (!transcription_segment->avg_logprob) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "avg_logprob", *transcription_segment->avg_logprob) == NULL) {
    goto fail; //Numeric
    }


    // transcription_segment->compression_ratio
    if (!transcription_segment->compression_ratio) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "compression_ratio", *transcription_segment->compression_ratio) == NULL) {
    goto fail; //Numeric
    }


    // transcription_segment->no_speech_prob
    if (!transcription_segment->no_speech_prob) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "no_speech_prob", *transcription_segment->no_speech_prob) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

transcription_segment_t *transcription_segment_parseFromJSON(cJSON *transcription_segmentJSON){

    transcription_segment_t *transcription_segment_local_var = NULL;

    // define the local variable for transcription_segment->id
    int *id_local_var = NULL;

    // define the local variable for transcription_segment->seek
    int *seek_local_var = NULL;

    // define the local variable for transcription_segment->start
    float *start_local_var = NULL;

    // define the local variable for transcription_segment->end
    float *end_local_var = NULL;

    char *text_local_str = NULL;

    // define the local list for transcription_segment->tokens
    list_t *tokensList = NULL;

    // define the local variable for transcription_segment->temperature
    float *temperature_local_var = NULL;

    // define the local variable for transcription_segment->avg_logprob
    float *avg_logprob_local_var = NULL;

    // define the local variable for transcription_segment->compression_ratio
    float *compression_ratio_local_var = NULL;

    // define the local variable for transcription_segment->no_speech_prob
    float *no_speech_prob_local_var = NULL;

    // transcription_segment->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(transcription_segmentJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }
    id_local_var = malloc(sizeof(int));
    if(!id_local_var)
    {
        goto end;
    }
    *id_local_var = id->valuedouble;

    // transcription_segment->seek
    cJSON *seek = cJSON_GetObjectItemCaseSensitive(transcription_segmentJSON, "seek");
    if (cJSON_IsNull(seek)) {
        seek = NULL;
    }
    if (!seek) {
        goto end;
    }

    
    if(!cJSON_IsNumber(seek))
    {
    goto end; //Numeric
    }
    seek_local_var = malloc(sizeof(int));
    if(!seek_local_var)
    {
        goto end;
    }
    *seek_local_var = seek->valuedouble;

    // transcription_segment->start
    cJSON *start = cJSON_GetObjectItemCaseSensitive(transcription_segmentJSON, "start");
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
    start_local_var = malloc(sizeof(float));
    if(!start_local_var)
    {
        goto end;
    }
    *start_local_var = start->valuedouble;

    // transcription_segment->end
    cJSON *end = cJSON_GetObjectItemCaseSensitive(transcription_segmentJSON, "end");
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
    end_local_var = malloc(sizeof(float));
    if(!end_local_var)
    {
        goto end;
    }
    *end_local_var = end->valuedouble;

    // transcription_segment->text
    cJSON *text = cJSON_GetObjectItemCaseSensitive(transcription_segmentJSON, "text");
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

    // transcription_segment->tokens
    cJSON *tokens = cJSON_GetObjectItemCaseSensitive(transcription_segmentJSON, "tokens");
    if (cJSON_IsNull(tokens)) {
        tokens = NULL;
    }
    if (!tokens) {
        goto end;
    }

    
    cJSON *tokens_local = NULL;
    if(!cJSON_IsArray(tokens)) {
        goto end;//primitive container
    }
    tokensList = list_createList();

    cJSON_ArrayForEach(tokens_local, tokens)
    {
        if(!cJSON_IsNumber(tokens_local))
        {
            goto end;
        }
        double *tokens_local_value = calloc(1, sizeof(double));
        if(!tokens_local_value)
        {
            goto end;
        }
        *tokens_local_value = tokens_local->valuedouble;
        list_addElement(tokensList , tokens_local_value);
    }

    // transcription_segment->temperature
    cJSON *temperature = cJSON_GetObjectItemCaseSensitive(transcription_segmentJSON, "temperature");
    if (cJSON_IsNull(temperature)) {
        temperature = NULL;
    }
    if (!temperature) {
        goto end;
    }

    
    if(!cJSON_IsNumber(temperature))
    {
    goto end; //Numeric
    }
    temperature_local_var = malloc(sizeof(float));
    if(!temperature_local_var)
    {
        goto end;
    }
    *temperature_local_var = temperature->valuedouble;

    // transcription_segment->avg_logprob
    cJSON *avg_logprob = cJSON_GetObjectItemCaseSensitive(transcription_segmentJSON, "avg_logprob");
    if (cJSON_IsNull(avg_logprob)) {
        avg_logprob = NULL;
    }
    if (!avg_logprob) {
        goto end;
    }

    
    if(!cJSON_IsNumber(avg_logprob))
    {
    goto end; //Numeric
    }
    avg_logprob_local_var = malloc(sizeof(float));
    if(!avg_logprob_local_var)
    {
        goto end;
    }
    *avg_logprob_local_var = avg_logprob->valuedouble;

    // transcription_segment->compression_ratio
    cJSON *compression_ratio = cJSON_GetObjectItemCaseSensitive(transcription_segmentJSON, "compression_ratio");
    if (cJSON_IsNull(compression_ratio)) {
        compression_ratio = NULL;
    }
    if (!compression_ratio) {
        goto end;
    }

    
    if(!cJSON_IsNumber(compression_ratio))
    {
    goto end; //Numeric
    }
    compression_ratio_local_var = malloc(sizeof(float));
    if(!compression_ratio_local_var)
    {
        goto end;
    }
    *compression_ratio_local_var = compression_ratio->valuedouble;

    // transcription_segment->no_speech_prob
    cJSON *no_speech_prob = cJSON_GetObjectItemCaseSensitive(transcription_segmentJSON, "no_speech_prob");
    if (cJSON_IsNull(no_speech_prob)) {
        no_speech_prob = NULL;
    }
    if (!no_speech_prob) {
        goto end;
    }

    
    if(!cJSON_IsNumber(no_speech_prob))
    {
    goto end; //Numeric
    }
    no_speech_prob_local_var = malloc(sizeof(float));
    if(!no_speech_prob_local_var)
    {
        goto end;
    }
    *no_speech_prob_local_var = no_speech_prob->valuedouble;


    if (text && !cJSON_IsNull(text)) text_local_str = strdup(text->valuestring);

    transcription_segment_local_var = transcription_segment_create_internal (
        id_local_var,
        seek_local_var,
        start_local_var,
        end_local_var,
        text_local_str,
        tokensList,
        temperature_local_var,
        avg_logprob_local_var,
        compression_ratio_local_var,
        no_speech_prob_local_var
        );

    if (!transcription_segment_local_var) {
        goto end;
    }

    return transcription_segment_local_var;
end:
    if (id_local_var) {
        free(id_local_var);
        id_local_var = NULL;
    }
    if (seek_local_var) {
        free(seek_local_var);
        seek_local_var = NULL;
    }
    if (start_local_var) {
        free(start_local_var);
        start_local_var = NULL;
    }
    if (end_local_var) {
        free(end_local_var);
        end_local_var = NULL;
    }
    if (text_local_str) {
        free(text_local_str);
        text_local_str = NULL;
    }
    if (tokensList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, tokensList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(tokensList);
        tokensList = NULL;
    }
    if (temperature_local_var) {
        free(temperature_local_var);
        temperature_local_var = NULL;
    }
    if (avg_logprob_local_var) {
        free(avg_logprob_local_var);
        avg_logprob_local_var = NULL;
    }
    if (compression_ratio_local_var) {
        free(compression_ratio_local_var);
        compression_ratio_local_var = NULL;
    }
    if (no_speech_prob_local_var) {
        free(no_speech_prob_local_var);
        no_speech_prob_local_var = NULL;
    }
    return NULL;

}
