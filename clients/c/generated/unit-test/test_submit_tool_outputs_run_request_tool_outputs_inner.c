#ifndef submit_tool_outputs_run_request_tool_outputs_inner_TEST
#define submit_tool_outputs_run_request_tool_outputs_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define submit_tool_outputs_run_request_tool_outputs_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/submit_tool_outputs_run_request_tool_outputs_inner.h"
submit_tool_outputs_run_request_tool_outputs_inner_t* instantiate_submit_tool_outputs_run_request_tool_outputs_inner(int include_optional);



submit_tool_outputs_run_request_tool_outputs_inner_t* instantiate_submit_tool_outputs_run_request_tool_outputs_inner(int include_optional) {
  submit_tool_outputs_run_request_tool_outputs_inner_t* submit_tool_outputs_run_request_tool_outputs_inner = NULL;
  if (include_optional) {
    submit_tool_outputs_run_request_tool_outputs_inner = submit_tool_outputs_run_request_tool_outputs_inner_create(
      "0",
      "0"
    );
  } else {
    submit_tool_outputs_run_request_tool_outputs_inner = submit_tool_outputs_run_request_tool_outputs_inner_create(
      "0",
      "0"
    );
  }

  return submit_tool_outputs_run_request_tool_outputs_inner;
}


#ifdef submit_tool_outputs_run_request_tool_outputs_inner_MAIN

void test_submit_tool_outputs_run_request_tool_outputs_inner(int include_optional) {
    submit_tool_outputs_run_request_tool_outputs_inner_t* submit_tool_outputs_run_request_tool_outputs_inner_1 = instantiate_submit_tool_outputs_run_request_tool_outputs_inner(include_optional);

	cJSON* jsonsubmit_tool_outputs_run_request_tool_outputs_inner_1 = submit_tool_outputs_run_request_tool_outputs_inner_convertToJSON(submit_tool_outputs_run_request_tool_outputs_inner_1);
	printf("submit_tool_outputs_run_request_tool_outputs_inner :\n%s\n", cJSON_Print(jsonsubmit_tool_outputs_run_request_tool_outputs_inner_1));
	submit_tool_outputs_run_request_tool_outputs_inner_t* submit_tool_outputs_run_request_tool_outputs_inner_2 = submit_tool_outputs_run_request_tool_outputs_inner_parseFromJSON(jsonsubmit_tool_outputs_run_request_tool_outputs_inner_1);
	cJSON* jsonsubmit_tool_outputs_run_request_tool_outputs_inner_2 = submit_tool_outputs_run_request_tool_outputs_inner_convertToJSON(submit_tool_outputs_run_request_tool_outputs_inner_2);
	printf("repeating submit_tool_outputs_run_request_tool_outputs_inner:\n%s\n", cJSON_Print(jsonsubmit_tool_outputs_run_request_tool_outputs_inner_2));
}

int main() {
  test_submit_tool_outputs_run_request_tool_outputs_inner(1);
  test_submit_tool_outputs_run_request_tool_outputs_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // submit_tool_outputs_run_request_tool_outputs_inner_MAIN
#endif // submit_tool_outputs_run_request_tool_outputs_inner_TEST
