#ifndef assistant_tools_function_TEST
#define assistant_tools_function_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define assistant_tools_function_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/assistant_tools_function.h"
assistant_tools_function_t* instantiate_assistant_tools_function(int include_optional);

#include "test_function_object.c"


assistant_tools_function_t* instantiate_assistant_tools_function(int include_optional) {
  assistant_tools_function_t* assistant_tools_function = NULL;
  if (include_optional) {
    assistant_tools_function = assistant_tools_function_create(
      openai_api_assistant_tools_function_TYPE_function,
       // false, not to have infinite recursion
      instantiate_function_object(0)
    );
  } else {
    assistant_tools_function = assistant_tools_function_create(
      openai_api_assistant_tools_function_TYPE_function,
      NULL
    );
  }

  return assistant_tools_function;
}


#ifdef assistant_tools_function_MAIN

void test_assistant_tools_function(int include_optional) {
    assistant_tools_function_t* assistant_tools_function_1 = instantiate_assistant_tools_function(include_optional);

	cJSON* jsonassistant_tools_function_1 = assistant_tools_function_convertToJSON(assistant_tools_function_1);
	printf("assistant_tools_function :\n%s\n", cJSON_Print(jsonassistant_tools_function_1));
	assistant_tools_function_t* assistant_tools_function_2 = assistant_tools_function_parseFromJSON(jsonassistant_tools_function_1);
	cJSON* jsonassistant_tools_function_2 = assistant_tools_function_convertToJSON(assistant_tools_function_2);
	printf("repeating assistant_tools_function:\n%s\n", cJSON_Print(jsonassistant_tools_function_2));
}

int main() {
  test_assistant_tools_function(1);
  test_assistant_tools_function(0);

  printf("Hello world \n");
  return 0;
}

#endif // assistant_tools_function_MAIN
#endif // assistant_tools_function_TEST
