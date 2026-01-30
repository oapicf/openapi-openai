#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "run_step_details_tool_calls_file_search_object_file_search.h"



static run_step_details_tool_calls_file_search_object_file_search_t *run_step_details_tool_calls_file_search_object_file_search_create_internal(
    run_step_details_tool_calls_file_search_ranking_options_object_t *ranking_options,
    list_t *results
    ) {
    run_step_details_tool_calls_file_search_object_file_search_t *run_step_details_tool_calls_file_search_object_file_search_local_var = malloc(sizeof(run_step_details_tool_calls_file_search_object_file_search_t));
    if (!run_step_details_tool_calls_file_search_object_file_search_local_var) {
        return NULL;
    }
    run_step_details_tool_calls_file_search_object_file_search_local_var->ranking_options = ranking_options;
    run_step_details_tool_calls_file_search_object_file_search_local_var->results = results;

    run_step_details_tool_calls_file_search_object_file_search_local_var->_library_owned = 1;
    return run_step_details_tool_calls_file_search_object_file_search_local_var;
}

__attribute__((deprecated)) run_step_details_tool_calls_file_search_object_file_search_t *run_step_details_tool_calls_file_search_object_file_search_create(
    run_step_details_tool_calls_file_search_ranking_options_object_t *ranking_options,
    list_t *results
    ) {
    return run_step_details_tool_calls_file_search_object_file_search_create_internal (
        ranking_options,
        results
        );
}

void run_step_details_tool_calls_file_search_object_file_search_free(run_step_details_tool_calls_file_search_object_file_search_t *run_step_details_tool_calls_file_search_object_file_search) {
    if(NULL == run_step_details_tool_calls_file_search_object_file_search){
        return ;
    }
    if(run_step_details_tool_calls_file_search_object_file_search->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "run_step_details_tool_calls_file_search_object_file_search_free");
        return ;
    }
    listEntry_t *listEntry;
    if (run_step_details_tool_calls_file_search_object_file_search->ranking_options) {
        run_step_details_tool_calls_file_search_ranking_options_object_free(run_step_details_tool_calls_file_search_object_file_search->ranking_options);
        run_step_details_tool_calls_file_search_object_file_search->ranking_options = NULL;
    }
    if (run_step_details_tool_calls_file_search_object_file_search->results) {
        list_ForEach(listEntry, run_step_details_tool_calls_file_search_object_file_search->results) {
            run_step_details_tool_calls_file_search_result_object_free(listEntry->data);
        }
        list_freeList(run_step_details_tool_calls_file_search_object_file_search->results);
        run_step_details_tool_calls_file_search_object_file_search->results = NULL;
    }
    free(run_step_details_tool_calls_file_search_object_file_search);
}

cJSON *run_step_details_tool_calls_file_search_object_file_search_convertToJSON(run_step_details_tool_calls_file_search_object_file_search_t *run_step_details_tool_calls_file_search_object_file_search) {
    cJSON *item = cJSON_CreateObject();

    // run_step_details_tool_calls_file_search_object_file_search->ranking_options
    if(run_step_details_tool_calls_file_search_object_file_search->ranking_options) {
    cJSON *ranking_options_local_JSON = run_step_details_tool_calls_file_search_ranking_options_object_convertToJSON(run_step_details_tool_calls_file_search_object_file_search->ranking_options);
    if(ranking_options_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ranking_options", ranking_options_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // run_step_details_tool_calls_file_search_object_file_search->results
    if(run_step_details_tool_calls_file_search_object_file_search->results) {
    cJSON *results = cJSON_AddArrayToObject(item, "results");
    if(results == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *resultsListEntry;
    if (run_step_details_tool_calls_file_search_object_file_search->results) {
    list_ForEach(resultsListEntry, run_step_details_tool_calls_file_search_object_file_search->results) {
    cJSON *itemLocal = run_step_details_tool_calls_file_search_result_object_convertToJSON(resultsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(results, itemLocal);
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

run_step_details_tool_calls_file_search_object_file_search_t *run_step_details_tool_calls_file_search_object_file_search_parseFromJSON(cJSON *run_step_details_tool_calls_file_search_object_file_searchJSON){

    run_step_details_tool_calls_file_search_object_file_search_t *run_step_details_tool_calls_file_search_object_file_search_local_var = NULL;

    // define the local variable for run_step_details_tool_calls_file_search_object_file_search->ranking_options
    run_step_details_tool_calls_file_search_ranking_options_object_t *ranking_options_local_nonprim = NULL;

    // define the local list for run_step_details_tool_calls_file_search_object_file_search->results
    list_t *resultsList = NULL;

    // run_step_details_tool_calls_file_search_object_file_search->ranking_options
    cJSON *ranking_options = cJSON_GetObjectItemCaseSensitive(run_step_details_tool_calls_file_search_object_file_searchJSON, "ranking_options");
    if (cJSON_IsNull(ranking_options)) {
        ranking_options = NULL;
    }
    if (ranking_options) { 
    ranking_options_local_nonprim = run_step_details_tool_calls_file_search_ranking_options_object_parseFromJSON(ranking_options); //nonprimitive
    }

    // run_step_details_tool_calls_file_search_object_file_search->results
    cJSON *results = cJSON_GetObjectItemCaseSensitive(run_step_details_tool_calls_file_search_object_file_searchJSON, "results");
    if (cJSON_IsNull(results)) {
        results = NULL;
    }
    if (results) { 
    cJSON *results_local_nonprimitive = NULL;
    if(!cJSON_IsArray(results)){
        goto end; //nonprimitive container
    }

    resultsList = list_createList();

    cJSON_ArrayForEach(results_local_nonprimitive,results )
    {
        if(!cJSON_IsObject(results_local_nonprimitive)){
            goto end;
        }
        run_step_details_tool_calls_file_search_result_object_t *resultsItem = run_step_details_tool_calls_file_search_result_object_parseFromJSON(results_local_nonprimitive);

        list_addElement(resultsList, resultsItem);
    }
    }


    run_step_details_tool_calls_file_search_object_file_search_local_var = run_step_details_tool_calls_file_search_object_file_search_create_internal (
        ranking_options ? ranking_options_local_nonprim : NULL,
        results ? resultsList : NULL
        );

    return run_step_details_tool_calls_file_search_object_file_search_local_var;
end:
    if (ranking_options_local_nonprim) {
        run_step_details_tool_calls_file_search_ranking_options_object_free(ranking_options_local_nonprim);
        ranking_options_local_nonprim = NULL;
    }
    if (resultsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, resultsList) {
            run_step_details_tool_calls_file_search_result_object_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(resultsList);
        resultsList = NULL;
    }
    return NULL;

}
