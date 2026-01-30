#ifndef usage_code_interpreter_sessions_result_TEST
#define usage_code_interpreter_sessions_result_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define usage_code_interpreter_sessions_result_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/usage_code_interpreter_sessions_result.h"
usage_code_interpreter_sessions_result_t* instantiate_usage_code_interpreter_sessions_result(int include_optional);



usage_code_interpreter_sessions_result_t* instantiate_usage_code_interpreter_sessions_result(int include_optional) {
  usage_code_interpreter_sessions_result_t* usage_code_interpreter_sessions_result = NULL;
  if (include_optional) {
    usage_code_interpreter_sessions_result = usage_code_interpreter_sessions_result_create(
      openai_api_usage_code_interpreter_sessions_result_OBJECT_organization.usage.code_interpreter_sessions.result,
      56,
      "0"
    );
  } else {
    usage_code_interpreter_sessions_result = usage_code_interpreter_sessions_result_create(
      openai_api_usage_code_interpreter_sessions_result_OBJECT_organization.usage.code_interpreter_sessions.result,
      56,
      "0"
    );
  }

  return usage_code_interpreter_sessions_result;
}


#ifdef usage_code_interpreter_sessions_result_MAIN

void test_usage_code_interpreter_sessions_result(int include_optional) {
    usage_code_interpreter_sessions_result_t* usage_code_interpreter_sessions_result_1 = instantiate_usage_code_interpreter_sessions_result(include_optional);

	cJSON* jsonusage_code_interpreter_sessions_result_1 = usage_code_interpreter_sessions_result_convertToJSON(usage_code_interpreter_sessions_result_1);
	printf("usage_code_interpreter_sessions_result :\n%s\n", cJSON_Print(jsonusage_code_interpreter_sessions_result_1));
	usage_code_interpreter_sessions_result_t* usage_code_interpreter_sessions_result_2 = usage_code_interpreter_sessions_result_parseFromJSON(jsonusage_code_interpreter_sessions_result_1);
	cJSON* jsonusage_code_interpreter_sessions_result_2 = usage_code_interpreter_sessions_result_convertToJSON(usage_code_interpreter_sessions_result_2);
	printf("repeating usage_code_interpreter_sessions_result:\n%s\n", cJSON_Print(jsonusage_code_interpreter_sessions_result_2));
}

int main() {
  test_usage_code_interpreter_sessions_result(1);
  test_usage_code_interpreter_sessions_result(0);

  printf("Hello world \n");
  return 0;
}

#endif // usage_code_interpreter_sessions_result_MAIN
#endif // usage_code_interpreter_sessions_result_TEST
