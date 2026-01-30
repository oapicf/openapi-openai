#ifndef create_thread_request_tool_resources_TEST
#define create_thread_request_tool_resources_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_thread_request_tool_resources_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_thread_request_tool_resources.h"
create_thread_request_tool_resources_t* instantiate_create_thread_request_tool_resources(int include_optional);

#include "test_create_assistant_request_tool_resources_code_interpreter.c"
#include "test_create_thread_request_tool_resources_file_search.c"


create_thread_request_tool_resources_t* instantiate_create_thread_request_tool_resources(int include_optional) {
  create_thread_request_tool_resources_t* create_thread_request_tool_resources = NULL;
  if (include_optional) {
    create_thread_request_tool_resources = create_thread_request_tool_resources_create(
       // false, not to have infinite recursion
      instantiate_create_assistant_request_tool_resources_code_interpreter(0),
       // false, not to have infinite recursion
      instantiate_create_thread_request_tool_resources_file_search(0)
    );
  } else {
    create_thread_request_tool_resources = create_thread_request_tool_resources_create(
      NULL,
      NULL
    );
  }

  return create_thread_request_tool_resources;
}


#ifdef create_thread_request_tool_resources_MAIN

void test_create_thread_request_tool_resources(int include_optional) {
    create_thread_request_tool_resources_t* create_thread_request_tool_resources_1 = instantiate_create_thread_request_tool_resources(include_optional);

	cJSON* jsoncreate_thread_request_tool_resources_1 = create_thread_request_tool_resources_convertToJSON(create_thread_request_tool_resources_1);
	printf("create_thread_request_tool_resources :\n%s\n", cJSON_Print(jsoncreate_thread_request_tool_resources_1));
	create_thread_request_tool_resources_t* create_thread_request_tool_resources_2 = create_thread_request_tool_resources_parseFromJSON(jsoncreate_thread_request_tool_resources_1);
	cJSON* jsoncreate_thread_request_tool_resources_2 = create_thread_request_tool_resources_convertToJSON(create_thread_request_tool_resources_2);
	printf("repeating create_thread_request_tool_resources:\n%s\n", cJSON_Print(jsoncreate_thread_request_tool_resources_2));
}

int main() {
  test_create_thread_request_tool_resources(1);
  test_create_thread_request_tool_resources(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_thread_request_tool_resources_MAIN
#endif // create_thread_request_tool_resources_TEST
