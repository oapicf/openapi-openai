#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_moderation_response_results_inner_categories.h"



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
    ) {
    create_moderation_response_results_inner_categories_t *create_moderation_response_results_inner_categories_local_var = malloc(sizeof(create_moderation_response_results_inner_categories_t));
    if (!create_moderation_response_results_inner_categories_local_var) {
        return NULL;
    }
    create_moderation_response_results_inner_categories_local_var->hate = hate;
    create_moderation_response_results_inner_categories_local_var->hate_threatening = hate_threatening;
    create_moderation_response_results_inner_categories_local_var->harassment = harassment;
    create_moderation_response_results_inner_categories_local_var->harassment_threatening = harassment_threatening;
    create_moderation_response_results_inner_categories_local_var->self_harm = self_harm;
    create_moderation_response_results_inner_categories_local_var->self_harm_intent = self_harm_intent;
    create_moderation_response_results_inner_categories_local_var->self_harm_instructions = self_harm_instructions;
    create_moderation_response_results_inner_categories_local_var->sexual = sexual;
    create_moderation_response_results_inner_categories_local_var->sexual_minors = sexual_minors;
    create_moderation_response_results_inner_categories_local_var->violence = violence;
    create_moderation_response_results_inner_categories_local_var->violence_graphic = violence_graphic;

    return create_moderation_response_results_inner_categories_local_var;
}


void create_moderation_response_results_inner_categories_free(create_moderation_response_results_inner_categories_t *create_moderation_response_results_inner_categories) {
    if(NULL == create_moderation_response_results_inner_categories){
        return ;
    }
    listEntry_t *listEntry;
    free(create_moderation_response_results_inner_categories);
}

