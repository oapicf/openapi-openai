#ifndef create_translation_response_TEST
#define create_translation_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_translation_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_translation_response.h"
create_translation_response_t* instantiate_create_translation_response(int include_optional);



create_translation_response_t* instantiate_create_translation_response(int include_optional) {
  create_translation_response_t* create_translation_response = NULL;
  if (include_optional) {
    create_translation_response = create_translation_response_create(
      "0"
    );
  } else {
    create_translation_response = create_translation_response_create(
      "0"
    );
  }

  return create_translation_response;
}


#ifdef create_translation_response_MAIN

void test_create_translation_response(int include_optional) {
    create_translation_response_t* create_translation_response_1 = instantiate_create_translation_response(include_optional);

	cJSON* jsoncreate_translation_response_1 = create_translation_response_convertToJSON(create_translation_response_1);
	printf("create_translation_response :\n%s\n", cJSON_Print(jsoncreate_translation_response_1));
	create_translation_response_t* create_translation_response_2 = create_translation_response_parseFromJSON(jsoncreate_translation_response_1);
	cJSON* jsoncreate_translation_response_2 = create_translation_response_convertToJSON(create_translation_response_2);
	printf("repeating create_translation_response:\n%s\n", cJSON_Print(jsoncreate_translation_response_2));
}

int main() {
  test_create_translation_response(1);
  test_create_translation_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_translation_response_MAIN
#endif // create_translation_response_TEST
