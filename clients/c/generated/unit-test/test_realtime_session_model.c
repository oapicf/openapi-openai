#ifndef realtime_session_model_TEST
#define realtime_session_model_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define realtime_session_model_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/realtime_session_model.h"
realtime_session_model_t* instantiate_realtime_session_model(int include_optional);



realtime_session_model_t* instantiate_realtime_session_model(int include_optional) {
  realtime_session_model_t* realtime_session_model = NULL;
  if (include_optional) {
    realtime_session_model = realtime_session_model_create(
    );
  } else {
    realtime_session_model = realtime_session_model_create(
    );
  }

  return realtime_session_model;
}


#ifdef realtime_session_model_MAIN

void test_realtime_session_model(int include_optional) {
    realtime_session_model_t* realtime_session_model_1 = instantiate_realtime_session_model(include_optional);

	cJSON* jsonrealtime_session_model_1 = realtime_session_model_convertToJSON(realtime_session_model_1);
	printf("realtime_session_model :\n%s\n", cJSON_Print(jsonrealtime_session_model_1));
	realtime_session_model_t* realtime_session_model_2 = realtime_session_model_parseFromJSON(jsonrealtime_session_model_1);
	cJSON* jsonrealtime_session_model_2 = realtime_session_model_convertToJSON(realtime_session_model_2);
	printf("repeating realtime_session_model:\n%s\n", cJSON_Print(jsonrealtime_session_model_2));
}

int main() {
  test_realtime_session_model(1);
  test_realtime_session_model(0);

  printf("Hello world \n");
  return 0;
}

#endif // realtime_session_model_MAIN
#endif // realtime_session_model_TEST
