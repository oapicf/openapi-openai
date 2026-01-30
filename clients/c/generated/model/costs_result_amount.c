#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "costs_result_amount.h"



static costs_result_amount_t *costs_result_amount_create_internal(
    double value,
    char *currency
    ) {
    costs_result_amount_t *costs_result_amount_local_var = malloc(sizeof(costs_result_amount_t));
    if (!costs_result_amount_local_var) {
        return NULL;
    }
    costs_result_amount_local_var->value = value;
    costs_result_amount_local_var->currency = currency;

    costs_result_amount_local_var->_library_owned = 1;
    return costs_result_amount_local_var;
}

__attribute__((deprecated)) costs_result_amount_t *costs_result_amount_create(
    double value,
    char *currency
    ) {
    return costs_result_amount_create_internal (
        value,
        currency
        );
}

void costs_result_amount_free(costs_result_amount_t *costs_result_amount) {
    if(NULL == costs_result_amount){
        return ;
    }
    if(costs_result_amount->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "costs_result_amount_free");
        return ;
    }
    listEntry_t *listEntry;
    if (costs_result_amount->currency) {
        free(costs_result_amount->currency);
        costs_result_amount->currency = NULL;
    }
    free(costs_result_amount);
}

cJSON *costs_result_amount_convertToJSON(costs_result_amount_t *costs_result_amount) {
    cJSON *item = cJSON_CreateObject();

    // costs_result_amount->value
    if(costs_result_amount->value) {
    if(cJSON_AddNumberToObject(item, "value", costs_result_amount->value) == NULL) {
    goto fail; //Numeric
    }
    }


    // costs_result_amount->currency
    if(costs_result_amount->currency) {
    if(cJSON_AddStringToObject(item, "currency", costs_result_amount->currency) == NULL) {
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

costs_result_amount_t *costs_result_amount_parseFromJSON(cJSON *costs_result_amountJSON){

    costs_result_amount_t *costs_result_amount_local_var = NULL;

    // costs_result_amount->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(costs_result_amountJSON, "value");
    if (cJSON_IsNull(value)) {
        value = NULL;
    }
    if (value) { 
    if(!cJSON_IsNumber(value))
    {
    goto end; //Numeric
    }
    }

    // costs_result_amount->currency
    cJSON *currency = cJSON_GetObjectItemCaseSensitive(costs_result_amountJSON, "currency");
    if (cJSON_IsNull(currency)) {
        currency = NULL;
    }
    if (currency) { 
    if(!cJSON_IsString(currency) && !cJSON_IsNull(currency))
    {
    goto end; //String
    }
    }


    costs_result_amount_local_var = costs_result_amount_create_internal (
        value ? value->valuedouble : 0,
        currency && !cJSON_IsNull(currency) ? strdup(currency->valuestring) : NULL
        );

    return costs_result_amount_local_var;
end:
    return NULL;

}
