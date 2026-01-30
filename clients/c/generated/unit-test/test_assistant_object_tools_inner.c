#ifndef assistant_object_tools_inner_TEST
#define assistant_object_tools_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define assistant_object_tools_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/assistant_object_tools_inner.h"
assistant_object_tools_inner_t* instantiate_assistant_object_tools_inner(int include_optional);

#include "test_assistant_tools_file_search_file_search.c"
#include "test_function_object.c"


assistant_object_tools_inner_t* instantiate_assistant_object_tools_inner(int include_optional) {
  assistant_object_tools_inner_t* assistant_object_tools_inner = NULL;
  if (include_optional) {
    assistant_object_tools_inner = assistant_object_tools_inner_create(
      openai_api_assistant_object_tools_inner_TYPE_code_interpreter,
       // false, not to have infinite recursion
      instantiate_assistant_tools_file_search_file_search(0),
       // false, not to have infinite recursion
      instantiate_function_object(0)
    );
  } else {
    assistant_object_tools_inner = assistant_object_tools_inner_create(
      openai_api_assistant_object_tools_inner_TYPE_code_interpreter,
      NULL,
      NULL
    );
  }

  return assistant_object_tools_inner;
}


#ifdef assistant_object_tools_inner_MAIN

void test_assistant_object_tools_inner(int include_optional) {
    assistant_object_tools_inner_t* assistant_object_tools_inner_1 = instantiate_assistant_object_tools_inner(include_optional);

	cJSON* jsonassistant_object_tools_inner_1 = assistant_object_tools_inner_convertToJSON(assistant_object_tools_inner_1);
	printf("assistant_object_tools_inner :\n%s\n", cJSON_Print(jsonassistant_object_tools_inner_1));
	assistant_object_tools_inner_t* assistant_object_tools_inner_2 = assistant_object_tools_inner_parseFromJSON(jsonassistant_object_tools_inner_1);
	cJSON* jsonassistant_object_tools_inner_2 = assistant_object_tools_inner_convertToJSON(assistant_object_tools_inner_2);
	printf("repeating assistant_object_tools_inner:\n%s\n", cJSON_Print(jsonassistant_object_tools_inner_2));
}

int main() {
  test_assistant_object_tools_inner(1);
  test_assistant_object_tools_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // assistant_object_tools_inner_MAIN
#endif // assistant_object_tools_inner_TEST
