#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "file_search_ranking_options.h"


char* file_search_ranking_options_ranker_ToString(openai_api_file_search_ranking_options_RANKER_e ranker) {
    char* rankerArray[] =  { "NULL", "auto", "default_2024_08_21" };
    return rankerArray[ranker];
}

openai_api_file_search_ranking_options_RANKER_e file_search_ranking_options_ranker_FromString(char* ranker){
    int stringToReturn = 0;
    char *rankerArray[] =  { "NULL", "auto", "default_2024_08_21" };
    size_t sizeofArray = sizeof(rankerArray) / sizeof(rankerArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(ranker, rankerArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static file_search_ranking_options_t *file_search_ranking_options_create_internal(
    openai_api_file_search_ranking_options_RANKER_e ranker,
    double *score_threshold
    ) {
    file_search_ranking_options_t *file_search_ranking_options_local_var = malloc(sizeof(file_search_ranking_options_t));
    if (!file_search_ranking_options_local_var) {
        return NULL;
    }
    memset(file_search_ranking_options_local_var, 0, sizeof(file_search_ranking_options_t));
    file_search_ranking_options_local_var->_library_owned = 1;
    file_search_ranking_options_local_var->ranker = ranker;
    file_search_ranking_options_local_var->score_threshold = score_threshold;
    return file_search_ranking_options_local_var;
}

__attribute__((deprecated)) file_search_ranking_options_t *file_search_ranking_options_create(
    openai_api_file_search_ranking_options_RANKER_e ranker,
    double *score_threshold
    ) {
    double *score_threshold_copy = NULL;
    if (score_threshold) {
        score_threshold_copy = malloc(sizeof(double));
        if (score_threshold_copy) *score_threshold_copy = *score_threshold;
    }
    file_search_ranking_options_t *result = file_search_ranking_options_create_internal (
        ranker,
        score_threshold_copy
        );
    if (!result) {
        free(score_threshold_copy);
    }
    return result;
}

void file_search_ranking_options_free(file_search_ranking_options_t *file_search_ranking_options) {
    if(NULL == file_search_ranking_options){
        return ;
    }
    if(file_search_ranking_options->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "file_search_ranking_options_free");
        return ;
    }
    listEntry_t *listEntry;
    if (file_search_ranking_options->score_threshold) {
        free(file_search_ranking_options->score_threshold);
        file_search_ranking_options->score_threshold = NULL;
    }
    free(file_search_ranking_options);
}

cJSON *file_search_ranking_options_convertToJSON(file_search_ranking_options_t *file_search_ranking_options) {
    cJSON *item = cJSON_CreateObject();

    // file_search_ranking_options->ranker
    if(file_search_ranking_options->ranker != openai_api_file_search_ranking_options_RANKER_NULL) {
    if(cJSON_AddStringToObject(item, "ranker", file_search_ranking_options_ranker_ToString(file_search_ranking_options->ranker)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // file_search_ranking_options->score_threshold
    if (!file_search_ranking_options->score_threshold) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "score_threshold", *file_search_ranking_options->score_threshold) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

file_search_ranking_options_t *file_search_ranking_options_parseFromJSON(cJSON *file_search_ranking_optionsJSON){

    file_search_ranking_options_t *file_search_ranking_options_local_var = NULL;

    // define the local variable for file_search_ranking_options->score_threshold
    double *score_threshold_local_var = NULL;

    // file_search_ranking_options->ranker
    cJSON *ranker = cJSON_GetObjectItemCaseSensitive(file_search_ranking_optionsJSON, "ranker");
    if (cJSON_IsNull(ranker)) {
        ranker = NULL;
    }
    openai_api_file_search_ranking_options_RANKER_e rankerVariable;
    if (ranker) { 
    if(!cJSON_IsString(ranker))
    {
    goto end; //Enum
    }
    rankerVariable = file_search_ranking_options_ranker_FromString(ranker->valuestring);
    }

    // file_search_ranking_options->score_threshold
    cJSON *score_threshold = cJSON_GetObjectItemCaseSensitive(file_search_ranking_optionsJSON, "score_threshold");
    if (cJSON_IsNull(score_threshold)) {
        score_threshold = NULL;
    }
    if (!score_threshold) {
        goto end;
    }

    
    if(!cJSON_IsNumber(score_threshold))
    {
    goto end; //Numeric
    }
    score_threshold_local_var = malloc(sizeof(double));
    if(!score_threshold_local_var)
    {
        goto end;
    }
    *score_threshold_local_var = score_threshold->valuedouble;



    file_search_ranking_options_local_var = file_search_ranking_options_create_internal (
        ranker ? rankerVariable : openai_api_file_search_ranking_options_RANKER_NULL,
        score_threshold_local_var
        );

    if (!file_search_ranking_options_local_var) {
        goto end;
    }

    return file_search_ranking_options_local_var;
end:
    if (score_threshold_local_var) {
        free(score_threshold_local_var);
        score_threshold_local_var = NULL;
    }
    return NULL;

}
