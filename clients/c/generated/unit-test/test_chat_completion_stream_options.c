#ifndef chat_completion_stream_options_TEST
#define chat_completion_stream_options_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define chat_completion_stream_options_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/chat_completion_stream_options.h"
chat_completion_stream_options_t* instantiate_chat_completion_stream_options(int include_optional);



chat_completion_stream_options_t* instantiate_chat_completion_stream_options(int include_optional) {
  chat_completion_stream_options_t* chat_completion_stream_options = NULL;
  if (include_optional) {
    chat_completion_stream_options = chat_completion_stream_options_create(
      1
    );
  } else {
    chat_completion_stream_options = chat_completion_stream_options_create(
      1
    );
  }

  return chat_completion_stream_options;
}


#ifdef chat_completion_stream_options_MAIN

void test_chat_completion_stream_options(int include_optional) {
    chat_completion_stream_options_t* chat_completion_stream_options_1 = instantiate_chat_completion_stream_options(include_optional);

	cJSON* jsonchat_completion_stream_options_1 = chat_completion_stream_options_convertToJSON(chat_completion_stream_options_1);
	printf("chat_completion_stream_options :\n%s\n", cJSON_Print(jsonchat_completion_stream_options_1));
	chat_completion_stream_options_t* chat_completion_stream_options_2 = chat_completion_stream_options_parseFromJSON(jsonchat_completion_stream_options_1);
	cJSON* jsonchat_completion_stream_options_2 = chat_completion_stream_options_convertToJSON(chat_completion_stream_options_2);
	printf("repeating chat_completion_stream_options:\n%s\n", cJSON_Print(jsonchat_completion_stream_options_2));
}

int main() {
  test_chat_completion_stream_options(1);
  test_chat_completion_stream_options(0);

  printf("Hello world \n");
  return 0;
}

#endif // chat_completion_stream_options_MAIN
#endif // chat_completion_stream_options_TEST
