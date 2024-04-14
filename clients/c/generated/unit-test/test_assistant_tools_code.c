#ifndef assistant_tools_code_TEST
#define assistant_tools_code_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define assistant_tools_code_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/assistant_tools_code.h"
assistant_tools_code_t* instantiate_assistant_tools_code(int include_optional);



assistant_tools_code_t* instantiate_assistant_tools_code(int include_optional) {
  assistant_tools_code_t* assistant_tools_code = NULL;
  if (include_optional) {
    assistant_tools_code = assistant_tools_code_create(
      openai_api_assistant_tools_code_TYPE_code_interpreter
    );
  } else {
    assistant_tools_code = assistant_tools_code_create(
      openai_api_assistant_tools_code_TYPE_code_interpreter
    );
  }

  return assistant_tools_code;
}


#ifdef assistant_tools_code_MAIN

void test_assistant_tools_code(int include_optional) {
    assistant_tools_code_t* assistant_tools_code_1 = instantiate_assistant_tools_code(include_optional);

	cJSON* jsonassistant_tools_code_1 = assistant_tools_code_convertToJSON(assistant_tools_code_1);
	printf("assistant_tools_code :\n%s\n", cJSON_Print(jsonassistant_tools_code_1));
	assistant_tools_code_t* assistant_tools_code_2 = assistant_tools_code_parseFromJSON(jsonassistant_tools_code_1);
	cJSON* jsonassistant_tools_code_2 = assistant_tools_code_convertToJSON(assistant_tools_code_2);
	printf("repeating assistant_tools_code:\n%s\n", cJSON_Print(jsonassistant_tools_code_2));
}

int main() {
  test_assistant_tools_code(1);
  test_assistant_tools_code(0);

  printf("Hello world \n");
  return 0;
}

#endif // assistant_tools_code_MAIN
#endif // assistant_tools_code_TEST
