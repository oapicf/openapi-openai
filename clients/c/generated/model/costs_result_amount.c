#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "costs_result_amount.h"



static costs_result_amount_t *costs_result_amount_create_internal(
    double *value,
    char *currency
    ) {
    costs_result_amount_t *costs_result_amount_local_var = malloc(sizeof(costs_result_amount_t));
    if (!costs_result_amount_local_var) {
        return NULL;
    }
    memset(costs_result_amount_local_var, 0, sizeof(costs_result_amount_t));
    costs_result_amount_local_var->_library_owned = 1;
    costs_result_amount_local_var->value = value;
    costs_result_amount_local_var->currency = currency;
    return costs_result_amount_local_var;
}

__attribute__((deprecated)) costs_result_amount_t *costs_result_amount_create(
    double *value,
    char *currency
    ) {
    double *value_copy = NULL;
    if (value) {
        value_copy = malloc(sizeof(double));
        if (value_copy) *value_copy = *value;
    }
    costs_result_amount_t *result = costs_result_amount_create_internal (
        value_copy,
        currency
        );
    if (!result) {
        free(value_copy);
    }
    return result;
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
    if (costs_result_amount->value) {
        free(costs_result_amount->value);
        costs_result_amount->value = NULL;
    }
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
    if(cJSON_AddNumberToObject(item, "value", *costs_result_amount->value) == NULL) {
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

    // define the local variable for costs_result_amount->value
    double *value_local_var = NULL;

    char *currency_local_str = NULL;

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
    value_local_var = malloc(sizeof(double));
    if(!value_local_var)
    {
        goto end;
    }
    *value_local_var = value->valuedouble;
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


    if (currency && !cJSON_IsNull(currency)) currency_local_str = strdup(currency->valuestring);

    costs_result_amount_local_var = costs_result_amount_create_internal (
        value_local_var,
        currency_local_str
        );

    if (!costs_result_amount_local_var) {
        goto end;
    }

    return costs_result_amount_local_var;
end:
    if (value_local_var) {
        free(value_local_var);
        value_local_var = NULL;
    }
    if (currency_local_str) {
        free(currency_local_str);
        currency_local_str = NULL;
    }
    return NULL;

}
