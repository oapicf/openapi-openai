#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "fine_tune_dpo_method_hyperparameters_beta.h"



static fine_tune_dpo_method_hyperparameters_beta_t *fine_tune_dpo_method_hyperparameters_beta_create_internal(
    ) {
    fine_tune_dpo_method_hyperparameters_beta_t *fine_tune_dpo_method_hyperparameters_beta_local_var = malloc(sizeof(fine_tune_dpo_method_hyperparameters_beta_t));
    if (!fine_tune_dpo_method_hyperparameters_beta_local_var) {
        return NULL;
    }

    fine_tune_dpo_method_hyperparameters_beta_local_var->_library_owned = 1;
    return fine_tune_dpo_method_hyperparameters_beta_local_var;
}

__attribute__((deprecated)) fine_tune_dpo_method_hyperparameters_beta_t *fine_tune_dpo_method_hyperparameters_beta_create(
    ) {
    return fine_tune_dpo_method_hyperparameters_beta_create_internal (
        );
}

void fine_tune_dpo_method_hyperparameters_beta_free(fine_tune_dpo_method_hyperparameters_beta_t *fine_tune_dpo_method_hyperparameters_beta) {
    if(NULL == fine_tune_dpo_method_hyperparameters_beta){
        return ;
    }
    if(fine_tune_dpo_method_hyperparameters_beta->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "fine_tune_dpo_method_hyperparameters_beta_free");
        return ;
    }
    listEntry_t *listEntry;
    free(fine_tune_dpo_method_hyperparameters_beta);
}

cJSON *fine_tune_dpo_method_hyperparameters_beta_convertToJSON(fine_tune_dpo_method_hyperparameters_beta_t *fine_tune_dpo_method_hyperparameters_beta) {
    cJSON *item = cJSON_CreateObject();
    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

fine_tune_dpo_method_hyperparameters_beta_t *fine_tune_dpo_method_hyperparameters_beta_parseFromJSON(cJSON *fine_tune_dpo_method_hyperparameters_betaJSON){

    fine_tune_dpo_method_hyperparameters_beta_t *fine_tune_dpo_method_hyperparameters_beta_local_var = NULL;


    fine_tune_dpo_method_hyperparameters_beta_local_var = fine_tune_dpo_method_hyperparameters_beta_create_internal (
        );

    return fine_tune_dpo_method_hyperparameters_beta_local_var;
end:
    return NULL;

}
