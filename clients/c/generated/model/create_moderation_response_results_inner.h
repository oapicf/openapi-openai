/*
 * create_moderation_response_results_inner.h
 *
 * 
 */

#ifndef _create_moderation_response_results_inner_H_
#define _create_moderation_response_results_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_moderation_response_results_inner_t create_moderation_response_results_inner_t;

#include "create_moderation_response_results_inner_categories.h"
#include "create_moderation_response_results_inner_category_scores.h"



typedef struct create_moderation_response_results_inner_t {
    int flagged; //boolean
    struct create_moderation_response_results_inner_categories_t *categories; //model
    struct create_moderation_response_results_inner_category_scores_t *category_scores; //model

    int _library_owned; // Is the library responsible for freeing this object?
} create_moderation_response_results_inner_t;

__attribute__((deprecated)) create_moderation_response_results_inner_t *create_moderation_response_results_inner_create(
    int flagged,
    create_moderation_response_results_inner_categories_t *categories,
    create_moderation_response_results_inner_category_scores_t *category_scores
);

void create_moderation_response_results_inner_free(create_moderation_response_results_inner_t *create_moderation_response_results_inner);

create_moderation_response_results_inner_t *create_moderation_response_results_inner_parseFromJSON(cJSON *create_moderation_response_results_innerJSON);

cJSON *create_moderation_response_results_inner_convertToJSON(create_moderation_response_results_inner_t *create_moderation_response_results_inner);

#endif /* _create_moderation_response_results_inner_H_ */