cJSON *create_moderation_response_results_inner_categories_convertToJSON(create_moderation_response_results_inner_categories_t *create_moderation_response_results_inner_categories) {
    cJSON *item = cJSON_CreateObject();

    // create_moderation_response_results_inner_categories->hate
    if (!create_moderation_response_results_inner_categories->hate) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "hate", create_moderation_response_results_inner_categories->hate) == NULL) {
    goto fail; //Bool
    }


    // create_moderation_response_results_inner_categories->hate_threatening
    if (!create_moderation_response_results_inner_categories->hate_threatening) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "hate/threatening", create_moderation_response_results_inner_categories->hate_threatening) == NULL) {
    goto fail; //Bool
    }


    // create_moderation_response_results_inner_categories->harassment
    if (!create_moderation_response_results_inner_categories->harassment) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "harassment", create_moderation_response_results_inner_categories->harassment) == NULL) {
    goto fail; //Bool
    }


    // create_moderation_response_results_inner_categories->harassment_threatening
    if (!create_moderation_response_results_inner_categories->harassment_threatening) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "harassment/threatening", create_moderation_response_results_inner_categories->harassment_threatening) == NULL) {
    goto fail; //Bool
    }


    // create_moderation_response_results_inner_categories->self_harm
    if (!create_moderation_response_results_inner_categories->self_harm) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "self-harm", create_moderation_response_results_inner_categories->self_harm) == NULL) {
    goto fail; //Bool
    }


    // create_moderation_response_results_inner_categories->self_harm_intent
    if (!create_moderation_response_results_inner_categories->self_harm_intent) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "self-harm/intent", create_moderation_response_results_inner_categories->self_harm_intent) == NULL) {
    goto fail; //Bool
    }


    // create_moderation_response_results_inner_categories->self_harm_instructions
    if (!create_moderation_response_results_inner_categories->self_harm_instructions) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "self-harm/instructions", create_moderation_response_results_inner_categories->self_harm_instructions) == NULL) {
    goto fail; //Bool
    }


    // create_moderation_response_results_inner_categories->sexual
    if (!create_moderation_response_results_inner_categories->sexual) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "sexual", create_moderation_response_results_inner_categories->sexual) == NULL) {
    goto fail; //Bool
    }


    // create_moderation_response_results_inner_categories->sexual_minors
    if (!create_moderation_response_results_inner_categories->sexual_minors) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "sexual/minors", create_moderation_response_results_inner_categories->sexual_minors) == NULL) {
    goto fail; //Bool
    }


    // create_moderation_response_results_inner_categories->violence
    if (!create_moderation_response_results_inner_categories->violence) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "violence", create_moderation_response_results_inner_categories->violence) == NULL) {
    goto fail; //Bool
    }


    // create_moderation_response_results_inner_categories->violence_graphic
    if (!create_moderation_response_results_inner_categories->violence_graphic) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "violence/graphic", create_moderation_response_results_inner_categories->violence_graphic) == NULL) {
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

    // create_moderation_response_results_inner_categories->hate
    cJSON *hate = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_categoriesJSON, "hate");
    if (!hate) {
        goto end;
    }

    
    if(!cJSON_IsBool(hate))
    {
    goto end; //Bool
    }

    // create_moderation_response_results_inner_categories->hate_threatening
    cJSON *hate_threatening = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_categoriesJSON, "hate/threatening");
    if (!hate_threatening) {
        goto end;
    }

    
    if(!cJSON_IsBool(hate_threatening))
    {
    goto end; //Bool
    }

    // create_moderation_response_results_inner_categories->harassment
    cJSON *harassment = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_categoriesJSON, "harassment");
    if (!harassment) {
        goto end;
    }

    
    if(!cJSON_IsBool(harassment))
    {
    goto end; //Bool
    }

    // create_moderation_response_results_inner_categories->harassment_threatening
    cJSON *harassment_threatening = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_categoriesJSON, "harassment/threatening");
    if (!harassment_threatening) {
        goto end;
    }

    
    if(!cJSON_IsBool(harassment_threatening))
    {
    goto end; //Bool
    }

    // create_moderation_response_results_inner_categories->self_harm
    cJSON *self_harm = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_categoriesJSON, "self-harm");
    if (!self_harm) {
        goto end;
    }

    
    if(!cJSON_IsBool(self_harm))
    {
    goto end; //Bool
    }

    // create_moderation_response_results_inner_categories->self_harm_intent
    cJSON *self_harm_intent = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_categoriesJSON, "self-harm/intent");
    if (!self_harm_intent) {
        goto end;
    }

    
    if(!cJSON_IsBool(self_harm_intent))
    {
    goto end; //Bool
    }

    // create_moderation_response_results_inner_categories->self_harm_instructions
    cJSON *self_harm_instructions = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_categoriesJSON, "self-harm/instructions");
    if (!self_harm_instructions) {
        goto end;
    }

    
    if(!cJSON_IsBool(self_harm_instructions))
    {
    goto end; //Bool
    }

    // create_moderation_response_results_inner_categories->sexual
    cJSON *sexual = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_categoriesJSON, "sexual");
    if (!sexual) {
        goto end;
    }

    
    if(!cJSON_IsBool(sexual))
    {
    goto end; //Bool
    }

    // create_moderation_response_results_inner_categories->sexual_minors
    cJSON *sexual_minors = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_categoriesJSON, "sexual/minors");
    if (!sexual_minors) {
        goto end;
    }

    
    if(!cJSON_IsBool(sexual_minors))
    {
    goto end; //Bool
    }

    // create_moderation_response_results_inner_categories->violence
    cJSON *violence = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_categoriesJSON, "violence");
    if (!violence) {
        goto end;
    }

    
    if(!cJSON_IsBool(violence))
    {
    goto end; //Bool
    }

    // create_moderation_response_results_inner_categories->violence_graphic
    cJSON *violence_graphic = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_categoriesJSON, "violence/graphic");
    if (!violence_graphic) {
        goto end;
    }

    
    if(!cJSON_IsBool(violence_graphic))
    {
    goto end; //Bool
    }


    create_moderation_response_results_inner_categories_local_var = create_moderation_response_results_inner_categories_create (
        hate->valueint,
        hate_threatening->valueint,
        harassment->valueint,
        harassment_threatening->valueint,
        self_harm->valueint,
        self_harm_intent->valueint,
        self_harm_instructions->valueint,
        sexual->valueint,
        sexual_minors->valueint,
        violence->valueint,
        violence_graphic->valueint
        );

    return create_moderation_response_results_inner_categories_local_var;
end:
    return NULL;

}
