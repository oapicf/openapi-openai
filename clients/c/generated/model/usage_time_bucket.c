#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "usage_time_bucket.h"


char* usage_time_bucket_object_ToString(openai_api_usage_time_bucket_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "bucket" };
    return objectArray[object];
}

openai_api_usage_time_bucket_OBJECT_e usage_time_bucket_object_FromString(char* object){
    int stringToReturn = 0;
    char *objectArray[] =  { "NULL", "bucket" };
    size_t sizeofArray = sizeof(objectArray) / sizeof(objectArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(object, objectArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static usage_time_bucket_t *usage_time_bucket_create_internal(
    openai_api_usage_time_bucket_OBJECT_e object,
    int start_time,
    int end_time,
    list_t *result
    ) {
    usage_time_bucket_t *usage_time_bucket_local_var = malloc(sizeof(usage_time_bucket_t));
    if (!usage_time_bucket_local_var) {
        return NULL;
    }
    usage_time_bucket_local_var->object = object;
    usage_time_bucket_local_var->start_time = start_time;
    usage_time_bucket_local_var->end_time = end_time;
    usage_time_bucket_local_var->result = result;

    usage_time_bucket_local_var->_library_owned = 1;
    return usage_time_bucket_local_var;
}

__attribute__((deprecated)) usage_time_bucket_t *usage_time_bucket_create(
    openai_api_usage_time_bucket_OBJECT_e object,
    int start_time,
    int end_time,
    list_t *result
    ) {
    return usage_time_bucket_create_internal (
        object,
        start_time,
        end_time,
        result
        );
}

void usage_time_bucket_free(usage_time_bucket_t *usage_time_bucket) {
    if(NULL == usage_time_bucket){
        return ;
    }
    if(usage_time_bucket->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "usage_time_bucket_free");
        return ;
    }
    listEntry_t *listEntry;
    if (usage_time_bucket->result) {
        list_ForEach(listEntry, usage_time_bucket->result) {
            usage_time_bucket_result_inner_free(listEntry->data);
        }
        list_freeList(usage_time_bucket->result);
        usage_time_bucket->result = NULL;
    }
    free(usage_time_bucket);
}

cJSON *usage_time_bucket_convertToJSON(usage_time_bucket_t *usage_time_bucket) {
    cJSON *item = cJSON_CreateObject();

    // usage_time_bucket->object
    if (openai_api_usage_time_bucket_OBJECT_NULL == usage_time_bucket->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", usage_time_bucket_object_ToString(usage_time_bucket->object)) == NULL)
    {
    goto fail; //Enum
    }


    // usage_time_bucket->start_time
    if (!usage_time_bucket->start_time) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "start_time", usage_time_bucket->start_time) == NULL) {
    goto fail; //Numeric
    }


    // usage_time_bucket->end_time
    if (!usage_time_bucket->end_time) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "end_time", usage_time_bucket->end_time) == NULL) {
    goto fail; //Numeric
    }


    // usage_time_bucket->result
    if (!usage_time_bucket->result) {
        goto fail;
    }
    cJSON *result = cJSON_AddArrayToObject(item, "result");
    if(result == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *resultListEntry;
    if (usage_time_bucket->result) {
    list_ForEach(resultListEntry, usage_time_bucket->result) {
    cJSON *itemLocal = usage_time_bucket_result_inner_convertToJSON(resultListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(result, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

usage_time_bucket_t *usage_time_bucket_parseFromJSON(cJSON *usage_time_bucketJSON){

    usage_time_bucket_t *usage_time_bucket_local_var = NULL;

    // define the local list for usage_time_bucket->result
    list_t *resultList = NULL;

    // usage_time_bucket->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(usage_time_bucketJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (!object) {
        goto end;
    }

    openai_api_usage_time_bucket_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = usage_time_bucket_object_FromString(object->valuestring);

    // usage_time_bucket->start_time
    cJSON *start_time = cJSON_GetObjectItemCaseSensitive(usage_time_bucketJSON, "start_time");
    if (cJSON_IsNull(start_time)) {
        start_time = NULL;
    }
    if (!start_time) {
        goto end;
    }

    
    if(!cJSON_IsNumber(start_time))
    {
    goto end; //Numeric
    }

    // usage_time_bucket->end_time
    cJSON *end_time = cJSON_GetObjectItemCaseSensitive(usage_time_bucketJSON, "end_time");
    if (cJSON_IsNull(end_time)) {
        end_time = NULL;
    }
    if (!end_time) {
        goto end;
    }

    
    if(!cJSON_IsNumber(end_time))
    {
    goto end; //Numeric
    }

    // usage_time_bucket->result
    cJSON *result = cJSON_GetObjectItemCaseSensitive(usage_time_bucketJSON, "result");
    if (cJSON_IsNull(result)) {
        result = NULL;
    }
    if (!result) {
        goto end;
    }

    
    cJSON *result_local_nonprimitive = NULL;
    if(!cJSON_IsArray(result)){
        goto end; //nonprimitive container
    }

    resultList = list_createList();

    cJSON_ArrayForEach(result_local_nonprimitive,result )
    {
        if(!cJSON_IsObject(result_local_nonprimitive)){
            goto end;
        }
        usage_time_bucket_result_inner_t *resultItem = usage_time_bucket_result_inner_parseFromJSON(result_local_nonprimitive);

        list_addElement(resultList, resultItem);
    }


    usage_time_bucket_local_var = usage_time_bucket_create_internal (
        objectVariable,
        start_time->valuedouble,
        end_time->valuedouble,
        resultList
        );

    return usage_time_bucket_local_var;
end:
    if (resultList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, resultList) {
            usage_time_bucket_result_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(resultList);
        resultList = NULL;
    }
    return NULL;

}
