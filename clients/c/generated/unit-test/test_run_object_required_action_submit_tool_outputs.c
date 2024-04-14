#ifndef run_object_required_action_submit_tool_outputs_TEST
#define run_object_required_action_submit_tool_outputs_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define run_object_required_action_submit_tool_outputs_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/run_object_required_action_submit_tool_outputs.h"
run_object_required_action_submit_tool_outputs_t* instantiate_run_object_required_action_submit_tool_outputs(int include_optional);



run_object_required_action_submit_tool_outputs_t* instantiate_run_object_required_action_submit_tool_outputs(int include_optional) {
  run_object_required_action_submit_tool_outputs_t* run_object_required_action_submit_tool_outputs = NULL;
  if (include_optional) {
    run_object_required_action_submit_tool_outputs = run_object_required_action_submit_tool_outputs_create(
      list_createList()
    );
  } else {
    run_object_required_action_submit_tool_outputs = run_object_required_action_submit_tool_outputs_create(
      list_createList()
    );
  }

  return run_object_required_action_submit_tool_outputs;
}


#ifdef run_object_required_action_submit_tool_outputs_MAIN

void test_run_object_required_action_submit_tool_outputs(int include_optional) {
    run_object_required_action_submit_tool_outputs_t* run_object_required_action_submit_tool_outputs_1 = instantiate_run_object_required_action_submit_tool_outputs(include_optional);

	cJSON* jsonrun_object_required_action_submit_tool_outputs_1 = run_object_required_action_submit_tool_outputs_convertToJSON(run_object_required_action_submit_tool_outputs_1);
	printf("run_object_required_action_submit_tool_outputs :\n%s\n", cJSON_Print(jsonrun_object_required_action_submit_tool_outputs_1));
	run_object_required_action_submit_tool_outputs_t* run_object_required_action_submit_tool_outputs_2 = run_object_required_action_submit_tool_outputs_parseFromJSON(jsonrun_object_required_action_submit_tool_outputs_1);
	cJSON* jsonrun_object_required_action_submit_tool_outputs_2 = run_object_required_action_submit_tool_outputs_convertToJSON(run_object_required_action_submit_tool_outputs_2);
	printf("repeating run_object_required_action_submit_tool_outputs:\n%s\n", cJSON_Print(jsonrun_object_required_action_submit_tool_outputs_2));
}

int main() {
  test_run_object_required_action_submit_tool_outputs(1);
  test_run_object_required_action_submit_tool_outputs(0);

  printf("Hello world \n");
  return 0;
}

#endif // run_object_required_action_submit_tool_outputs_MAIN
#endif // run_object_required_action_submit_tool_outputs_TEST
