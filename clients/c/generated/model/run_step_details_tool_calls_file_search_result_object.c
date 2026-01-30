#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "run_step_details_tool_calls_file_search_result_object.h"



static run_step_details_tool_calls_file_search_result_object_t *run_step_details_tool_calls_file_search_result_object_create_internal(
    char *file_id,
    char *file_name,
    double score,
    list_t *content
    ) {
    run_step_details_tool_calls_file_search_result_object_t *run_step_details_tool_calls_file_search_result_object_local_var = malloc(sizeof(run_step_details_tool_calls_file_search_result_object_t));
    if (!run_step_details_tool_calls_file_search_result_object_local_var) {
        return NULL;
    }
    run_step_details_tool_calls_file_search_result_object_local_var->file_id = file_id;
    run_step_details_tool_calls_file_search_result_object_local_var->file_name = file_name;
    run_step_details_tool_calls_file_search_result_object_local_var->score = score;
    run_step_details_tool_calls_file_search_result_object_local_var->content = content;

    run_step_details_tool_calls_file_search_result_object_local_var->_library_owned = 1;
    return run_step_details_tool_calls_file_search_result_object_local_var;
}

__attribute__((deprecated)) run_step_details_tool_calls_file_search_result_object_t *run_step_details_tool_calls_file_search_result_object_create(
    char *file_id,
    char *file_name,
    double score,
    list_t *content
    ) {
    return run_step_details_tool_calls_file_search_result_object_create_internal (
        file_id,
        file_name,
        score,
        content
        );
}

void run_step_details_tool_calls_file_search_result_object_free(run_step_details_tool_calls_file_search_result_object_t *run_step_details_tool_calls_file_search_result_object) {
    if(NULL == run_step_details_tool_calls_file_search_result_object){
        return ;
    }
    if(run_step_details_tool_calls_file_search_result_object->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "run_step_details_tool_calls_file_search_result_object_free");
        return ;
    }
    listEntry_t *listEntry;
    if (run_step_details_tool_calls_file_search_result_object->file_id) {
        free(run_step_details_tool_calls_file_search_result_object->file_id);
        run_step_details_tool_calls_file_search_result_object->file_id = NULL;
    }
    if (run_step_details_tool_calls_file_search_result_object->file_name) {
        free(run_step_details_tool_calls_file_search_result_object->file_name);
        run_step_details_tool_calls_file_search_result_object->file_name = NULL;
    }
    if (run_step_details_tool_calls_file_search_result_object->content) {
        list_ForEach(listEntry, run_step_details_tool_calls_file_search_result_object->content) {
            run_step_details_tool_calls_file_search_result_object_content_inner_free(listEntry->data);
        }
        list_freeList(run_step_details_tool_calls_file_search_result_object->content);
        run_step_details_tool_calls_file_search_result_object->content = NULL;
    }
    free(run_step_details_tool_calls_file_search_result_object);
}

cJSON *run_step_details_tool_calls_file_search_result_object_convertToJSON(run_step_details_tool_calls_file_search_result_object_t *run_step_details_tool_calls_file_search_result_object) {
    cJSON *item = cJSON_CreateObject();

    // run_step_details_tool_calls_file_search_result_object->file_id
    if (!run_step_details_tool_calls_file_search_result_object->file_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "file_id", run_step_details_tool_calls_file_search_result_object->file_id) == NULL) {
    goto fail; //String
    }


    // run_step_details_tool_calls_file_search_result_object->file_name
    if (!run_step_details_tool_calls_file_search_result_object->file_name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "file_name", run_step_details_tool_calls_file_search_result_object->file_name) == NULL) {
    goto fail; //String
    }


    // run_step_details_tool_calls_file_search_result_object->score
    if (!run_step_details_tool_calls_file_search_result_object->score) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "score", run_step_details_tool_calls_file_search_result_object->score) == NULL) {
    goto fail; //Numeric
    }


    // run_step_details_tool_calls_file_search_result_object->content
    if(run_step_details_tool_calls_file_search_result_object->content) {
    cJSON *content = cJSON_AddArrayToObject(item, "content");
    if(content == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *contentListEntry;
    if (run_step_details_tool_calls_file_search_result_object->content) {
    list_ForEach(contentListEntry, run_step_details_tool_calls_file_search_result_object->content) {
    cJSON *itemLocal = run_step_details_tool_calls_file_search_result_object_content_inner_convertToJSON(contentListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(content, itemLocal);
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

run_step_details_tool_calls_file_search_result_object_t *run_step_details_tool_calls_file_search_result_object_parseFromJSON(cJSON *run_step_details_tool_calls_file_search_result_objectJSON){

    run_step_details_tool_calls_file_search_result_object_t *run_step_details_tool_calls_file_search_result_object_local_var = NULL;

    // define the local list for run_step_details_tool_calls_file_search_result_object->content
    list_t *contentList = NULL;

    // run_step_details_tool_calls_file_search_result_object->file_id
    cJSON *file_id = cJSON_GetObjectItemCaseSensitive(run_step_details_tool_calls_file_search_result_objectJSON, "file_id");
    if (cJSON_IsNull(file_id)) {
        file_id = NULL;
    }
    if (!file_id) {
        goto end;
    }

    
    if(!cJSON_IsString(file_id))
    {
    goto end; //String
    }

    // run_step_details_tool_calls_file_search_result_object->file_name
    cJSON *file_name = cJSON_GetObjectItemCaseSensitive(run_step_details_tool_calls_file_search_result_objectJSON, "file_name");
    if (cJSON_IsNull(file_name)) {
        file_name = NULL;
    }
    if (!file_name) {
        goto end;
    }

    
    if(!cJSON_IsString(file_name))
    {
    goto end; //String
    }

    // run_step_details_tool_calls_file_search_result_object->score
    cJSON *score = cJSON_GetObjectItemCaseSensitive(run_step_details_tool_calls_file_search_result_objectJSON, "score");
    if (cJSON_IsNull(score)) {
        score = NULL;
    }
    if (!score) {
        goto end;
    }

    
    if(!cJSON_IsNumber(score))
    {
    goto end; //Numeric
    }

    // run_step_details_tool_calls_file_search_result_object->content
    cJSON *content = cJSON_GetObjectItemCaseSensitive(run_step_details_tool_calls_file_search_result_objectJSON, "content");
    if (cJSON_IsNull(content)) {
        content = NULL;
    }
    if (content) { 
    cJSON *content_local_nonprimitive = NULL;
    if(!cJSON_IsArray(content)){
        goto end; //nonprimitive container
    }

    contentList = list_createList();

    cJSON_ArrayForEach(content_local_nonprimitive,content )
    {
        if(!cJSON_IsObject(content_local_nonprimitive)){
            goto end;
        }
        run_step_details_tool_calls_file_search_result_object_content_inner_t *contentItem = run_step_details_tool_calls_file_search_result_object_content_inner_parseFromJSON(content_local_nonprimitive);

        list_addElement(contentList, contentItem);
    }
    }


    run_step_details_tool_calls_file_search_result_object_local_var = run_step_details_tool_calls_file_search_result_object_create_internal (
        strdup(file_id->valuestring),
        strdup(file_name->valuestring),
        score->valuedouble,
        content ? contentList : NULL
        );

    return run_step_details_tool_calls_file_search_result_object_local_var;
end:
    if (contentList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, contentList) {
            run_step_details_tool_calls_file_search_result_object_content_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(contentList);
        contentList = NULL;
    }
    return NULL;

}
