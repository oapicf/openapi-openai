#ifndef create_translation_response_verbose_json_TEST
#define create_translation_response_verbose_json_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_translation_response_verbose_json_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_translation_response_verbose_json.h"
create_translation_response_verbose_json_t* instantiate_create_translation_response_verbose_json(int include_optional);



create_translation_response_verbose_json_t* instantiate_create_translation_response_verbose_json(int include_optional) {
  create_translation_response_verbose_json_t* create_translation_response_verbose_json = NULL;
  if (include_optional) {
    create_translation_response_verbose_json = create_translation_response_verbose_json_create(
      "0",
      "0",
      "0",
      list_createList()
    );
  } else {
    create_translation_response_verbose_json = create_translation_response_verbose_json_create(
      "0",
      "0",
      "0",
      list_createList()
    );
  }

  return create_translation_response_verbose_json;
}


#ifdef create_translation_response_verbose_json_MAIN

void test_create_translation_response_verbose_json(int include_optional) {
    create_translation_response_verbose_json_t* create_translation_response_verbose_json_1 = instantiate_create_translation_response_verbose_json(include_optional);

	cJSON* jsoncreate_translation_response_verbose_json_1 = create_translation_response_verbose_json_convertToJSON(create_translation_response_verbose_json_1);
	printf("create_translation_response_verbose_json :\n%s\n", cJSON_Print(jsoncreate_translation_response_verbose_json_1));
	create_translation_response_verbose_json_t* create_translation_response_verbose_json_2 = create_translation_response_verbose_json_parseFromJSON(jsoncreate_translation_response_verbose_json_1);
	cJSON* jsoncreate_translation_response_verbose_json_2 = create_translation_response_verbose_json_convertToJSON(create_translation_response_verbose_json_2);
	printf("repeating create_translation_response_verbose_json:\n%s\n", cJSON_Print(jsoncreate_translation_response_verbose_json_2));
}

int main() {
  test_create_translation_response_verbose_json(1);
  test_create_translation_response_verbose_json(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_translation_response_verbose_json_MAIN
#endif // create_translation_response_verbose_json_TEST
