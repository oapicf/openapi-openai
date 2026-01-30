/*
 * usage_time_bucket_result_inner.h
 *
 * 
 */

#ifndef _usage_time_bucket_result_inner_H_
#define _usage_time_bucket_result_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct usage_time_bucket_result_inner_t usage_time_bucket_result_inner_t;

#include "costs_result.h"
#include "costs_result_amount.h"
#include "usage_audio_speeches_result.h"
#include "usage_audio_transcriptions_result.h"
#include "usage_code_interpreter_sessions_result.h"
#include "usage_completions_result.h"
#include "usage_embeddings_result.h"
#include "usage_images_result.h"
#include "usage_moderations_result.h"
#include "usage_vector_stores_result.h"

// Enum OBJECT for usage_time_bucket_result_inner

typedef enum  { openai_api_usage_time_bucket_result_inner_OBJECT_NULL = 0, openai_api_usage_time_bucket_result_inner_OBJECT_organization.costs.result } openai_api_usage_time_bucket_result_inner_OBJECT_e;

char* usage_time_bucket_result_inner_object_ToString(openai_api_usage_time_bucket_result_inner_OBJECT_e object);

openai_api_usage_time_bucket_result_inner_OBJECT_e usage_time_bucket_result_inner_object_FromString(char* object);



typedef struct usage_time_bucket_result_inner_t {
    openai_api_usage_time_bucket_result_inner_OBJECT_e object; //enum
    int input_tokens; //numeric
    int input_cached_tokens; //numeric
    int output_tokens; //numeric
    int input_audio_tokens; //numeric
    int output_audio_tokens; //numeric
    int num_model_requests; //numeric
    char *project_id; // string
    char *user_id; // string
    char *api_key_id; // string
    char *model; // string
    int batch; //boolean
    int images; //numeric
    char *source; // string
    char *size; // string
    int characters; //numeric
    int seconds; //numeric
    int usage_bytes; //numeric
    int sessions; //numeric
    struct costs_result_amount_t *amount; //model
    char *line_item; // string

    int _library_owned; // Is the library responsible for freeing this object?
} usage_time_bucket_result_inner_t;

__attribute__((deprecated)) usage_time_bucket_result_inner_t *usage_time_bucket_result_inner_create(
    openai_api_usage_time_bucket_result_inner_OBJECT_e object,
    int input_tokens,
    int input_cached_tokens,
    int output_tokens,
    int input_audio_tokens,
    int output_audio_tokens,
    int num_model_requests,
    char *project_id,
    char *user_id,
    char *api_key_id,
    char *model,
    int batch,
    int images,
    char *source,
    char *size,
    int characters,
    int seconds,
    int usage_bytes,
    int sessions,
    costs_result_amount_t *amount,
    char *line_item
);

void usage_time_bucket_result_inner_free(usage_time_bucket_result_inner_t *usage_time_bucket_result_inner);

usage_time_bucket_result_inner_t *usage_time_bucket_result_inner_parseFromJSON(cJSON *usage_time_bucket_result_innerJSON);

cJSON *usage_time_bucket_result_inner_convertToJSON(usage_time_bucket_result_inner_t *usage_time_bucket_result_inner);

#endif /* _usage_time_bucket_result_inner_H_ */

