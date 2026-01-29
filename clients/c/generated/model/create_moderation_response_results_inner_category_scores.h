/*
 * create_moderation_response_results_inner_category_scores.h
 *
 * A list of the categories along with their scores as predicted by model.
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
    double harassment; //numeric
    double harassment_threatening; //numeric
    double self_harm; //numeric
    double self_harm_intent; //numeric
    double self_harm_instructions; //numeric
    double sexual; //numeric
    double sexual_minors; //numeric
    double violence; //numeric
    double violence_graphic; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} create_moderation_response_results_inner_category_scores_t;

__attribute__((deprecated)) create_moderation_response_results_inner_category_scores_t *create_moderation_response_results_inner_category_scores_create(
    double hate,
    double hate_threatening,
    double harassment,
    double harassment_threatening,
    double self_harm,
    double self_harm_intent,
    double self_harm_instructions,
    double sexual,
    double sexual_minors,
    double violence,
    double violence_graphic
);

void create_moderation_response_results_inner_category_scores_free(create_moderation_response_results_inner_category_scores_t *create_moderation_response_results_inner_category_scores);

create_moderation_response_results_inner_category_scores_t *create_moderation_response_results_inner_category_scores_parseFromJSON(cJSON *create_moderation_response_results_inner_category_scoresJSON);

cJSON *create_moderation_response_results_inner_category_scores_convertToJSON(create_moderation_response_results_inner_category_scores_t *create_moderation_response_results_inner_category_scores);

#endif /* _create_moderation_response_results_inner_category_scores_H_ */

