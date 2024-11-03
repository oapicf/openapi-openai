#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_chat_completion_response_choices_inner_logprobs.h"



create_chat_completion_response_choices_inner_logprobs_t *create_chat_completion_response_choices_inner_logprobs_create(
    list_t *content
    ) {
    create_chat_completion_response_choices_inner_logprobs_t *create_chat_completion_response_choices_inner_logprobs_local_var = malloc(sizeof(create_chat_completion_response_choices_inner_logprobs_t));
    if (!create_chat_completion_response_choices_inner_logprobs_local_var) {
        return NULL;
    }
    create_chat_completion_response_choices_inner_logprobs_local_var->content = content;

    return create_chat_completion_response_choices_inner_logprobs_local_var;
}


void create_chat_completion_response_choices_inner_logprobs_free(create_chat_completion_response_choices_inner_logprobs_t *create_chat_completion_response_choices_inner_logprobs) {
    if(NULL == create_chat_completion_response_choices_inner_logprobs){
        return ;
    }
    listEntry_t *listEntry;
    if (create_chat_completion_response_choices_inner_logprobs->content) {
        list_ForEach(listEntry, create_chat_completion_response_choices_inner_logprobs->content) {
            chat_completion_token_logprob_free(listEntry->data);
        }
        list_freeList(create_chat_completion_response_choices_inner_logprobs->content);
        create_chat_completion_response_choices_inner_logprobs->content = NULL;
    }
    free(create_chat_completion_response_choices_inner_logprobs);
}

cJSON *create_chat_completion_response_choices_inner_logprobs_convertToJSON(create_chat_completion_response_choices_inner_logprobs_t *create_chat_completion_response_choices_inner_logprobs) {
    cJSON *item = cJSON_CreateObject();

    // create_chat_completion_response_choices_inner_logprobs->content
    if (!create_chat_completion_response_choices_inner_logprobs->content) {
        goto fail;
    }
    cJSON *content = cJSON_AddArrayToObject(item, "content");
    if(content == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *contentListEntry;
    if (create_chat_completion_response_choices_inner_logprobs->content) {
    list_ForEach(contentListEntry, create_chat_completion_response_choices_inner_logprobs->content) {
    cJSON *itemLocal = chat_completion_token_logprob_convertToJSON(contentListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(content, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_chat_completion_response_choices_inner_logprobs_t *create_chat_completion_response_choices_inner_logprobs_parseFromJSON(cJSON *create_chat_completion_response_choices_inner_logprobsJSON){

    create_chat_completion_response_choices_inner_logprobs_t *create_chat_completion_response_choices_inner_logprobs_local_var = NULL;

    // define the local list for create_chat_completion_response_choices_inner_logprobs->content
    list_t *contentList = NULL;

    // create_chat_completion_response_choices_inner_logprobs->content
    cJSON *content = cJSON_GetObjectItemCaseSensitive(create_chat_completion_response_choices_inner_logprobsJSON, "content");
    if (!content) {
        goto end;
    }

    
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
        chat_completion_token_logprob_t *contentItem = chat_completion_token_logprob_parseFromJSON(content_local_nonprimitive);

        list_addElement(contentList, contentItem);
    }


    create_chat_completion_response_choices_inner_logprobs_local_var = create_chat_completion_response_choices_inner_logprobs_create (
        contentList
        );

    return create_chat_completion_response_choices_inner_logprobs_local_var;
end:
    if (contentList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, contentList) {
            chat_completion_token_logprob_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(contentList);
        contentList = NULL;
    }
    return NULL;

}
