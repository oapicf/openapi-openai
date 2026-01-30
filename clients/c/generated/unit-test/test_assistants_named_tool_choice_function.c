#ifndef assistants_named_tool_choice_function_TEST
#define assistants_named_tool_choice_function_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define assistants_named_tool_choice_function_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/assistants_named_tool_choice_function.h"
assistants_named_tool_choice_function_t* instantiate_assistants_named_tool_choice_function(int include_optional);



assistants_named_tool_choice_function_t* instantiate_assistants_named_tool_choice_function(int include_optional) {
  assistants_named_tool_choice_function_t* assistants_named_tool_choice_function = NULL;
  if (include_optional) {
    assistants_named_tool_choice_function = assistants_named_tool_choice_function_create(
      "0"
    );
  } else {
    assistants_named_tool_choice_function = assistants_named_tool_choice_function_create(
      "0"
    );
  }

  return assistants_named_tool_choice_function;
}


#ifdef assistants_named_tool_choice_function_MAIN

void test_assistants_named_tool_choice_function(int include_optional) {
    assistants_named_tool_choice_function_t* assistants_named_tool_choice_function_1 = instantiate_assistants_named_tool_choice_function(include_optional);

	cJSON* jsonassistants_named_tool_choice_function_1 = assistants_named_tool_choice_function_convertToJSON(assistants_named_tool_choice_function_1);
	printf("assistants_named_tool_choice_function :\n%s\n", cJSON_Print(jsonassistants_named_tool_choice_function_1));
	assistants_named_tool_choice_function_t* assistants_named_tool_choice_function_2 = assistants_named_tool_choice_function_parseFromJSON(jsonassistants_named_tool_choice_function_1);
	cJSON* jsonassistants_named_tool_choice_function_2 = assistants_named_tool_choice_function_convertToJSON(assistants_named_tool_choice_function_2);
	printf("repeating assistants_named_tool_choice_function:\n%s\n", cJSON_Print(jsonassistants_named_tool_choice_function_2));
}

int main() {
  test_assistants_named_tool_choice_function(1);
  test_assistants_named_tool_choice_function(0);

  printf("Hello world \n");
  return 0;
}

#endif // assistants_named_tool_choice_function_MAIN
#endif // assistants_named_tool_choice_function_TEST
