#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_moderation_response_results_inner.h"



create_moderation_response_results_inner_t *create_moderation_response_results_inner_create(
    int flagged,
    create_moderation_response_results_inner_categories_t *categories,
    create_moderation_response_results_inner_category_scores_t *category_scores
    ) {
    create_moderation_response_results_inner_t *create_moderation_response_results_inner_local_var = malloc(sizeof(create_moderation_response_results_inner_t));
    if (!create_moderation_response_results_inner_local_var) {
        return NULL;
    }
    create_moderation_response_results_inner_local_var->flagged = flagged;
    create_moderation_response_results_inner_local_var->categories = categories;
    create_moderation_response_results_inner_local_var->category_scores = category_scores;

    return create_moderation_response_results_inner_local_var;
}


void create_moderation_response_results_inner_free(create_moderation_response_results_inner_t *create_moderation_response_results_inner) {
    if(NULL == create_moderation_response_results_inner){
        return ;
    }
    listEntry_t *listEntry;
    if (create_moderation_response_results_inner->categories) {
        create_moderation_response_results_inner_categories_free(create_moderation_response_results_inner->categories);
        create_moderation_response_results_inner->categories = NULL;
    }
    if (create_moderation_response_results_inner->category_scores) {
        create_moderation_response_results_inner_category_scores_free(create_moderation_response_results_inner->category_scores);
        create_moderation_response_results_inner->category_scores = NULL;
    }
    free(create_moderation_response_results_inner);
}

cJSON *create_moderation_response_results_inner_convertToJSON(create_moderation_response_results_inner_t *create_moderation_response_results_inner) {
    cJSON *item = cJSON_CreateObject();

    // create_moderation_response_results_inner->flagged
    if (!create_moderation_response_results_inner->flagged) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "flagged", create_moderation_response_results_inner->flagged) == NULL) {
    goto fail; //Bool
    }


    // create_moderation_response_results_inner->categories
    if (!create_moderation_response_results_inner->categories) {
        goto fail;
    }
    cJSON *categories_local_JSON = create_moderation_response_results_inner_categories_convertToJSON(create_moderation_response_results_inner->categories);
    if(categories_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "categories", categories_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // create_moderation_response_results_inner->category_scores
    if (!create_moderation_response_results_inner->category_scores) {
        goto fail;
    }
    cJSON *category_scores_local_JSON = create_moderation_response_results_inner_category_scores_convertToJSON(create_moderation_response_results_inner->category_scores);
    if(category_scores_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "category_scores", category_scores_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_moderation_response_results_inner_t *create_moderation_response_results_inner_parseFromJSON(cJSON *create_moderation_response_results_innerJSON){

    create_moderation_response_results_inner_t *create_moderation_response_results_inner_local_var = NULL;

    // define the local variable for create_moderation_response_results_inner->categories
    create_moderation_response_results_inner_categories_t *categories_local_nonprim = NULL;

    // define the local variable for create_moderation_response_results_inner->category_scores
    create_moderation_response_results_inner_category_scores_t *category_scores_local_nonprim = NULL;

    // create_moderation_response_results_inner->flagged
    cJSON *flagged = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_innerJSON, "flagged");
    if (!flagged) {
        goto end;
    }

    
    if(!cJSON_IsBool(flagged))
    {
    goto end; //Bool
    }

    // create_moderation_response_results_inner->categories
    cJSON *categories = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_innerJSON, "categories");
    if (!categories) {
        goto end;
    }

    
    categories_local_nonprim = create_moderation_response_results_inner_categories_parseFromJSON(categories); //nonprimitive

    // create_moderation_response_results_inner->category_scores
    cJSON *category_scores = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_innerJSON, "category_scores");
    if (!category_scores) {
        goto end;
    }

    
    category_scores_local_nonprim = create_moderation_response_results_inner_category_scores_parseFromJSON(category_scores); //nonprimitive


    create_moderation_response_results_inner_local_var = create_moderation_response_results_inner_create (
        flagged->valueint,
        categories_local_nonprim,
        category_scores_local_nonprim
        );

    return create_moderation_response_results_inner_local_var;
end:
    if (categories_local_nonprim) {
        create_moderation_response_results_inner_categories_free(categories_local_nonprim);
        categories_local_nonprim = NULL;
    }
    if (category_scores_local_nonprim) {
        create_moderation_response_results_inner_category_scores_free(category_scores_local_nonprim);
        category_scores_local_nonprim = NULL;
    }
    return NULL;

}
