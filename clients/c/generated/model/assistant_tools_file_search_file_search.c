#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "assistant_tools_file_search_file_search.h"



static assistant_tools_file_search_file_search_t *assistant_tools_file_search_file_search_create_internal(
    int max_num_results,
    file_search_ranking_options_t *ranking_options
    ) {
    assistant_tools_file_search_file_search_t *assistant_tools_file_search_file_search_local_var = malloc(sizeof(assistant_tools_file_search_file_search_t));
    if (!assistant_tools_file_search_file_search_local_var) {
        return NULL;
    }
    assistant_tools_file_search_file_search_local_var->max_num_results = max_num_results;
    assistant_tools_file_search_file_search_local_var->ranking_options = ranking_options;

    assistant_tools_file_search_file_search_local_var->_library_owned = 1;
    return assistant_tools_file_search_file_search_local_var;
}

__attribute__((deprecated)) assistant_tools_file_search_file_search_t *assistant_tools_file_search_file_search_create(
    int max_num_results,
    file_search_ranking_options_t *ranking_options
    ) {
    return assistant_tools_file_search_file_search_create_internal (
        max_num_results,
        ranking_options
        );
}

void assistant_tools_file_search_file_search_free(assistant_tools_file_search_file_search_t *assistant_tools_file_search_file_search) {
    if(NULL == assistant_tools_file_search_file_search){
        return ;
    }
    if(assistant_tools_file_search_file_search->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "assistant_tools_file_search_file_search_free");
        return ;
    }
    listEntry_t *listEntry;
    if (assistant_tools_file_search_file_search->ranking_options) {
        file_search_ranking_options_free(assistant_tools_file_search_file_search->ranking_options);
        assistant_tools_file_search_file_search->ranking_options = NULL;
    }
    free(assistant_tools_file_search_file_search);
}

cJSON *assistant_tools_file_search_file_search_convertToJSON(assistant_tools_file_search_file_search_t *assistant_tools_file_search_file_search) {
    cJSON *item = cJSON_CreateObject();

    // assistant_tools_file_search_file_search->max_num_results
    if(assistant_tools_file_search_file_search->max_num_results) {
    if(cJSON_AddNumberToObject(item, "max_num_results", assistant_tools_file_search_file_search->max_num_results) == NULL) {
    goto fail; //Numeric
    }
    }


    // assistant_tools_file_search_file_search->ranking_options
    if(assistant_tools_file_search_file_search->ranking_options) {
    cJSON *ranking_options_local_JSON = file_search_ranking_options_convertToJSON(assistant_tools_file_search_file_search->ranking_options);
    if(ranking_options_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ranking_options", ranking_options_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

assistant_tools_file_search_file_search_t *assistant_tools_file_search_file_search_parseFromJSON(cJSON *assistant_tools_file_search_file_searchJSON){

    assistant_tools_file_search_file_search_t *assistant_tools_file_search_file_search_local_var = NULL;

    // define the local variable for assistant_tools_file_search_file_search->ranking_options
    file_search_ranking_options_t *ranking_options_local_nonprim = NULL;

    // assistant_tools_file_search_file_search->max_num_results
    cJSON *max_num_results = cJSON_GetObjectItemCaseSensitive(assistant_tools_file_search_file_searchJSON, "max_num_results");
    if (cJSON_IsNull(max_num_results)) {
        max_num_results = NULL;
    }
    if (max_num_results) { 
    if(!cJSON_IsNumber(max_num_results))
    {
    goto end; //Numeric
    }
    }

    // assistant_tools_file_search_file_search->ranking_options
    cJSON *ranking_options = cJSON_GetObjectItemCaseSensitive(assistant_tools_file_search_file_searchJSON, "ranking_options");
    if (cJSON_IsNull(ranking_options)) {
        ranking_options = NULL;
    }
    if (ranking_options) { 
    ranking_options_local_nonprim = file_search_ranking_options_parseFromJSON(ranking_options); //nonprimitive
    }


    assistant_tools_file_search_file_search_local_var = assistant_tools_file_search_file_search_create_internal (
        max_num_results ? max_num_results->valuedouble : 0,
        ranking_options ? ranking_options_local_nonprim : NULL
        );

    return assistant_tools_file_search_file_search_local_var;
end:
    if (ranking_options_local_nonprim) {
        file_search_ranking_options_free(ranking_options_local_nonprim);
        ranking_options_local_nonprim = NULL;
    }
    return NULL;

}
