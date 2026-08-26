#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_moderation_response_results_inner_category_scores.h"



static create_moderation_response_results_inner_category_scores_t *create_moderation_response_results_inner_category_scores_create_internal(
    double *hate,
    double *hate_threatening,
    double *harassment,
    double *harassment_threatening,
    double *illicit,
    double *illicit_violent,
    double *self_harm,
    double *self_harm_intent,
    double *self_harm_instructions,
    double *sexual,
    double *sexual_minors,
    double *violence,
    double *violence_graphic
    ) {
    create_moderation_response_results_inner_category_scores_t *create_moderation_response_results_inner_category_scores_local_var = malloc(sizeof(create_moderation_response_results_inner_category_scores_t));
    if (!create_moderation_response_results_inner_category_scores_local_var) {
        return NULL;
    }
    memset(create_moderation_response_results_inner_category_scores_local_var, 0, sizeof(create_moderation_response_results_inner_category_scores_t));
    create_moderation_response_results_inner_category_scores_local_var->_library_owned = 1;
    create_moderation_response_results_inner_category_scores_local_var->hate = hate;
    create_moderation_response_results_inner_category_scores_local_var->hate_threatening = hate_threatening;
    create_moderation_response_results_inner_category_scores_local_var->harassment = harassment;
    create_moderation_response_results_inner_category_scores_local_var->harassment_threatening = harassment_threatening;
    create_moderation_response_results_inner_category_scores_local_var->illicit = illicit;
    create_moderation_response_results_inner_category_scores_local_var->illicit_violent = illicit_violent;
    create_moderation_response_results_inner_category_scores_local_var->self_harm = self_harm;
    create_moderation_response_results_inner_category_scores_local_var->self_harm_intent = self_harm_intent;
    create_moderation_response_results_inner_category_scores_local_var->self_harm_instructions = self_harm_instructions;
    create_moderation_response_results_inner_category_scores_local_var->sexual = sexual;
    create_moderation_response_results_inner_category_scores_local_var->sexual_minors = sexual_minors;
    create_moderation_response_results_inner_category_scores_local_var->violence = violence;
    create_moderation_response_results_inner_category_scores_local_var->violence_graphic = violence_graphic;
    return create_moderation_response_results_inner_category_scores_local_var;
}

