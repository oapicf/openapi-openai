/*
 * prediction_content_content.h
 *
 * The content that should be matched when generating a model response. If generated tokens would match this content, the entire model response can be returned much more quickly. 
 */

#ifndef _prediction_content_content_H_
#define _prediction_content_content_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct prediction_content_content_t prediction_content_content_t;

#include "chat_completion_request_message_content_part_text.h"



typedef struct prediction_content_content_t {

    int _library_owned; // Is the library responsible for freeing this object?
} prediction_content_content_t;

__attribute__((deprecated)) prediction_content_content_t *prediction_content_content_create(
);

void prediction_content_content_free(prediction_content_content_t *prediction_content_content);

prediction_content_content_t *prediction_content_content_parseFromJSON(cJSON *prediction_content_contentJSON);

cJSON *prediction_content_content_convertToJSON(prediction_content_content_t *prediction_content_content);

#endif /* _prediction_content_content_H_ */

