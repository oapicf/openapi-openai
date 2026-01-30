#ifndef create_message_request_content_TEST
#define create_message_request_content_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_message_request_content_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_message_request_content.h"
create_message_request_content_t* instantiate_create_message_request_content(int include_optional);



create_message_request_content_t* instantiate_create_message_request_content(int include_optional) {
  create_message_request_content_t* create_message_request_content = NULL;
  if (include_optional) {
    create_message_request_content = create_message_request_content_create(
    );
  } else {
    create_message_request_content = create_message_request_content_create(
    );
  }

  return create_message_request_content;
}


#ifdef create_message_request_content_MAIN

void test_create_message_request_content(int include_optional) {
    create_message_request_content_t* create_message_request_content_1 = instantiate_create_message_request_content(include_optional);

	cJSON* jsoncreate_message_request_content_1 = create_message_request_content_convertToJSON(create_message_request_content_1);
	printf("create_message_request_content :\n%s\n", cJSON_Print(jsoncreate_message_request_content_1));
	create_message_request_content_t* create_message_request_content_2 = create_message_request_content_parseFromJSON(jsoncreate_message_request_content_1);
	cJSON* jsoncreate_message_request_content_2 = create_message_request_content_convertToJSON(create_message_request_content_2);
	printf("repeating create_message_request_content:\n%s\n", cJSON_Print(jsoncreate_message_request_content_2));
}

int main() {
  test_create_message_request_content(1);
  test_create_message_request_content(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_message_request_content_MAIN
#endif // create_message_request_content_TEST
