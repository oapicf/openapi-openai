#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "list_audit_logs_effective_at_parameter.h"



static list_audit_logs_effective_at_parameter_t *list_audit_logs_effective_at_parameter_create_internal(
    int *gt,
    int *gte,
    int *lt,
    int *lte
    ) {
    list_audit_logs_effective_at_parameter_t *list_audit_logs_effective_at_parameter_local_var = malloc(sizeof(list_audit_logs_effective_at_parameter_t));
    if (!list_audit_logs_effective_at_parameter_local_var) {
        return NULL;
    }
    memset(list_audit_logs_effective_at_parameter_local_var, 0, sizeof(list_audit_logs_effective_at_parameter_t));
    list_audit_logs_effective_at_parameter_local_var->_library_owned = 1;
    list_audit_logs_effective_at_parameter_local_var->gt = gt;
    list_audit_logs_effective_at_parameter_local_var->gte = gte;
    list_audit_logs_effective_at_parameter_local_var->lt = lt;
    list_audit_logs_effective_at_parameter_local_var->lte = lte;
    return list_audit_logs_effective_at_parameter_local_var;
}

__attribute__((deprecated)) list_audit_logs_effective_at_parameter_t *list_audit_logs_effective_at_parameter_create(
    int *gt,
    int *gte,
    int *lt,
    int *lte
    ) {
    int *gt_copy = NULL;
    if (gt) {
        gt_copy = malloc(sizeof(int));
        if (gt_copy) *gt_copy = *gt;
    }
    int *gte_copy = NULL;
    if (gte) {
        gte_copy = malloc(sizeof(int));
        if (gte_copy) *gte_copy = *gte;
    }
    int *lt_copy = NULL;
    if (lt) {
        lt_copy = malloc(sizeof(int));
        if (lt_copy) *lt_copy = *lt;
    }
    int *lte_copy = NULL;
    if (lte) {
        lte_copy = malloc(sizeof(int));
        if (lte_copy) *lte_copy = *lte;
    }
    list_audit_logs_effective_at_parameter_t *result = list_audit_logs_effective_at_parameter_create_internal (
        gt_copy,
        gte_copy,
        lt_copy,
        lte_copy
        );
    if (!result) {
        free(gt_copy);
        free(gte_copy);
        free(lt_copy);
        free(lte_copy);
    }
    return result;
}

void list_audit_logs_effective_at_parameter_free(list_audit_logs_effective_at_parameter_t *list_audit_logs_effective_at_parameter) {
    if(NULL == list_audit_logs_effective_at_parameter){
        return ;
    }
    if(list_audit_logs_effective_at_parameter->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "list_audit_logs_effective_at_parameter_free");
        return ;
    }
    listEntry_t *listEntry;
    if (list_audit_logs_effective_at_parameter->gt) {
        free(list_audit_logs_effective_at_parameter->gt);
        list_audit_logs_effective_at_parameter->gt = NULL;
    }
    if (list_audit_logs_effective_at_parameter->gte) {
        free(list_audit_logs_effective_at_parameter->gte);
        list_audit_logs_effective_at_parameter->gte = NULL;
    }
    if (list_audit_logs_effective_at_parameter->lt) {
        free(list_audit_logs_effective_at_parameter->lt);
        list_audit_logs_effective_at_parameter->lt = NULL;
    }
    if (list_audit_logs_effective_at_parameter->lte) {
        free(list_audit_logs_effective_at_parameter->lte);
        list_audit_logs_effective_at_parameter->lte = NULL;
    }
    free(list_audit_logs_effective_at_parameter);
}

