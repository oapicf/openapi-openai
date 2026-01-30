#ifndef assistant_object_tool_resources_code_interpreter_TEST
#define assistant_object_tool_resources_code_interpreter_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define assistant_object_tool_resources_code_interpreter_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/assistant_object_tool_resources_code_interpreter.h"
assistant_object_tool_resources_code_interpreter_t* instantiate_assistant_object_tool_resources_code_interpreter(int include_optional);



assistant_object_tool_resources_code_interpreter_t* instantiate_assistant_object_tool_resources_code_interpreter(int include_optional) {
  assistant_object_tool_resources_code_interpreter_t* assistant_object_tool_resources_code_interpreter = NULL;
  if (include_optional) {
    assistant_object_tool_resources_code_interpreter = assistant_object_tool_resources_code_interpreter_create(
      list_createList()
    );
  } else {
    assistant_object_tool_resources_code_interpreter = assistant_object_tool_resources_code_interpreter_create(
      list_createList()
    );
  }

  return assistant_object_tool_resources_code_interpreter;
}


#ifdef assistant_object_tool_resources_code_interpreter_MAIN

void test_assistant_object_tool_resources_code_interpreter(int include_optional) {
    assistant_object_tool_resources_code_interpreter_t* assistant_object_tool_resources_code_interpreter_1 = instantiate_assistant_object_tool_resources_code_interpreter(include_optional);

	cJSON* jsonassistant_object_tool_resources_code_interpreter_1 = assistant_object_tool_resources_code_interpreter_convertToJSON(assistant_object_tool_resources_code_interpreter_1);
	printf("assistant_object_tool_resources_code_interpreter :\n%s\n", cJSON_Print(jsonassistant_object_tool_resources_code_interpreter_1));
	assistant_object_tool_resources_code_interpreter_t* assistant_object_tool_resources_code_interpreter_2 = assistant_object_tool_resources_code_interpreter_parseFromJSON(jsonassistant_object_tool_resources_code_interpreter_1);
	cJSON* jsonassistant_object_tool_resources_code_interpreter_2 = assistant_object_tool_resources_code_interpreter_convertToJSON(assistant_object_tool_resources_code_interpreter_2);
	printf("repeating assistant_object_tool_resources_code_interpreter:\n%s\n", cJSON_Print(jsonassistant_object_tool_resources_code_interpreter_2));
}

int main() {
  test_assistant_object_tool_resources_code_interpreter(1);
  test_assistant_object_tool_resources_code_interpreter(0);

  printf("Hello world \n");
  return 0;
}

#endif // assistant_object_tool_resources_code_interpreter_MAIN
#endif // assistant_object_tool_resources_code_interpreter_TEST
