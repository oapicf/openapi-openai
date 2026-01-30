#ifndef fine_tune_chat_completion_request_assistant_message_TEST
#define fine_tune_chat_completion_request_assistant_message_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define fine_tune_chat_completion_request_assistant_message_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/fine_tune_chat_completion_request_assistant_message.h"
fine_tune_chat_completion_request_assistant_message_t* instantiate_fine_tune_chat_completion_request_assistant_message(int include_optional);

#include "test_chat_completion_request_assistant_message_content.c"
#include "test_chat_completion_request_assistant_message_audio.c"
#include "test_chat_completion_request_assistant_message_function_call.c"


fine_tune_chat_completion_request_assistant_message_t* instantiate_fine_tune_chat_completion_request_assistant_message(int include_optional) {
  fine_tune_chat_completion_request_assistant_message_t* fine_tune_chat_completion_request_assistant_message = NULL;
  if (include_optional) {
    fine_tune_chat_completion_request_assistant_message = fine_tune_chat_completion_request_assistant_message_create(
      null,
      "0",
      openai_api_fine_tune_chat_completion_request_assistant_message_ROLE_assistant,
      "0",
       // false, not to have infinite recursion
      instantiate_chat_completion_request_assistant_message_audio(0),
      list_createList(),
       // false, not to have infinite recursion
      instantiate_chat_completion_request_assistant_message_function_call(0),
      openai_api_fine_tune_chat_completion_request_assistant_message_WEIGHT_0
    );
  } else {
    fine_tune_chat_completion_request_assistant_message = fine_tune_chat_completion_request_assistant_message_create(
      null,
      "0",
      openai_api_fine_tune_chat_completion_request_assistant_message_ROLE_assistant,
      "0",
      NULL,
      list_createList(),
      NULL,
      openai_api_fine_tune_chat_completion_request_assistant_message_WEIGHT_0
    );
  }

  return fine_tune_chat_completion_request_assistant_message;
}


#ifdef fine_tune_chat_completion_request_assistant_message_MAIN

void test_fine_tune_chat_completion_request_assistant_message(int include_optional) {
    fine_tune_chat_completion_request_assistant_message_t* fine_tune_chat_completion_request_assistant_message_1 = instantiate_fine_tune_chat_completion_request_assistant_message(include_optional);

	cJSON* jsonfine_tune_chat_completion_request_assistant_message_1 = fine_tune_chat_completion_request_assistant_message_convertToJSON(fine_tune_chat_completion_request_assistant_message_1);
	printf("fine_tune_chat_completion_request_assistant_message :\n%s\n", cJSON_Print(jsonfine_tune_chat_completion_request_assistant_message_1));
	fine_tune_chat_completion_request_assistant_message_t* fine_tune_chat_completion_request_assistant_message_2 = fine_tune_chat_completion_request_assistant_message_parseFromJSON(jsonfine_tune_chat_completion_request_assistant_message_1);
	cJSON* jsonfine_tune_chat_completion_request_assistant_message_2 = fine_tune_chat_completion_request_assistant_message_convertToJSON(fine_tune_chat_completion_request_assistant_message_2);
	printf("repeating fine_tune_chat_completion_request_assistant_message:\n%s\n", cJSON_Print(jsonfine_tune_chat_completion_request_assistant_message_2));
}

int main() {
  test_fine_tune_chat_completion_request_assistant_message(1);
  test_fine_tune_chat_completion_request_assistant_message(0);

  printf("Hello world \n");
  return 0;
}

#endif // fine_tune_chat_completion_request_assistant_message_MAIN
#endif // fine_tune_chat_completion_request_assistant_message_TEST
