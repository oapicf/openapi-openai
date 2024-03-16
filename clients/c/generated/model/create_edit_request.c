#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_edit_request.h"



create_edit_request_t *create_edit_request_create(
    create_edit_request_model_t *model,
    char *input,
    char *instruction,
    int n,
    double temperature,
    double top_p
    ) {
    create_edit_request_t *create_edit_request_local_var = malloc(sizeof(create_edit_request_t));
    if (!create_edit_request_local_var) {
        return NULL;
    }
    create_edit_request_local_var->model = model;
    create_edit_request_local_var->input = input;
    create_edit_request_local_var->instruction = instruction;
    create_edit_request_local_var->n = n;
    create_edit_request_local_var->temperature = temperature;
    create_edit_request_local_var->top_p = top_p;

    return create_edit_request_local_var;
}


void create_edit_request_free(create_edit_request_t *create_edit_request) {
    if(NULL == create_edit_request){
        return ;
    }
    listEntry_t *listEntry;
    if (create_edit_request->model) {
        create_edit_request_model_free(create_edit_request->model);
        create_edit_request->model = NULL;
    }
    if (create_edit_request->input) {
        free(create_edit_request->input);
        create_edit_request->input = NULL;
    }
    if (create_edit_request->instruction) {
        free(create_edit_request->instruction);
        create_edit_request->instruction = NULL;
    }
    free(create_edit_request);
}

cJSON *create_edit_request_convertToJSON(create_edit_request_t *create_edit_request) {
    cJSON *item = cJSON_CreateObject();

    // create_edit_request->model
    if (!create_edit_request->model) {
        goto fail;
    }
    cJSON *model_local_JSON = create_edit_request_model_convertToJSON(create_edit_request->model);
    if(model_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "model", model_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // create_edit_request->input
    if(create_edit_request->input) {
    if(cJSON_AddStringToObject(item, "input", create_edit_request->input) == NULL) {
    goto fail; //String
    }
    }


    // create_edit_request->instruction
    if (!create_edit_request->instruction) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "instruction", create_edit_request->instruction) == NULL) {
    goto fail; //String
    }


    // create_edit_request->n
    if(create_edit_request->n) {
    if(cJSON_AddNumberToObject(item, "n", create_edit_request->n) == NULL) {
    goto fail; //Numeric
    }
    }


    // create_edit_request->temperature
    if(create_edit_request->temperature) {
    if(cJSON_AddNumberToObject(item, "temperature", create_edit_request->temperature) == NULL) {
    goto fail; //Numeric
    }
    }


    // create_edit_request->top_p
    if(create_edit_request->top_p) {
    if(cJSON_AddNumberToObject(item, "top_p", create_edit_request->top_p) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_edit_request_t *create_edit_request_parseFromJSON(cJSON *create_edit_requestJSON){

    create_edit_request_t *create_edit_request_local_var = NULL;

    // define the local variable for create_edit_request->model
    create_edit_request_model_t *model_local_nonprim = NULL;

    // create_edit_request->model
    cJSON *model = cJSON_GetObjectItemCaseSensitive(create_edit_requestJSON, "model");
    if (!model) {
        goto end;
    }

    
    model_local_nonprim = create_edit_request_model_parseFromJSON(model); //nonprimitive

    // create_edit_request->input
    cJSON *input = cJSON_GetObjectItemCaseSensitive(create_edit_requestJSON, "input");
    if (input) { 
    if(!cJSON_IsString(input) && !cJSON_IsNull(input))
    {
    goto end; //String
    }
    }

    // create_edit_request->instruction
    cJSON *instruction = cJSON_GetObjectItemCaseSensitive(create_edit_requestJSON, "instruction");
    if (!instruction) {
        goto end;
    }

    
    if(!cJSON_IsString(instruction))
    {
    goto end; //String
    }

    // create_edit_request->n
    cJSON *n = cJSON_GetObjectItemCaseSensitive(create_edit_requestJSON, "n");
    if (n) { 
    if(!cJSON_IsNumber(n))
    {
    goto end; //Numeric
    }
    }

    // create_edit_request->temperature
    cJSON *temperature = cJSON_GetObjectItemCaseSensitive(create_edit_requestJSON, "temperature");
    if (temperature) { 
    if(!cJSON_IsNumber(temperature))
    {
    goto end; //Numeric
    }
    }

    // create_edit_request->top_p
    cJSON *top_p = cJSON_GetObjectItemCaseSensitive(create_edit_requestJSON, "top_p");
    if (top_p) { 
    if(!cJSON_IsNumber(top_p))
    {
    goto end; //Numeric
    }
    }


    create_edit_request_local_var = create_edit_request_create (
        model_local_nonprim,
        input && !cJSON_IsNull(input) ? strdup(input->valuestring) : NULL,
        strdup(instruction->valuestring),
        n ? n->valuedouble : 0,
        temperature ? temperature->valuedouble : 0,
        top_p ? top_p->valuedouble : 0
        );

    return create_edit_request_local_var;
end:
    if (model_local_nonprim) {
        create_edit_request_model_free(model_local_nonprim);
        model_local_nonprim = NULL;
    }
    return NULL;

}
