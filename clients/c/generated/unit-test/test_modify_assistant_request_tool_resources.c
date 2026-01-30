#ifndef modify_assistant_request_tool_resources_TEST
#define modify_assistant_request_tool_resources_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define modify_assistant_request_tool_resources_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/modify_assistant_request_tool_resources.h"
modify_assistant_request_tool_resources_t* instantiate_modify_assistant_request_tool_resources(int include_optional);

#include "test_modify_assistant_request_tool_resources_code_interpreter.c"
#include "test_modify_assistant_request_tool_resources_file_search.c"


modify_assistant_request_tool_resources_t* instantiate_modify_assistant_request_tool_resources(int include_optional) {
  modify_assistant_request_tool_resources_t* modify_assistant_request_tool_resources = NULL;
  if (include_optional) {
    modify_assistant_request_tool_resources = modify_assistant_request_tool_resources_create(
       // false, not to have infinite recursion
      instantiate_modify_assistant_request_tool_resources_code_interpreter(0),
       // false, not to have infinite recursion
      instantiate_modify_assistant_request_tool_resources_file_search(0)
    );
  } else {
    modify_assistant_request_tool_resources = modify_assistant_request_tool_resources_create(
      NULL,
      NULL
    );
  }

  return modify_assistant_request_tool_resources;
}


#ifdef modify_assistant_request_tool_resources_MAIN

void test_modify_assistant_request_tool_resources(int include_optional) {
    modify_assistant_request_tool_resources_t* modify_assistant_request_tool_resources_1 = instantiate_modify_assistant_request_tool_resources(include_optional);

	cJSON* jsonmodify_assistant_request_tool_resources_1 = modify_assistant_request_tool_resources_convertToJSON(modify_assistant_request_tool_resources_1);
	printf("modify_assistant_request_tool_resources :\n%s\n", cJSON_Print(jsonmodify_assistant_request_tool_resources_1));
	modify_assistant_request_tool_resources_t* modify_assistant_request_tool_resources_2 = modify_assistant_request_tool_resources_parseFromJSON(jsonmodify_assistant_request_tool_resources_1);
	cJSON* jsonmodify_assistant_request_tool_resources_2 = modify_assistant_request_tool_resources_convertToJSON(modify_assistant_request_tool_resources_2);
	printf("repeating modify_assistant_request_tool_resources:\n%s\n", cJSON_Print(jsonmodify_assistant_request_tool_resources_2));
}

int main() {
  test_modify_assistant_request_tool_resources(1);
  test_modify_assistant_request_tool_resources(0);

  printf("Hello world \n");
  return 0;
}

#endif // modify_assistant_request_tool_resources_MAIN
#endif // modify_assistant_request_tool_resources_TEST
