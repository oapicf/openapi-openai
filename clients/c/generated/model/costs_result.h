/*
 * costs_result.h
 *
 * The aggregated costs details of the specific time bucket.
 */

#ifndef _costs_result_H_
#define _costs_result_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct costs_result_t costs_result_t;

#include "costs_result_amount.h"

// Enum OBJECT for costs_result

typedef enum  { openai_api_costs_result_OBJECT_NULL = 0, openai_api_costs_result_OBJECT_organization.costs.result } openai_api_costs_result_OBJECT_e;

char* costs_result_object_ToString(openai_api_costs_result_OBJECT_e object);

openai_api_costs_result_OBJECT_e costs_result_object_FromString(char* object);



typedef struct costs_result_t {
    openai_api_costs_result_OBJECT_e object; //enum
    struct costs_result_amount_t *amount; //model
    char *line_item; // string
    char *project_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} costs_result_t;

__attribute__((deprecated)) costs_result_t *costs_result_create(
    openai_api_costs_result_OBJECT_e object,
    costs_result_amount_t *amount,
    char *line_item,
    char *project_id
);

void costs_result_free(costs_result_t *costs_result);

costs_result_t *costs_result_parseFromJSON(cJSON *costs_resultJSON);

cJSON *costs_result_convertToJSON(costs_result_t *costs_result);

#endif /* _costs_result_H_ */

