#ifndef assistant_tools_file_search_TEST
#define assistant_tools_file_search_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define assistant_tools_file_search_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/assistant_tools_file_search.h"
assistant_tools_file_search_t* instantiate_assistant_tools_file_search(int include_optional);

#include "test_assistant_tools_file_search_file_search.c"


assistant_tools_file_search_t* instantiate_assistant_tools_file_search(int include_optional) {
  assistant_tools_file_search_t* assistant_tools_file_search = NULL;
  if (include_optional) {
    assistant_tools_file_search = assistant_tools_file_search_create(
      openai_api_assistant_tools_file_search_TYPE_file_search,
       // false, not to have infinite recursion
      instantiate_assistant_tools_file_search_file_search(0)
    );
  } else {
    assistant_tools_file_search = assistant_tools_file_search_create(
      openai_api_assistant_tools_file_search_TYPE_file_search,
      NULL
    );
  }

  return assistant_tools_file_search;
}


#ifdef assistant_tools_file_search_MAIN

void test_assistant_tools_file_search(int include_optional) {
    assistant_tools_file_search_t* assistant_tools_file_search_1 = instantiate_assistant_tools_file_search(include_optional);

	cJSON* jsonassistant_tools_file_search_1 = assistant_tools_file_search_convertToJSON(assistant_tools_file_search_1);
	printf("assistant_tools_file_search :\n%s\n", cJSON_Print(jsonassistant_tools_file_search_1));
	assistant_tools_file_search_t* assistant_tools_file_search_2 = assistant_tools_file_search_parseFromJSON(jsonassistant_tools_file_search_1);
	cJSON* jsonassistant_tools_file_search_2 = assistant_tools_file_search_convertToJSON(assistant_tools_file_search_2);
	printf("repeating assistant_tools_file_search:\n%s\n", cJSON_Print(jsonassistant_tools_file_search_2));
}

int main() {
  test_assistant_tools_file_search(1);
  test_assistant_tools_file_search(0);

  printf("Hello world \n");
  return 0;
}

#endif // assistant_tools_file_search_MAIN
#endif // assistant_tools_file_search_TEST
