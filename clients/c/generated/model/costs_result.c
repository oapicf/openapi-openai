#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "costs_result.h"


char* costs_result_object_ToString(openai_api_costs_result_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "organization.costs.result" };
    return objectArray[object];
}

openai_api_costs_result_OBJECT_e costs_result_object_FromString(char* object){
    int stringToReturn = 0;
    char *objectArray[] =  { "NULL", "organization.costs.result" };
    size_t sizeofArray = sizeof(objectArray) / sizeof(objectArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(object, objectArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static costs_result_t *costs_result_create_internal(
    openai_api_costs_result_OBJECT_e object,
    costs_result_amount_t *amount,
    char *line_item,
    char *project_id
    ) {
    costs_result_t *costs_result_local_var = malloc(sizeof(costs_result_t));
    if (!costs_result_local_var) {
        return NULL;
    }
    costs_result_local_var->object = object;
    costs_result_local_var->amount = amount;
    costs_result_local_var->line_item = line_item;
    costs_result_local_var->project_id = project_id;

    costs_result_local_var->_library_owned = 1;
    return costs_result_local_var;
}

__attribute__((deprecated)) costs_result_t *costs_result_create(
    openai_api_costs_result_OBJECT_e object,
    costs_result_amount_t *amount,
    char *line_item,
    char *project_id
    ) {
    return costs_result_create_internal (
        object,
        amount,
        line_item,
        project_id
        );
}

void costs_result_free(costs_result_t *costs_result) {
    if(NULL == costs_result){
        return ;
    }
    if(costs_result->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "costs_result_free");
        return ;
    }
    listEntry_t *listEntry;
    if (costs_result->amount) {
        costs_result_amount_free(costs_result->amount);
        costs_result->amount = NULL;
    }
    if (costs_result->line_item) {
        free(costs_result->line_item);
        costs_result->line_item = NULL;
    }
    if (costs_result->project_id) {
        free(costs_result->project_id);
        costs_result->project_id = NULL;
    }
    free(costs_result);
}

cJSON *costs_result_convertToJSON(costs_result_t *costs_result) {
    cJSON *item = cJSON_CreateObject();

    // costs_result->object
    if (openai_api_costs_result_OBJECT_NULL == costs_result->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", costs_result_object_ToString(costs_result->object)) == NULL)
    {
    goto fail; //Enum
    }


    // costs_result->amount
    if(costs_result->amount) {
    cJSON *amount_local_JSON = costs_result_amount_convertToJSON(costs_result->amount);
    if(amount_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "amount", amount_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // costs_result->line_item
    if(costs_result->line_item) {
    if(cJSON_AddStringToObject(item, "line_item", costs_result->line_item) == NULL) {
    goto fail; //String
    }
    }


    // costs_result->project_id
    if(costs_result->project_id) {
    if(cJSON_AddStringToObject(item, "project_id", costs_result->project_id) == NULL) {
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

costs_result_t *costs_result_parseFromJSON(cJSON *costs_resultJSON){

    costs_result_t *costs_result_local_var = NULL;

    // define the local variable for costs_result->amount
    costs_result_amount_t *amount_local_nonprim = NULL;

    // costs_result->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(costs_resultJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (!object) {
        goto end;
    }

    openai_api_costs_result_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = costs_result_object_FromString(object->valuestring);

    // costs_result->amount
    cJSON *amount = cJSON_GetObjectItemCaseSensitive(costs_resultJSON, "amount");
    if (cJSON_IsNull(amount)) {
        amount = NULL;
    }
    if (amount) { 
    amount_local_nonprim = costs_result_amount_parseFromJSON(amount); //nonprimitive
    }

    // costs_result->line_item
    cJSON *line_item = cJSON_GetObjectItemCaseSensitive(costs_resultJSON, "line_item");
    if (cJSON_IsNull(line_item)) {
        line_item = NULL;
    }
    if (line_item) { 
    if(!cJSON_IsString(line_item) && !cJSON_IsNull(line_item))
    {
    goto end; //String
    }
    }

    // costs_result->project_id
    cJSON *project_id = cJSON_GetObjectItemCaseSensitive(costs_resultJSON, "project_id");
    if (cJSON_IsNull(project_id)) {
        project_id = NULL;
    }
    if (project_id) { 
    if(!cJSON_IsString(project_id) && !cJSON_IsNull(project_id))
    {
    goto end; //String
    }
    }


    costs_result_local_var = costs_result_create_internal (
        objectVariable,
        amount ? amount_local_nonprim : NULL,
        line_item && !cJSON_IsNull(line_item) ? strdup(line_item->valuestring) : NULL,
        project_id && !cJSON_IsNull(project_id) ? strdup(project_id->valuestring) : NULL
        );

    return costs_result_local_var;
end:
    if (amount_local_nonprim) {
        costs_result_amount_free(amount_local_nonprim);
        amount_local_nonprim = NULL;
    }
    return NULL;

}
