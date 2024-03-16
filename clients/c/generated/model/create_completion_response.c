#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_completion_response.h"



create_completion_response_t *create_completion_response_create(
    char *id,
    char *object,
    int created,
    char *model,
    list_t *choices,
    create_completion_response_usage_t *usage
    ) {
    create_completion_response_t *create_completion_response_local_var = malloc(sizeof(create_completion_response_t));
    if (!create_completion_response_local_var) {
        return NULL;
    }
    create_completion_response_local_var->id = id;
    create_completion_response_local_var->object = object;
    create_completion_response_local_var->created = created;
    create_completion_response_local_var->model = model;
    create_completion_response_local_var->choices = choices;
    create_completion_response_local_var->usage = usage;

    return create_completion_response_local_var;
}


void create_completion_response_free(create_completion_response_t *create_completion_response) {
    if(NULL == create_completion_response){
        return ;
    }
    listEntry_t *listEntry;
    if (create_completion_response->id) {
        free(create_completion_response->id);
        create_completion_response->id = NULL;
    }
    if (create_completion_response->object) {
        free(create_completion_response->object);
        create_completion_response->object = NULL;
    }
    if (create_completion_response->model) {
        free(create_completion_response->model);
        create_completion_response->model = NULL;
    }
    if (create_completion_response->choices) {
        list_ForEach(listEntry, create_completion_response->choices) {
            create_completion_response_choices_inner_free(listEntry->data);
        }
        list_freeList(create_completion_response->choices);
        create_completion_response->choices = NULL;
    }
    if (create_completion_response->usage) {
        create_completion_response_usage_free(create_completion_response->usage);
        create_completion_response->usage = NULL;
    }
    free(create_completion_response);
}

cJSON *create_completion_response_convertToJSON(create_completion_response_t *create_completion_response) {
    cJSON *item = cJSON_CreateObject();

    // create_completion_response->id
    if (!create_completion_response->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", create_completion_response->id) == NULL) {
    goto fail; //String
    }


    // create_completion_response->object
    if (!create_completion_response->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", create_completion_response->object) == NULL) {
    goto fail; //String
    }


    // create_completion_response->created
    if (!create_completion_response->created) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "created", create_completion_response->created) == NULL) {
    goto fail; //Numeric
    }


    // create_completion_response->model
    if (!create_completion_response->model) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "model", create_completion_response->model) == NULL) {
    goto fail; //String
    }


    // create_completion_response->choices
    if (!create_completion_response->choices) {
        goto fail;
    }
    cJSON *choices = cJSON_AddArrayToObject(item, "choices");
    if(choices == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *choicesListEntry;
    if (create_completion_response->choices) {
    list_ForEach(choicesListEntry, create_completion_response->choices) {
    cJSON *itemLocal = create_completion_response_choices_inner_convertToJSON(choicesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(choices, itemLocal);
    }
    }


    // create_completion_response->usage
    if(create_completion_response->usage) {
    cJSON *usage_local_JSON = create_completion_response_usage_convertToJSON(create_completion_response->usage);
    if(usage_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "usage", usage_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_completion_response_t *create_completion_response_parseFromJSON(cJSON *create_completion_responseJSON){

    create_completion_response_t *create_completion_response_local_var = NULL;

    // define the local list for create_completion_response->choices
    list_t *choicesList = NULL;

    // define the local variable for create_completion_response->usage
    create_completion_response_usage_t *usage_local_nonprim = NULL;

    // create_completion_response->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(create_completion_responseJSON, "id");
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // create_completion_response->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(create_completion_responseJSON, "object");
    if (!object) {
        goto end;
    }

    
    if(!cJSON_IsString(object))
    {
    goto end; //String
    }

    // create_completion_response->created
    cJSON *created = cJSON_GetObjectItemCaseSensitive(create_completion_responseJSON, "created");
    if (!created) {
        goto end;
    }

    
    if(!cJSON_IsNumber(created))
    {
    goto end; //Numeric
    }

    // create_completion_response->model
    cJSON *model = cJSON_GetObjectItemCaseSensitive(create_completion_responseJSON, "model");
    if (!model) {
        goto end;
    }

    
    if(!cJSON_IsString(model))
    {
    goto end; //String
    }

    // create_completion_response->choices
    cJSON *choices = cJSON_GetObjectItemCaseSensitive(create_completion_responseJSON, "choices");
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
        create_completion_response_choices_inner_t *choicesItem = create_completion_response_choices_inner_parseFromJSON(choices_local_nonprimitive);

        list_addElement(choicesList, choicesItem);
    }

    // create_completion_response->usage
    cJSON *usage = cJSON_GetObjectItemCaseSensitive(create_completion_responseJSON, "usage");
    if (usage) { 
    usage_local_nonprim = create_completion_response_usage_parseFromJSON(usage); //nonprimitive
    }


    create_completion_response_local_var = create_completion_response_create (
        strdup(id->valuestring),
        strdup(object->valuestring),
        created->valuedouble,
        strdup(model->valuestring),
        choicesList,
        usage ? usage_local_nonprim : NULL
        );

    return create_completion_response_local_var;
end:
    if (choicesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, choicesList) {
            create_completion_response_choices_inner_free(listEntry->data);
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
