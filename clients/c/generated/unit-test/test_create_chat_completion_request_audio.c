#ifndef create_chat_completion_request_audio_TEST
#define create_chat_completion_request_audio_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_chat_completion_request_audio_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_chat_completion_request_audio.h"
create_chat_completion_request_audio_t* instantiate_create_chat_completion_request_audio(int include_optional);



create_chat_completion_request_audio_t* instantiate_create_chat_completion_request_audio(int include_optional) {
  create_chat_completion_request_audio_t* create_chat_completion_request_audio = NULL;
  if (include_optional) {
    create_chat_completion_request_audio = create_chat_completion_request_audio_create(
      openai_api_create_chat_completion_request_audio_VOICE_alloy,
      openai_api_create_chat_completion_request_audio_FORMAT_wav
    );
  } else {
    create_chat_completion_request_audio = create_chat_completion_request_audio_create(
      openai_api_create_chat_completion_request_audio_VOICE_alloy,
      openai_api_create_chat_completion_request_audio_FORMAT_wav
    );
  }

  return create_chat_completion_request_audio;
}


#ifdef create_chat_completion_request_audio_MAIN

void test_create_chat_completion_request_audio(int include_optional) {
    create_chat_completion_request_audio_t* create_chat_completion_request_audio_1 = instantiate_create_chat_completion_request_audio(include_optional);

	cJSON* jsoncreate_chat_completion_request_audio_1 = create_chat_completion_request_audio_convertToJSON(create_chat_completion_request_audio_1);
	printf("create_chat_completion_request_audio :\n%s\n", cJSON_Print(jsoncreate_chat_completion_request_audio_1));
	create_chat_completion_request_audio_t* create_chat_completion_request_audio_2 = create_chat_completion_request_audio_parseFromJSON(jsoncreate_chat_completion_request_audio_1);
	cJSON* jsoncreate_chat_completion_request_audio_2 = create_chat_completion_request_audio_convertToJSON(create_chat_completion_request_audio_2);
	printf("repeating create_chat_completion_request_audio:\n%s\n", cJSON_Print(jsoncreate_chat_completion_request_audio_2));
}

int main() {
  test_create_chat_completion_request_audio(1);
  test_create_chat_completion_request_audio(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_chat_completion_request_audio_MAIN
#endif // create_chat_completion_request_audio_TEST
