/*
 * create_moderation_response_results_inner_category_scores.h
 *
 * 
 */

#ifndef _create_moderation_response_results_inner_category_scores_H_
#define _create_moderation_response_results_inner_category_scores_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_moderation_response_results_inner_category_scores_t create_moderation_response_results_inner_category_scores_t;




typedef struct create_moderation_response_results_inner_category_scores_t {
    double hate; //numeric
    double hate_threatening; //numeric
    double self_harm; //numeric
    double sexual; //numeric
    double sexual_minors; //numeric
    double violence; //numeric
    double violence_graphic; //numeric

} create_moderation_response_results_inner_category_scores_t;

create_moderation_response_results_inner_category_scores_t *create_moderation_response_results_inner_category_scores_create(
    double hate,
    double hate_threatening,
    double self_harm,
    double sexual,
    double sexual_minors,
    double violence,
    double violence_graphic
);

void create_moderation_response_results_inner_category_scores_free(create_moderation_response_results_inner_category_scores_t *create_moderation_response_results_inner_category_scores);

create_moderation_response_results_inner_category_scores_t *create_moderation_response_results_inner_category_scores_parseFromJSON(cJSON *create_moderation_response_results_inner_category_scoresJSON);

cJSON *create_moderation_response_results_inner_category_scores_convertToJSON(create_moderation_response_results_inner_category_scores_t *create_moderation_response_results_inner_category_scores);

#endif /* _create_moderation_response_results_inner_category_scores_H_ */