__attribute__((deprecated)) create_moderation_response_results_inner_category_scores_t *create_moderation_response_results_inner_category_scores_create(
    double *hate,
    double *hate_threatening,
    double *harassment,
    double *harassment_threatening,
    double *illicit,
    double *illicit_violent,
    double *self_harm,
    double *self_harm_intent,
    double *self_harm_instructions,
    double *sexual,
    double *sexual_minors,
    double *violence,
    double *violence_graphic
    ) {
    double *hate_copy = NULL;
    if (hate) {
        hate_copy = malloc(sizeof(double));
        if (hate_copy) *hate_copy = *hate;
    }
    double *hate_threatening_copy = NULL;
    if (hate_threatening) {
        hate_threatening_copy = malloc(sizeof(double));
        if (hate_threatening_copy) *hate_threatening_copy = *hate_threatening;
    }
    double *harassment_copy = NULL;
    if (harassment) {
        harassment_copy = malloc(sizeof(double));
        if (harassment_copy) *harassment_copy = *harassment;
    }
    double *harassment_threatening_copy = NULL;
    if (harassment_threatening) {
        harassment_threatening_copy = malloc(sizeof(double));
        if (harassment_threatening_copy) *harassment_threatening_copy = *harassment_threatening;
    }
    double *illicit_copy = NULL;
    if (illicit) {
        illicit_copy = malloc(sizeof(double));
        if (illicit_copy) *illicit_copy = *illicit;
    }
    double *illicit_violent_copy = NULL;
    if (illicit_violent) {
        illicit_violent_copy = malloc(sizeof(double));
        if (illicit_violent_copy) *illicit_violent_copy = *illicit_violent;
    }
    double *self_harm_copy = NULL;
    if (self_harm) {
        self_harm_copy = malloc(sizeof(double));
        if (self_harm_copy) *self_harm_copy = *self_harm;
    }
    double *self_harm_intent_copy = NULL;
    if (self_harm_intent) {
        self_harm_intent_copy = malloc(sizeof(double));
        if (self_harm_intent_copy) *self_harm_intent_copy = *self_harm_intent;
    }
    double *self_harm_instructions_copy = NULL;
    if (self_harm_instructions) {
        self_harm_instructions_copy = malloc(sizeof(double));
        if (self_harm_instructions_copy) *self_harm_instructions_copy = *self_harm_instructions;
    }
    double *sexual_copy = NULL;
    if (sexual) {
        sexual_copy = malloc(sizeof(double));
        if (sexual_copy) *sexual_copy = *sexual;
    }
    double *sexual_minors_copy = NULL;
    if (sexual_minors) {
        sexual_minors_copy = malloc(sizeof(double));
        if (sexual_minors_copy) *sexual_minors_copy = *sexual_minors;
    }
    double *violence_copy = NULL;
    if (violence) {
        violence_copy = malloc(sizeof(double));
        if (violence_copy) *violence_copy = *violence;
    }
    double *violence_graphic_copy = NULL;
    if (violence_graphic) {
        violence_graphic_copy = malloc(sizeof(double));
        if (violence_graphic_copy) *violence_graphic_copy = *violence_graphic;
    }
    create_moderation_response_results_inner_category_scores_t *result = create_moderation_response_results_inner_category_scores_create_internal (
        hate_copy,
        hate_threatening_copy,
        harassment_copy,
        harassment_threatening_copy,
        illicit_copy,
        illicit_violent_copy,
        self_harm_copy,
        self_harm_intent_copy,
        self_harm_instructions_copy,
        sexual_copy,
        sexual_minors_copy,
        violence_copy,
        violence_graphic_copy
        );
    if (!result) {
        free(hate_copy);
        free(hate_threatening_copy);
        free(harassment_copy);
        free(harassment_threatening_copy);
        free(illicit_copy);
        free(illicit_violent_copy);
        free(self_harm_copy);
        free(self_harm_intent_copy);
        free(self_harm_instructions_copy);
        free(sexual_copy);
        free(sexual_minors_copy);
        free(violence_copy);
        free(violence_graphic_copy);
    }
    return result;
}

void create_moderation_response_results_inner_category_scores_free(create_moderation_response_results_inner_category_scores_t *create_moderation_response_results_inner_category_scores) {
    if(NULL == create_moderation_response_results_inner_category_scores){
        return ;
    }
    if(create_moderation_response_results_inner_category_scores->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "create_moderation_response_results_inner_category_scores_free");
        return ;
    }
    listEntry_t *listEntry;
    if (create_moderation_response_results_inner_category_scores->hate) {
        free(create_moderation_response_results_inner_category_scores->hate);
        create_moderation_response_results_inner_category_scores->hate = NULL;
    }
    if (create_moderation_response_results_inner_category_scores->hate_threatening) {
        free(create_moderation_response_results_inner_category_scores->hate_threatening);
        create_moderation_response_results_inner_category_scores->hate_threatening = NULL;
    }
    if (create_moderation_response_results_inner_category_scores->harassment) {
        free(create_moderation_response_results_inner_category_scores->harassment);
        create_moderation_response_results_inner_category_scores->harassment = NULL;
    }
    if (create_moderation_response_results_inner_category_scores->harassment_threatening) {
        free(create_moderation_response_results_inner_category_scores->harassment_threatening);
        create_moderation_response_results_inner_category_scores->harassment_threatening = NULL;
    }
    if (create_moderation_response_results_inner_category_scores->illicit) {
        free(create_moderation_response_results_inner_category_scores->illicit);
        create_moderation_response_results_inner_category_scores->illicit = NULL;
    }
    if (create_moderation_response_results_inner_category_scores->illicit_violent) {
        free(create_moderation_response_results_inner_category_scores->illicit_violent);
        create_moderation_response_results_inner_category_scores->illicit_violent = NULL;
    }
    if (create_moderation_response_results_inner_category_scores->self_harm) {
        free(create_moderation_response_results_inner_category_scores->self_harm);
        create_moderation_response_results_inner_category_scores->self_harm = NULL;
    }
    if (create_moderation_response_results_inner_category_scores->self_harm_intent) {
        free(create_moderation_response_results_inner_category_scores->self_harm_intent);
        create_moderation_response_results_inner_category_scores->self_harm_intent = NULL;
    }
    if (create_moderation_response_results_inner_category_scores->self_harm_instructions) {
        free(create_moderation_response_results_inner_category_scores->self_harm_instructions);
        create_moderation_response_results_inner_category_scores->self_harm_instructions = NULL;
    }
    if (create_moderation_response_results_inner_category_scores->sexual) {
        free(create_moderation_response_results_inner_category_scores->sexual);
        create_moderation_response_results_inner_category_scores->sexual = NULL;
    }
    if (create_moderation_response_results_inner_category_scores->sexual_minors) {
        free(create_moderation_response_results_inner_category_scores->sexual_minors);
        create_moderation_response_results_inner_category_scores->sexual_minors = NULL;
    }
    if (create_moderation_response_results_inner_category_scores->violence) {
        free(create_moderation_response_results_inner_category_scores->violence);
        create_moderation_response_results_inner_category_scores->violence = NULL;
    }
    if (create_moderation_response_results_inner_category_scores->violence_graphic) {
        free(create_moderation_response_results_inner_category_scores->violence_graphic);
        create_moderation_response_results_inner_category_scores->violence_graphic = NULL;
    }
    free(create_moderation_response_results_inner_category_scores);
}

