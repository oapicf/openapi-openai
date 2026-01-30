#ifndef fine_tune_chat_request_input_TEST
#define fine_tune_chat_request_input_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define fine_tune_chat_request_input_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/fine_tune_chat_request_input.h"
fine_tune_chat_request_input_t* instantiate_fine_tune_chat_request_input(int include_optional);



fine_tune_chat_request_input_t* instantiate_fine_tune_chat_request_input(int include_optional) {
  fine_tune_chat_request_input_t* fine_tune_chat_request_input = NULL;
  if (include_optional) {
    fine_tune_chat_request_input = fine_tune_chat_request_input_create(
      list_createList(),
      list_createList(),
      1,
      list_createList()
    );
  } else {
    fine_tune_chat_request_input = fine_tune_chat_request_input_create(
      list_createList(),
      list_createList(),
      1,
      list_createList()
    );
  }

  return fine_tune_chat_request_input;
}


#ifdef fine_tune_chat_request_input_MAIN

void test_fine_tune_chat_request_input(int include_optional) {
    fine_tune_chat_request_input_t* fine_tune_chat_request_input_1 = instantiate_fine_tune_chat_request_input(include_optional);

	cJSON* jsonfine_tune_chat_request_input_1 = fine_tune_chat_request_input_convertToJSON(fine_tune_chat_request_input_1);
	printf("fine_tune_chat_request_input :\n%s\n", cJSON_Print(jsonfine_tune_chat_request_input_1));
	fine_tune_chat_request_input_t* fine_tune_chat_request_input_2 = fine_tune_chat_request_input_parseFromJSON(jsonfine_tune_chat_request_input_1);
	cJSON* jsonfine_tune_chat_request_input_2 = fine_tune_chat_request_input_convertToJSON(fine_tune_chat_request_input_2);
	printf("repeating fine_tune_chat_request_input:\n%s\n", cJSON_Print(jsonfine_tune_chat_request_input_2));
}

int main() {
  test_fine_tune_chat_request_input(1);
  test_fine_tune_chat_request_input(0);

  printf("Hello world \n");
  return 0;
}

#endif // fine_tune_chat_request_input_MAIN
#endif // fine_tune_chat_request_input_TEST
