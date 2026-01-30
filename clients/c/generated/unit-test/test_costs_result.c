#ifndef costs_result_TEST
#define costs_result_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define costs_result_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/costs_result.h"
costs_result_t* instantiate_costs_result(int include_optional);

#include "test_costs_result_amount.c"


costs_result_t* instantiate_costs_result(int include_optional) {
  costs_result_t* costs_result = NULL;
  if (include_optional) {
    costs_result = costs_result_create(
      openai_api_costs_result_OBJECT_organization.costs.result,
       // false, not to have infinite recursion
      instantiate_costs_result_amount(0),
      "0",
      "0"
    );
  } else {
    costs_result = costs_result_create(
      openai_api_costs_result_OBJECT_organization.costs.result,
      NULL,
      "0",
      "0"
    );
  }

  return costs_result;
}


#ifdef costs_result_MAIN

void test_costs_result(int include_optional) {
    costs_result_t* costs_result_1 = instantiate_costs_result(include_optional);

	cJSON* jsoncosts_result_1 = costs_result_convertToJSON(costs_result_1);
	printf("costs_result :\n%s\n", cJSON_Print(jsoncosts_result_1));
	costs_result_t* costs_result_2 = costs_result_parseFromJSON(jsoncosts_result_1);
	cJSON* jsoncosts_result_2 = costs_result_convertToJSON(costs_result_2);
	printf("repeating costs_result:\n%s\n", cJSON_Print(jsoncosts_result_2));
}

int main() {
  test_costs_result(1);
  test_costs_result(0);

  printf("Hello world \n");
  return 0;
}

#endif // costs_result_MAIN
#endif // costs_result_TEST
