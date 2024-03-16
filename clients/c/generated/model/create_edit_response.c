#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_edit_response.h"



create_edit_response_t *create_edit_response_create(
    char *object,
    int created,
    list_t *choices,
    create_completion_response_usage_t *usage
    ) {
    create_edit_response_t *create_edit_response_local_var = malloc(sizeof(create_edit_response_t));
    if (!create_edit_response_local_var) {
        return NULL;
    }
    create_edit_response_local_var->object = object;
    create_edit_response_local_var->created = created;
    create_edit_response_local_var->choices = choices;
    create_edit_response_local_var->usage = usage;

    return create_edit_response_local_var;
}


void create_edit_response_free(create_edit_response_t *create_edit_response) {
    if(NULL == create_edit_response){
        return ;
    }
    listEntry_t *listEntry;
    if (create_edit_response->object) {
        free(create_edit_response->object);
        create_edit_response->object = NULL;
    }
    if (create_edit_response->choices) {
        list_ForEach(listEntry, create_edit_response->choices) {
            create_edit_response_choices_inner_free(listEntry->data);
        }
        list_freeList(create_edit_response->choices);
        create_edit_response->choices = NULL;
    }
    if (create_edit_response->usage) {
        create_completion_response_usage_free(create_edit_response->usage);
        create_edit_response->usage = NULL;
    }
    free(create_edit_response);
}

cJSON *create_edit_response_convertToJSON(create_edit_response_t *create_edit_response) {
    cJSON *item = cJSON_CreateObject();

    // create_edit_response->object
    if (!create_edit_response->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", create_edit_response->object) == NULL) {
    goto fail; //String
    }


    // create_edit_response->created
    if (!create_edit_response->created) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "created", create_edit_response->created) == NULL) {
    goto fail; //Numeric
    }


    // create_edit_response->choices
    if (!create_edit_response->choices) {
        goto fail;
    }
    cJSON *choices = cJSON_AddArrayToObject(item, "choices");
    if(choices == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *choicesListEntry;
    if (create_edit_response->choices) {
    list_ForEach(choicesListEntry, create_edit_response->choices) {
    cJSON *itemLocal = create_edit_response_choices_inner_convertToJSON(choicesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(choices, itemLocal);
    }
    }


    // create_edit_response->usage
    if (!create_edit_response->usage) {
        goto fail;
    }
    cJSON *usage_local_JSON = create_completion_response_usage_convertToJSON(create_edit_response->usage);
    if(usage_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "usage", usage_local_JSON);
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

create_edit_response_t *create_edit_response_parseFromJSON(cJSON *create_edit_responseJSON){

    create_edit_response_t *create_edit_response_local_var = NULL;

    // define the local list for create_edit_response->choices
    list_t *choicesList = NULL;

    // define the local variable for create_edit_response->usage
    create_completion_response_usage_t *usage_local_nonprim = NULL;

    // create_edit_response->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(create_edit_responseJSON, "object");
    if (!object) {
        goto end;
    }

    
    if(!cJSON_IsString(object))
    {
    goto end; //String
    }

    // create_edit_response->created
    cJSON *created = cJSON_GetObjectItemCaseSensitive(create_edit_responseJSON, "created");
    if (!created) {
        goto end;
    }

    
    if(!cJSON_IsNumber(created))
    {
    goto end; //Numeric
    }

    // create_edit_response->choices
    cJSON *choices = cJSON_GetObjectItemCaseSensitive(create_edit_responseJSON, "choices");
    if (!choices) {
        goto end;
    }

    
    cJSON *choices_local_nonprimitive = NULL;
    if(!cJSON_IsArray(choices)){
        goto end; //nonprimitive container
    }

    choicesList = list_createList();

    cJSON_ArrayForEach(choices_local_nonprimitive,choices )
    {
        if(!cJSON_IsObject(choices_local_nonprimitive)){
            goto end;
        }
        create_edit_response_choices_inner_t *choicesItem = create_edit_response_choices_inner_parseFromJSON(choices_local_nonprimitive);

        list_addElement(choicesList, choicesItem);
    }

    // create_edit_response->usage
    cJSON *usage = cJSON_GetObjectItemCaseSensitive(create_edit_responseJSON, "usage");
    if (!usage) {
        goto end;
    }

    
    usage_local_nonprim = create_completion_response_usage_parseFromJSON(usage); //nonprimitive


    create_edit_response_local_var = create_edit_response_create (
        strdup(object->valuestring),
        created->valuedouble,
        choicesList,
        usage_local_nonprim
        );

    return create_edit_response_local_var;
end:
    if (choicesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, choicesList) {
            create_edit_response_choices_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(choicesList);
        choicesList = NULL;
    }
    if (usage_local_nonprim) {
        create_completion_response_usage_free(usage_local_nonprim);
        usage_local_nonprim = NULL;
    }
    return NULL;

}
