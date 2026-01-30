#ifndef chat_completion_response_message_audio_TEST
#define chat_completion_response_message_audio_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define chat_completion_response_message_audio_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/chat_completion_response_message_audio.h"
chat_completion_response_message_audio_t* instantiate_chat_completion_response_message_audio(int include_optional);



chat_completion_response_message_audio_t* instantiate_chat_completion_response_message_audio(int include_optional) {
  chat_completion_response_message_audio_t* chat_completion_response_message_audio = NULL;
  if (include_optional) {
    chat_completion_response_message_audio = chat_completion_response_message_audio_create(
      "0",
      56,
      "0",
      "0"
    );
  } else {
    chat_completion_response_message_audio = chat_completion_response_message_audio_create(
      "0",
      56,
      "0",
      "0"
    );
  }

  return chat_completion_response_message_audio;
}


#ifdef chat_completion_response_message_audio_MAIN

void test_chat_completion_response_message_audio(int include_optional) {
    chat_completion_response_message_audio_t* chat_completion_response_message_audio_1 = instantiate_chat_completion_response_message_audio(include_optional);

	cJSON* jsonchat_completion_response_message_audio_1 = chat_completion_response_message_audio_convertToJSON(chat_completion_response_message_audio_1);
	printf("chat_completion_response_message_audio :\n%s\n", cJSON_Print(jsonchat_completion_response_message_audio_1));
	chat_completion_response_message_audio_t* chat_completion_response_message_audio_2 = chat_completion_response_message_audio_parseFromJSON(jsonchat_completion_response_message_audio_1);
	cJSON* jsonchat_completion_response_message_audio_2 = chat_completion_response_message_audio_convertToJSON(chat_completion_response_message_audio_2);
	printf("repeating chat_completion_response_message_audio:\n%s\n", cJSON_Print(jsonchat_completion_response_message_audio_2));
}

int main() {
  test_chat_completion_response_message_audio(1);
  test_chat_completion_response_message_audio(0);

  printf("Hello world \n");
  return 0;
}

#endif // chat_completion_response_message_audio_MAIN
#endif // chat_completion_response_message_audio_TEST
