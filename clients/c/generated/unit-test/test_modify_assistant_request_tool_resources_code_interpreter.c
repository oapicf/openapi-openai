#ifndef modify_assistant_request_tool_resources_code_interpreter_TEST
#define modify_assistant_request_tool_resources_code_interpreter_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define modify_assistant_request_tool_resources_code_interpreter_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/modify_assistant_request_tool_resources_code_interpreter.h"
modify_assistant_request_tool_resources_code_interpreter_t* instantiate_modify_assistant_request_tool_resources_code_interpreter(int include_optional);



modify_assistant_request_tool_resources_code_interpreter_t* instantiate_modify_assistant_request_tool_resources_code_interpreter(int include_optional) {
  modify_assistant_request_tool_resources_code_interpreter_t* modify_assistant_request_tool_resources_code_interpreter = NULL;
  if (include_optional) {
    modify_assistant_request_tool_resources_code_interpreter = modify_assistant_request_tool_resources_code_interpreter_create(
      list_createList()
    );
  } else {
    modify_assistant_request_tool_resources_code_interpreter = modify_assistant_request_tool_resources_code_interpreter_create(
      list_createList()
    );
  }

  return modify_assistant_request_tool_resources_code_interpreter;
}


#ifdef modify_assistant_request_tool_resources_code_interpreter_MAIN

void test_modify_assistant_request_tool_resources_code_interpreter(int include_optional) {
    modify_assistant_request_tool_resources_code_interpreter_t* modify_assistant_request_tool_resources_code_interpreter_1 = instantiate_modify_assistant_request_tool_resources_code_interpreter(include_optional);

	cJSON* jsonmodify_assistant_request_tool_resources_code_interpreter_1 = modify_assistant_request_tool_resources_code_interpreter_convertToJSON(modify_assistant_request_tool_resources_code_interpreter_1);
	printf("modify_assistant_request_tool_resources_code_interpreter :\n%s\n", cJSON_Print(jsonmodify_assistant_request_tool_resources_code_interpreter_1));
	modify_assistant_request_tool_resources_code_interpreter_t* modify_assistant_request_tool_resources_code_interpreter_2 = modify_assistant_request_tool_resources_code_interpreter_parseFromJSON(jsonmodify_assistant_request_tool_resources_code_interpreter_1);
	cJSON* jsonmodify_assistant_request_tool_resources_code_interpreter_2 = modify_assistant_request_tool_resources_code_interpreter_convertToJSON(modify_assistant_request_tool_resources_code_interpreter_2);
	printf("repeating modify_assistant_request_tool_resources_code_interpreter:\n%s\n", cJSON_Print(jsonmodify_assistant_request_tool_resources_code_interpreter_2));
}

int main() {
  test_modify_assistant_request_tool_resources_code_interpreter(1);
  test_modify_assistant_request_tool_resources_code_interpreter(0);

  printf("Hello world \n");
  return 0;
}

#endif // modify_assistant_request_tool_resources_code_interpreter_MAIN
#endif // modify_assistant_request_tool_resources_code_interpreter_TEST
