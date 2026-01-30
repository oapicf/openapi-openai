#ifndef realtime_session_create_response_client_secret_TEST
#define realtime_session_create_response_client_secret_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define realtime_session_create_response_client_secret_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/realtime_session_create_response_client_secret.h"
realtime_session_create_response_client_secret_t* instantiate_realtime_session_create_response_client_secret(int include_optional);



realtime_session_create_response_client_secret_t* instantiate_realtime_session_create_response_client_secret(int include_optional) {
  realtime_session_create_response_client_secret_t* realtime_session_create_response_client_secret = NULL;
  if (include_optional) {
    realtime_session_create_response_client_secret = realtime_session_create_response_client_secret_create(
      "0",
      56
    );
  } else {
    realtime_session_create_response_client_secret = realtime_session_create_response_client_secret_create(
      "0",
      56
    );
  }

  return realtime_session_create_response_client_secret;
}


#ifdef realtime_session_create_response_client_secret_MAIN

void test_realtime_session_create_response_client_secret(int include_optional) {
    realtime_session_create_response_client_secret_t* realtime_session_create_response_client_secret_1 = instantiate_realtime_session_create_response_client_secret(include_optional);

	cJSON* jsonrealtime_session_create_response_client_secret_1 = realtime_session_create_response_client_secret_convertToJSON(realtime_session_create_response_client_secret_1);
	printf("realtime_session_create_response_client_secret :\n%s\n", cJSON_Print(jsonrealtime_session_create_response_client_secret_1));
	realtime_session_create_response_client_secret_t* realtime_session_create_response_client_secret_2 = realtime_session_create_response_client_secret_parseFromJSON(jsonrealtime_session_create_response_client_secret_1);
	cJSON* jsonrealtime_session_create_response_client_secret_2 = realtime_session_create_response_client_secret_convertToJSON(realtime_session_create_response_client_secret_2);
	printf("repeating realtime_session_create_response_client_secret:\n%s\n", cJSON_Print(jsonrealtime_session_create_response_client_secret_2));
}

int main() {
  test_realtime_session_create_response_client_secret(1);
  test_realtime_session_create_response_client_secret(0);

  printf("Hello world \n");
  return 0;
}

#endif // realtime_session_create_response_client_secret_MAIN
#endif // realtime_session_create_response_client_secret_TEST
