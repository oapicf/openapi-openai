#ifndef assistant_object_tool_resources_TEST
#define assistant_object_tool_resources_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define assistant_object_tool_resources_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/assistant_object_tool_resources.h"
assistant_object_tool_resources_t* instantiate_assistant_object_tool_resources(int include_optional);

#include "test_assistant_object_tool_resources_code_interpreter.c"
#include "test_assistant_object_tool_resources_file_search.c"


assistant_object_tool_resources_t* instantiate_assistant_object_tool_resources(int include_optional) {
  assistant_object_tool_resources_t* assistant_object_tool_resources = NULL;
  if (include_optional) {
    assistant_object_tool_resources = assistant_object_tool_resources_create(
       // false, not to have infinite recursion
      instantiate_assistant_object_tool_resources_code_interpreter(0),
       // false, not to have infinite recursion
      instantiate_assistant_object_tool_resources_file_search(0)
    );
  } else {
    assistant_object_tool_resources = assistant_object_tool_resources_create(
      NULL,
      NULL
    );
  }

  return assistant_object_tool_resources;
}


#ifdef assistant_object_tool_resources_MAIN

void test_assistant_object_tool_resources(int include_optional) {
    assistant_object_tool_resources_t* assistant_object_tool_resources_1 = instantiate_assistant_object_tool_resources(include_optional);

	cJSON* jsonassistant_object_tool_resources_1 = assistant_object_tool_resources_convertToJSON(assistant_object_tool_resources_1);
	printf("assistant_object_tool_resources :\n%s\n", cJSON_Print(jsonassistant_object_tool_resources_1));
	assistant_object_tool_resources_t* assistant_object_tool_resources_2 = assistant_object_tool_resources_parseFromJSON(jsonassistant_object_tool_resources_1);
	cJSON* jsonassistant_object_tool_resources_2 = assistant_object_tool_resources_convertToJSON(assistant_object_tool_resources_2);
	printf("repeating assistant_object_tool_resources:\n%s\n", cJSON_Print(jsonassistant_object_tool_resources_2));
}

int main() {
  test_assistant_object_tool_resources(1);
  test_assistant_object_tool_resources(0);

  printf("Hello world \n");
  return 0;
}

#endif // assistant_object_tool_resources_MAIN
#endif // assistant_object_tool_resources_TEST
