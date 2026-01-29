#ifndef run_tool_call_object_TEST
#define run_tool_call_object_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define run_tool_call_object_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/run_tool_call_object.h"
run_tool_call_object_t* instantiate_run_tool_call_object(int include_optional);

#include "test_run_tool_call_object_function.c"


run_tool_call_object_t* instantiate_run_tool_call_object(int include_optional) {
  run_tool_call_object_t* run_tool_call_object = NULL;
  if (include_optional) {
    run_tool_call_object = run_tool_call_object_create(
      "0",
      openai_api_run_tool_call_object_TYPE_function,
       // false, not to have infinite recursion
      instantiate_run_tool_call_object_function(0)
    );
  } else {
    run_tool_call_object = run_tool_call_object_create(
      "0",
      openai_api_run_tool_call_object_TYPE_function,
      NULL
    );
  }

  return run_tool_call_object;
}


#ifdef run_tool_call_object_MAIN

void test_run_tool_call_object(int include_optional) {
    run_tool_call_object_t* run_tool_call_object_1 = instantiate_run_tool_call_object(include_optional);

	cJSON* jsonrun_tool_call_object_1 = run_tool_call_object_convertToJSON(run_tool_call_object_1);
	printf("run_tool_call_object :\n%s\n", cJSON_Print(jsonrun_tool_call_object_1));
	run_tool_call_object_t* run_tool_call_object_2 = run_tool_call_object_parseFromJSON(jsonrun_tool_call_object_1);
	cJSON* jsonrun_tool_call_object_2 = run_tool_call_object_convertToJSON(run_tool_call_object_2);
	printf("repeating run_tool_call_object:\n%s\n", cJSON_Print(jsonrun_tool_call_object_2));
}

int main() {
  test_run_tool_call_object(1);
  test_run_tool_call_object(0);

  printf("Hello world \n");
  return 0;
}

#endif // run_tool_call_object_MAIN
#endif // run_tool_call_object_TEST
