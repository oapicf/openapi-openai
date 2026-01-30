#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "complete_upload_request.h"



static complete_upload_request_t *complete_upload_request_create_internal(
    list_t *part_ids,
    char *md5
    ) {
    complete_upload_request_t *complete_upload_request_local_var = malloc(sizeof(complete_upload_request_t));
    if (!complete_upload_request_local_var) {
        return NULL;
    }
    complete_upload_request_local_var->part_ids = part_ids;
    complete_upload_request_local_var->md5 = md5;

    complete_upload_request_local_var->_library_owned = 1;
    return complete_upload_request_local_var;
}

__attribute__((deprecated)) complete_upload_request_t *complete_upload_request_create(
    list_t *part_ids,
    char *md5
    ) {
    return complete_upload_request_create_internal (
        part_ids,
        md5
        );
}

void complete_upload_request_free(complete_upload_request_t *complete_upload_request) {
    if(NULL == complete_upload_request){
        return ;
    }
    if(complete_upload_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "complete_upload_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (complete_upload_request->part_ids) {
        list_ForEach(listEntry, complete_upload_request->part_ids) {
            free(listEntry->data);
        }
        list_freeList(complete_upload_request->part_ids);
        complete_upload_request->part_ids = NULL;
    }
    if (complete_upload_request->md5) {
        free(complete_upload_request->md5);
        complete_upload_request->md5 = NULL;
    }
    free(complete_upload_request);
}

cJSON *complete_upload_request_convertToJSON(complete_upload_request_t *complete_upload_request) {
    cJSON *item = cJSON_CreateObject();

    // complete_upload_request->part_ids
    if (!complete_upload_request->part_ids) {
        goto fail;
    }
    cJSON *part_ids = cJSON_AddArrayToObject(item, "part_ids");
    if(part_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *part_idsListEntry;
    list_ForEach(part_idsListEntry, complete_upload_request->part_ids) {
    if(cJSON_AddStringToObject(part_ids, "", part_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }


    // complete_upload_request->md5
    if(complete_upload_request->md5) {
    if(cJSON_AddStringToObject(item, "md5", complete_upload_request->md5) == NULL) {
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

complete_upload_request_t *complete_upload_request_parseFromJSON(cJSON *complete_upload_requestJSON){

    complete_upload_request_t *complete_upload_request_local_var = NULL;

    // define the local list for complete_upload_request->part_ids
    list_t *part_idsList = NULL;

    // complete_upload_request->part_ids
    cJSON *part_ids = cJSON_GetObjectItemCaseSensitive(complete_upload_requestJSON, "part_ids");
    if (cJSON_IsNull(part_ids)) {
        part_ids = NULL;
    }
    if (!part_ids) {
        goto end;
    }

    
    cJSON *part_ids_local = NULL;
    if(!cJSON_IsArray(part_ids)) {
        goto end;//primitive container
    }
    part_idsList = list_createList();

    cJSON_ArrayForEach(part_ids_local, part_ids)
    {
        if(!cJSON_IsString(part_ids_local))
        {
            goto end;
        }
        list_addElement(part_idsList , strdup(part_ids_local->valuestring));
    }

    // complete_upload_request->md5
    cJSON *md5 = cJSON_GetObjectItemCaseSensitive(complete_upload_requestJSON, "md5");
    if (cJSON_IsNull(md5)) {
        md5 = NULL;
    }
    if (md5) { 
    if(!cJSON_IsString(md5) && !cJSON_IsNull(md5))
    {
    goto end; //String
    }
    }


    complete_upload_request_local_var = complete_upload_request_create_internal (
        part_idsList,
        md5 && !cJSON_IsNull(md5) ? strdup(md5->valuestring) : NULL
        );

    return complete_upload_request_local_var;
end:
    if (part_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, part_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(part_idsList);
        part_idsList = NULL;
    }
    return NULL;

}
