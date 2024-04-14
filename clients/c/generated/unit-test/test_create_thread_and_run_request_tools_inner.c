#ifndef create_thread_and_run_request_tools_inner_TEST
#define create_thread_and_run_request_tools_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_thread_and_run_request_tools_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_thread_and_run_request_tools_inner.h"
create_thread_and_run_request_tools_inner_t* instantiate_create_thread_and_run_request_tools_inner(int include_optional);

#include "test_function_object.c"


create_thread_and_run_request_tools_inner_t* instantiate_create_thread_and_run_request_tools_inner(int include_optional) {
  create_thread_and_run_request_tools_inner_t* create_thread_and_run_request_tools_inner = NULL;
  if (include_optional) {
    create_thread_and_run_request_tools_inner = create_thread_and_run_request_tools_inner_create(
      openai_api_create_thread_and_run_request_tools_inner_TYPE_code_interpreter,
       // false, not to have infinite recursion
      instantiate_function_object(0)
    );
  } else {
    create_thread_and_run_request_tools_inner = create_thread_and_run_request_tools_inner_create(
      openai_api_create_thread_and_run_request_tools_inner_TYPE_code_interpreter,
      NULL
    );
  }

  return create_thread_and_run_request_tools_inner;
}


#ifdef create_thread_and_run_request_tools_inner_MAIN

void test_create_thread_and_run_request_tools_inner(int include_optional) {
    create_thread_and_run_request_tools_inner_t* create_thread_and_run_request_tools_inner_1 = instantiate_create_thread_and_run_request_tools_inner(include_optional);

	cJSON* jsoncreate_thread_and_run_request_tools_inner_1 = create_thread_and_run_request_tools_inner_convertToJSON(create_thread_and_run_request_tools_inner_1);
	printf("create_thread_and_run_request_tools_inner :\n%s\n", cJSON_Print(jsoncreate_thread_and_run_request_tools_inner_1));
	create_thread_and_run_request_tools_inner_t* create_thread_and_run_request_tools_inner_2 = create_thread_and_run_request_tools_inner_parseFromJSON(jsoncreate_thread_and_run_request_tools_inner_1);
	cJSON* jsoncreate_thread_and_run_request_tools_inner_2 = create_thread_and_run_request_tools_inner_convertToJSON(create_thread_and_run_request_tools_inner_2);
	printf("repeating create_thread_and_run_request_tools_inner:\n%s\n", cJSON_Print(jsoncreate_thread_and_run_request_tools_inner_2));
}

int main() {
  test_create_thread_and_run_request_tools_inner(1);
  test_create_thread_and_run_request_tools_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_thread_and_run_request_tools_inner_MAIN
#endif // create_thread_and_run_request_tools_inner_TEST
