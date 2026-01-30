#ifndef assistants_api_response_format_option_TEST
#define assistants_api_response_format_option_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define assistants_api_response_format_option_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/assistants_api_response_format_option.h"
assistants_api_response_format_option_t* instantiate_assistants_api_response_format_option(int include_optional);

#include "test_response_format_json_schema_json_schema.c"


assistants_api_response_format_option_t* instantiate_assistants_api_response_format_option(int include_optional) {
  assistants_api_response_format_option_t* assistants_api_response_format_option = NULL;
  if (include_optional) {
    assistants_api_response_format_option = assistants_api_response_format_option_create(
      openai_api_assistants_api_response_format_option_TYPE_text,
       // false, not to have infinite recursion
      instantiate_response_format_json_schema_json_schema(0)
    );
  } else {
    assistants_api_response_format_option = assistants_api_response_format_option_create(
      openai_api_assistants_api_response_format_option_TYPE_text,
      NULL
    );
  }

  return assistants_api_response_format_option;
}


#ifdef assistants_api_response_format_option_MAIN

void test_assistants_api_response_format_option(int include_optional) {
    assistants_api_response_format_option_t* assistants_api_response_format_option_1 = instantiate_assistants_api_response_format_option(include_optional);

	cJSON* jsonassistants_api_response_format_option_1 = assistants_api_response_format_option_convertToJSON(assistants_api_response_format_option_1);
	printf("assistants_api_response_format_option :\n%s\n", cJSON_Print(jsonassistants_api_response_format_option_1));
	assistants_api_response_format_option_t* assistants_api_response_format_option_2 = assistants_api_response_format_option_parseFromJSON(jsonassistants_api_response_format_option_1);
	cJSON* jsonassistants_api_response_format_option_2 = assistants_api_response_format_option_convertToJSON(assistants_api_response_format_option_2);
	printf("repeating assistants_api_response_format_option:\n%s\n", cJSON_Print(jsonassistants_api_response_format_option_2));
}

int main() {
  test_assistants_api_response_format_option(1);
  test_assistants_api_response_format_option(0);

  printf("Hello world \n");
  return 0;
}

#endif // assistants_api_response_format_option_MAIN
#endif // assistants_api_response_format_option_TEST
