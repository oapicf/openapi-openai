#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_moderation_response_results_inner_category_scores.h"



create_moderation_response_results_inner_category_scores_t *create_moderation_response_results_inner_category_scores_create(
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
    ) {
    create_moderation_response_results_inner_category_scores_t *create_moderation_response_results_inner_category_scores_local_var = malloc(sizeof(create_moderation_response_results_inner_category_scores_t));
    if (!create_moderation_response_results_inner_category_scores_local_var) {
        return NULL;
    }
    create_moderation_response_results_inner_category_scores_local_var->hate = hate;
    create_moderation_response_results_inner_category_scores_local_var->hate_threatening = hate_threatening;
    create_moderation_response_results_inner_category_scores_local_var->harassment = harassment;
    create_moderation_response_results_inner_category_scores_local_var->harassment_threatening = harassment_threatening;
    create_moderation_response_results_inner_category_scores_local_var->self_harm = self_harm;
    create_moderation_response_results_inner_category_scores_local_var->self_harm_intent = self_harm_intent;
    create_moderation_response_results_inner_category_scores_local_var->self_harm_instructions = self_harm_instructions;
    create_moderation_response_results_inner_category_scores_local_var->sexual = sexual;
    create_moderation_response_results_inner_category_scores_local_var->sexual_minors = sexual_minors;
    create_moderation_response_results_inner_category_scores_local_var->violence = violence;
    create_moderation_response_results_inner_category_scores_local_var->violence_graphic = violence_graphic;

    return create_moderation_response_results_inner_category_scores_local_var;
}


void create_moderation_response_results_inner_category_scores_free(create_moderation_response_results_inner_category_scores_t *create_moderation_response_results_inner_category_scores) {
    if(NULL == create_moderation_response_results_inner_category_scores){
        return ;
    }
    listEntry_t *listEntry;
    free(create_moderation_response_results_inner_category_scores);
}

