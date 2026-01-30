#ifndef assistant_object_tool_resources_file_search_TEST
#define assistant_object_tool_resources_file_search_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define assistant_object_tool_resources_file_search_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/assistant_object_tool_resources_file_search.h"
assistant_object_tool_resources_file_search_t* instantiate_assistant_object_tool_resources_file_search(int include_optional);



assistant_object_tool_resources_file_search_t* instantiate_assistant_object_tool_resources_file_search(int include_optional) {
  assistant_object_tool_resources_file_search_t* assistant_object_tool_resources_file_search = NULL;
  if (include_optional) {
    assistant_object_tool_resources_file_search = assistant_object_tool_resources_file_search_create(
      list_createList()
    );
  } else {
    assistant_object_tool_resources_file_search = assistant_object_tool_resources_file_search_create(
      list_createList()
    );
  }

  return assistant_object_tool_resources_file_search;
}


#ifdef assistant_object_tool_resources_file_search_MAIN

void test_assistant_object_tool_resources_file_search(int include_optional) {
    assistant_object_tool_resources_file_search_t* assistant_object_tool_resources_file_search_1 = instantiate_assistant_object_tool_resources_file_search(include_optional);

	cJSON* jsonassistant_object_tool_resources_file_search_1 = assistant_object_tool_resources_file_search_convertToJSON(assistant_object_tool_resources_file_search_1);
	printf("assistant_object_tool_resources_file_search :\n%s\n", cJSON_Print(jsonassistant_object_tool_resources_file_search_1));
	assistant_object_tool_resources_file_search_t* assistant_object_tool_resources_file_search_2 = assistant_object_tool_resources_file_search_parseFromJSON(jsonassistant_object_tool_resources_file_search_1);
	cJSON* jsonassistant_object_tool_resources_file_search_2 = assistant_object_tool_resources_file_search_convertToJSON(assistant_object_tool_resources_file_search_2);
	printf("repeating assistant_object_tool_resources_file_search:\n%s\n", cJSON_Print(jsonassistant_object_tool_resources_file_search_2));
}

int main() {
  test_assistant_object_tool_resources_file_search(1);
  test_assistant_object_tool_resources_file_search(0);

  printf("Hello world \n");
  return 0;
}

#endif // assistant_object_tool_resources_file_search_MAIN
#endif // assistant_object_tool_resources_file_search_TEST
