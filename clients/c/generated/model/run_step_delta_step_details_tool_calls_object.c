#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "run_step_delta_step_details_tool_calls_object.h"


char* run_step_delta_step_details_tool_calls_object_type_ToString(openai_api_run_step_delta_step_details_tool_calls_object_TYPE_e type) {
    char* typeArray[] =  { "NULL", "tool_calls" };
    return typeArray[type];
}

openai_api_run_step_delta_step_details_tool_calls_object_TYPE_e run_step_delta_step_details_tool_calls_object_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "tool_calls" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

run_step_delta_step_details_tool_calls_object_t *run_step_delta_step_details_tool_calls_object_create(
    openai_api_run_step_delta_step_details_tool_calls_object_TYPE_e type,
    list_t *tool_calls
    ) {
    run_step_delta_step_details_tool_calls_object_t *run_step_delta_step_details_tool_calls_object_local_var = malloc(sizeof(run_step_delta_step_details_tool_calls_object_t));
    if (!run_step_delta_step_details_tool_calls_object_local_var) {
        return NULL;
    }
    run_step_delta_step_details_tool_calls_object_local_var->type = type;
    run_step_delta_step_details_tool_calls_object_local_var->tool_calls = tool_calls;

    return run_step_delta_step_details_tool_calls_object_local_var;
}


void run_step_delta_step_details_tool_calls_object_free(run_step_delta_step_details_tool_calls_object_t *run_step_delta_step_details_tool_calls_object) {
    if(NULL == run_step_delta_step_details_tool_calls_object){
        return ;
    }
    listEntry_t *listEntry;
    if (run_step_delta_step_details_tool_calls_object->tool_calls) {
        list_ForEach(listEntry, run_step_delta_step_details_tool_calls_object->tool_calls) {
            run_step_delta_step_details_tool_calls_object_tool_calls_inner_free(listEntry->data);
        }
        list_freeList(run_step_delta_step_details_tool_calls_object->tool_calls);
        run_step_delta_step_details_tool_calls_object->tool_calls = NULL;
    }
    free(run_step_delta_step_details_tool_calls_object);
}

cJSON *run_step_delta_step_details_tool_calls_object_convertToJSON(run_step_delta_step_details_tool_calls_object_t *run_step_delta_step_details_tool_calls_object) {
    cJSON *item = cJSON_CreateObject();

    // run_step_delta_step_details_tool_calls_object->type
    if (openai_api_run_step_delta_step_details_tool_calls_object_TYPE_NULL == run_step_delta_step_details_tool_calls_object->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", typerun_step_delta_step_details_tool_calls_object_ToString(run_step_delta_step_details_tool_calls_object->type)) == NULL)
    {
    goto fail; //Enum
    }


    // run_step_delta_step_details_tool_calls_object->tool_calls
    if(run_step_delta_step_details_tool_calls_object->tool_calls) {
    cJSON *tool_calls = cJSON_AddArrayToObject(item, "tool_calls");
    if(tool_calls == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *tool_callsListEntry;
    if (run_step_delta_step_details_tool_calls_object->tool_calls) {
    list_ForEach(tool_callsListEntry, run_step_delta_step_details_tool_calls_object->tool_calls) {
    cJSON *itemLocal = run_step_delta_step_details_tool_calls_object_tool_calls_inner_convertToJSON(tool_callsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(tool_calls, itemLocal);
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

run_step_delta_step_details_tool_calls_object_t *run_step_delta_step_details_tool_calls_object_parseFromJSON(cJSON *run_step_delta_step_details_tool_calls_objectJSON){

    run_step_delta_step_details_tool_calls_object_t *run_step_delta_step_details_tool_calls_object_local_var = NULL;

    // define the local list for run_step_delta_step_details_tool_calls_object->tool_calls
    list_t *tool_callsList = NULL;

    // run_step_delta_step_details_tool_calls_object->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(run_step_delta_step_details_tool_calls_objectJSON, "type");
    if (!type) {
        goto end;
    }

    openai_api_run_step_delta_step_details_tool_calls_object_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = run_step_delta_step_details_tool_calls_object_type_FromString(type->valuestring);

    // run_step_delta_step_details_tool_calls_object->tool_calls
    cJSON *tool_calls = cJSON_GetObjectItemCaseSensitive(run_step_delta_step_details_tool_calls_objectJSON, "tool_calls");
    if (tool_calls) { 
    cJSON *tool_calls_local_nonprimitive = NULL;
    if(!cJSON_IsArray(tool_calls)){
        goto end; //nonprimitive container
    }

    tool_callsList = list_createList();

    cJSON_ArrayForEach(tool_calls_local_nonprimitive,tool_calls )
    {
        if(!cJSON_IsObject(tool_calls_local_nonprimitive)){
            goto end;
        }
        run_step_delta_step_details_tool_calls_object_tool_calls_inner_t *tool_callsItem = run_step_delta_step_details_tool_calls_object_tool_calls_inner_parseFromJSON(tool_calls_local_nonprimitive);

        list_addElement(tool_callsList, tool_callsItem);
    }
    }


    run_step_delta_step_details_tool_calls_object_local_var = run_step_delta_step_details_tool_calls_object_create (
        typeVariable,
        tool_calls ? tool_callsList : NULL
        );

    return run_step_delta_step_details_tool_calls_object_local_var;
end:
    if (tool_callsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, tool_callsList) {
            run_step_delta_step_details_tool_calls_object_tool_calls_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(tool_callsList);
        tool_callsList = NULL;
    }
    return NULL;

}
