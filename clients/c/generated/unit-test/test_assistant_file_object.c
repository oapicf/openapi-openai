#ifndef assistant_file_object_TEST
#define assistant_file_object_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define assistant_file_object_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/assistant_file_object.h"
assistant_file_object_t* instantiate_assistant_file_object(int include_optional);



assistant_file_object_t* instantiate_assistant_file_object(int include_optional) {
  assistant_file_object_t* assistant_file_object = NULL;
  if (include_optional) {
    assistant_file_object = assistant_file_object_create(
      "0",
      openai_api_assistant_file_object_OBJECT_assistant.file,
      56,
      "0"
    );
  } else {
    assistant_file_object = assistant_file_object_create(
      "0",
      openai_api_assistant_file_object_OBJECT_assistant.file,
      56,
      "0"
    );
  }

  return assistant_file_object;
}


#ifdef assistant_file_object_MAIN

void test_assistant_file_object(int include_optional) {
    assistant_file_object_t* assistant_file_object_1 = instantiate_assistant_file_object(include_optional);

	cJSON* jsonassistant_file_object_1 = assistant_file_object_convertToJSON(assistant_file_object_1);
	printf("assistant_file_object :\n%s\n", cJSON_Print(jsonassistant_file_object_1));
	assistant_file_object_t* assistant_file_object_2 = assistant_file_object_parseFromJSON(jsonassistant_file_object_1);
	cJSON* jsonassistant_file_object_2 = assistant_file_object_convertToJSON(assistant_file_object_2);
	printf("repeating assistant_file_object:\n%s\n", cJSON_Print(jsonassistant_file_object_2));
}

int main() {
  test_assistant_file_object(1);
  test_assistant_file_object(0);

  printf("Hello world \n");
  return 0;
}

#endif // assistant_file_object_MAIN
#endif // assistant_file_object_TEST