cJSON *list_audit_logs_effective_at_parameter_convertToJSON(list_audit_logs_effective_at_parameter_t *list_audit_logs_effective_at_parameter) {
    cJSON *item = cJSON_CreateObject();

    // list_audit_logs_effective_at_parameter->gt
    if(list_audit_logs_effective_at_parameter->gt) {
    if(cJSON_AddNumberToObject(item, "gt", *list_audit_logs_effective_at_parameter->gt) == NULL) {
    goto fail; //Numeric
    }
    }


    // list_audit_logs_effective_at_parameter->gte
    if(list_audit_logs_effective_at_parameter->gte) {
    if(cJSON_AddNumberToObject(item, "gte", *list_audit_logs_effective_at_parameter->gte) == NULL) {
    goto fail; //Numeric
    }
    }


    // list_audit_logs_effective_at_parameter->lt
    if(list_audit_logs_effective_at_parameter->lt) {
    if(cJSON_AddNumberToObject(item, "lt", *list_audit_logs_effective_at_parameter->lt) == NULL) {
    goto fail; //Numeric
    }
    }


    // list_audit_logs_effective_at_parameter->lte
    if(list_audit_logs_effective_at_parameter->lte) {
    if(cJSON_AddNumberToObject(item, "lte", *list_audit_logs_effective_at_parameter->lte) == NULL) {
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

list_audit_logs_effective_at_parameter_t *list_audit_logs_effective_at_parameter_parseFromJSON(cJSON *list_audit_logs_effective_at_parameterJSON){

    list_audit_logs_effective_at_parameter_t *list_audit_logs_effective_at_parameter_local_var = NULL;

    // define the local variable for list_audit_logs_effective_at_parameter->gt
    int *gt_local_var = NULL;

    // define the local variable for list_audit_logs_effective_at_parameter->gte
    int *gte_local_var = NULL;

    // define the local variable for list_audit_logs_effective_at_parameter->lt
    int *lt_local_var = NULL;

    // define the local variable for list_audit_logs_effective_at_parameter->lte
    int *lte_local_var = NULL;

    // list_audit_logs_effective_at_parameter->gt
    cJSON *gt = cJSON_GetObjectItemCaseSensitive(list_audit_logs_effective_at_parameterJSON, "gt");
    if (cJSON_IsNull(gt)) {
        gt = NULL;
    }
    if (gt) { 
    if(!cJSON_IsNumber(gt))
    {
    goto end; //Numeric
    }
    gt_local_var = malloc(sizeof(int));
    if(!gt_local_var)
    {
        goto end;
    }
    *gt_local_var = gt->valuedouble;
    }

    // list_audit_logs_effective_at_parameter->gte
    cJSON *gte = cJSON_GetObjectItemCaseSensitive(list_audit_logs_effective_at_parameterJSON, "gte");
    if (cJSON_IsNull(gte)) {
        gte = NULL;
    }
    if (gte) { 
    if(!cJSON_IsNumber(gte))
    {
    goto end; //Numeric
    }
    gte_local_var = malloc(sizeof(int));
    if(!gte_local_var)
    {
        goto end;
    }
    *gte_local_var = gte->valuedouble;
    }

    // list_audit_logs_effective_at_parameter->lt
    cJSON *lt = cJSON_GetObjectItemCaseSensitive(list_audit_logs_effective_at_parameterJSON, "lt");
    if (cJSON_IsNull(lt)) {
        lt = NULL;
    }
    if (lt) { 
    if(!cJSON_IsNumber(lt))
    {
    goto end; //Numeric
    }
    lt_local_var = malloc(sizeof(int));
    if(!lt_local_var)
    {
        goto end;
    }
    *lt_local_var = lt->valuedouble;
    }

    // list_audit_logs_effective_at_parameter->lte
    cJSON *lte = cJSON_GetObjectItemCaseSensitive(list_audit_logs_effective_at_parameterJSON, "lte");
    if (cJSON_IsNull(lte)) {
        lte = NULL;
    }
    if (lte) { 
    if(!cJSON_IsNumber(lte))
    {
    goto end; //Numeric
    }
    lte_local_var = malloc(sizeof(int));
    if(!lte_local_var)
    {
        goto end;
    }
    *lte_local_var = lte->valuedouble;
    }



    list_audit_logs_effective_at_parameter_local_var = list_audit_logs_effective_at_parameter_create_internal (
        gt_local_var,
        gte_local_var,
        lt_local_var,
        lte_local_var
        );

    if (!list_audit_logs_effective_at_parameter_local_var) {
        goto end;
    }

    return list_audit_logs_effective_at_parameter_local_var;
end:
    if (gt_local_var) {
        free(gt_local_var);
        gt_local_var = NULL;
    }
    if (gte_local_var) {
        free(gte_local_var);
        gte_local_var = NULL;
    }
    if (lt_local_var) {
        free(lt_local_var);
        lt_local_var = NULL;
    }
    if (lte_local_var) {
        free(lte_local_var);
        lte_local_var = NULL;
    }
    return NULL;

}
