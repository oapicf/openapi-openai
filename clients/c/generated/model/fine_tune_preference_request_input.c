#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "fine_tune_preference_request_input.h"



static fine_tune_preference_request_input_t *fine_tune_preference_request_input_create_internal(
    fine_tune_preference_request_input_input_t *input,
    list_t *preferred_completion,
    list_t *non_preferred_completion
    ) {
    fine_tune_preference_request_input_t *fine_tune_preference_request_input_local_var = malloc(sizeof(fine_tune_preference_request_input_t));
    if (!fine_tune_preference_request_input_local_var) {
        return NULL;
    }
    fine_tune_preference_request_input_local_var->input = input;
    fine_tune_preference_request_input_local_var->preferred_completion = preferred_completion;
    fine_tune_preference_request_input_local_var->non_preferred_completion = non_preferred_completion;

    fine_tune_preference_request_input_local_var->_library_owned = 1;
    return fine_tune_preference_request_input_local_var;
}

__attribute__((deprecated)) fine_tune_preference_request_input_t *fine_tune_preference_request_input_create(
    fine_tune_preference_request_input_input_t *input,
    list_t *preferred_completion,
    list_t *non_preferred_completion
    ) {
    return fine_tune_preference_request_input_create_internal (
        input,
        preferred_completion,
        non_preferred_completion
        );
}

void fine_tune_preference_request_input_free(fine_tune_preference_request_input_t *fine_tune_preference_request_input) {
    if(NULL == fine_tune_preference_request_input){
        return ;
    }
    if(fine_tune_preference_request_input->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "fine_tune_preference_request_input_free");
        return ;
    }
    listEntry_t *listEntry;
    if (fine_tune_preference_request_input->input) {
        fine_tune_preference_request_input_input_free(fine_tune_preference_request_input->input);
        fine_tune_preference_request_input->input = NULL;
    }
    if (fine_tune_preference_request_input->preferred_completion) {
        list_ForEach(listEntry, fine_tune_preference_request_input->preferred_completion) {
            fine_tune_preference_request_input_preferred_completion_inner_free(listEntry->data);
        }
        list_freeList(fine_tune_preference_request_input->preferred_completion);
        fine_tune_preference_request_input->preferred_completion = NULL;
    }
    if (fine_tune_preference_request_input->non_preferred_completion) {
        list_ForEach(listEntry, fine_tune_preference_request_input->non_preferred_completion) {
            fine_tune_preference_request_input_preferred_completion_inner_free(listEntry->data);
        }
        list_freeList(fine_tune_preference_request_input->non_preferred_completion);
        fine_tune_preference_request_input->non_preferred_completion = NULL;
    }
    free(fine_tune_preference_request_input);
}

