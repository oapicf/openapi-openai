#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_assistant_file_request.h"



create_assistant_file_request_t *create_assistant_file_request_create(
    char *file_id
    ) {
    create_assistant_file_request_t *create_assistant_file_request_local_var = malloc(sizeof(create_assistant_file_request_t));
    if (!create_assistant_file_request_local_var) {
        return NULL;
    }
    create_assistant_file_request_local_var->file_id = file_id;

    return create_assistant_file_request_local_var;
}


void create_assistant_file_request_free(create_assistant_file_request_t *create_assistant_file_request) {
    if(NULL == create_assistant_file_request){
        return ;
    }
    listEntry_t *listEntry;
    if (create_assistant_file_request->file_id) {
        free(create_assistant_file_request->file_id);
        create_assistant_file_request->file_id = NULL;
    }
    free(create_assistant_file_request);
}

cJSON *create_assistant_file_request_convertToJSON(create_assistant_file_request_t *create_assistant_file_request) {
    cJSON *item = cJSON_CreateObject();

    // create_assistant_file_request->file_id
    if (!create_assistant_file_request->file_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "file_id", create_assistant_file_request->file_id) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_assistant_file_request_t *create_assistant_file_request_parseFromJSON(cJSON *create_assistant_file_requestJSON){

    create_assistant_file_request_t *create_assistant_file_request_local_var = NULL;

    // create_assistant_file_request->file_id
    cJSON *file_id = cJSON_GetObjectItemCaseSensitive(create_assistant_file_requestJSON, "file_id");
    if (!file_id) {
        goto end;
    }

    
    if(!cJSON_IsString(file_id))
    {
    goto end; //String
    }


    create_assistant_file_request_local_var = create_assistant_file_request_create (
        strdup(file_id->valuestring)
        );

    return create_assistant_file_request_local_var;
end:
    return NULL;

}
