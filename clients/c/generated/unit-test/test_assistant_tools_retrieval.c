#ifndef assistant_tools_retrieval_TEST
#define assistant_tools_retrieval_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define assistant_tools_retrieval_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/assistant_tools_retrieval.h"
assistant_tools_retrieval_t* instantiate_assistant_tools_retrieval(int include_optional);



assistant_tools_retrieval_t* instantiate_assistant_tools_retrieval(int include_optional) {
  assistant_tools_retrieval_t* assistant_tools_retrieval = NULL;
  if (include_optional) {
    assistant_tools_retrieval = assistant_tools_retrieval_create(
      openai_api_assistant_tools_retrieval_TYPE_retrieval
    );
  } else {
    assistant_tools_retrieval = assistant_tools_retrieval_create(
      openai_api_assistant_tools_retrieval_TYPE_retrieval
    );
  }

  return assistant_tools_retrieval;
}


#ifdef assistant_tools_retrieval_MAIN

void test_assistant_tools_retrieval(int include_optional) {
    assistant_tools_retrieval_t* assistant_tools_retrieval_1 = instantiate_assistant_tools_retrieval(include_optional);

	cJSON* jsonassistant_tools_retrieval_1 = assistant_tools_retrieval_convertToJSON(assistant_tools_retrieval_1);
	printf("assistant_tools_retrieval :\n%s\n", cJSON_Print(jsonassistant_tools_retrieval_1));
	assistant_tools_retrieval_t* assistant_tools_retrieval_2 = assistant_tools_retrieval_parseFromJSON(jsonassistant_tools_retrieval_1);
	cJSON* jsonassistant_tools_retrieval_2 = assistant_tools_retrieval_convertToJSON(assistant_tools_retrieval_2);
	printf("repeating assistant_tools_retrieval:\n%s\n", cJSON_Print(jsonassistant_tools_retrieval_2));
}

int main() {
  test_assistant_tools_retrieval(1);
  test_assistant_tools_retrieval(0);

  printf("Hello world \n");
  return 0;
}

#endif // assistant_tools_retrieval_MAIN
#endif // assistant_tools_retrieval_TEST
