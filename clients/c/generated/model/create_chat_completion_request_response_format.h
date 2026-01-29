/*
 * create_chat_completion_request_response_format.h
 *
 * An object specifying the format that the model must output. Compatible with [GPT-4 Turbo](/docs/models/gpt-4-and-gpt-4-turbo) and all GPT-3.5 Turbo models newer than &#x60;gpt-3.5-turbo-1106&#x60;.  Setting to &#x60;{ \&quot;type\&quot;: \&quot;json_object\&quot; }&#x60; enables JSON mode, which guarantees the message the model generates is valid JSON.  **Important:** when using JSON mode, you **must** also instruct the model to produce JSON yourself via a system or user message. Without this, the model may generate an unending stream of whitespace until the generation reaches the token limit, resulting in a long-running and seemingly \&quot;stuck\&quot; request. Also note that the message content may be partially cut off if &#x60;finish_reason&#x3D;\&quot;length\&quot;&#x60;, which indicates the generation exceeded &#x60;max_tokens&#x60; or the conversation exceeded the max context length. 
 */

#ifndef _create_chat_completion_request_response_format_H_
#define _create_chat_completion_request_response_format_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_chat_completion_request_response_format_t create_chat_completion_request_response_format_t;


// Enum TYPE for create_chat_completion_request_response_format

typedef enum  { openai_api_create_chat_completion_request_response_format_TYPE_NULL = 0, openai_api_create_chat_completion_request_response_format_TYPE_text, openai_api_create_chat_completion_request_response_format_TYPE_json_object } openai_api_create_chat_completion_request_response_format_TYPE_e;

char* create_chat_completion_request_response_format_type_ToString(openai_api_create_chat_completion_request_response_format_TYPE_e type);

openai_api_create_chat_completion_request_response_format_TYPE_e create_chat_completion_request_response_format_type_FromString(char* type);



typedef struct create_chat_completion_request_response_format_t {
    openai_api_create_chat_completion_request_response_format_TYPE_e type; //enum

    int _library_owned; // Is the library responsible for freeing this object?
} create_chat_completion_request_response_format_t;

__attribute__((deprecated)) create_chat_completion_request_response_format_t *create_chat_completion_request_response_format_create(
    openai_api_create_chat_completion_request_response_format_TYPE_e type
);

void create_chat_completion_request_response_format_free(create_chat_completion_request_response_format_t *create_chat_completion_request_response_format);

create_chat_completion_request_response_format_t *create_chat_completion_request_response_format_parseFromJSON(cJSON *create_chat_completion_request_response_formatJSON);

cJSON *create_chat_completion_request_response_format_convertToJSON(create_chat_completion_request_response_format_t *create_chat_completion_request_response_format);

#endif /* _create_chat_completion_request_response_format_H_ */

