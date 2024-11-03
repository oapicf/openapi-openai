#ifndef assistants_api_named_tool_choice_TEST
#define assistants_api_named_tool_choice_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define assistants_api_named_tool_choice_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/assistants_api_named_tool_choice.h"
assistants_api_named_tool_choice_t* instantiate_assistants_api_named_tool_choice(int include_optional);

#include "test_chat_completion_named_tool_choice_function.c"


assistants_api_named_tool_choice_t* instantiate_assistants_api_named_tool_choice(int include_optional) {
  assistants_api_named_tool_choice_t* assistants_api_named_tool_choice = NULL;
  if (include_optional) {
    assistants_api_named_tool_choice = assistants_api_named_tool_choice_create(
      openai_api_assistants_api_named_tool_choice_TYPE_function,
       // false, not to have infinite recursion
      instantiate_chat_completion_named_tool_choice_function(0)
    );
  } else {
    assistants_api_named_tool_choice = assistants_api_named_tool_choice_create(
      openai_api_assistants_api_named_tool_choice_TYPE_function,
      NULL
    );
  }

  return assistants_api_named_tool_choice;
}


#ifdef assistants_api_named_tool_choice_MAIN

void test_assistants_api_named_tool_choice(int include_optional) {
    assistants_api_named_tool_choice_t* assistants_api_named_tool_choice_1 = instantiate_assistants_api_named_tool_choice(include_optional);

	cJSON* jsonassistants_api_named_tool_choice_1 = assistants_api_named_tool_choice_convertToJSON(assistants_api_named_tool_choice_1);
	printf("assistants_api_named_tool_choice :\n%s\n", cJSON_Print(jsonassistants_api_named_tool_choice_1));
	assistants_api_named_tool_choice_t* assistants_api_named_tool_choice_2 = assistants_api_named_tool_choice_parseFromJSON(jsonassistants_api_named_tool_choice_1);
	cJSON* jsonassistants_api_named_tool_choice_2 = assistants_api_named_tool_choice_convertToJSON(assistants_api_named_tool_choice_2);
	printf("repeating assistants_api_named_tool_choice:\n%s\n", cJSON_Print(jsonassistants_api_named_tool_choice_2));
}

int main() {
  test_assistants_api_named_tool_choice(1);
  test_assistants_api_named_tool_choice(0);

  printf("Hello world \n");
  return 0;
}

#endif // assistants_api_named_tool_choice_MAIN
#endif // assistants_api_named_tool_choice_TEST
