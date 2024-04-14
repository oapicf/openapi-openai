#ifndef submit_tool_outputs_run_request_TEST
#define submit_tool_outputs_run_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define submit_tool_outputs_run_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/submit_tool_outputs_run_request.h"
submit_tool_outputs_run_request_t* instantiate_submit_tool_outputs_run_request(int include_optional);



submit_tool_outputs_run_request_t* instantiate_submit_tool_outputs_run_request(int include_optional) {
  submit_tool_outputs_run_request_t* submit_tool_outputs_run_request = NULL;
  if (include_optional) {
    submit_tool_outputs_run_request = submit_tool_outputs_run_request_create(
      list_createList(),
      1
    );
  } else {
    submit_tool_outputs_run_request = submit_tool_outputs_run_request_create(
      list_createList(),
      1
    );
  }

  return submit_tool_outputs_run_request;
}


#ifdef submit_tool_outputs_run_request_MAIN

void test_submit_tool_outputs_run_request(int include_optional) {
    submit_tool_outputs_run_request_t* submit_tool_outputs_run_request_1 = instantiate_submit_tool_outputs_run_request(include_optional);

	cJSON* jsonsubmit_tool_outputs_run_request_1 = submit_tool_outputs_run_request_convertToJSON(submit_tool_outputs_run_request_1);
	printf("submit_tool_outputs_run_request :\n%s\n", cJSON_Print(jsonsubmit_tool_outputs_run_request_1));
	submit_tool_outputs_run_request_t* submit_tool_outputs_run_request_2 = submit_tool_outputs_run_request_parseFromJSON(jsonsubmit_tool_outputs_run_request_1);
	cJSON* jsonsubmit_tool_outputs_run_request_2 = submit_tool_outputs_run_request_convertToJSON(submit_tool_outputs_run_request_2);
	printf("repeating submit_tool_outputs_run_request:\n%s\n", cJSON_Print(jsonsubmit_tool_outputs_run_request_2));
}

int main() {
  test_submit_tool_outputs_run_request(1);
  test_submit_tool_outputs_run_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // submit_tool_outputs_run_request_MAIN
#endif // submit_tool_outputs_run_request_TEST
