#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_chat_completion_stream_response.h"


char* create_chat_completion_stream_response_service_tier_ToString(openai_api_create_chat_completion_stream_response_SERVICETIER_e service_tier) {
    char* service_tierArray[] =  { "NULL", "scale", "default" };
    return service_tierArray[service_tier];
}

openai_api_create_chat_completion_stream_response_SERVICETIER_e create_chat_completion_stream_response_service_tier_FromString(char* service_tier){
    int stringToReturn = 0;
    char *service_tierArray[] =  { "NULL", "scale", "default" };
    size_t sizeofArray = sizeof(service_tierArray) / sizeof(service_tierArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(service_tier, service_tierArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* create_chat_completion_stream_response_object_ToString(openai_api_create_chat_completion_stream_response_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "chat.completion.chunk" };
    return objectArray[object];
}

openai_api_create_chat_completion_stream_response_OBJECT_e create_chat_completion_stream_response_object_FromString(char* object){
    int stringToReturn = 0;
    char *objectArray[] =  { "NULL", "chat.completion.chunk" };
    size_t sizeofArray = sizeof(objectArray) / sizeof(objectArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(object, objectArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static create_chat_completion_stream_response_t *create_chat_completion_stream_response_create_internal(
    char *id,
    list_t *choices,
    int created,
    char *model,
    openai_api_create_chat_completion_stream_response_SERVICETIER_e service_tier,
    char *system_fingerprint,
    openai_api_create_chat_completion_stream_response_OBJECT_e object,
    create_chat_completion_stream_response_usage_t *usage
    ) {
    create_chat_completion_stream_response_t *create_chat_completion_stream_response_local_var = malloc(sizeof(create_chat_completion_stream_response_t));
    if (!create_chat_completion_stream_response_local_var) {
        return NULL;
    }
    create_chat_completion_stream_response_local_var->id = id;
    create_chat_completion_stream_response_local_var->choices = choices;
    create_chat_completion_stream_response_local_var->created = created;
    create_chat_completion_stream_response_local_var->model = model;
    create_chat_completion_stream_response_local_var->service_tier = service_tier;
    create_chat_completion_stream_response_local_var->system_fingerprint = system_fingerprint;
    create_chat_completion_stream_response_local_var->object = object;
    create_chat_completion_stream_response_local_var->usage = usage;

    create_chat_completion_stream_response_local_var->_library_owned = 1;
    return create_chat_completion_stream_response_local_var;
}

__attribute__((deprecated)) create_chat_completion_stream_response_t *create_chat_completion_stream_response_create(
    char *id,
    list_t *choices,
    int created,
    char *model,
    openai_api_create_chat_completion_stream_response_SERVICETIER_e service_tier,
    char *system_fingerprint,
    openai_api_create_chat_completion_stream_response_OBJECT_e object,
    create_chat_completion_stream_response_usage_t *usage
    ) {
    return create_chat_completion_stream_response_create_internal (
        id,
        choices,
        created,
        model,
        service_tier,
        system_fingerprint,
        object,
        usage
        );
}

void create_chat_completion_stream_response_free(create_chat_completion_stream_response_t *create_chat_completion_stream_response) {
    if(NULL == create_chat_completion_stream_response){
        return ;
    }
    if(create_chat_completion_stream_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "create_chat_completion_stream_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (create_chat_completion_stream_response->id) {
        free(create_chat_completion_stream_response->id);
        create_chat_completion_stream_response->id = NULL;
    }
    if (create_chat_completion_stream_response->choices) {
        list_ForEach(listEntry, create_chat_completion_stream_response->choices) {
            create_chat_completion_stream_response_choices_inner_free(listEntry->data);
        }
        list_freeList(create_chat_completion_stream_response->choices);
        create_chat_completion_stream_response->choices = NULL;
    }
    if (create_chat_completion_stream_response->model) {
        free(create_chat_completion_stream_response->model);
        create_chat_completion_stream_response->model = NULL;
    }
    if (create_chat_completion_stream_response->system_fingerprint) {
        free(create_chat_completion_stream_response->system_fingerprint);
        create_chat_completion_stream_response->system_fingerprint = NULL;
    }
    if (create_chat_completion_stream_response->usage) {
        create_chat_completion_stream_response_usage_free(create_chat_completion_stream_response->usage);
        create_chat_completion_stream_response->usage = NULL;
    }
    free(create_chat_completion_stream_response);
}

cJSON *create_chat_completion_stream_response_convertToJSON(create_chat_completion_stream_response_t *create_chat_completion_stream_response) {
    cJSON *item = cJSON_CreateObject();

    // create_chat_completion_stream_response->id
    if (!create_chat_completion_stream_response->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", create_chat_completion_stream_response->id) == NULL) {
    goto fail; //String
    }


    // create_chat_completion_stream_response->choices
    if (!create_chat_completion_stream_response->choices) {
        goto fail;
    }
    cJSON *choices = cJSON_AddArrayToObject(item, "choices");
    if(choices == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *choicesListEntry;
    if (create_chat_completion_stream_response->choices) {
    list_ForEach(choicesListEntry, create_chat_completion_stream_response->choices) {
    cJSON *itemLocal = create_chat_completion_stream_response_choices_inner_convertToJSON(choicesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(choices, itemLocal);
    }
    }


    // create_chat_completion_stream_response->created
    if (!create_chat_completion_stream_response->created) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "created", create_chat_completion_stream_response->created) == NULL) {
    goto fail; //Numeric
    }


    // create_chat_completion_stream_response->model
    if (!create_chat_completion_stream_response->model) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "model", create_chat_completion_stream_response->model) == NULL) {
    goto fail; //String
    }


    // create_chat_completion_stream_response->service_tier
    if(create_chat_completion_stream_response->service_tier != openai_api_create_chat_completion_stream_response_SERVICETIER_NULL) {
    if(cJSON_AddStringToObject(item, "service_tier", create_chat_completion_stream_response_service_tier_ToString(create_chat_completion_stream_response->service_tier)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // create_chat_completion_stream_response->system_fingerprint
    if(create_chat_completion_stream_response->system_fingerprint) {
    if(cJSON_AddStringToObject(item, "system_fingerprint", create_chat_completion_stream_response->system_fingerprint) == NULL) {
    goto fail; //String
    }
    }


    // create_chat_completion_stream_response->object
    if (openai_api_create_chat_completion_stream_response_OBJECT_NULL == create_chat_completion_stream_response->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", create_chat_completion_stream_response_object_ToString(create_chat_completion_stream_response->object)) == NULL)
    {
    goto fail; //Enum
    }


    // create_chat_completion_stream_response->usage
    if(create_chat_completion_stream_response->usage) {
    cJSON *usage_local_JSON = create_chat_completion_stream_response_usage_convertToJSON(create_chat_completion_stream_response->usage);
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

create_chat_completion_stream_response_t *create_chat_completion_stream_response_parseFromJSON(cJSON *create_chat_completion_stream_responseJSON){

    create_chat_completion_stream_response_t *create_chat_completion_stream_response_local_var = NULL;

    // define the local list for create_chat_completion_stream_response->choices
    list_t *choicesList = NULL;

    // define the local variable for create_chat_completion_stream_response->usage
    create_chat_completion_stream_response_usage_t *usage_local_nonprim = NULL;

    // create_chat_completion_stream_response->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(create_chat_completion_stream_responseJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // create_chat_completion_stream_response->choices
    cJSON *choices = cJSON_GetObjectItemCaseSensitive(create_chat_completion_stream_responseJSON, "choices");
    if (cJSON_IsNull(choices)) {
        choices = NULL;
    }
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
        create_chat_completion_stream_response_choices_inner_t *choicesItem = create_chat_completion_stream_response_choices_inner_parseFromJSON(choices_local_nonprimitive);

        list_addElement(choicesList, choicesItem);
    }

    // create_chat_completion_stream_response->created
    cJSON *created = cJSON_GetObjectItemCaseSensitive(create_chat_completion_stream_responseJSON, "created");
    if (cJSON_IsNull(created)) {
        created = NULL;
    }
    if (!created) {
        goto end;
    }

    
    if(!cJSON_IsNumber(created))
    {
    goto end; //Numeric
    }

    // create_chat_completion_stream_response->model
    cJSON *model = cJSON_GetObjectItemCaseSensitive(create_chat_completion_stream_responseJSON, "model");
    if (cJSON_IsNull(model)) {
        model = NULL;
    }
    if (!model) {
        goto end;
    }

    
    if(!cJSON_IsString(model))
    {
    goto end; //String
    }

    // create_chat_completion_stream_response->service_tier
    cJSON *service_tier = cJSON_GetObjectItemCaseSensitive(create_chat_completion_stream_responseJSON, "service_tier");
    if (cJSON_IsNull(service_tier)) {
        service_tier = NULL;
    }
    openai_api_create_chat_completion_stream_response_SERVICETIER_e service_tierVariable;
    if (service_tier) { 
    if(!cJSON_IsString(service_tier))
    {
    goto end; //Enum
    }
    service_tierVariable = create_chat_completion_stream_response_service_tier_FromString(service_tier->valuestring);
    }

    // create_chat_completion_stream_response->system_fingerprint
    cJSON *system_fingerprint = cJSON_GetObjectItemCaseSensitive(create_chat_completion_stream_responseJSON, "system_fingerprint");
    if (cJSON_IsNull(system_fingerprint)) {
        system_fingerprint = NULL;
    }
    if (system_fingerprint) { 
    if(!cJSON_IsString(system_fingerprint) && !cJSON_IsNull(system_fingerprint))
    {
    goto end; //String
    }
    }

    // create_chat_completion_stream_response->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(create_chat_completion_stream_responseJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (!object) {
        goto end;
    }

    openai_api_create_chat_completion_stream_response_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = create_chat_completion_stream_response_object_FromString(object->valuestring);

    // create_chat_completion_stream_response->usage
    cJSON *usage = cJSON_GetObjectItemCaseSensitive(create_chat_completion_stream_responseJSON, "usage");
    if (cJSON_IsNull(usage)) {
        usage = NULL;
    }
    if (usage) { 
    usage_local_nonprim = create_chat_completion_stream_response_usage_parseFromJSON(usage); //nonprimitive
    }


    create_chat_completion_stream_response_local_var = create_chat_completion_stream_response_create_internal (
        strdup(id->valuestring),
        choicesList,
        created->valuedouble,
        strdup(model->valuestring),
        service_tier ? service_tierVariable : openai_api_create_chat_completion_stream_response_SERVICETIER_NULL,
        system_fingerprint && !cJSON_IsNull(system_fingerprint) ? strdup(system_fingerprint->valuestring) : NULL,
        objectVariable,
        usage ? usage_local_nonprim : NULL
        );

    return create_chat_completion_stream_response_local_var;
end:
    if (choicesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, choicesList) {
            create_chat_completion_stream_response_choices_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(choicesList);
        choicesList = NULL;
    }
    if (usage_local_nonprim) {
        create_chat_completion_stream_response_usage_free(usage_local_nonprim);
        usage_local_nonprim = NULL;
    }
    return NULL;

}
