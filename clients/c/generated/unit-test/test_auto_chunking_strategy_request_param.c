#ifndef auto_chunking_strategy_request_param_TEST
#define auto_chunking_strategy_request_param_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define auto_chunking_strategy_request_param_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/auto_chunking_strategy_request_param.h"
auto_chunking_strategy_request_param_t* instantiate_auto_chunking_strategy_request_param(int include_optional);



auto_chunking_strategy_request_param_t* instantiate_auto_chunking_strategy_request_param(int include_optional) {
  auto_chunking_strategy_request_param_t* auto_chunking_strategy_request_param = NULL;
  if (include_optional) {
    auto_chunking_strategy_request_param = auto_chunking_strategy_request_param_create(
      openai_api_auto_chunking_strategy_request_param_TYPE_auto
    );
  } else {
    auto_chunking_strategy_request_param = auto_chunking_strategy_request_param_create(
      openai_api_auto_chunking_strategy_request_param_TYPE_auto
    );
  }

  return auto_chunking_strategy_request_param;
}


#ifdef auto_chunking_strategy_request_param_MAIN

void test_auto_chunking_strategy_request_param(int include_optional) {
    auto_chunking_strategy_request_param_t* auto_chunking_strategy_request_param_1 = instantiate_auto_chunking_strategy_request_param(include_optional);

	cJSON* jsonauto_chunking_strategy_request_param_1 = auto_chunking_strategy_request_param_convertToJSON(auto_chunking_strategy_request_param_1);
	printf("auto_chunking_strategy_request_param :\n%s\n", cJSON_Print(jsonauto_chunking_strategy_request_param_1));
	auto_chunking_strategy_request_param_t* auto_chunking_strategy_request_param_2 = auto_chunking_strategy_request_param_parseFromJSON(jsonauto_chunking_strategy_request_param_1);
	cJSON* jsonauto_chunking_strategy_request_param_2 = auto_chunking_strategy_request_param_convertToJSON(auto_chunking_strategy_request_param_2);
	printf("repeating auto_chunking_strategy_request_param:\n%s\n", cJSON_Print(jsonauto_chunking_strategy_request_param_2));
}

int main() {
  test_auto_chunking_strategy_request_param(1);
  test_auto_chunking_strategy_request_param(0);

  printf("Hello world \n");
  return 0;
}

#endif // auto_chunking_strategy_request_param_MAIN
#endif // auto_chunking_strategy_request_param_TEST
