#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_moderation_response_results_inner_categories.h"



static create_moderation_response_results_inner_categories_t *create_moderation_response_results_inner_categories_create_internal(
    int *hate,
    int *hate_threatening,
    int *harassment,
    int *harassment_threatening,
    int *illicit,
    int *illicit_violent,
    int *self_harm,
    int *self_harm_intent,
    int *self_harm_instructions,
    int *sexual,
    int *sexual_minors,
    int *violence,
    int *violence_graphic
    ) {
    create_moderation_response_results_inner_categories_t *create_moderation_response_results_inner_categories_local_var = malloc(sizeof(create_moderation_response_results_inner_categories_t));
    if (!create_moderation_response_results_inner_categories_local_var) {
        return NULL;
    }
    memset(create_moderation_response_results_inner_categories_local_var, 0, sizeof(create_moderation_response_results_inner_categories_t));
    create_moderation_response_results_inner_categories_local_var->_library_owned = 1;
    create_moderation_response_results_inner_categories_local_var->hate = hate;
    create_moderation_response_results_inner_categories_local_var->hate_threatening = hate_threatening;
    create_moderation_response_results_inner_categories_local_var->harassment = harassment;
    create_moderation_response_results_inner_categories_local_var->harassment_threatening = harassment_threatening;
    create_moderation_response_results_inner_categories_local_var->illicit = illicit;
    create_moderation_response_results_inner_categories_local_var->illicit_violent = illicit_violent;
    create_moderation_response_results_inner_categories_local_var->self_harm = self_harm;
    create_moderation_response_results_inner_categories_local_var->self_harm_intent = self_harm_intent;
    create_moderation_response_results_inner_categories_local_var->self_harm_instructions = self_harm_instructions;
    create_moderation_response_results_inner_categories_local_var->sexual = sexual;
    create_moderation_response_results_inner_categories_local_var->sexual_minors = sexual_minors;
    create_moderation_response_results_inner_categories_local_var->violence = violence;
    create_moderation_response_results_inner_categories_local_var->violence_graphic = violence_graphic;
    return create_moderation_response_results_inner_categories_local_var;
}

