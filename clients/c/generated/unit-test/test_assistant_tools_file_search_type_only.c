#ifndef assistant_tools_file_search_type_only_TEST
#define assistant_tools_file_search_type_only_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define assistant_tools_file_search_type_only_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/assistant_tools_file_search_type_only.h"
assistant_tools_file_search_type_only_t* instantiate_assistant_tools_file_search_type_only(int include_optional);



assistant_tools_file_search_type_only_t* instantiate_assistant_tools_file_search_type_only(int include_optional) {
  assistant_tools_file_search_type_only_t* assistant_tools_file_search_type_only = NULL;
  if (include_optional) {
    assistant_tools_file_search_type_only = assistant_tools_file_search_type_only_create(
      openai_api_assistant_tools_file_search_type_only_TYPE_file_search
    );
  } else {
    assistant_tools_file_search_type_only = assistant_tools_file_search_type_only_create(
      openai_api_assistant_tools_file_search_type_only_TYPE_file_search
    );
  }

  return assistant_tools_file_search_type_only;
}


#ifdef assistant_tools_file_search_type_only_MAIN

void test_assistant_tools_file_search_type_only(int include_optional) {
    assistant_tools_file_search_type_only_t* assistant_tools_file_search_type_only_1 = instantiate_assistant_tools_file_search_type_only(include_optional);

	cJSON* jsonassistant_tools_file_search_type_only_1 = assistant_tools_file_search_type_only_convertToJSON(assistant_tools_file_search_type_only_1);
	printf("assistant_tools_file_search_type_only :\n%s\n", cJSON_Print(jsonassistant_tools_file_search_type_only_1));
	assistant_tools_file_search_type_only_t* assistant_tools_file_search_type_only_2 = assistant_tools_file_search_type_only_parseFromJSON(jsonassistant_tools_file_search_type_only_1);
	cJSON* jsonassistant_tools_file_search_type_only_2 = assistant_tools_file_search_type_only_convertToJSON(assistant_tools_file_search_type_only_2);
	printf("repeating assistant_tools_file_search_type_only:\n%s\n", cJSON_Print(jsonassistant_tools_file_search_type_only_2));
}

int main() {
  test_assistant_tools_file_search_type_only(1);
  test_assistant_tools_file_search_type_only(0);

  printf("Hello world \n");
  return 0;
}

#endif // assistant_tools_file_search_type_only_MAIN
#endif // assistant_tools_file_search_type_only_TEST
