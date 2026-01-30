#ifndef run_step_details_tool_calls_file_search_object_file_search_TEST
#define run_step_details_tool_calls_file_search_object_file_search_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define run_step_details_tool_calls_file_search_object_file_search_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/run_step_details_tool_calls_file_search_object_file_search.h"
run_step_details_tool_calls_file_search_object_file_search_t* instantiate_run_step_details_tool_calls_file_search_object_file_search(int include_optional);

#include "test_run_step_details_tool_calls_file_search_ranking_options_object.c"


run_step_details_tool_calls_file_search_object_file_search_t* instantiate_run_step_details_tool_calls_file_search_object_file_search(int include_optional) {
  run_step_details_tool_calls_file_search_object_file_search_t* run_step_details_tool_calls_file_search_object_file_search = NULL;
  if (include_optional) {
    run_step_details_tool_calls_file_search_object_file_search = run_step_details_tool_calls_file_search_object_file_search_create(
       // false, not to have infinite recursion
      instantiate_run_step_details_tool_calls_file_search_ranking_options_object(0),
      list_createList()
    );
  } else {
    run_step_details_tool_calls_file_search_object_file_search = run_step_details_tool_calls_file_search_object_file_search_create(
      NULL,
      list_createList()
    );
  }

  return run_step_details_tool_calls_file_search_object_file_search;
}


#ifdef run_step_details_tool_calls_file_search_object_file_search_MAIN

void test_run_step_details_tool_calls_file_search_object_file_search(int include_optional) {
    run_step_details_tool_calls_file_search_object_file_search_t* run_step_details_tool_calls_file_search_object_file_search_1 = instantiate_run_step_details_tool_calls_file_search_object_file_search(include_optional);

	cJSON* jsonrun_step_details_tool_calls_file_search_object_file_search_1 = run_step_details_tool_calls_file_search_object_file_search_convertToJSON(run_step_details_tool_calls_file_search_object_file_search_1);
	printf("run_step_details_tool_calls_file_search_object_file_search :\n%s\n", cJSON_Print(jsonrun_step_details_tool_calls_file_search_object_file_search_1));
	run_step_details_tool_calls_file_search_object_file_search_t* run_step_details_tool_calls_file_search_object_file_search_2 = run_step_details_tool_calls_file_search_object_file_search_parseFromJSON(jsonrun_step_details_tool_calls_file_search_object_file_search_1);
	cJSON* jsonrun_step_details_tool_calls_file_search_object_file_search_2 = run_step_details_tool_calls_file_search_object_file_search_convertToJSON(run_step_details_tool_calls_file_search_object_file_search_2);
	printf("repeating run_step_details_tool_calls_file_search_object_file_search:\n%s\n", cJSON_Print(jsonrun_step_details_tool_calls_file_search_object_file_search_2));
}

int main() {
  test_run_step_details_tool_calls_file_search_object_file_search(1);
  test_run_step_details_tool_calls_file_search_object_file_search(0);

  printf("Hello world \n");
  return 0;
}

#endif // run_step_details_tool_calls_file_search_object_file_search_MAIN
#endif // run_step_details_tool_calls_file_search_object_file_search_TEST
