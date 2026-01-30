#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_message_request_content.h"



static create_message_request_content_t *create_message_request_content_create_internal(
    ) {
    create_message_request_content_t *create_message_request_content_local_var = malloc(sizeof(create_message_request_content_t));
    if (!create_message_request_content_local_var) {
        return NULL;
    }

    create_message_request_content_local_var->_library_owned = 1;
    return create_message_request_content_local_var;
}

__attribute__((deprecated)) create_message_request_content_t *create_message_request_content_create(
    ) {
    return create_message_request_content_create_internal (
        );
}

void create_message_request_content_free(create_message_request_content_t *create_message_request_content) {
    if(NULL == create_message_request_content){
        return ;
    }
    if(create_message_request_content->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "create_message_request_content_free");
        return ;
    }
    listEntry_t *listEntry;
    free(create_message_request_content);
}

cJSON *create_message_request_content_convertToJSON(create_message_request_content_t *create_message_request_content) {
    cJSON *item = cJSON_CreateObject();
    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_message_request_content_t *create_message_request_content_parseFromJSON(cJSON *create_message_request_contentJSON){

    create_message_request_content_t *create_message_request_content_local_var = NULL;


    create_message_request_content_local_var = create_message_request_content_create_internal (
        );

    return create_message_request_content_local_var;
end:
    return NULL;

}