cJSON *create_moderation_response_results_inner_category_scores_convertToJSON(create_moderation_response_results_inner_category_scores_t *create_moderation_response_results_inner_category_scores) {
    cJSON *item = cJSON_CreateObject();

    // create_moderation_response_results_inner_category_scores->hate
    if (!create_moderation_response_results_inner_category_scores->hate) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "hate", *create_moderation_response_results_inner_category_scores->hate) == NULL) {
    goto fail; //Numeric
    }


    // create_moderation_response_results_inner_category_scores->hate_threatening
    if (!create_moderation_response_results_inner_category_scores->hate_threatening) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "hate/threatening", *create_moderation_response_results_inner_category_scores->hate_threatening) == NULL) {
    goto fail; //Numeric
    }


    // create_moderation_response_results_inner_category_scores->harassment
    if (!create_moderation_response_results_inner_category_scores->harassment) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "harassment", *create_moderation_response_results_inner_category_scores->harassment) == NULL) {
    goto fail; //Numeric
    }


    // create_moderation_response_results_inner_category_scores->harassment_threatening
    if (!create_moderation_response_results_inner_category_scores->harassment_threatening) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "harassment/threatening", *create_moderation_response_results_inner_category_scores->harassment_threatening) == NULL) {
    goto fail; //Numeric
    }


    // create_moderation_response_results_inner_category_scores->illicit
    if (!create_moderation_response_results_inner_category_scores->illicit) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "illicit", *create_moderation_response_results_inner_category_scores->illicit) == NULL) {
    goto fail; //Numeric
    }


    // create_moderation_response_results_inner_category_scores->illicit_violent
    if (!create_moderation_response_results_inner_category_scores->illicit_violent) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "illicit/violent", *create_moderation_response_results_inner_category_scores->illicit_violent) == NULL) {
    goto fail; //Numeric
    }


    // create_moderation_response_results_inner_category_scores->self_harm
    if (!create_moderation_response_results_inner_category_scores->self_harm) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "self-harm", *create_moderation_response_results_inner_category_scores->self_harm) == NULL) {
    goto fail; //Numeric
    }


    // create_moderation_response_results_inner_category_scores->self_harm_intent
    if (!create_moderation_response_results_inner_category_scores->self_harm_intent) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "self-harm/intent", *create_moderation_response_results_inner_category_scores->self_harm_intent) == NULL) {
    goto fail; //Numeric
    }


    // create_moderation_response_results_inner_category_scores->self_harm_instructions
    if (!create_moderation_response_results_inner_category_scores->self_harm_instructions) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "self-harm/instructions", *create_moderation_response_results_inner_category_scores->self_harm_instructions) == NULL) {
    goto fail; //Numeric
    }


    // create_moderation_response_results_inner_category_scores->sexual
    if (!create_moderation_response_results_inner_category_scores->sexual) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "sexual", *create_moderation_response_results_inner_category_scores->sexual) == NULL) {
    goto fail; //Numeric
    }


    // create_moderation_response_results_inner_category_scores->sexual_minors
    if (!create_moderation_response_results_inner_category_scores->sexual_minors) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "sexual/minors", *create_moderation_response_results_inner_category_scores->sexual_minors) == NULL) {
    goto fail; //Numeric
    }


    // create_moderation_response_results_inner_category_scores->violence
    if (!create_moderation_response_results_inner_category_scores->violence) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "violence", *create_moderation_response_results_inner_category_scores->violence) == NULL) {
    goto fail; //Numeric
    }


    // create_moderation_response_results_inner_category_scores->violence_graphic
    if (!create_moderation_response_results_inner_category_scores->violence_graphic) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "violence/graphic", *create_moderation_response_results_inner_category_scores->violence_graphic) == NULL) {
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

    // define the local variable for create_moderation_response_results_inner_category_scores->hate
    double *hate_local_var = NULL;

    // define the local variable for create_moderation_response_results_inner_category_scores->hate_threatening
    double *hate_threatening_local_var = NULL;

    // define the local variable for create_moderation_response_results_inner_category_scores->harassment
    double *harassment_local_var = NULL;

    // define the local variable for create_moderation_response_results_inner_category_scores->harassment_threatening
    double *harassment_threatening_local_var = NULL;

    // define the local variable for create_moderation_response_results_inner_category_scores->illicit
    double *illicit_local_var = NULL;

    // define the local variable for create_moderation_response_results_inner_category_scores->illicit_violent
    double *illicit_violent_local_var = NULL;

    // define the local variable for create_moderation_response_results_inner_category_scores->self_harm
    double *self_harm_local_var = NULL;

    // define the local variable for create_moderation_response_results_inner_category_scores->self_harm_intent
    double *self_harm_intent_local_var = NULL;

    // define the local variable for create_moderation_response_results_inner_category_scores->self_harm_instructions
    double *self_harm_instructions_local_var = NULL;

    // define the local variable for create_moderation_response_results_inner_category_scores->sexual
    double *sexual_local_var = NULL;

    // define the local variable for create_moderation_response_results_inner_category_scores->sexual_minors
    double *sexual_minors_local_var = NULL;

    // define the local variable for create_moderation_response_results_inner_category_scores->violence
    double *violence_local_var = NULL;

    // define the local variable for create_moderation_response_results_inner_category_scores->violence_graphic
    double *violence_graphic_local_var = NULL;

    // create_moderation_response_results_inner_category_scores->hate
    cJSON *hate = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_category_scoresJSON, "hate");
    if (cJSON_IsNull(hate)) {
        hate = NULL;
    }
    if (!hate) {
        goto end;
    }

    
    if(!cJSON_IsNumber(hate))
    {
    goto end; //Numeric
    }
    hate_local_var = malloc(sizeof(double));
    if(!hate_local_var)
    {
        goto end;
    }
    *hate_local_var = hate->valuedouble;

    // create_moderation_response_results_inner_category_scores->hate_threatening
    cJSON *hate_threatening = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_category_scoresJSON, "hate/threatening");
    if (cJSON_IsNull(hate_threatening)) {
        hate_threatening = NULL;
    }
    if (!hate_threatening) {
        goto end;
    }

    
    if(!cJSON_IsNumber(hate_threatening))
    {
    goto end; //Numeric
    }
    hate_threatening_local_var = malloc(sizeof(double));
    if(!hate_threatening_local_var)
    {
        goto end;
    }
    *hate_threatening_local_var = hate_threatening->valuedouble;

    // create_moderation_response_results_inner_category_scores->harassment
    cJSON *harassment = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_category_scoresJSON, "harassment");
    if (cJSON_IsNull(harassment)) {
        harassment = NULL;
    }
    if (!harassment) {
        goto end;
    }

    
    if(!cJSON_IsNumber(harassment))
    {
    goto end; //Numeric
    }
    harassment_local_var = malloc(sizeof(double));
    if(!harassment_local_var)
    {
        goto end;
    }
    *harassment_local_var = harassment->valuedouble;

    // create_moderation_response_results_inner_category_scores->harassment_threatening
    cJSON *harassment_threatening = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_category_scoresJSON, "harassment/threatening");
    if (cJSON_IsNull(harassment_threatening)) {
        harassment_threatening = NULL;
    }
    if (!harassment_threatening) {
        goto end;
    }

    
    if(!cJSON_IsNumber(harassment_threatening))
    {
    goto end; //Numeric
    }
    harassment_threatening_local_var = malloc(sizeof(double));
    if(!harassment_threatening_local_var)
    {
        goto end;
    }
    *harassment_threatening_local_var = harassment_threatening->valuedouble;

    // create_moderation_response_results_inner_category_scores->illicit
    cJSON *illicit = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_category_scoresJSON, "illicit");
    if (cJSON_IsNull(illicit)) {
        illicit = NULL;
    }
    if (!illicit) {
        goto end;
    }

    
    if(!cJSON_IsNumber(illicit))
    {
    goto end; //Numeric
    }
    illicit_local_var = malloc(sizeof(double));
    if(!illicit_local_var)
    {
        goto end;
    }
    *illicit_local_var = illicit->valuedouble;

    // create_moderation_response_results_inner_category_scores->illicit_violent
    cJSON *illicit_violent = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_category_scoresJSON, "illicit/violent");
    if (cJSON_IsNull(illicit_violent)) {
        illicit_violent = NULL;
    }
    if (!illicit_violent) {
        goto end;
    }

    
    if(!cJSON_IsNumber(illicit_violent))
    {
    goto end; //Numeric
    }
    illicit_violent_local_var = malloc(sizeof(double));
    if(!illicit_violent_local_var)
    {
        goto end;
    }
    *illicit_violent_local_var = illicit_violent->valuedouble;

    // create_moderation_response_results_inner_category_scores->self_harm
    cJSON *self_harm = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_category_scoresJSON, "self-harm");
    if (cJSON_IsNull(self_harm)) {
        self_harm = NULL;
    }
    if (!self_harm) {
        goto end;
    }

    
    if(!cJSON_IsNumber(self_harm))
    {
    goto end; //Numeric
    }
    self_harm_local_var = malloc(sizeof(double));
    if(!self_harm_local_var)
    {
        goto end;
    }
    *self_harm_local_var = self_harm->valuedouble;

    // create_moderation_response_results_inner_category_scores->self_harm_intent
    cJSON *self_harm_intent = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_category_scoresJSON, "self-harm/intent");
    if (cJSON_IsNull(self_harm_intent)) {
        self_harm_intent = NULL;
    }
    if (!self_harm_intent) {
        goto end;
    }

    
    if(!cJSON_IsNumber(self_harm_intent))
    {
    goto end; //Numeric
    }
    self_harm_intent_local_var = malloc(sizeof(double));
    if(!self_harm_intent_local_var)
    {
        goto end;
    }
    *self_harm_intent_local_var = self_harm_intent->valuedouble;

    // create_moderation_response_results_inner_category_scores->self_harm_instructions
    cJSON *self_harm_instructions = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_category_scoresJSON, "self-harm/instructions");
    if (cJSON_IsNull(self_harm_instructions)) {
        self_harm_instructions = NULL;
    }
    if (!self_harm_instructions) {
        goto end;
    }

    
    if(!cJSON_IsNumber(self_harm_instructions))
    {
    goto end; //Numeric
    }
    self_harm_instructions_local_var = malloc(sizeof(double));
    if(!self_harm_instructions_local_var)
    {
        goto end;
    }
    *self_harm_instructions_local_var = self_harm_instructions->valuedouble;

    // create_moderation_response_results_inner_category_scores->sexual
    cJSON *sexual = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_category_scoresJSON, "sexual");
    if (cJSON_IsNull(sexual)) {
        sexual = NULL;
    }
    if (!sexual) {
        goto end;
    }

    
    if(!cJSON_IsNumber(sexual))
    {
    goto end; //Numeric
    }
    sexual_local_var = malloc(sizeof(double));
    if(!sexual_local_var)
    {
        goto end;
    }
    *sexual_local_var = sexual->valuedouble;

    // create_moderation_response_results_inner_category_scores->sexual_minors
    cJSON *sexual_minors = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_category_scoresJSON, "sexual/minors");
    if (cJSON_IsNull(sexual_minors)) {
        sexual_minors = NULL;
    }
    if (!sexual_minors) {
        goto end;
    }

    
    if(!cJSON_IsNumber(sexual_minors))
    {
    goto end; //Numeric
    }
    sexual_minors_local_var = malloc(sizeof(double));
    if(!sexual_minors_local_var)
    {
        goto end;
    }
    *sexual_minors_local_var = sexual_minors->valuedouble;

    // create_moderation_response_results_inner_category_scores->violence
    cJSON *violence = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_category_scoresJSON, "violence");
    if (cJSON_IsNull(violence)) {
        violence = NULL;
    }
    if (!violence) {
        goto end;
    }

    
    if(!cJSON_IsNumber(violence))
    {
    goto end; //Numeric
    }
    violence_local_var = malloc(sizeof(double));
    if(!violence_local_var)
    {
        goto end;
    }
    *violence_local_var = violence->valuedouble;

    // create_moderation_response_results_inner_category_scores->violence_graphic
    cJSON *violence_graphic = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_category_scoresJSON, "violence/graphic");
    if (cJSON_IsNull(violence_graphic)) {
        violence_graphic = NULL;
    }
    if (!violence_graphic) {
        goto end;
    }

    
    if(!cJSON_IsNumber(violence_graphic))
    {
    goto end; //Numeric
    }
    violence_graphic_local_var = malloc(sizeof(double));
    if(!violence_graphic_local_var)
    {
        goto end;
    }
    *violence_graphic_local_var = violence_graphic->valuedouble;



    create_moderation_response_results_inner_category_scores_local_var = create_moderation_response_results_inner_category_scores_create_internal (
        hate_local_var,
        hate_threatening_local_var,
        harassment_local_var,
        harassment_threatening_local_var,
        illicit_local_var,
        illicit_violent_local_var,
        self_harm_local_var,
        self_harm_intent_local_var,
        self_harm_instructions_local_var,
        sexual_local_var,
        sexual_minors_local_var,
        violence_local_var,
        violence_graphic_local_var
        );

    if (!create_moderation_response_results_inner_category_scores_local_var) {
        goto end;
    }

    return create_moderation_response_results_inner_category_scores_local_var;
