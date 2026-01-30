#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "list_audit_logs_effective_at_parameter.h"



static list_audit_logs_effective_at_parameter_t *list_audit_logs_effective_at_parameter_create_internal(
    int gt,
    int gte,
    int lt,
    int lte
    ) {
    list_audit_logs_effective_at_parameter_t *list_audit_logs_effective_at_parameter_local_var = malloc(sizeof(list_audit_logs_effective_at_parameter_t));
    if (!list_audit_logs_effective_at_parameter_local_var) {
        return NULL;
    }
    list_audit_logs_effective_at_parameter_local_var->gt = gt;
    list_audit_logs_effective_at_parameter_local_var->gte = gte;
    list_audit_logs_effective_at_parameter_local_var->lt = lt;
    list_audit_logs_effective_at_parameter_local_var->lte = lte;

    list_audit_logs_effective_at_parameter_local_var->_library_owned = 1;
    return list_audit_logs_effective_at_parameter_local_var;
}

__attribute__((deprecated)) list_audit_logs_effective_at_parameter_t *list_audit_logs_effective_at_parameter_create(
    int gt,
    int gte,
    int lt,
    int lte
    ) {
    return list_audit_logs_effective_at_parameter_create_internal (
        gt,
        gte,
        lt,
        lte
        );
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
    free(list_audit_logs_effective_at_parameter);
}

cJSON *list_audit_logs_effective_at_parameter_convertToJSON(list_audit_logs_effective_at_parameter_t *list_audit_logs_effective_at_parameter) {
    cJSON *item = cJSON_CreateObject();

    // list_audit_logs_effective_at_parameter->gt
    if(list_audit_logs_effective_at_parameter->gt) {
    if(cJSON_AddNumberToObject(item, "gt", list_audit_logs_effective_at_parameter->gt) == NULL) {
    goto fail; //Numeric
    }
    }


    // list_audit_logs_effective_at_parameter->gte
    if(list_audit_logs_effective_at_parameter->gte) {
    if(cJSON_AddNumberToObject(item, "gte", list_audit_logs_effective_at_parameter->gte) == NULL) {
    goto fail; //Numeric
    }
    }


    // list_audit_logs_effective_at_parameter->lt
    if(list_audit_logs_effective_at_parameter->lt) {
    if(cJSON_AddNumberToObject(item, "lt", list_audit_logs_effective_at_parameter->lt) == NULL) {
    goto fail; //Numeric
    }
    }


    // list_audit_logs_effective_at_parameter->lte
    if(list_audit_logs_effective_at_parameter->lte) {
    if(cJSON_AddNumberToObject(item, "lte", list_audit_logs_effective_at_parameter->lte) == NULL) {
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
    }


    list_audit_logs_effective_at_parameter_local_var = list_audit_logs_effective_at_parameter_create_internal (
        gt ? gt->valuedouble : 0,
        gte ? gte->valuedouble : 0,
        lt ? lt->valuedouble : 0,
        lte ? lte->valuedouble : 0
        );

    return list_audit_logs_effective_at_parameter_local_var;
end:
    return NULL;

}
