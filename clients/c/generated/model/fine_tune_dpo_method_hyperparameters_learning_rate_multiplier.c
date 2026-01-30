#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "fine_tune_dpo_method_hyperparameters_learning_rate_multiplier.h"



static fine_tune_dpo_method_hyperparameters_learning_rate_multiplier_t *fine_tune_dpo_method_hyperparameters_learning_rate_multiplier_create_internal(
    ) {
    fine_tune_dpo_method_hyperparameters_learning_rate_multiplier_t *fine_tune_dpo_method_hyperparameters_learning_rate_multiplier_local_var = malloc(sizeof(fine_tune_dpo_method_hyperparameters_learning_rate_multiplier_t));
    if (!fine_tune_dpo_method_hyperparameters_learning_rate_multiplier_local_var) {
        return NULL;
    }

    fine_tune_dpo_method_hyperparameters_learning_rate_multiplier_local_var->_library_owned = 1;
    return fine_tune_dpo_method_hyperparameters_learning_rate_multiplier_local_var;
}

__attribute__((deprecated)) fine_tune_dpo_method_hyperparameters_learning_rate_multiplier_t *fine_tune_dpo_method_hyperparameters_learning_rate_multiplier_create(
    ) {
    return fine_tune_dpo_method_hyperparameters_learning_rate_multiplier_create_internal (
        );
}

void fine_tune_dpo_method_hyperparameters_learning_rate_multiplier_free(fine_tune_dpo_method_hyperparameters_learning_rate_multiplier_t *fine_tune_dpo_method_hyperparameters_learning_rate_multiplier) {
    if(NULL == fine_tune_dpo_method_hyperparameters_learning_rate_multiplier){
        return ;
    }
    if(fine_tune_dpo_method_hyperparameters_learning_rate_multiplier->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "fine_tune_dpo_method_hyperparameters_learning_rate_multiplier_free");
        return ;
    }
    listEntry_t *listEntry;
    free(fine_tune_dpo_method_hyperparameters_learning_rate_multiplier);
}

cJSON *fine_tune_dpo_method_hyperparameters_learning_rate_multiplier_convertToJSON(fine_tune_dpo_method_hyperparameters_learning_rate_multiplier_t *fine_tune_dpo_method_hyperparameters_learning_rate_multiplier) {
    cJSON *item = cJSON_CreateObject();
    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

fine_tune_dpo_method_hyperparameters_learning_rate_multiplier_t *fine_tune_dpo_method_hyperparameters_learning_rate_multiplier_parseFromJSON(cJSON *fine_tune_dpo_method_hyperparameters_learning_rate_multiplierJSON){

    fine_tune_dpo_method_hyperparameters_learning_rate_multiplier_t *fine_tune_dpo_method_hyperparameters_learning_rate_multiplier_local_var = NULL;


    fine_tune_dpo_method_hyperparameters_learning_rate_multiplier_local_var = fine_tune_dpo_method_hyperparameters_learning_rate_multiplier_create_internal (
        );

    return fine_tune_dpo_method_hyperparameters_learning_rate_multiplier_local_var;
end:
    return NULL;

}
