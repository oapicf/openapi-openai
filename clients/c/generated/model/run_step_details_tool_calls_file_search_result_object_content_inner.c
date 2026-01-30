#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "run_step_details_tool_calls_file_search_result_object_content_inner.h"


char* run_step_details_tool_calls_file_search_result_object_content_inner_type_ToString(openai_api_run_step_details_tool_calls_file_search_result_object_content_inner_TYPE_e type) {
    char* typeArray[] =  { "NULL", "text" };
    return typeArray[type];
}

openai_api_run_step_details_tool_calls_file_search_result_object_content_inner_TYPE_e run_step_details_tool_calls_file_search_result_object_content_inner_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "text" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static run_step_details_tool_calls_file_search_result_object_content_inner_t *run_step_details_tool_calls_file_search_result_object_content_inner_create_internal(
    openai_api_run_step_details_tool_calls_file_search_result_object_content_inner_TYPE_e type,
    char *text
    ) {
    run_step_details_tool_calls_file_search_result_object_content_inner_t *run_step_details_tool_calls_file_search_result_object_content_inner_local_var = malloc(sizeof(run_step_details_tool_calls_file_search_result_object_content_inner_t));
    if (!run_step_details_tool_calls_file_search_result_object_content_inner_local_var) {
        return NULL;
    }
    run_step_details_tool_calls_file_search_result_object_content_inner_local_var->type = type;
    run_step_details_tool_calls_file_search_result_object_content_inner_local_var->text = text;

    run_step_details_tool_calls_file_search_result_object_content_inner_local_var->_library_owned = 1;
    return run_step_details_tool_calls_file_search_result_object_content_inner_local_var;
}

__attribute__((deprecated)) run_step_details_tool_calls_file_search_result_object_content_inner_t *run_step_details_tool_calls_file_search_result_object_content_inner_create(
    openai_api_run_step_details_tool_calls_file_search_result_object_content_inner_TYPE_e type,
    char *text
    ) {
    return run_step_details_tool_calls_file_search_result_object_content_inner_create_internal (
        type,
        text
        );
}

void run_step_details_tool_calls_file_search_result_object_content_inner_free(run_step_details_tool_calls_file_search_result_object_content_inner_t *run_step_details_tool_calls_file_search_result_object_content_inner) {
    if(NULL == run_step_details_tool_calls_file_search_result_object_content_inner){
        return ;
    }
    if(run_step_details_tool_calls_file_search_result_object_content_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "run_step_details_tool_calls_file_search_result_object_content_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (run_step_details_tool_calls_file_search_result_object_content_inner->text) {
        free(run_step_details_tool_calls_file_search_result_object_content_inner->text);
        run_step_details_tool_calls_file_search_result_object_content_inner->text = NULL;
    }
    free(run_step_details_tool_calls_file_search_result_object_content_inner);
}

cJSON *run_step_details_tool_calls_file_search_result_object_content_inner_convertToJSON(run_step_details_tool_calls_file_search_result_object_content_inner_t *run_step_details_tool_calls_file_search_result_object_content_inner) {
    cJSON *item = cJSON_CreateObject();

    // run_step_details_tool_calls_file_search_result_object_content_inner->type
    if(run_step_details_tool_calls_file_search_result_object_content_inner->type != openai_api_run_step_details_tool_calls_file_search_result_object_content_inner_TYPE_NULL) {
    if(cJSON_AddStringToObject(item, "type", run_step_details_tool_calls_file_search_result_object_content_inner_type_ToString(run_step_details_tool_calls_file_search_result_object_content_inner->type)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // run_step_details_tool_calls_file_search_result_object_content_inner->text
    if(run_step_details_tool_calls_file_search_result_object_content_inner->text) {
    if(cJSON_AddStringToObject(item, "text", run_step_details_tool_calls_file_search_result_object_content_inner->text) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

run_step_details_tool_calls_file_search_result_object_content_inner_t *run_step_details_tool_calls_file_search_result_object_content_inner_parseFromJSON(cJSON *run_step_details_tool_calls_file_search_result_object_content_innerJSON){

    run_step_details_tool_calls_file_search_result_object_content_inner_t *run_step_details_tool_calls_file_search_result_object_content_inner_local_var = NULL;

    // run_step_details_tool_calls_file_search_result_object_content_inner->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(run_step_details_tool_calls_file_search_result_object_content_innerJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    openai_api_run_step_details_tool_calls_file_search_result_object_content_inner_TYPE_e typeVariable;
    if (type) { 
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = run_step_details_tool_calls_file_search_result_object_content_inner_type_FromString(type->valuestring);
    }

    // run_step_details_tool_calls_file_search_result_object_content_inner->text
    cJSON *text = cJSON_GetObjectItemCaseSensitive(run_step_details_tool_calls_file_search_result_object_content_innerJSON, "text");
    if (cJSON_IsNull(text)) {
        text = NULL;
    }
    if (text) { 
    if(!cJSON_IsString(text) && !cJSON_IsNull(text))
    {
    goto end; //String
    }
    }


    run_step_details_tool_calls_file_search_result_object_content_inner_local_var = run_step_details_tool_calls_file_search_result_object_content_inner_create_internal (
        type ? typeVariable : openai_api_run_step_details_tool_calls_file_search_result_object_content_inner_TYPE_NULL,
        text && !cJSON_IsNull(text) ? strdup(text->valuestring) : NULL
        );

    return run_step_details_tool_calls_file_search_result_object_content_inner_local_var;
end:
    return NULL;

}
