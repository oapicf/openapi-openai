/*
 * create_moderation_response_results_inner_categories.h
 *
 * A list of the categories, and whether they are flagged or not.
 */

#ifndef _create_moderation_response_results_inner_categories_H_
#define _create_moderation_response_results_inner_categories_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_moderation_response_results_inner_categories_t create_moderation_response_results_inner_categories_t;




typedef struct create_moderation_response_results_inner_categories_t {
    int hate; //boolean
    int hate_threatening; //boolean
    int harassment; //boolean
    int harassment_threatening; //boolean
    int self_harm; //boolean
    int self_harm_intent; //boolean
    int self_harm_instructions; //boolean
    int sexual; //boolean
    int sexual_minors; //boolean
    int violence; //boolean
    int violence_graphic; //boolean

} create_moderation_response_results_inner_categories_t;

create_moderation_response_results_inner_categories_t *create_moderation_response_results_inner_categories_create(
    int hate,
    int hate_threatening,
    int harassment,
    int harassment_threatening,
    int self_harm,
    int self_harm_intent,
    int self_harm_instructions,
    int sexual,
    int sexual_minors,
    int violence,
    int violence_graphic
);

void create_moderation_response_results_inner_categories_free(create_moderation_response_results_inner_categories_t *create_moderation_response_results_inner_categories);

create_moderation_response_results_inner_categories_t *create_moderation_response_results_inner_categories_parseFromJSON(cJSON *create_moderation_response_results_inner_categoriesJSON);

cJSON *create_moderation_response_results_inner_categories_convertToJSON(create_moderation_response_results_inner_categories_t *create_moderation_response_results_inner_categories);

#endif /* _create_moderation_response_results_inner_categories_H_ */

