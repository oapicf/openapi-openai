#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "fine_tune_completion_request_input.h"



static fine_tune_completion_request_input_t *fine_tune_completion_request_input_create_internal(
    char *prompt,
    char *completion
    ) {
    fine_tune_completion_request_input_t *fine_tune_completion_request_input_local_var = malloc(sizeof(fine_tune_completion_request_input_t));
    if (!fine_tune_completion_request_input_local_var) {
        return NULL;
    }
    fine_tune_completion_request_input_local_var->prompt = prompt;
    fine_tune_completion_request_input_local_var->completion = completion;

    fine_tune_completion_request_input_local_var->_library_owned = 1;
    return fine_tune_completion_request_input_local_var;
}

__attribute__((deprecated)) fine_tune_completion_request_input_t *fine_tune_completion_request_input_create(
    char *prompt,
    char *completion
    ) {
    return fine_tune_completion_request_input_create_internal (
        prompt,
        completion
        );
}

void fine_tune_completion_request_input_free(fine_tune_completion_request_input_t *fine_tune_completion_request_input) {
    if(NULL == fine_tune_completion_request_input){
        return ;
    }
    if(fine_tune_completion_request_input->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "fine_tune_completion_request_input_free");
        return ;
    }
    listEntry_t *listEntry;
    if (fine_tune_completion_request_input->prompt) {
        free(fine_tune_completion_request_input->prompt);
        fine_tune_completion_request_input->prompt = NULL;
    }
    if (fine_tune_completion_request_input->completion) {
        free(fine_tune_completion_request_input->completion);
        fine_tune_completion_request_input->completion = NULL;
    }
    free(fine_tune_completion_request_input);
}

cJSON *fine_tune_completion_request_input_convertToJSON(fine_tune_completion_request_input_t *fine_tune_completion_request_input) {
    cJSON *item = cJSON_CreateObject();

    // fine_tune_completion_request_input->prompt
    if(fine_tune_completion_request_input->prompt) {
    if(cJSON_AddStringToObject(item, "prompt", fine_tune_completion_request_input->prompt) == NULL) {
    goto fail; //String
    }
    }


    // fine_tune_completion_request_input->completion
    if(fine_tune_completion_request_input->completion) {
    if(cJSON_AddStringToObject(item, "completion", fine_tune_completion_request_input->completion) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

fine_tune_completion_request_input_t *fine_tune_completion_request_input_parseFromJSON(cJSON *fine_tune_completion_request_inputJSON){

    fine_tune_completion_request_input_t *fine_tune_completion_request_input_local_var = NULL;

    // fine_tune_completion_request_input->prompt
    cJSON *prompt = cJSON_GetObjectItemCaseSensitive(fine_tune_completion_request_inputJSON, "prompt");
    if (cJSON_IsNull(prompt)) {
        prompt = NULL;
    }
    if (prompt) { 
    if(!cJSON_IsString(prompt) && !cJSON_IsNull(prompt))
    {
    goto end; //String
    }
    }

    // fine_tune_completion_request_input->completion
    cJSON *completion = cJSON_GetObjectItemCaseSensitive(fine_tune_completion_request_inputJSON, "completion");
    if (cJSON_IsNull(completion)) {
        completion = NULL;
    }
    if (completion) { 
    if(!cJSON_IsString(completion) && !cJSON_IsNull(completion))
    {
    goto end; //String
    }
    }


    fine_tune_completion_request_input_local_var = fine_tune_completion_request_input_create_internal (
        prompt && !cJSON_IsNull(prompt) ? strdup(prompt->valuestring) : NULL,
        completion && !cJSON_IsNull(completion) ? strdup(completion->valuestring) : NULL
        );

    return fine_tune_completion_request_input_local_var;
end:
    return NULL;

}
