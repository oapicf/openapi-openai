#ifndef create_assistant_request_tool_resources_code_interpreter_TEST
#define create_assistant_request_tool_resources_code_interpreter_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_assistant_request_tool_resources_code_interpreter_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_assistant_request_tool_resources_code_interpreter.h"
create_assistant_request_tool_resources_code_interpreter_t* instantiate_create_assistant_request_tool_resources_code_interpreter(int include_optional);



create_assistant_request_tool_resources_code_interpreter_t* instantiate_create_assistant_request_tool_resources_code_interpreter(int include_optional) {
  create_assistant_request_tool_resources_code_interpreter_t* create_assistant_request_tool_resources_code_interpreter = NULL;
  if (include_optional) {
    create_assistant_request_tool_resources_code_interpreter = create_assistant_request_tool_resources_code_interpreter_create(
      list_createList()
    );
  } else {
    create_assistant_request_tool_resources_code_interpreter = create_assistant_request_tool_resources_code_interpreter_create(
      list_createList()
    );
  }

  return create_assistant_request_tool_resources_code_interpreter;
}


#ifdef create_assistant_request_tool_resources_code_interpreter_MAIN

void test_create_assistant_request_tool_resources_code_interpreter(int include_optional) {
    create_assistant_request_tool_resources_code_interpreter_t* create_assistant_request_tool_resources_code_interpreter_1 = instantiate_create_assistant_request_tool_resources_code_interpreter(include_optional);

	cJSON* jsoncreate_assistant_request_tool_resources_code_interpreter_1 = create_assistant_request_tool_resources_code_interpreter_convertToJSON(create_assistant_request_tool_resources_code_interpreter_1);
	printf("create_assistant_request_tool_resources_code_interpreter :\n%s\n", cJSON_Print(jsoncreate_assistant_request_tool_resources_code_interpreter_1));
	create_assistant_request_tool_resources_code_interpreter_t* create_assistant_request_tool_resources_code_interpreter_2 = create_assistant_request_tool_resources_code_interpreter_parseFromJSON(jsoncreate_assistant_request_tool_resources_code_interpreter_1);
	cJSON* jsoncreate_assistant_request_tool_resources_code_interpreter_2 = create_assistant_request_tool_resources_code_interpreter_convertToJSON(create_assistant_request_tool_resources_code_interpreter_2);
	printf("repeating create_assistant_request_tool_resources_code_interpreter:\n%s\n", cJSON_Print(jsoncreate_assistant_request_tool_resources_code_interpreter_2));
}

int main() {
  test_create_assistant_request_tool_resources_code_interpreter(1);
  test_create_assistant_request_tool_resources_code_interpreter(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_assistant_request_tool_resources_code_interpreter_MAIN
#endif // create_assistant_request_tool_resources_code_interpreter_TEST