__attribute__((deprecated)) create_moderation_response_results_inner_categories_t *create_moderation_response_results_inner_categories_create(
    int *hate,
    int *hate_threatening,
    int *harassment,
    int *harassment_threatening,
    int *illicit,
    int *illicit_violent,
    int *self_harm,
    int *self_harm_intent,
    int *self_harm_instructions,
    int *sexual,
    int *sexual_minors,
    int *violence,
    int *violence_graphic
    ) {
    int *hate_copy = NULL;
    if (hate) {
        hate_copy = malloc(sizeof(int));
        if (hate_copy) *hate_copy = *hate;
    }
    int *hate_threatening_copy = NULL;
    if (hate_threatening) {
        hate_threatening_copy = malloc(sizeof(int));
        if (hate_threatening_copy) *hate_threatening_copy = *hate_threatening;
    }
    int *harassment_copy = NULL;
    if (harassment) {
        harassment_copy = malloc(sizeof(int));
        if (harassment_copy) *harassment_copy = *harassment;
    }
    int *harassment_threatening_copy = NULL;
    if (harassment_threatening) {
        harassment_threatening_copy = malloc(sizeof(int));
        if (harassment_threatening_copy) *harassment_threatening_copy = *harassment_threatening;
    }
    int *illicit_copy = NULL;
    if (illicit) {
        illicit_copy = malloc(sizeof(int));
        if (illicit_copy) *illicit_copy = *illicit;
    }
    int *illicit_violent_copy = NULL;
    if (illicit_violent) {
        illicit_violent_copy = malloc(sizeof(int));
        if (illicit_violent_copy) *illicit_violent_copy = *illicit_violent;
    }
    int *self_harm_copy = NULL;
    if (self_harm) {
        self_harm_copy = malloc(sizeof(int));
        if (self_harm_copy) *self_harm_copy = *self_harm;
    }
    int *self_harm_intent_copy = NULL;
    if (self_harm_intent) {
        self_harm_intent_copy = malloc(sizeof(int));
        if (self_harm_intent_copy) *self_harm_intent_copy = *self_harm_intent;
    }
    int *self_harm_instructions_copy = NULL;
    if (self_harm_instructions) {
        self_harm_instructions_copy = malloc(sizeof(int));
        if (self_harm_instructions_copy) *self_harm_instructions_copy = *self_harm_instructions;
    }
    int *sexual_copy = NULL;
    if (sexual) {
        sexual_copy = malloc(sizeof(int));
        if (sexual_copy) *sexual_copy = *sexual;
    }
    int *sexual_minors_copy = NULL;
    if (sexual_minors) {
        sexual_minors_copy = malloc(sizeof(int));
        if (sexual_minors_copy) *sexual_minors_copy = *sexual_minors;
    }
    int *violence_copy = NULL;
    if (violence) {
        violence_copy = malloc(sizeof(int));
        if (violence_copy) *violence_copy = *violence;
    }
    int *violence_graphic_copy = NULL;
    if (violence_graphic) {
        violence_graphic_copy = malloc(sizeof(int));
        if (violence_graphic_copy) *violence_graphic_copy = *violence_graphic;
    }
    create_moderation_response_results_inner_categories_t *result = create_moderation_response_results_inner_categories_create_internal (
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

void create_moderation_response_results_inner_categories_free(create_moderation_response_results_inner_categories_t *create_moderation_response_results_inner_categories) {
    if(NULL == create_moderation_response_results_inner_categories){
        return ;
    }
    if(create_moderation_response_results_inner_categories->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "create_moderation_response_results_inner_categories_free");
        return ;
    }
    listEntry_t *listEntry;
    if (create_moderation_response_results_inner_categories->hate) {
        free(create_moderation_response_results_inner_categories->hate);
        create_moderation_response_results_inner_categories->hate = NULL;
    }
    if (create_moderation_response_results_inner_categories->hate_threatening) {
        free(create_moderation_response_results_inner_categories->hate_threatening);
        create_moderation_response_results_inner_categories->hate_threatening = NULL;
    }
    if (create_moderation_response_results_inner_categories->harassment) {
        free(create_moderation_response_results_inner_categories->harassment);
        create_moderation_response_results_inner_categories->harassment = NULL;
    }
    if (create_moderation_response_results_inner_categories->harassment_threatening) {
        free(create_moderation_response_results_inner_categories->harassment_threatening);
        create_moderation_response_results_inner_categories->harassment_threatening = NULL;
    }
    if (create_moderation_response_results_inner_categories->illicit) {
        free(create_moderation_response_results_inner_categories->illicit);
        create_moderation_response_results_inner_categories->illicit = NULL;
    }
    if (create_moderation_response_results_inner_categories->illicit_violent) {
        free(create_moderation_response_results_inner_categories->illicit_violent);
        create_moderation_response_results_inner_categories->illicit_violent = NULL;
    }
    if (create_moderation_response_results_inner_categories->self_harm) {
        free(create_moderation_response_results_inner_categories->self_harm);
        create_moderation_response_results_inner_categories->self_harm = NULL;
    }
    if (create_moderation_response_results_inner_categories->self_harm_intent) {
        free(create_moderation_response_results_inner_categories->self_harm_intent);
        create_moderation_response_results_inner_categories->self_harm_intent = NULL;
    }
    if (create_moderation_response_results_inner_categories->self_harm_instructions) {
        free(create_moderation_response_results_inner_categories->self_harm_instructions);
        create_moderation_response_results_inner_categories->self_harm_instructions = NULL;
    }
    if (create_moderation_response_results_inner_categories->sexual) {
        free(create_moderation_response_results_inner_categories->sexual);
        create_moderation_response_results_inner_categories->sexual = NULL;
    }
    if (create_moderation_response_results_inner_categories->sexual_minors) {
        free(create_moderation_response_results_inner_categories->sexual_minors);
        create_moderation_response_results_inner_categories->sexual_minors = NULL;
    }
    if (create_moderation_response_results_inner_categories->violence) {
        free(create_moderation_response_results_inner_categories->violence);
        create_moderation_response_results_inner_categories->violence = NULL;
    }
    if (create_moderation_response_results_inner_categories->violence_graphic) {
        free(create_moderation_response_results_inner_categories->violence_graphic);
        create_moderation_response_results_inner_categories->violence_graphic = NULL;
    }
    free(create_moderation_response_results_inner_categories);
}

cJSON *create_moderation_response_results_inner_categories_convertToJSON(create_moderation_response_results_inner_categories_t *create_moderation_response_results_inner_categories) {
    cJSON *item = cJSON_CreateObject();

    // create_moderation_response_results_inner_categories->hate
    if (!create_moderation_response_results_inner_categories->hate) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "hate", *create_moderation_response_results_inner_categories->hate) == NULL) {
    goto fail; //Bool
    }


    // create_moderation_response_results_inner_categories->hate_threatening
    if (!create_moderation_response_results_inner_categories->hate_threatening) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "hate/threatening", *create_moderation_response_results_inner_categories->hate_threatening) == NULL) {
    goto fail; //Bool
    }


    // create_moderation_response_results_inner_categories->harassment
    if (!create_moderation_response_results_inner_categories->harassment) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "harassment", *create_moderation_response_results_inner_categories->harassment) == NULL) {
    goto fail; //Bool
    }


    // create_moderation_response_results_inner_categories->harassment_threatening
    if (!create_moderation_response_results_inner_categories->harassment_threatening) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "harassment/threatening", *create_moderation_response_results_inner_categories->harassment_threatening) == NULL) {
    goto fail; //Bool
    }


    // create_moderation_response_results_inner_categories->illicit
    if (!create_moderation_response_results_inner_categories->illicit) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "illicit", *create_moderation_response_results_inner_categories->illicit) == NULL) {
    goto fail; //Bool
    }


    // create_moderation_response_results_inner_categories->illicit_violent
    if (!create_moderation_response_results_inner_categories->illicit_violent) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "illicit/violent", *create_moderation_response_results_inner_categories->illicit_violent) == NULL) {
    goto fail; //Bool
    }


    // create_moderation_response_results_inner_categories->self_harm
    if (!create_moderation_response_results_inner_categories->self_harm) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "self-harm", *create_moderation_response_results_inner_categories->self_harm) == NULL) {
    goto fail; //Bool
    }


    // create_moderation_response_results_inner_categories->self_harm_intent
    if (!create_moderation_response_results_inner_categories->self_harm_intent) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "self-harm/intent", *create_moderation_response_results_inner_categories->self_harm_intent) == NULL) {
    goto fail; //Bool
    }


    // create_moderation_response_results_inner_categories->self_harm_instructions
    if (!create_moderation_response_results_inner_categories->self_harm_instructions) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "self-harm/instructions", *create_moderation_response_results_inner_categories->self_harm_instructions) == NULL) {
    goto fail; //Bool
    }


    // create_moderation_response_results_inner_categories->sexual
    if (!create_moderation_response_results_inner_categories->sexual) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "sexual", *create_moderation_response_results_inner_categories->sexual) == NULL) {
    goto fail; //Bool
    }


    // create_moderation_response_results_inner_categories->sexual_minors
    if (!create_moderation_response_results_inner_categories->sexual_minors) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "sexual/minors", *create_moderation_response_results_inner_categories->sexual_minors) == NULL) {
    goto fail; //Bool
    }


    // create_moderation_response_results_inner_categories->violence
    if (!create_moderation_response_results_inner_categories->violence) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "violence", *create_moderation_response_results_inner_categories->violence) == NULL) {
    goto fail; //Bool
    }


    // create_moderation_response_results_inner_categories->violence_graphic
    if (!create_moderation_response_results_inner_categories->violence_graphic) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "violence/graphic", *create_moderation_response_results_inner_categories->violence_graphic) == NULL) {
    goto fail; //Bool
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_moderation_response_results_inner_categories_t *create_moderation_response_results_inner_categories_parseFromJSON(cJSON *create_moderation_response_results_inner_categoriesJSON){

    create_moderation_response_results_inner_categories_t *create_moderation_response_results_inner_categories_local_var = NULL;

    // define the local variable for create_moderation_response_results_inner_categories->hate
    int *hate_local_var = NULL;

    // define the local variable for create_moderation_response_results_inner_categories->hate_threatening
    int *hate_threatening_local_var = NULL;

    // define the local variable for create_moderation_response_results_inner_categories->harassment
    int *harassment_local_var = NULL;

    // define the local variable for create_moderation_response_results_inner_categories->harassment_threatening
    int *harassment_threatening_local_var = NULL;

    // define the local variable for create_moderation_response_results_inner_categories->illicit
    int *illicit_local_var = NULL;

    // define the local variable for create_moderation_response_results_inner_categories->illicit_violent
    int *illicit_violent_local_var = NULL;

    // define the local variable for create_moderation_response_results_inner_categories->self_harm
    int *self_harm_local_var = NULL;

    // define the local variable for create_moderation_response_results_inner_categories->self_harm_intent
    int *self_harm_intent_local_var = NULL;

    // define the local variable for create_moderation_response_results_inner_categories->self_harm_instructions
    int *self_harm_instructions_local_var = NULL;

    // define the local variable for create_moderation_response_results_inner_categories->sexual
    int *sexual_local_var = NULL;

    // define the local variable for create_moderation_response_results_inner_categories->sexual_minors
    int *sexual_minors_local_var = NULL;

    // define the local variable for create_moderation_response_results_inner_categories->violence
    int *violence_local_var = NULL;

    // define the local variable for create_moderation_response_results_inner_categories->violence_graphic
    int *violence_graphic_local_var = NULL;

    // create_moderation_response_results_inner_categories->hate
    cJSON *hate = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_categoriesJSON, "hate");
    if (cJSON_IsNull(hate)) {
        hate = NULL;
    }
    if (!hate) {
        goto end;
    }

    
    if(!cJSON_IsBool(hate))
    {
    goto end; //Bool
    }
    hate_local_var = malloc(sizeof(int));
    if(!hate_local_var)
    {
        goto end;
    }
    *hate_local_var = hate->valueint;

    // create_moderation_response_results_inner_categories->hate_threatening
    cJSON *hate_threatening = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_categoriesJSON, "hate/threatening");
    if (cJSON_IsNull(hate_threatening)) {
        hate_threatening = NULL;
    }
    if (!hate_threatening) {
        goto end;
    }

    
    if(!cJSON_IsBool(hate_threatening))
    {
    goto end; //Bool
    }
    hate_threatening_local_var = malloc(sizeof(int));
    if(!hate_threatening_local_var)
    {
        goto end;
    }
    *hate_threatening_local_var = hate_threatening->valueint;

    // create_moderation_response_results_inner_categories->harassment
    cJSON *harassment = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_categoriesJSON, "harassment");
    if (cJSON_IsNull(harassment)) {
        harassment = NULL;
    }
    if (!harassment) {
        goto end;
    }

    
    if(!cJSON_IsBool(harassment))
    {
    goto end; //Bool
    }
    harassment_local_var = malloc(sizeof(int));
    if(!harassment_local_var)
    {
        goto end;
    }
    *harassment_local_var = harassment->valueint;

    // create_moderation_response_results_inner_categories->harassment_threatening
    cJSON *harassment_threatening = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_categoriesJSON, "harassment/threatening");
    if (cJSON_IsNull(harassment_threatening)) {
        harassment_threatening = NULL;
    }
    if (!harassment_threatening) {
        goto end;
    }

    
    if(!cJSON_IsBool(harassment_threatening))
    {
    goto end; //Bool
    }
    harassment_threatening_local_var = malloc(sizeof(int));
    if(!harassment_threatening_local_var)
    {
        goto end;
    }
    *harassment_threatening_local_var = harassment_threatening->valueint;

    // create_moderation_response_results_inner_categories->illicit
    cJSON *illicit = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_categoriesJSON, "illicit");
    if (cJSON_IsNull(illicit)) {
        illicit = NULL;
    }
    if (!illicit) {
        goto end;
    }

    
    if(!cJSON_IsBool(illicit))
    {
    goto end; //Bool
    }
    illicit_local_var = malloc(sizeof(int));
    if(!illicit_local_var)
    {
        goto end;
    }
    *illicit_local_var = illicit->valueint;

    // create_moderation_response_results_inner_categories->illicit_violent
    cJSON *illicit_violent = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_categoriesJSON, "illicit/violent");
    if (cJSON_IsNull(illicit_violent)) {
        illicit_violent = NULL;
    }
    if (!illicit_violent) {
        goto end;
    }

    
    if(!cJSON_IsBool(illicit_violent))
    {
    goto end; //Bool
    }
    illicit_violent_local_var = malloc(sizeof(int));
    if(!illicit_violent_local_var)
    {
        goto end;
    }
    *illicit_violent_local_var = illicit_violent->valueint;

    // create_moderation_response_results_inner_categories->self_harm
    cJSON *self_harm = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_categoriesJSON, "self-harm");
    if (cJSON_IsNull(self_harm)) {
        self_harm = NULL;
    }
    if (!self_harm) {
        goto end;
    }

    
    if(!cJSON_IsBool(self_harm))
    {
    goto end; //Bool
    }
    self_harm_local_var = malloc(sizeof(int));
    if(!self_harm_local_var)
    {
        goto end;
    }
    *self_harm_local_var = self_harm->valueint;

    // create_moderation_response_results_inner_categories->self_harm_intent
    cJSON *self_harm_intent = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_categoriesJSON, "self-harm/intent");
    if (cJSON_IsNull(self_harm_intent)) {
        self_harm_intent = NULL;
    }
    if (!self_harm_intent) {
        goto end;
    }

    
    if(!cJSON_IsBool(self_harm_intent))
    {
    goto end; //Bool
    }
    self_harm_intent_local_var = malloc(sizeof(int));
    if(!self_harm_intent_local_var)
    {
        goto end;
    }
    *self_harm_intent_local_var = self_harm_intent->valueint;

    // create_moderation_response_results_inner_categories->self_harm_instructions
    cJSON *self_harm_instructions = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_categoriesJSON, "self-harm/instructions");
    if (cJSON_IsNull(self_harm_instructions)) {
        self_harm_instructions = NULL;
    }
    if (!self_harm_instructions) {
        goto end;
    }

    
    if(!cJSON_IsBool(self_harm_instructions))
    {
    goto end; //Bool
    }
    self_harm_instructions_local_var = malloc(sizeof(int));
    if(!self_harm_instructions_local_var)
    {
        goto end;
    }
    *self_harm_instructions_local_var = self_harm_instructions->valueint;

    // create_moderation_response_results_inner_categories->sexual
    cJSON *sexual = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_categoriesJSON, "sexual");
    if (cJSON_IsNull(sexual)) {
        sexual = NULL;
    }
    if (!sexual) {
        goto end;
    }

    
    if(!cJSON_IsBool(sexual))
    {
    goto end; //Bool
    }
    sexual_local_var = malloc(sizeof(int));
    if(!sexual_local_var)
    {
        goto end;
    }
    *sexual_local_var = sexual->valueint;

    // create_moderation_response_results_inner_categories->sexual_minors
    cJSON *sexual_minors = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_categoriesJSON, "sexual/minors");
    if (cJSON_IsNull(sexual_minors)) {
        sexual_minors = NULL;
    }
    if (!sexual_minors) {
        goto end;
    }

    
    if(!cJSON_IsBool(sexual_minors))
    {
    goto end; //Bool
    }
    sexual_minors_local_var = malloc(sizeof(int));
    if(!sexual_minors_local_var)
    {
        goto end;
    }
    *sexual_minors_local_var = sexual_minors->valueint;

    // create_moderation_response_results_inner_categories->violence
    cJSON *violence = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_categoriesJSON, "violence");
    if (cJSON_IsNull(violence)) {
        violence = NULL;
    }
    if (!violence) {
        goto end;
    }

    
    if(!cJSON_IsBool(violence))
    {
    goto end; //Bool
    }
    violence_local_var = malloc(sizeof(int));
    if(!violence_local_var)
    {
        goto end;
    }
    *violence_local_var = violence->valueint;

    // create_moderation_response_results_inner_categories->violence_graphic
    cJSON *violence_graphic = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_categoriesJSON, "violence/graphic");
    if (cJSON_IsNull(violence_graphic)) {
        violence_graphic = NULL;
    }
    if (!violence_graphic) {
        goto end;
    }

    
    if(!cJSON_IsBool(violence_graphic))
    {
    goto end; //Bool
    }
    violence_graphic_local_var = malloc(sizeof(int));
    if(!violence_graphic_local_var)
    {
        goto end;
    }
    *violence_graphic_local_var = violence_graphic->valueint;



    create_moderation_response_results_inner_categories_local_var = create_moderation_response_results_inner_categories_create_internal (
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

    if (!create_moderation_response_results_inner_categories_local_var) {
        goto end;
    }

    return create_moderation_response_results_inner_categories_local_var;
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
