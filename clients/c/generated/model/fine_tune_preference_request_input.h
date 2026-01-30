/*
 * fine_tune_preference_request_input.h
 *
 * The per-line training example of a fine-tuning input file for chat models using the dpo method.
 */

#ifndef _fine_tune_preference_request_input_H_
#define _fine_tune_preference_request_input_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct fine_tune_preference_request_input_t fine_tune_preference_request_input_t;

#include "fine_tune_preference_request_input_input.h"
#include "fine_tune_preference_request_input_preferred_completion_inner.h"



typedef struct fine_tune_preference_request_input_t {
    struct fine_tune_preference_request_input_input_t *input; //model
    list_t *preferred_completion; //nonprimitive container
    list_t *non_preferred_completion; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} fine_tune_preference_request_input_t;

__attribute__((deprecated)) fine_tune_preference_request_input_t *fine_tune_preference_request_input_create(
    fine_tune_preference_request_input_input_t *input,
    list_t *preferred_completion,
    list_t *non_preferred_completion
);

void fine_tune_preference_request_input_free(fine_tune_preference_request_input_t *fine_tune_preference_request_input);

fine_tune_preference_request_input_t *fine_tune_preference_request_input_parseFromJSON(cJSON *fine_tune_preference_request_inputJSON);

cJSON *fine_tune_preference_request_input_convertToJSON(fine_tune_preference_request_input_t *fine_tune_preference_request_input);

#endif /* _fine_tune_preference_request_input_H_ */

