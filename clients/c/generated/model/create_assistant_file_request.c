#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_assistant_file_request.h"



static create_assistant_file_request_t *create_assistant_file_request_create_internal(
    char *file_id
    ) {
    create_assistant_file_request_t *create_assistant_file_request_local_var = malloc(sizeof(create_assistant_file_request_t));
    if (!create_assistant_file_request_local_var) {
        return NULL;
    }
    create_assistant_file_request_local_var->file_id = file_id;

    create_assistant_file_request_local_var->_library_owned = 1;
    return create_assistant_file_request_local_var;
}

__attribute__((deprecated)) create_assistant_file_request_t *create_assistant_file_request_create(
    char *file_id
    ) {
    return create_assistant_file_request_create_internal (
        file_id
        );
}

void create_assistant_file_request_free(create_assistant_file_request_t *create_assistant_file_request) {
    if(NULL == create_assistant_file_request){
        return ;
    }
    if(create_assistant_file_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "create_assistant_file_request_free");
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


    create_assistant_file_request_local_var = create_assistant_file_request_create_internal (
        strdup(file_id->valuestring)
        );

    return create_assistant_file_request_local_var;
end:
    return NULL;

}
