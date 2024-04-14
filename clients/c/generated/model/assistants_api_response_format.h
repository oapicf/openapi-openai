/*
 * assistants_api_response_format.h
 *
 * An object describing the expected output of the model. If &#x60;json_object&#x60; only &#x60;function&#x60; type &#x60;tools&#x60; are allowed to be passed to the Run. If &#x60;text&#x60; the model can return text or any value needed. 
 */

#ifndef _assistants_api_response_format_H_
#define _assistants_api_response_format_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct assistants_api_response_format_t assistants_api_response_format_t;


// Enum TYPE for assistants_api_response_format

typedef enum  { openai_api_assistants_api_response_format_TYPE_NULL = 0, openai_api_assistants_api_response_format_TYPE_text, openai_api_assistants_api_response_format_TYPE_json_object } openai_api_assistants_api_response_format_TYPE_e;

char* assistants_api_response_format_type_ToString(openai_api_assistants_api_response_format_TYPE_e type);

openai_api_assistants_api_response_format_TYPE_e assistants_api_response_format_type_FromString(char* type);



typedef struct assistants_api_response_format_t {
    openai_api_assistants_api_response_format_TYPE_e type; //enum

} assistants_api_response_format_t;

assistants_api_response_format_t *assistants_api_response_format_create(
    openai_api_assistants_api_response_format_TYPE_e type
);

void assistants_api_response_format_free(assistants_api_response_format_t *assistants_api_response_format);

assistants_api_response_format_t *assistants_api_response_format_parseFromJSON(cJSON *assistants_api_response_formatJSON);

cJSON *assistants_api_response_format_convertToJSON(assistants_api_response_format_t *assistants_api_response_format);

#endif /* _assistants_api_response_format_H_ */