cJSON *create_moderation_response_results_inner_category_scores_convertToJSON(create_moderation_response_results_inner_category_scores_t *create_moderation_response_results_inner_category_scores) {
    cJSON *item = cJSON_CreateObject();

    // create_moderation_response_results_inner_category_scores->hate
    if (!create_moderation_response_results_inner_category_scores->hate) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "hate", create_moderation_response_results_inner_category_scores->hate) == NULL) {
    goto fail; //Numeric
    }


    // create_moderation_response_results_inner_category_scores->hate_threatening
    if (!create_moderation_response_results_inner_category_scores->hate_threatening) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "hate/threatening", create_moderation_response_results_inner_category_scores->hate_threatening) == NULL) {
    goto fail; //Numeric
    }


    // create_moderation_response_results_inner_category_scores->harassment
    if (!create_moderation_response_results_inner_category_scores->harassment) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "harassment", create_moderation_response_results_inner_category_scores->harassment) == NULL) {
    goto fail; //Numeric
    }


    // create_moderation_response_results_inner_category_scores->harassment_threatening
    if (!create_moderation_response_results_inner_category_scores->harassment_threatening) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "harassment/threatening", create_moderation_response_results_inner_category_scores->harassment_threatening) == NULL) {
    goto fail; //Numeric
    }


    // create_moderation_response_results_inner_category_scores->self_harm
    if (!create_moderation_response_results_inner_category_scores->self_harm) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "self-harm", create_moderation_response_results_inner_category_scores->self_harm) == NULL) {
    goto fail; //Numeric
    }


    // create_moderation_response_results_inner_category_scores->self_harm_intent
    if (!create_moderation_response_results_inner_category_scores->self_harm_intent) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "self-harm/intent", create_moderation_response_results_inner_category_scores->self_harm_intent) == NULL) {
    goto fail; //Numeric
    }


    // create_moderation_response_results_inner_category_scores->self_harm_instructions
    if (!create_moderation_response_results_inner_category_scores->self_harm_instructions) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "self-harm/instructions", create_moderation_response_results_inner_category_scores->self_harm_instructions) == NULL) {
    goto fail; //Numeric
    }


    // create_moderation_response_results_inner_category_scores->sexual
    if (!create_moderation_response_results_inner_category_scores->sexual) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "sexual", create_moderation_response_results_inner_category_scores->sexual) == NULL) {
    goto fail; //Numeric
    }


    // create_moderation_response_results_inner_category_scores->sexual_minors
    if (!create_moderation_response_results_inner_category_scores->sexual_minors) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "sexual/minors", create_moderation_response_results_inner_category_scores->sexual_minors) == NULL) {
    goto fail; //Numeric
    }


    // create_moderation_response_results_inner_category_scores->violence
    if (!create_moderation_response_results_inner_category_scores->violence) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "violence", create_moderation_response_results_inner_category_scores->violence) == NULL) {
    goto fail; //Numeric
    }


    // create_moderation_response_results_inner_category_scores->violence_graphic
    if (!create_moderation_response_results_inner_category_scores->violence_graphic) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "violence/graphic", create_moderation_response_results_inner_category_scores->violence_graphic) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_moderation_response_results_inner_category_scores_t *create_moderation_response_results_inner_category_scores_parseFromJSON(cJSON *create_moderation_response_results_inner_category_scoresJSON){

    create_moderation_response_results_inner_category_scores_t *create_moderation_response_results_inner_category_scores_local_var = NULL;

    // create_moderation_response_results_inner_category_scores->hate
    cJSON *hate = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_category_scoresJSON, "hate");
    if (!hate) {
        goto end;
    }

    
    if(!cJSON_IsNumber(hate))
    {
    goto end; //Numeric
    }

    // create_moderation_response_results_inner_category_scores->hate_threatening
    cJSON *hate_threatening = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_category_scoresJSON, "hate/threatening");
    if (!hate_threatening) {
        goto end;
    }

    
    if(!cJSON_IsNumber(hate_threatening))
    {
    goto end; //Numeric
    }

    // create_moderation_response_results_inner_category_scores->harassment
    cJSON *harassment = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_category_scoresJSON, "harassment");
    if (!harassment) {
        goto end;
    }

    
    if(!cJSON_IsNumber(harassment))
    {
    goto end; //Numeric
    }

    // create_moderation_response_results_inner_category_scores->harassment_threatening
    cJSON *harassment_threatening = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_category_scoresJSON, "harassment/threatening");
    if (!harassment_threatening) {
        goto end;
    }

    
    if(!cJSON_IsNumber(harassment_threatening))
    {
    goto end; //Numeric
    }

    // create_moderation_response_results_inner_category_scores->self_harm
    cJSON *self_harm = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_category_scoresJSON, "self-harm");
    if (!self_harm) {
        goto end;
    }

    
    if(!cJSON_IsNumber(self_harm))
    {
    goto end; //Numeric
    }

    // create_moderation_response_results_inner_category_scores->self_harm_intent
    cJSON *self_harm_intent = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_category_scoresJSON, "self-harm/intent");
    if (!self_harm_intent) {
        goto end;
    }

    
    if(!cJSON_IsNumber(self_harm_intent))
    {
    goto end; //Numeric
    }

    // create_moderation_response_results_inner_category_scores->self_harm_instructions
    cJSON *self_harm_instructions = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_category_scoresJSON, "self-harm/instructions");
    if (!self_harm_instructions) {
        goto end;
    }

    
    if(!cJSON_IsNumber(self_harm_instructions))
    {
    goto end; //Numeric
    }

    // create_moderation_response_results_inner_category_scores->sexual
    cJSON *sexual = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_category_scoresJSON, "sexual");
    if (!sexual) {
        goto end;
    }

    
    if(!cJSON_IsNumber(sexual))
    {
    goto end; //Numeric
    }

    // create_moderation_response_results_inner_category_scores->sexual_minors
    cJSON *sexual_minors = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_category_scoresJSON, "sexual/minors");
    if (!sexual_minors) {
        goto end;
    }

    
    if(!cJSON_IsNumber(sexual_minors))
    {
    goto end; //Numeric
    }

    // create_moderation_response_results_inner_category_scores->violence
    cJSON *violence = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_category_scoresJSON, "violence");
    if (!violence) {
        goto end;
    }

    
    if(!cJSON_IsNumber(violence))
    {
    goto end; //Numeric
    }

    // create_moderation_response_results_inner_category_scores->violence_graphic
    cJSON *violence_graphic = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_category_scoresJSON, "violence/graphic");
    if (!violence_graphic) {
        goto end;
    }

    
    if(!cJSON_IsNumber(violence_graphic))
    {
    goto end; //Numeric
    }


    create_moderation_response_results_inner_category_scores_local_var = create_moderation_response_results_inner_category_scores_create (
        hate->valuedouble,
        hate_threatening->valuedouble,
        harassment->valuedouble,
        harassment_threatening->valuedouble,
        self_harm->valuedouble,
        self_harm_intent->valuedouble,
        self_harm_instructions->valuedouble,
        sexual->valuedouble,
        sexual_minors->valuedouble,
        violence->valuedouble,
        violence_graphic->valuedouble
        );

    return create_moderation_response_results_inner_category_scores_local_var;
end:
    return NULL;

}