end:
    if (hate_local_var) {
        free(hate_local_var);
        hate_local_var = NULL;
    }
    if (hate_threatening_local_var) {
        free(hate_threatening_local_var);
        hate_threatening_local_var = NULL;
    }
    if (harassment_local_var) {
        free(harassment_local_var);
        harassment_local_var = NULL;
    }
    if (harassment_threatening_local_var) {
        free(harassment_threatening_local_var);
        harassment_threatening_local_var = NULL;
    }
    if (illicit_local_var) {
        free(illicit_local_var);
        illicit_local_var = NULL;
    }
    if (illicit_violent_local_var) {
        free(illicit_violent_local_var);
        illicit_violent_local_var = NULL;
    }
    if (self_harm_local_var) {
        free(self_harm_local_var);
        self_harm_local_var = NULL;
    }
    if (self_harm_intent_local_var) {
        free(self_harm_intent_local_var);
        self_harm_intent_local_var = NULL;
    }
    if (self_harm_instructions_local_var) {
        free(self_harm_instructions_local_var);
        self_harm_instructions_local_var = NULL;
    }
    if (sexual_local_var) {
        free(sexual_local_var);
        sexual_local_var = NULL;
    }
    if (sexual_minors_local_var) {
        free(sexual_minors_local_var);
        sexual_minors_local_var = NULL;
    }
    if (violence_local_var) {
        free(violence_local_var);
        violence_local_var = NULL;
    }
    if (violence_graphic_local_var) {
        free(violence_graphic_local_var);
        violence_graphic_local_var = NULL;
    }
    return NULL;

}
