#ifndef create_completion_response_usage_TEST
#define create_completion_response_usage_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_completion_response_usage_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_completion_response_usage.h"
create_completion_response_usage_t* instantiate_create_completion_response_usage(int include_optional);



create_completion_response_usage_t* instantiate_create_completion_response_usage(int include_optional) {
  create_completion_response_usage_t* create_completion_response_usage = NULL;
  if (include_optional) {
    create_completion_response_usage = create_completion_response_usage_create(
      56,
      56,
      56
    );
  } else {
    create_completion_response_usage = create_completion_response_usage_create(
      56,
      56,
      56
    );
  }

  return create_completion_response_usage;
}


#ifdef create_completion_response_usage_MAIN

void test_create_completion_response_usage(int include_optional) {
    create_completion_response_usage_t* create_completion_response_usage_1 = instantiate_create_completion_response_usage(include_optional);

	cJSON* jsoncreate_completion_response_usage_1 = create_completion_response_usage_convertToJSON(create_completion_response_usage_1);
	printf("create_completion_response_usage :\n%s\n", cJSON_Print(jsoncreate_completion_response_usage_1));
	create_completion_response_usage_t* create_completion_response_usage_2 = create_completion_response_usage_parseFromJSON(jsoncreate_completion_response_usage_1);
	cJSON* jsoncreate_completion_response_usage_2 = create_completion_response_usage_convertToJSON(create_completion_response_usage_2);
	printf("repeating create_completion_response_usage:\n%s\n", cJSON_Print(jsoncreate_completion_response_usage_2));
}

int main() {
  test_create_completion_response_usage(1);
  test_create_completion_response_usage(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_completion_response_usage_MAIN
#endif // create_completion_response_usage_TEST
