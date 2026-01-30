/*
 * fine_tune_completion_request_input.h
 *
 * The per-line training example of a fine-tuning input file for completions models
 */

#ifndef _fine_tune_completion_request_input_H_
#define _fine_tune_completion_request_input_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct fine_tune_completion_request_input_t fine_tune_completion_request_input_t;




typedef struct fine_tune_completion_request_input_t {
    char *prompt; // string
    char *completion; // string

    int _library_owned; // Is the library responsible for freeing this object?
} fine_tune_completion_request_input_t;

__attribute__((deprecated)) fine_tune_completion_request_input_t *fine_tune_completion_request_input_create(
    char *prompt,
    char *completion
);

void fine_tune_completion_request_input_free(fine_tune_completion_request_input_t *fine_tune_completion_request_input);

fine_tune_completion_request_input_t *fine_tune_completion_request_input_parseFromJSON(cJSON *fine_tune_completion_request_inputJSON);

cJSON *fine_tune_completion_request_input_convertToJSON(fine_tune_completion_request_input_t *fine_tune_completion_request_input);

#endif /* _fine_tune_completion_request_input_H_ */

