#ifndef create_thread_and_run_request_TEST
#define create_thread_and_run_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_thread_and_run_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_thread_and_run_request.h"
create_thread_and_run_request_t* instantiate_create_thread_and_run_request(int include_optional);

#include "test_create_thread_request.c"
#include "test_create_run_request_model.c"
#include "test_truncation_object.c"
#include "test_assistants_api_tool_choice_option.c"
#include "test_assistants_api_response_format_option.c"


create_thread_and_run_request_t* instantiate_create_thread_and_run_request(int include_optional) {
  create_thread_and_run_request_t* create_thread_and_run_request = NULL;
  if (include_optional) {
    create_thread_and_run_request = create_thread_and_run_request_create(
      "0",
       // false, not to have infinite recursion
      instantiate_create_thread_request(0),
      gpt-4-turbo,
      "0",
      list_createList(),
      0,
      1,
      1,
      256,
      256,
       // false, not to have infinite recursion
      instantiate_truncation_object(0),
      null,
      null
    );
  } else {
    create_thread_and_run_request = create_thread_and_run_request_create(
      "0",
      NULL,
      gpt-4-turbo,
      "0",
      list_createList(),
      0,
      1,
      1,
      256,
      256,
      NULL,
      null,
      null
    );
  }

  return create_thread_and_run_request;
}


#ifdef create_thread_and_run_request_MAIN

void test_create_thread_and_run_request(int include_optional) {
    create_thread_and_run_request_t* create_thread_and_run_request_1 = instantiate_create_thread_and_run_request(include_optional);

	cJSON* jsoncreate_thread_and_run_request_1 = create_thread_and_run_request_convertToJSON(create_thread_and_run_request_1);
	printf("create_thread_and_run_request :\n%s\n", cJSON_Print(jsoncreate_thread_and_run_request_1));
	create_thread_and_run_request_t* create_thread_and_run_request_2 = create_thread_and_run_request_parseFromJSON(jsoncreate_thread_and_run_request_1);
	cJSON* jsoncreate_thread_and_run_request_2 = create_thread_and_run_request_convertToJSON(create_thread_and_run_request_2);
	printf("repeating create_thread_and_run_request:\n%s\n", cJSON_Print(jsoncreate_thread_and_run_request_2));
}

int main() {
  test_create_thread_and_run_request(1);
  test_create_thread_and_run_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_thread_and_run_request_MAIN
#endif // create_thread_and_run_request_TEST
