/*
 * create_fine_tune_request_model.h
 *
 * The name of the base model to fine-tune. You can select one of \&quot;ada\&quot;, \&quot;babbage\&quot;, \&quot;curie\&quot;, \&quot;davinci\&quot;, or a fine-tuned model created after 2022-04-21. To learn more about these models, see the [Models](https://platform.openai.com/docs/models) documentation. 
 */

#ifndef _create_fine_tune_request_model_H_
#define _create_fine_tune_request_model_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_fine_tune_request_model_t create_fine_tune_request_model_t;




typedef struct create_fine_tune_request_model_t {

} create_fine_tune_request_model_t;

create_fine_tune_request_model_t *create_fine_tune_request_model_create(
);

void create_fine_tune_request_model_free(create_fine_tune_request_model_t *create_fine_tune_request_model);

create_fine_tune_request_model_t *create_fine_tune_request_model_parseFromJSON(cJSON *create_fine_tune_request_modelJSON);

cJSON *create_fine_tune_request_model_convertToJSON(create_fine_tune_request_model_t *create_fine_tune_request_model);

#endif /* _create_fine_tune_request_model_H_ */

