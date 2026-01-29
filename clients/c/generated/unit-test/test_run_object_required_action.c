#ifndef run_object_required_action_TEST
#define run_object_required_action_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define run_object_required_action_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/run_object_required_action.h"
run_object_required_action_t* instantiate_run_object_required_action(int include_optional);

#include "test_run_object_required_action_submit_tool_outputs.c"


run_object_required_action_t* instantiate_run_object_required_action(int include_optional) {
  run_object_required_action_t* run_object_required_action = NULL;
  if (include_optional) {
    run_object_required_action = run_object_required_action_create(
      openai_api_run_object_required_action_TYPE_submit_tool_outputs,
       // false, not to have infinite recursion
      instantiate_run_object_required_action_submit_tool_outputs(0)
    );
  } else {
    run_object_required_action = run_object_required_action_create(
      openai_api_run_object_required_action_TYPE_submit_tool_outputs,
      NULL
    );
  }

  return run_object_required_action;
}


#ifdef run_object_required_action_MAIN

void test_run_object_required_action(int include_optional) {
    run_object_required_action_t* run_object_required_action_1 = instantiate_run_object_required_action(include_optional);

	cJSON* jsonrun_object_required_action_1 = run_object_required_action_convertToJSON(run_object_required_action_1);
	printf("run_object_required_action :\n%s\n", cJSON_Print(jsonrun_object_required_action_1));
	run_object_required_action_t* run_object_required_action_2 = run_object_required_action_parseFromJSON(jsonrun_object_required_action_1);
	cJSON* jsonrun_object_required_action_2 = run_object_required_action_convertToJSON(run_object_required_action_2);
	printf("repeating run_object_required_action:\n%s\n", cJSON_Print(jsonrun_object_required_action_2));
}

int main() {
  test_run_object_required_action(1);
  test_run_object_required_action(0);

  printf("Hello world \n");
  return 0;
}

#endif // run_object_required_action_MAIN
#endif // run_object_required_action_TEST
