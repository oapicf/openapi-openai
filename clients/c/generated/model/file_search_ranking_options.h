/*
 * file_search_ranking_options.h
 *
 * The ranking options for the file search. If not specified, the file search tool will use the &#x60;auto&#x60; ranker and a score_threshold of 0.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
 */

#ifndef _file_search_ranking_options_H_
#define _file_search_ranking_options_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct file_search_ranking_options_t file_search_ranking_options_t;


// Enum RANKER for file_search_ranking_options

typedef enum  { openai_api_file_search_ranking_options_RANKER_NULL = 0, openai_api_file_search_ranking_options_RANKER__auto, openai_api_file_search_ranking_options_RANKER_default_2024_08_21 } openai_api_file_search_ranking_options_RANKER_e;

char* file_search_ranking_options_ranker_ToString(openai_api_file_search_ranking_options_RANKER_e ranker);

openai_api_file_search_ranking_options_RANKER_e file_search_ranking_options_ranker_FromString(char* ranker);



typedef struct file_search_ranking_options_t {
    openai_api_file_search_ranking_options_RANKER_e ranker; //enum
    double score_threshold; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} file_search_ranking_options_t;

__attribute__((deprecated)) file_search_ranking_options_t *file_search_ranking_options_create(
    openai_api_file_search_ranking_options_RANKER_e ranker,
    double score_threshold
);

void file_search_ranking_options_free(file_search_ranking_options_t *file_search_ranking_options);

file_search_ranking_options_t *file_search_ranking_options_parseFromJSON(cJSON *file_search_ranking_optionsJSON);

cJSON *file_search_ranking_options_convertToJSON(file_search_ranking_options_t *file_search_ranking_options);

#endif /* _file_search_ranking_options_H_ */

