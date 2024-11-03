#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "message_content_text_annotations_file_citation_object_file_citation.h"



message_content_text_annotations_file_citation_object_file_citation_t *message_content_text_annotations_file_citation_object_file_citation_create(
    char *file_id,
    char *quote
    ) {
    message_content_text_annotations_file_citation_object_file_citation_t *message_content_text_annotations_file_citation_object_file_citation_local_var = malloc(sizeof(message_content_text_annotations_file_citation_object_file_citation_t));
    if (!message_content_text_annotations_file_citation_object_file_citation_local_var) {
        return NULL;
    }
    message_content_text_annotations_file_citation_object_file_citation_local_var->file_id = file_id;
    message_content_text_annotations_file_citation_object_file_citation_local_var->quote = quote;

    return message_content_text_annotations_file_citation_object_file_citation_local_var;
}


void message_content_text_annotations_file_citation_object_file_citation_free(message_content_text_annotations_file_citation_object_file_citation_t *message_content_text_annotations_file_citation_object_file_citation) {
    if(NULL == message_content_text_annotations_file_citation_object_file_citation){
        return ;
    }
    listEntry_t *listEntry;
    if (message_content_text_annotations_file_citation_object_file_citation->file_id) {
        free(message_content_text_annotations_file_citation_object_file_citation->file_id);
        message_content_text_annotations_file_citation_object_file_citation->file_id = NULL;
    }
    if (message_content_text_annotations_file_citation_object_file_citation->quote) {
        free(message_content_text_annotations_file_citation_object_file_citation->quote);
        message_content_text_annotations_file_citation_object_file_citation->quote = NULL;
    }
    free(message_content_text_annotations_file_citation_object_file_citation);
}

cJSON *message_content_text_annotations_file_citation_object_file_citation_convertToJSON(message_content_text_annotations_file_citation_object_file_citation_t *message_content_text_annotations_file_citation_object_file_citation) {
    cJSON *item = cJSON_CreateObject();

    // message_content_text_annotations_file_citation_object_file_citation->file_id
    if (!message_content_text_annotations_file_citation_object_file_citation->file_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "file_id", message_content_text_annotations_file_citation_object_file_citation->file_id) == NULL) {
    goto fail; //String
    }


    // message_content_text_annotations_file_citation_object_file_citation->quote
    if (!message_content_text_annotations_file_citation_object_file_citation->quote) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "quote", message_content_text_annotations_file_citation_object_file_citation->quote) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

message_content_text_annotations_file_citation_object_file_citation_t *message_content_text_annotations_file_citation_object_file_citation_parseFromJSON(cJSON *message_content_text_annotations_file_citation_object_file_citationJSON){

    message_content_text_annotations_file_citation_object_file_citation_t *message_content_text_annotations_file_citation_object_file_citation_local_var = NULL;

    // message_content_text_annotations_file_citation_object_file_citation->file_id
    cJSON *file_id = cJSON_GetObjectItemCaseSensitive(message_content_text_annotations_file_citation_object_file_citationJSON, "file_id");
    if (!file_id) {
        goto end;
    }

    
    if(!cJSON_IsString(file_id))
    {
    goto end; //String
    }

    // message_content_text_annotations_file_citation_object_file_citation->quote
    cJSON *quote = cJSON_GetObjectItemCaseSensitive(message_content_text_annotations_file_citation_object_file_citationJSON, "quote");
    if (!quote) {
        goto end;
    }

    
    if(!cJSON_IsString(quote))
    {
    goto end; //String
    }


    message_content_text_annotations_file_citation_object_file_citation_local_var = message_content_text_annotations_file_citation_object_file_citation_create (
        strdup(file_id->valuestring),
        strdup(quote->valuestring)
        );

    return message_content_text_annotations_file_citation_object_file_citation_local_var;
end:
    return NULL;

}
