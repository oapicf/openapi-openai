#ifndef run_step_details_tool_calls_object_tool_calls_inner_TEST
#define run_step_details_tool_calls_object_tool_calls_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define run_step_details_tool_calls_object_tool_calls_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/run_step_details_tool_calls_object_tool_calls_inner.h"
run_step_details_tool_calls_object_tool_calls_inner_t* instantiate_run_step_details_tool_calls_object_tool_calls_inner(int include_optional);

#include "test_run_step_details_tool_calls_code_object_code_interpreter.c"
#include "test_run_step_details_tool_calls_file_search_object_file_search.c"
#include "test_run_step_details_tool_calls_function_object_function.c"


run_step_details_tool_calls_object_tool_calls_inner_t* instantiate_run_step_details_tool_calls_object_tool_calls_inner(int include_optional) {
  run_step_details_tool_calls_object_tool_calls_inner_t* run_step_details_tool_calls_object_tool_calls_inner = NULL;
  if (include_optional) {
    run_step_details_tool_calls_object_tool_calls_inner = run_step_details_tool_calls_object_tool_calls_inner_create(
      "0",
      openai_api_run_step_details_tool_calls_object_tool_calls_inner_TYPE_code_interpreter,
       // false, not to have infinite recursion
      instantiate_run_step_details_tool_calls_code_object_code_interpreter(0),
       // false, not to have infinite recursion
      instantiate_run_step_details_tool_calls_file_search_object_file_search(0),
       // false, not to have infinite recursion
      instantiate_run_step_details_tool_calls_function_object_function(0)
    );
  } else {
    run_step_details_tool_calls_object_tool_calls_inner = run_step_details_tool_calls_object_tool_calls_inner_create(
      "0",
      openai_api_run_step_details_tool_calls_object_tool_calls_inner_TYPE_code_interpreter,
      NULL,
      NULL,
      NULL
    );
  }

  return run_step_details_tool_calls_object_tool_calls_inner;
}


#ifdef run_step_details_tool_calls_object_tool_calls_inner_MAIN

void test_run_step_details_tool_calls_object_tool_calls_inner(int include_optional) {
    run_step_details_tool_calls_object_tool_calls_inner_t* run_step_details_tool_calls_object_tool_calls_inner_1 = instantiate_run_step_details_tool_calls_object_tool_calls_inner(include_optional);

	cJSON* jsonrun_step_details_tool_calls_object_tool_calls_inner_1 = run_step_details_tool_calls_object_tool_calls_inner_convertToJSON(run_step_details_tool_calls_object_tool_calls_inner_1);
	printf("run_step_details_tool_calls_object_tool_calls_inner :\n%s\n", cJSON_Print(jsonrun_step_details_tool_calls_object_tool_calls_inner_1));
	run_step_details_tool_calls_object_tool_calls_inner_t* run_step_details_tool_calls_object_tool_calls_inner_2 = run_step_details_tool_calls_object_tool_calls_inner_parseFromJSON(jsonrun_step_details_tool_calls_object_tool_calls_inner_1);
	cJSON* jsonrun_step_details_tool_calls_object_tool_calls_inner_2 = run_step_details_tool_calls_object_tool_calls_inner_convertToJSON(run_step_details_tool_calls_object_tool_calls_inner_2);
	printf("repeating run_step_details_tool_calls_object_tool_calls_inner:\n%s\n", cJSON_Print(jsonrun_step_details_tool_calls_object_tool_calls_inner_2));
}

int main() {
  test_run_step_details_tool_calls_object_tool_calls_inner(1);
  test_run_step_details_tool_calls_object_tool_calls_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // run_step_details_tool_calls_object_tool_calls_inner_MAIN
#endif // run_step_details_tool_calls_object_tool_calls_inner_TEST
