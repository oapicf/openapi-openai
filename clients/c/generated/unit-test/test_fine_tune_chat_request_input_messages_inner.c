#ifndef fine_tune_chat_request_input_messages_inner_TEST
#define fine_tune_chat_request_input_messages_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define fine_tune_chat_request_input_messages_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/fine_tune_chat_request_input_messages_inner.h"
fine_tune_chat_request_input_messages_inner_t* instantiate_fine_tune_chat_request_input_messages_inner(int include_optional);

#include "test_chat_completion_request_assistant_message_audio.c"
#include "test_chat_completion_request_assistant_message_function_call.c"


fine_tune_chat_request_input_messages_inner_t* instantiate_fine_tune_chat_request_input_messages_inner(int include_optional) {
  fine_tune_chat_request_input_messages_inner_t* fine_tune_chat_request_input_messages_inner = NULL;
  if (include_optional) {
    fine_tune_chat_request_input_messages_inner = fine_tune_chat_request_input_messages_inner_create(
      "0",
      openai_api_fine_tune_chat_request_input_messages_inner_ROLE_function,
      "0",
      openai_api_fine_tune_chat_request_input_messages_inner_WEIGHT_0,
      "0",
       // false, not to have infinite recursion
      instantiate_chat_completion_request_assistant_message_audio(0),
      list_createList(),
       // false, not to have infinite recursion
      instantiate_chat_completion_request_assistant_message_function_call(0),
      "0"
    );
  } else {
    fine_tune_chat_request_input_messages_inner = fine_tune_chat_request_input_messages_inner_create(
      "0",
      openai_api_fine_tune_chat_request_input_messages_inner_ROLE_function,
      "0",
      openai_api_fine_tune_chat_request_input_messages_inner_WEIGHT_0,
      "0",
      NULL,
      list_createList(),
      NULL,
      "0"
    );
  }

  return fine_tune_chat_request_input_messages_inner;
}


#ifdef fine_tune_chat_request_input_messages_inner_MAIN

void test_fine_tune_chat_request_input_messages_inner(int include_optional) {
    fine_tune_chat_request_input_messages_inner_t* fine_tune_chat_request_input_messages_inner_1 = instantiate_fine_tune_chat_request_input_messages_inner(include_optional);

	cJSON* jsonfine_tune_chat_request_input_messages_inner_1 = fine_tune_chat_request_input_messages_inner_convertToJSON(fine_tune_chat_request_input_messages_inner_1);
	printf("fine_tune_chat_request_input_messages_inner :\n%s\n", cJSON_Print(jsonfine_tune_chat_request_input_messages_inner_1));
	fine_tune_chat_request_input_messages_inner_t* fine_tune_chat_request_input_messages_inner_2 = fine_tune_chat_request_input_messages_inner_parseFromJSON(jsonfine_tune_chat_request_input_messages_inner_1);
	cJSON* jsonfine_tune_chat_request_input_messages_inner_2 = fine_tune_chat_request_input_messages_inner_convertToJSON(fine_tune_chat_request_input_messages_inner_2);
	printf("repeating fine_tune_chat_request_input_messages_inner:\n%s\n", cJSON_Print(jsonfine_tune_chat_request_input_messages_inner_2));
}

int main() {
  test_fine_tune_chat_request_input_messages_inner(1);
  test_fine_tune_chat_request_input_messages_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // fine_tune_chat_request_input_messages_inner_MAIN
#endif // fine_tune_chat_request_input_messages_inner_TEST
