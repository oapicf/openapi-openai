/*
 * create_fine_tune_request.h
 *
 * 
 */

#ifndef _create_fine_tune_request_H_
#define _create_fine_tune_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_fine_tune_request_t create_fine_tune_request_t;

#include "create_fine_tune_request_model.h"



typedef struct create_fine_tune_request_t {
    char *training_file; // string
    char *validation_file; // string
    struct create_fine_tune_request_model_t *model; //model
    int n_epochs; //numeric
    int batch_size; //numeric
    double learning_rate_multiplier; //numeric
    double prompt_loss_weight; //numeric
    int compute_classification_metrics; //boolean
    int classification_n_classes; //numeric
    char *classification_positive_class; // string
    list_t *classification_betas; //primitive container
    char *suffix; // string

} create_fine_tune_request_t;

create_fine_tune_request_t *create_fine_tune_request_create(
    char *training_file,
    char *validation_file,
    create_fine_tune_request_model_t *model,
    int n_epochs,
    int batch_size,
    double learning_rate_multiplier,
    double prompt_loss_weight,
    int compute_classification_metrics,
    int classification_n_classes,
    char *classification_positive_class,
    list_t *classification_betas,
    char *suffix
);

void create_fine_tune_request_free(create_fine_tune_request_t *create_fine_tune_request);

create_fine_tune_request_t *create_fine_tune_request_parseFromJSON(cJSON *create_fine_tune_requestJSON);

cJSON *create_fine_tune_request_convertToJSON(create_fine_tune_request_t *create_fine_tune_request);

#endif /* _create_fine_tune_request_H_ */

