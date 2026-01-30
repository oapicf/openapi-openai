/*
 * assistants_api_tool_choice_option.h
 *
 * Controls which (if any) tool is called by the model. &#x60;none&#x60; means the model will not call any tools and instead generates a message. &#x60;auto&#x60; is the default value and means the model can pick between generating a message or calling one or more tools. &#x60;required&#x60; means the model must call one or more tools before responding to the user. Specifying a particular tool like &#x60;{\&quot;type\&quot;: \&quot;file_search\&quot;}&#x60; or &#x60;{\&quot;type\&quot;: \&quot;function\&quot;, \&quot;function\&quot;: {\&quot;name\&quot;: \&quot;my_function\&quot;}}&#x60; forces the model to call that tool. 
 */

#ifndef _assistants_api_tool_choice_option_H_
#define _assistants_api_tool_choice_option_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct assistants_api_tool_choice_option_t assistants_api_tool_choice_option_t;

#include "assistants_named_tool_choice.h"
#include "assistants_named_tool_choice_function.h"

// Enum TYPE for assistants_api_tool_choice_option

typedef enum  { openai_api_assistants_api_tool_choice_option_TYPE_NULL = 0, openai_api_assistants_api_tool_choice_option_TYPE_function, openai_api_assistants_api_tool_choice_option_TYPE_code_interpreter, openai_api_assistants_api_tool_choice_option_TYPE_file_search } openai_api_assistants_api_tool_choice_option_TYPE_e;

char* assistants_api_tool_choice_option_type_ToString(openai_api_assistants_api_tool_choice_option_TYPE_e type);

openai_api_assistants_api_tool_choice_option_TYPE_e assistants_api_tool_choice_option_type_FromString(char* type);



typedef struct assistants_api_tool_choice_option_t {
    openai_api_assistants_api_tool_choice_option_TYPE_e type; //enum
    struct assistants_named_tool_choice_function_t *function; //model

    int _library_owned; // Is the library responsible for freeing this object?
} assistants_api_tool_choice_option_t;

__attribute__((deprecated)) assistants_api_tool_choice_option_t *assistants_api_tool_choice_option_create(
    openai_api_assistants_api_tool_choice_option_TYPE_e type,
    assistants_named_tool_choice_function_t *function
);

void assistants_api_tool_choice_option_free(assistants_api_tool_choice_option_t *assistants_api_tool_choice_option);

assistants_api_tool_choice_option_t *assistants_api_tool_choice_option_parseFromJSON(cJSON *assistants_api_tool_choice_optionJSON);

cJSON *assistants_api_tool_choice_option_convertToJSON(assistants_api_tool_choice_option_t *assistants_api_tool_choice_option);

#endif /* _assistants_api_tool_choice_option_H_ */

