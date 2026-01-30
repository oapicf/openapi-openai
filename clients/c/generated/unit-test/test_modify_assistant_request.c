#ifndef modify_assistant_request_TEST
#define modify_assistant_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define modify_assistant_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/modify_assistant_request.h"
modify_assistant_request_t* instantiate_modify_assistant_request(int include_optional);

#include "test_modify_assistant_request_tool_resources.c"
#include "test_assistants_api_response_format_option.c"


modify_assistant_request_t* instantiate_modify_assistant_request(int include_optional) {
  modify_assistant_request_t* modify_assistant_request = NULL;
  if (include_optional) {
    modify_assistant_request = modify_assistant_request_create(
      "0",
      "0",
      "0",
      "0",
      list_createList(),
       // false, not to have infinite recursion
      instantiate_modify_assistant_request_tool_resources(0),
      0,
      1,
      1,
      null
    );
  } else {
    modify_assistant_request = modify_assistant_request_create(
      "0",
      "0",
      "0",
      "0",
      list_createList(),
      NULL,
      0,
      1,
      1,
      null
    );
  }

  return modify_assistant_request;
}


#ifdef modify_assistant_request_MAIN

void test_modify_assistant_request(int include_optional) {
    modify_assistant_request_t* modify_assistant_request_1 = instantiate_modify_assistant_request(include_optional);

	cJSON* jsonmodify_assistant_request_1 = modify_assistant_request_convertToJSON(modify_assistant_request_1);
	printf("modify_assistant_request :\n%s\n", cJSON_Print(jsonmodify_assistant_request_1));
	modify_assistant_request_t* modify_assistant_request_2 = modify_assistant_request_parseFromJSON(jsonmodify_assistant_request_1);
	cJSON* jsonmodify_assistant_request_2 = modify_assistant_request_convertToJSON(modify_assistant_request_2);
	printf("repeating modify_assistant_request:\n%s\n", cJSON_Print(jsonmodify_assistant_request_2));
}

int main() {
  test_modify_assistant_request(1);
  test_modify_assistant_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // modify_assistant_request_MAIN
#endif // modify_assistant_request_TEST
