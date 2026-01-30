/*
 * prediction_content.h
 *
 * Static predicted output content, such as the content of a text file that is being regenerated. 
 */

#ifndef _prediction_content_H_
#define _prediction_content_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct prediction_content_t prediction_content_t;

#include "prediction_content_content.h"

// Enum TYPE for prediction_content

typedef enum  { openai_api_prediction_content_TYPE_NULL = 0, openai_api_prediction_content_TYPE_content } openai_api_prediction_content_TYPE_e;

char* prediction_content_type_ToString(openai_api_prediction_content_TYPE_e type);

openai_api_prediction_content_TYPE_e prediction_content_type_FromString(char* type);



typedef struct prediction_content_t {
    openai_api_prediction_content_TYPE_e type; //enum
    struct prediction_content_content_t *content; //model

    int _library_owned; // Is the library responsible for freeing this object?
} prediction_content_t;

__attribute__((deprecated)) prediction_content_t *prediction_content_create(
    openai_api_prediction_content_TYPE_e type,
    prediction_content_content_t *content
);

void prediction_content_free(prediction_content_t *prediction_content);

prediction_content_t *prediction_content_parseFromJSON(cJSON *prediction_contentJSON);

cJSON *prediction_content_convertToJSON(prediction_content_t *prediction_content);

#endif /* _prediction_content_H_ */

