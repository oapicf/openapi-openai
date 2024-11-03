#ifndef create_speech_request_TEST
#define create_speech_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_speech_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_speech_request.h"
create_speech_request_t* instantiate_create_speech_request(int include_optional);

#include "test_create_speech_request_model.c"


create_speech_request_t* instantiate_create_speech_request(int include_optional) {
  create_speech_request_t* create_speech_request = NULL;
  if (include_optional) {
    create_speech_request = create_speech_request_create(
      null,
      "0",
      openai_api_create_speech_request_VOICE_alloy,
      openai_api_create_speech_request_RESPONSEFORMAT_"mp3",
      0.25
    );
  } else {
    create_speech_request = create_speech_request_create(
      null,
      "0",
      openai_api_create_speech_request_VOICE_alloy,
      openai_api_create_speech_request_RESPONSEFORMAT_"mp3",
      0.25
    );
  }

  return create_speech_request;
}


#ifdef create_speech_request_MAIN

void test_create_speech_request(int include_optional) {
    create_speech_request_t* create_speech_request_1 = instantiate_create_speech_request(include_optional);

	cJSON* jsoncreate_speech_request_1 = create_speech_request_convertToJSON(create_speech_request_1);
	printf("create_speech_request :\n%s\n", cJSON_Print(jsoncreate_speech_request_1));
	create_speech_request_t* create_speech_request_2 = create_speech_request_parseFromJSON(jsoncreate_speech_request_1);
	cJSON* jsoncreate_speech_request_2 = create_speech_request_convertToJSON(create_speech_request_2);
	printf("repeating create_speech_request:\n%s\n", cJSON_Print(jsoncreate_speech_request_2));
}

int main() {
  test_create_speech_request(1);
  test_create_speech_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_speech_request_MAIN
#endif // create_speech_request_TEST
