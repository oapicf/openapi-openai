#ifndef realtime_response_create_params_TEST
#define realtime_response_create_params_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define realtime_response_create_params_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/realtime_response_create_params.h"
realtime_response_create_params_t* instantiate_realtime_response_create_params(int include_optional);

#include "test_realtime_response_create_params_max_response_output_tokens.c"
#include "test_realtime_response_create_params_conversation.c"


realtime_response_create_params_t* instantiate_realtime_response_create_params(int include_optional) {
  realtime_response_create_params_t* realtime_response_create_params = NULL;
  if (include_optional) {
    realtime_response_create_params = realtime_response_create_params_create(
      list_createList(),
      "0",
      openai_api_realtime_response_create_params_VOICE_alloy,
      openai_api_realtime_response_create_params_OUTPUTAUDIOFORMAT_pcm16,
      list_createList(),
      "0",
      1.337,
      null,
      null,
      0,
      list_createList()
    );
  } else {
    realtime_response_create_params = realtime_response_create_params_create(
      list_createList(),
      "0",
      openai_api_realtime_response_create_params_VOICE_alloy,
      openai_api_realtime_response_create_params_OUTPUTAUDIOFORMAT_pcm16,
      list_createList(),
      "0",
      1.337,
      null,
      null,
      0,
      list_createList()
    );
  }

  return realtime_response_create_params;
}


#ifdef realtime_response_create_params_MAIN

void test_realtime_response_create_params(int include_optional) {
    realtime_response_create_params_t* realtime_response_create_params_1 = instantiate_realtime_response_create_params(include_optional);

	cJSON* jsonrealtime_response_create_params_1 = realtime_response_create_params_convertToJSON(realtime_response_create_params_1);
	printf("realtime_response_create_params :\n%s\n", cJSON_Print(jsonrealtime_response_create_params_1));
	realtime_response_create_params_t* realtime_response_create_params_2 = realtime_response_create_params_parseFromJSON(jsonrealtime_response_create_params_1);
	cJSON* jsonrealtime_response_create_params_2 = realtime_response_create_params_convertToJSON(realtime_response_create_params_2);
	printf("repeating realtime_response_create_params:\n%s\n", cJSON_Print(jsonrealtime_response_create_params_2));
}

int main() {
  test_realtime_response_create_params(1);
  test_realtime_response_create_params(0);

  printf("Hello world \n");
  return 0;
}

#endif // realtime_response_create_params_MAIN
#endif // realtime_response_create_params_TEST
