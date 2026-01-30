#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "run_step_details_tool_calls_file_search_ranking_options_object.h"


char* run_step_details_tool_calls_file_search_ranking_options_object_ranker_ToString(openai_api_run_step_details_tool_calls_file_search_ranking_options_object_RANKER_e ranker) {
    char* rankerArray[] =  { "NULL", "default_2024_08_21" };
    return rankerArray[ranker];
}

openai_api_run_step_details_tool_calls_file_search_ranking_options_object_RANKER_e run_step_details_tool_calls_file_search_ranking_options_object_ranker_FromString(char* ranker){
    int stringToReturn = 0;
    char *rankerArray[] =  { "NULL", "default_2024_08_21" };
    size_t sizeofArray = sizeof(rankerArray) / sizeof(rankerArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(ranker, rankerArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static run_step_details_tool_calls_file_search_ranking_options_object_t *run_step_details_tool_calls_file_search_ranking_options_object_create_internal(
    openai_api_run_step_details_tool_calls_file_search_ranking_options_object_RANKER_e ranker,
    double score_threshold
    ) {
    run_step_details_tool_calls_file_search_ranking_options_object_t *run_step_details_tool_calls_file_search_ranking_options_object_local_var = malloc(sizeof(run_step_details_tool_calls_file_search_ranking_options_object_t));
    if (!run_step_details_tool_calls_file_search_ranking_options_object_local_var) {
        return NULL;
    }
    run_step_details_tool_calls_file_search_ranking_options_object_local_var->ranker = ranker;
    run_step_details_tool_calls_file_search_ranking_options_object_local_var->score_threshold = score_threshold;

    run_step_details_tool_calls_file_search_ranking_options_object_local_var->_library_owned = 1;
    return run_step_details_tool_calls_file_search_ranking_options_object_local_var;
}

__attribute__((deprecated)) run_step_details_tool_calls_file_search_ranking_options_object_t *run_step_details_tool_calls_file_search_ranking_options_object_create(
    openai_api_run_step_details_tool_calls_file_search_ranking_options_object_RANKER_e ranker,
    double score_threshold
    ) {
    return run_step_details_tool_calls_file_search_ranking_options_object_create_internal (
        ranker,
        score_threshold
        );
}

void run_step_details_tool_calls_file_search_ranking_options_object_free(run_step_details_tool_calls_file_search_ranking_options_object_t *run_step_details_tool_calls_file_search_ranking_options_object) {
    if(NULL == run_step_details_tool_calls_file_search_ranking_options_object){
        return ;
    }
    if(run_step_details_tool_calls_file_search_ranking_options_object->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "run_step_details_tool_calls_file_search_ranking_options_object_free");
        return ;
    }
    listEntry_t *listEntry;
    free(run_step_details_tool_calls_file_search_ranking_options_object);
}

cJSON *run_step_details_tool_calls_file_search_ranking_options_object_convertToJSON(run_step_details_tool_calls_file_search_ranking_options_object_t *run_step_details_tool_calls_file_search_ranking_options_object) {
    cJSON *item = cJSON_CreateObject();

    // run_step_details_tool_calls_file_search_ranking_options_object->ranker
    if (openai_api_run_step_details_tool_calls_file_search_ranking_options_object_RANKER_NULL == run_step_details_tool_calls_file_search_ranking_options_object->ranker) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "ranker", run_step_details_tool_calls_file_search_ranking_options_object_ranker_ToString(run_step_details_tool_calls_file_search_ranking_options_object->ranker)) == NULL)
    {
    goto fail; //Enum
    }


    // run_step_details_tool_calls_file_search_ranking_options_object->score_threshold
    if (!run_step_details_tool_calls_file_search_ranking_options_object->score_threshold) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "score_threshold", run_step_details_tool_calls_file_search_ranking_options_object->score_threshold) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

run_step_details_tool_calls_file_search_ranking_options_object_t *run_step_details_tool_calls_file_search_ranking_options_object_parseFromJSON(cJSON *run_step_details_tool_calls_file_search_ranking_options_objectJSON){

    run_step_details_tool_calls_file_search_ranking_options_object_t *run_step_details_tool_calls_file_search_ranking_options_object_local_var = NULL;

    // run_step_details_tool_calls_file_search_ranking_options_object->ranker
    cJSON *ranker = cJSON_GetObjectItemCaseSensitive(run_step_details_tool_calls_file_search_ranking_options_objectJSON, "ranker");
    if (cJSON_IsNull(ranker)) {
        ranker = NULL;
    }
    if (!ranker) {
        goto end;
    }

    openai_api_run_step_details_tool_calls_file_search_ranking_options_object_RANKER_e rankerVariable;
    
    if(!cJSON_IsString(ranker))
    {
    goto end; //Enum
    }
    rankerVariable = run_step_details_tool_calls_file_search_ranking_options_object_ranker_FromString(ranker->valuestring);

    // run_step_details_tool_calls_file_search_ranking_options_object->score_threshold
    cJSON *score_threshold = cJSON_GetObjectItemCaseSensitive(run_step_details_tool_calls_file_search_ranking_options_objectJSON, "score_threshold");
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


    run_step_details_tool_calls_file_search_ranking_options_object_local_var = run_step_details_tool_calls_file_search_ranking_options_object_create_internal (
        rankerVariable,
        score_threshold->valuedouble
        );

    return run_step_details_tool_calls_file_search_ranking_options_object_local_var;
end:
    return NULL;

}
