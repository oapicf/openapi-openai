#ifndef assistant_object_TEST
#define assistant_object_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define assistant_object_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/assistant_object.h"
assistant_object_t* instantiate_assistant_object(int include_optional);



assistant_object_t* instantiate_assistant_object(int include_optional) {
  assistant_object_t* assistant_object = NULL;
  if (include_optional) {
    assistant_object = assistant_object_create(
      "0",
      openai_api_assistant_object_OBJECT_assistant,
      56,
      "0",
      "0",
      "0",
      "0",
      list_createList(),
      list_createList(),
      0
    );
  } else {
    assistant_object = assistant_object_create(
      "0",
      openai_api_assistant_object_OBJECT_assistant,
      56,
      "0",
      "0",
      "0",
      "0",
      list_createList(),
      list_createList(),
      0
    );
  }

  return assistant_object;
}


#ifdef assistant_object_MAIN

void test_assistant_object(int include_optional) {
    assistant_object_t* assistant_object_1 = instantiate_assistant_object(include_optional);

	cJSON* jsonassistant_object_1 = assistant_object_convertToJSON(assistant_object_1);
	printf("assistant_object :\n%s\n", cJSON_Print(jsonassistant_object_1));
	assistant_object_t* assistant_object_2 = assistant_object_parseFromJSON(jsonassistant_object_1);
	cJSON* jsonassistant_object_2 = assistant_object_convertToJSON(assistant_object_2);
	printf("repeating assistant_object:\n%s\n", cJSON_Print(jsonassistant_object_2));
}

int main() {
  test_assistant_object(1);
  test_assistant_object(0);

  printf("Hello world \n");
  return 0;
}

#endif // assistant_object_MAIN
#endif // assistant_object_TEST
