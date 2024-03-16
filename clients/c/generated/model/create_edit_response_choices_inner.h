/*
 * create_edit_response_choices_inner.h
 *
 * 
 */

#ifndef _create_edit_response_choices_inner_H_
#define _create_edit_response_choices_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_edit_response_choices_inner_t create_edit_response_choices_inner_t;

#include "create_completion_response_choices_inner_logprobs.h"

// Enum FINISHREASON for create_edit_response_choices_inner

typedef enum  { openai_api_create_edit_response_choices_inner_FINISHREASON_NULL = 0, openai_api_create_edit_response_choices_inner_FINISHREASON_stop, openai_api_create_edit_response_choices_inner_FINISHREASON_length } openai_api_create_edit_response_choices_inner_FINISHREASON_e;

char* create_edit_response_choices_inner_finish_reason_ToString(openai_api_create_edit_response_choices_inner_FINISHREASON_e finish_reason);

openai_api_create_edit_response_choices_inner_FINISHREASON_e create_edit_response_choices_inner_finish_reason_FromString(char* finish_reason);



typedef struct create_edit_response_choices_inner_t {
    char *text; // string
    int index; //numeric
    struct create_completion_response_choices_inner_logprobs_t *logprobs; //model
    openai_api_create_edit_response_choices_inner_FINISHREASON_e finish_reason; //enum

} create_edit_response_choices_inner_t;

create_edit_response_choices_inner_t *create_edit_response_choices_inner_create(
    char *text,
    int index,
    create_completion_response_choices_inner_logprobs_t *logprobs,
    openai_api_create_edit_response_choices_inner_FINISHREASON_e finish_reason
);

void create_edit_response_choices_inner_free(create_edit_response_choices_inner_t *create_edit_response_choices_inner);

create_edit_response_choices_inner_t *create_edit_response_choices_inner_parseFromJSON(cJSON *create_edit_response_choices_innerJSON);

cJSON *create_edit_response_choices_inner_convertToJSON(create_edit_response_choices_inner_t *create_edit_response_choices_inner);

#endif /* _create_edit_response_choices_inner_H_ */

