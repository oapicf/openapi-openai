/*
 * realtime_conversation_item_content_inner.h
 *
 * 
 */

#ifndef _realtime_conversation_item_content_inner_H_
#define _realtime_conversation_item_content_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct realtime_conversation_item_content_inner_t realtime_conversation_item_content_inner_t;


// Enum TYPE for realtime_conversation_item_content_inner

typedef enum  { openai_api_realtime_conversation_item_content_inner_TYPE_NULL = 0, openai_api_realtime_conversation_item_content_inner_TYPE_input_audio, openai_api_realtime_conversation_item_content_inner_TYPE_input_text, openai_api_realtime_conversation_item_content_inner_TYPE_item_reference, openai_api_realtime_conversation_item_content_inner_TYPE_text } openai_api_realtime_conversation_item_content_inner_TYPE_e;

char* realtime_conversation_item_content_inner_type_ToString(openai_api_realtime_conversation_item_content_inner_TYPE_e type);

openai_api_realtime_conversation_item_content_inner_TYPE_e realtime_conversation_item_content_inner_type_FromString(char* type);



typedef struct realtime_conversation_item_content_inner_t {
    openai_api_realtime_conversation_item_content_inner_TYPE_e type; //enum
    char *text; // string
    char *id; // string
    char *audio; // string
    char *transcript; // string

    int _library_owned; // Is the library responsible for freeing this object?
} realtime_conversation_item_content_inner_t;

__attribute__((deprecated)) realtime_conversation_item_content_inner_t *realtime_conversation_item_content_inner_create(
    openai_api_realtime_conversation_item_content_inner_TYPE_e type,
    char *text,
    char *id,
    char *audio,
    char *transcript
);

void realtime_conversation_item_content_inner_free(realtime_conversation_item_content_inner_t *realtime_conversation_item_content_inner);

realtime_conversation_item_content_inner_t *realtime_conversation_item_content_inner_parseFromJSON(cJSON *realtime_conversation_item_content_innerJSON);

cJSON *realtime_conversation_item_content_inner_convertToJSON(realtime_conversation_item_content_inner_t *realtime_conversation_item_content_inner);

#endif /* _realtime_conversation_item_content_inner_H_ */

