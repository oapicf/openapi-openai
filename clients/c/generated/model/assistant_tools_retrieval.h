/*
 * assistant_tools_retrieval.h
 *
 * 
 */

#ifndef _assistant_tools_retrieval_H_
#define _assistant_tools_retrieval_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct assistant_tools_retrieval_t assistant_tools_retrieval_t;


// Enum TYPE for assistant_tools_retrieval

typedef enum  { openai_api_assistant_tools_retrieval_TYPE_NULL = 0, openai_api_assistant_tools_retrieval_TYPE_retrieval } openai_api_assistant_tools_retrieval_TYPE_e;

char* assistant_tools_retrieval_type_ToString(openai_api_assistant_tools_retrieval_TYPE_e type);

openai_api_assistant_tools_retrieval_TYPE_e assistant_tools_retrieval_type_FromString(char* type);



typedef struct assistant_tools_retrieval_t {
    openai_api_assistant_tools_retrieval_TYPE_e type; //enum

} assistant_tools_retrieval_t;

assistant_tools_retrieval_t *assistant_tools_retrieval_create(
    openai_api_assistant_tools_retrieval_TYPE_e type
);

void assistant_tools_retrieval_free(assistant_tools_retrieval_t *assistant_tools_retrieval);

assistant_tools_retrieval_t *assistant_tools_retrieval_parseFromJSON(cJSON *assistant_tools_retrievalJSON);

cJSON *assistant_tools_retrieval_convertToJSON(assistant_tools_retrieval_t *assistant_tools_retrieval);

#endif /* _assistant_tools_retrieval_H_ */