cJSON *fine_tune_preference_request_input_convertToJSON(fine_tune_preference_request_input_t *fine_tune_preference_request_input) {
    cJSON *item = cJSON_CreateObject();

    // fine_tune_preference_request_input->input
    if(fine_tune_preference_request_input->input) {
    cJSON *input_local_JSON = fine_tune_preference_request_input_input_convertToJSON(fine_tune_preference_request_input->input);
    if(input_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "input", input_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // fine_tune_preference_request_input->preferred_completion
    if(fine_tune_preference_request_input->preferred_completion) {
    cJSON *preferred_completion = cJSON_AddArrayToObject(item, "preferred_completion");
    if(preferred_completion == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *preferred_completionListEntry;
    if (fine_tune_preference_request_input->preferred_completion) {
    list_ForEach(preferred_completionListEntry, fine_tune_preference_request_input->preferred_completion) {
    cJSON *itemLocal = fine_tune_preference_request_input_preferred_completion_inner_convertToJSON(preferred_completionListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(preferred_completion, itemLocal);
    }
    }
    }


    // fine_tune_preference_request_input->non_preferred_completion
    if(fine_tune_preference_request_input->non_preferred_completion) {
    cJSON *non_preferred_completion = cJSON_AddArrayToObject(item, "non_preferred_completion");
    if(non_preferred_completion == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *non_preferred_completionListEntry;
    if (fine_tune_preference_request_input->non_preferred_completion) {
    list_ForEach(non_preferred_completionListEntry, fine_tune_preference_request_input->non_preferred_completion) {
    cJSON *itemLocal = fine_tune_preference_request_input_preferred_completion_inner_convertToJSON(non_preferred_completionListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(non_preferred_completion, itemLocal);
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

fine_tune_preference_request_input_t *fine_tune_preference_request_input_parseFromJSON(cJSON *fine_tune_preference_request_inputJSON){

    fine_tune_preference_request_input_t *fine_tune_preference_request_input_local_var = NULL;

    // define the local variable for fine_tune_preference_request_input->input
    fine_tune_preference_request_input_input_t *input_local_nonprim = NULL;

    // define the local list for fine_tune_preference_request_input->preferred_completion
    list_t *preferred_completionList = NULL;

    // define the local list for fine_tune_preference_request_input->non_preferred_completion
    list_t *non_preferred_completionList = NULL;

    // fine_tune_preference_request_input->input
    cJSON *input = cJSON_GetObjectItemCaseSensitive(fine_tune_preference_request_inputJSON, "input");
    if (cJSON_IsNull(input)) {
        input = NULL;
    }
    if (input) { 
    input_local_nonprim = fine_tune_preference_request_input_input_parseFromJSON(input); //nonprimitive
    }

    // fine_tune_preference_request_input->preferred_completion
    cJSON *preferred_completion = cJSON_GetObjectItemCaseSensitive(fine_tune_preference_request_inputJSON, "preferred_completion");
    if (cJSON_IsNull(preferred_completion)) {
        preferred_completion = NULL;
    }
    if (preferred_completion) { 
    cJSON *preferred_completion_local_nonprimitive = NULL;
    if(!cJSON_IsArray(preferred_completion)){
        goto end; //nonprimitive container
    }

    preferred_completionList = list_createList();

    cJSON_ArrayForEach(preferred_completion_local_nonprimitive,preferred_completion )
    {
        if(!cJSON_IsObject(preferred_completion_local_nonprimitive)){
            goto end;
        }
        fine_tune_preference_request_input_preferred_completion_inner_t *preferred_completionItem = fine_tune_preference_request_input_preferred_completion_inner_parseFromJSON(preferred_completion_local_nonprimitive);

        list_addElement(preferred_completionList, preferred_completionItem);
    }
    }

    // fine_tune_preference_request_input->non_preferred_completion
    cJSON *non_preferred_completion = cJSON_GetObjectItemCaseSensitive(fine_tune_preference_request_inputJSON, "non_preferred_completion");
    if (cJSON_IsNull(non_preferred_completion)) {
        non_preferred_completion = NULL;
    }
    if (non_preferred_completion) { 
    cJSON *non_preferred_completion_local_nonprimitive = NULL;
    if(!cJSON_IsArray(non_preferred_completion)){
        goto end; //nonprimitive container
    }

    non_preferred_completionList = list_createList();

    cJSON_ArrayForEach(non_preferred_completion_local_nonprimitive,non_preferred_completion )
    {
        if(!cJSON_IsObject(non_preferred_completion_local_nonprimitive)){
            goto end;
        }
        fine_tune_preference_request_input_preferred_completion_inner_t *non_preferred_completionItem = fine_tune_preference_request_input_preferred_completion_inner_parseFromJSON(non_preferred_completion_local_nonprimitive);

        list_addElement(non_preferred_completionList, non_preferred_completionItem);
    }
    }


    fine_tune_preference_request_input_local_var = fine_tune_preference_request_input_create_internal (
        input ? input_local_nonprim : NULL,
        preferred_completion ? preferred_completionList : NULL,
        non_preferred_completion ? non_preferred_completionList : NULL
        );

    return fine_tune_preference_request_input_local_var;
end:
    if (input_local_nonprim) {
        fine_tune_preference_request_input_input_free(input_local_nonprim);
        input_local_nonprim = NULL;
    }
    if (preferred_completionList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, preferred_completionList) {
            fine_tune_preference_request_input_preferred_completion_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(preferred_completionList);
        preferred_completionList = NULL;
    }
    if (non_preferred_completionList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, non_preferred_completionList) {
            fine_tune_preference_request_input_preferred_completion_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(non_preferred_completionList);
        non_preferred_completionList = NULL;
    }
    return NULL;

}
