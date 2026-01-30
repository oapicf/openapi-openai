#ifndef default_project_error_response_TEST
#define default_project_error_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define default_project_error_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/default_project_error_response.h"
default_project_error_response_t* instantiate_default_project_error_response(int include_optional);



default_project_error_response_t* instantiate_default_project_error_response(int include_optional) {
  default_project_error_response_t* default_project_error_response = NULL;
  if (include_optional) {
    default_project_error_response = default_project_error_response_create(
      56,
      "0"
    );
  } else {
    default_project_error_response = default_project_error_response_create(
      56,
      "0"
    );
  }

  return default_project_error_response;
}


#ifdef default_project_error_response_MAIN

void test_default_project_error_response(int include_optional) {
    default_project_error_response_t* default_project_error_response_1 = instantiate_default_project_error_response(include_optional);

	cJSON* jsondefault_project_error_response_1 = default_project_error_response_convertToJSON(default_project_error_response_1);
	printf("default_project_error_response :\n%s\n", cJSON_Print(jsondefault_project_error_response_1));
	default_project_error_response_t* default_project_error_response_2 = default_project_error_response_parseFromJSON(jsondefault_project_error_response_1);
	cJSON* jsondefault_project_error_response_2 = default_project_error_response_convertToJSON(default_project_error_response_2);
	printf("repeating default_project_error_response:\n%s\n", cJSON_Print(jsondefault_project_error_response_2));
}

int main() {
  test_default_project_error_response(1);
  test_default_project_error_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // default_project_error_response_MAIN
#endif // default_project_error_response_TEST
