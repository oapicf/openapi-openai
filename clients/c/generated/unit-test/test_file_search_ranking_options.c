#ifndef file_search_ranking_options_TEST
#define file_search_ranking_options_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define file_search_ranking_options_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/file_search_ranking_options.h"
file_search_ranking_options_t* instantiate_file_search_ranking_options(int include_optional);



file_search_ranking_options_t* instantiate_file_search_ranking_options(int include_optional) {
  file_search_ranking_options_t* file_search_ranking_options = NULL;
  if (include_optional) {
    file_search_ranking_options = file_search_ranking_options_create(
      openai_api_file_search_ranking_options_RANKER_auto,
      0
    );
  } else {
    file_search_ranking_options = file_search_ranking_options_create(
      openai_api_file_search_ranking_options_RANKER_auto,
      0
    );
  }

  return file_search_ranking_options;
}


#ifdef file_search_ranking_options_MAIN

void test_file_search_ranking_options(int include_optional) {
    file_search_ranking_options_t* file_search_ranking_options_1 = instantiate_file_search_ranking_options(include_optional);

	cJSON* jsonfile_search_ranking_options_1 = file_search_ranking_options_convertToJSON(file_search_ranking_options_1);
	printf("file_search_ranking_options :\n%s\n", cJSON_Print(jsonfile_search_ranking_options_1));
	file_search_ranking_options_t* file_search_ranking_options_2 = file_search_ranking_options_parseFromJSON(jsonfile_search_ranking_options_1);
	cJSON* jsonfile_search_ranking_options_2 = file_search_ranking_options_convertToJSON(file_search_ranking_options_2);
	printf("repeating file_search_ranking_options:\n%s\n", cJSON_Print(jsonfile_search_ranking_options_2));
}

int main() {
  test_file_search_ranking_options(1);
  test_file_search_ranking_options(0);

  printf("Hello world \n");
  return 0;
}

#endif // file_search_ranking_options_MAIN
#endif // file_search_ranking_options_TEST
