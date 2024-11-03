#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_moderation_request.h"



create_moderation_request_t *create_moderation_request_create(
    create_moderation_request_input_t *input,
    create_moderation_request_model_t *model
    ) {
    create_moderation_request_t *create_moderation_request_local_var = malloc(sizeof(create_moderation_request_t));
    if (!create_moderation_request_local_var) {
        return NULL;
    }
    create_moderation_request_local_var->input = input;
    create_moderation_request_local_var->model = model;

    return create_moderation_request_local_var;
}


void create_moderation_request_free(create_moderation_request_t *create_moderation_request) {
    if(NULL == create_moderation_request){
        return ;
    }
    listEntry_t *listEntry;
    if (create_moderation_request->input) {
        create_moderation_request_input_free(create_moderation_request->input);
        create_moderation_request->input = NULL;
    }
    if (create_moderation_request->model) {
        create_moderation_request_model_free(create_moderation_request->model);
        create_moderation_request->model = NULL;
    }
    free(create_moderation_request);
}

cJSON *create_moderation_request_convertToJSON(create_moderation_request_t *create_moderation_request) {
    cJSON *item = cJSON_CreateObject();

    // create_moderation_request->input
    if (!create_moderation_request->input) {
        goto fail;
    }
    cJSON *input_local_JSON = create_moderation_request_input_convertToJSON(create_moderation_request->input);
    if(input_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "input", input_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // create_moderation_request->model
    if(create_moderation_request->model) {
    cJSON *model_local_JSON = create_moderation_request_model_convertToJSON(create_moderation_request->model);
    if(model_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "model", model_local_JSON);
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

create_moderation_request_t *create_moderation_request_parseFromJSON(cJSON *create_moderation_requestJSON){

    create_moderation_request_t *create_moderation_request_local_var = NULL;

    // define the local variable for create_moderation_request->input
    create_moderation_request_input_t *input_local_nonprim = NULL;

    // define the local variable for create_moderation_request->model
    create_moderation_request_model_t *model_local_nonprim = NULL;

    // create_moderation_request->input
    cJSON *input = cJSON_GetObjectItemCaseSensitive(create_moderation_requestJSON, "input");
    if (!input) {
        goto end;
    }

    
    input_local_nonprim = create_moderation_request_input_parseFromJSON(input); //nonprimitive

    // create_moderation_request->model
    cJSON *model = cJSON_GetObjectItemCaseSensitive(create_moderation_requestJSON, "model");
    if (model) { 
    model_local_nonprim = create_moderation_request_model_parseFromJSON(model); //nonprimitive
    }


    create_moderation_request_local_var = create_moderation_request_create (
        input_local_nonprim,
        model ? model_local_nonprim : NULL
        );

    return create_moderation_request_local_var;
end:
    if (input_local_nonprim) {
        create_moderation_request_input_free(input_local_nonprim);
        input_local_nonprim = NULL;
    }
    if (model_local_nonprim) {
        create_moderation_request_model_free(model_local_nonprim);
        model_local_nonprim = NULL;
    }
    return NULL;

}
