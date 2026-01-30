/*
 * assistants_api_response_format_option.h
 *
 * Specifies the format that the model must output. Compatible with [GPT-4o](/docs/models#gpt-4o), [GPT-4 Turbo](/docs/models#gpt-4-turbo-and-gpt-4), and all GPT-3.5 Turbo models since &#x60;gpt-3.5-turbo-1106&#x60;.  Setting to &#x60;{ \&quot;type\&quot;: \&quot;json_schema\&quot;, \&quot;json_schema\&quot;: {...} }&#x60; enables Structured Outputs which ensures the model will match your supplied JSON schema. Learn more in the [Structured Outputs guide](/docs/guides/structured-outputs).  Setting to &#x60;{ \&quot;type\&quot;: \&quot;json_object\&quot; }&#x60; enables JSON mode, which ensures the message the model generates is valid JSON.  **Important:** when using JSON mode, you **must** also instruct the model to produce JSON yourself via a system or user message. Without this, the model may generate an unending stream of whitespace until the generation reaches the token limit, resulting in a long-running and seemingly \&quot;stuck\&quot; request. Also note that the message content may be partially cut off if &#x60;finish_reason&#x3D;\&quot;length\&quot;&#x60;, which indicates the generation exceeded &#x60;max_tokens&#x60; or the conversation exceeded the max context length. 
 */

#ifndef _assistants_api_response_format_option_H_
#define _assistants_api_response_format_option_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct assistants_api_response_format_option_t assistants_api_response_format_option_t;

#include "response_format_json_object.h"
#include "response_format_json_schema.h"
#include "response_format_json_schema_json_schema.h"
#include "response_format_text.h"

// Enum TYPE for assistants_api_response_format_option

typedef enum  { openai_api_assistants_api_response_format_option_TYPE_NULL = 0, openai_api_assistants_api_response_format_option_TYPE_text, openai_api_assistants_api_response_format_option_TYPE_json_object, openai_api_assistants_api_response_format_option_TYPE_json_schema } openai_api_assistants_api_response_format_option_TYPE_e;

char* assistants_api_response_format_option_type_ToString(openai_api_assistants_api_response_format_option_TYPE_e type);

openai_api_assistants_api_response_format_option_TYPE_e assistants_api_response_format_option_type_FromString(char* type);



typedef struct assistants_api_response_format_option_t {
    openai_api_assistants_api_response_format_option_TYPE_e type; //enum
    struct response_format_json_schema_json_schema_t *json_schema; //model

    int _library_owned; // Is the library responsible for freeing this object?
} assistants_api_response_format_option_t;

__attribute__((deprecated)) assistants_api_response_format_option_t *assistants_api_response_format_option_create(
    openai_api_assistants_api_response_format_option_TYPE_e type,
    response_format_json_schema_json_schema_t *json_schema
);

void assistants_api_response_format_option_free(assistants_api_response_format_option_t *assistants_api_response_format_option);

assistants_api_response_format_option_t *assistants_api_response_format_option_parseFromJSON(cJSON *assistants_api_response_format_optionJSON);

cJSON *assistants_api_response_format_option_convertToJSON(assistants_api_response_format_option_t *assistants_api_response_format_option);

#endif /* _assistants_api_response_format_option_H_ */

