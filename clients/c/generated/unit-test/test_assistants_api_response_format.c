#ifndef assistants_api_response_format_TEST
#define assistants_api_response_format_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define assistants_api_response_format_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/assistants_api_response_format.h"
assistants_api_response_format_t* instantiate_assistants_api_response_format(int include_optional);



assistants_api_response_format_t* instantiate_assistants_api_response_format(int include_optional) {
  assistants_api_response_format_t* assistants_api_response_format = NULL;
  if (include_optional) {
    assistants_api_response_format = assistants_api_response_format_create(
      openai_api_assistants_api_response_format_TYPE_"text"
    );
  } else {
    assistants_api_response_format = assistants_api_response_format_create(
      openai_api_assistants_api_response_format_TYPE_"text"
    );
  }

  return assistants_api_response_format;
}


#ifdef assistants_api_response_format_MAIN

void test_assistants_api_response_format(int include_optional) {
    assistants_api_response_format_t* assistants_api_response_format_1 = instantiate_assistants_api_response_format(include_optional);

	cJSON* jsonassistants_api_response_format_1 = assistants_api_response_format_convertToJSON(assistants_api_response_format_1);
	printf("assistants_api_response_format :\n%s\n", cJSON_Print(jsonassistants_api_response_format_1));
	assistants_api_response_format_t* assistants_api_response_format_2 = assistants_api_response_format_parseFromJSON(jsonassistants_api_response_format_1);
	cJSON* jsonassistants_api_response_format_2 = assistants_api_response_format_convertToJSON(assistants_api_response_format_2);
	printf("repeating assistants_api_response_format:\n%s\n", cJSON_Print(jsonassistants_api_response_format_2));
}

int main() {
  test_assistants_api_response_format(1);
  test_assistants_api_response_format(0);

  printf("Hello world \n");
  return 0;
}

#endif // assistants_api_response_format_MAIN
#endif // assistants_api_response_format_TEST
