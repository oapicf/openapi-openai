#ifndef realtime_response_create_params_tools_inner_TEST
#define realtime_response_create_params_tools_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define realtime_response_create_params_tools_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/realtime_response_create_params_tools_inner.h"
realtime_response_create_params_tools_inner_t* instantiate_realtime_response_create_params_tools_inner(int include_optional);



realtime_response_create_params_tools_inner_t* instantiate_realtime_response_create_params_tools_inner(int include_optional) {
  realtime_response_create_params_tools_inner_t* realtime_response_create_params_tools_inner = NULL;
  if (include_optional) {
    realtime_response_create_params_tools_inner = realtime_response_create_params_tools_inner_create(
      openai_api_realtime_response_create_params_tools_inner_TYPE_function,
      "0",
      "0",
      0
    );
  } else {
    realtime_response_create_params_tools_inner = realtime_response_create_params_tools_inner_create(
      openai_api_realtime_response_create_params_tools_inner_TYPE_function,
      "0",
      "0",
      0
    );
  }

  return realtime_response_create_params_tools_inner;
}


#ifdef realtime_response_create_params_tools_inner_MAIN

void test_realtime_response_create_params_tools_inner(int include_optional) {
    realtime_response_create_params_tools_inner_t* realtime_response_create_params_tools_inner_1 = instantiate_realtime_response_create_params_tools_inner(include_optional);

	cJSON* jsonrealtime_response_create_params_tools_inner_1 = realtime_response_create_params_tools_inner_convertToJSON(realtime_response_create_params_tools_inner_1);
	printf("realtime_response_create_params_tools_inner :\n%s\n", cJSON_Print(jsonrealtime_response_create_params_tools_inner_1));
	realtime_response_create_params_tools_inner_t* realtime_response_create_params_tools_inner_2 = realtime_response_create_params_tools_inner_parseFromJSON(jsonrealtime_response_create_params_tools_inner_1);
	cJSON* jsonrealtime_response_create_params_tools_inner_2 = realtime_response_create_params_tools_inner_convertToJSON(realtime_response_create_params_tools_inner_2);
	printf("repeating realtime_response_create_params_tools_inner:\n%s\n", cJSON_Print(jsonrealtime_response_create_params_tools_inner_2));
}

int main() {
  test_realtime_response_create_params_tools_inner(1);
  test_realtime_response_create_params_tools_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // realtime_response_create_params_tools_inner_MAIN
#endif // realtime_response_create_params_tools_inner_TEST
