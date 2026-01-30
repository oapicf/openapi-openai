#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "fine_tune_supervised_method.h"



static fine_tune_supervised_method_t *fine_tune_supervised_method_create_internal(
    fine_tune_supervised_method_hyperparameters_t *hyperparameters
    ) {
    fine_tune_supervised_method_t *fine_tune_supervised_method_local_var = malloc(sizeof(fine_tune_supervised_method_t));
    if (!fine_tune_supervised_method_local_var) {
        return NULL;
    }
    fine_tune_supervised_method_local_var->hyperparameters = hyperparameters;

    fine_tune_supervised_method_local_var->_library_owned = 1;
    return fine_tune_supervised_method_local_var;
}

__attribute__((deprecated)) fine_tune_supervised_method_t *fine_tune_supervised_method_create(
    fine_tune_supervised_method_hyperparameters_t *hyperparameters
    ) {
    return fine_tune_supervised_method_create_internal (
        hyperparameters
        );
}

void fine_tune_supervised_method_free(fine_tune_supervised_method_t *fine_tune_supervised_method) {
    if(NULL == fine_tune_supervised_method){
        return ;
    }
    if(fine_tune_supervised_method->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "fine_tune_supervised_method_free");
        return ;
    }
    listEntry_t *listEntry;
    if (fine_tune_supervised_method->hyperparameters) {
        fine_tune_supervised_method_hyperparameters_free(fine_tune_supervised_method->hyperparameters);
        fine_tune_supervised_method->hyperparameters = NULL;
    }
    free(fine_tune_supervised_method);
}

cJSON *fine_tune_supervised_method_convertToJSON(fine_tune_supervised_method_t *fine_tune_supervised_method) {
    cJSON *item = cJSON_CreateObject();

    // fine_tune_supervised_method->hyperparameters
    if(fine_tune_supervised_method->hyperparameters) {
    cJSON *hyperparameters_local_JSON = fine_tune_supervised_method_hyperparameters_convertToJSON(fine_tune_supervised_method->hyperparameters);
    if(hyperparameters_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "hyperparameters", hyperparameters_local_JSON);
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

fine_tune_supervised_method_t *fine_tune_supervised_method_parseFromJSON(cJSON *fine_tune_supervised_methodJSON){

    fine_tune_supervised_method_t *fine_tune_supervised_method_local_var = NULL;

    // define the local variable for fine_tune_supervised_method->hyperparameters
    fine_tune_supervised_method_hyperparameters_t *hyperparameters_local_nonprim = NULL;

    // fine_tune_supervised_method->hyperparameters
    cJSON *hyperparameters = cJSON_GetObjectItemCaseSensitive(fine_tune_supervised_methodJSON, "hyperparameters");
    if (cJSON_IsNull(hyperparameters)) {
        hyperparameters = NULL;
    }
    if (hyperparameters) { 
    hyperparameters_local_nonprim = fine_tune_supervised_method_hyperparameters_parseFromJSON(hyperparameters); //nonprimitive
    }


    fine_tune_supervised_method_local_var = fine_tune_supervised_method_create_internal (
        hyperparameters ? hyperparameters_local_nonprim : NULL
        );

    return fine_tune_supervised_method_local_var;
end:
    if (hyperparameters_local_nonprim) {
        fine_tune_supervised_method_hyperparameters_free(hyperparameters_local_nonprim);
        hyperparameters_local_nonprim = NULL;
    }
    return NULL;

}
