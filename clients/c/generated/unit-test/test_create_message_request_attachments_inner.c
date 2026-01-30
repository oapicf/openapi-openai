#ifndef create_message_request_attachments_inner_TEST
#define create_message_request_attachments_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_message_request_attachments_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_message_request_attachments_inner.h"
create_message_request_attachments_inner_t* instantiate_create_message_request_attachments_inner(int include_optional);



create_message_request_attachments_inner_t* instantiate_create_message_request_attachments_inner(int include_optional) {
  create_message_request_attachments_inner_t* create_message_request_attachments_inner = NULL;
  if (include_optional) {
    create_message_request_attachments_inner = create_message_request_attachments_inner_create(
      "0",
      list_createList()
    );
  } else {
    create_message_request_attachments_inner = create_message_request_attachments_inner_create(
      "0",
      list_createList()
    );
  }

  return create_message_request_attachments_inner;
}


#ifdef create_message_request_attachments_inner_MAIN

void test_create_message_request_attachments_inner(int include_optional) {
    create_message_request_attachments_inner_t* create_message_request_attachments_inner_1 = instantiate_create_message_request_attachments_inner(include_optional);

	cJSON* jsoncreate_message_request_attachments_inner_1 = create_message_request_attachments_inner_convertToJSON(create_message_request_attachments_inner_1);
	printf("create_message_request_attachments_inner :\n%s\n", cJSON_Print(jsoncreate_message_request_attachments_inner_1));
	create_message_request_attachments_inner_t* create_message_request_attachments_inner_2 = create_message_request_attachments_inner_parseFromJSON(jsoncreate_message_request_attachments_inner_1);
	cJSON* jsoncreate_message_request_attachments_inner_2 = create_message_request_attachments_inner_convertToJSON(create_message_request_attachments_inner_2);
	printf("repeating create_message_request_attachments_inner:\n%s\n", cJSON_Print(jsoncreate_message_request_attachments_inner_2));
}

int main() {
  test_create_message_request_attachments_inner(1);
  test_create_message_request_attachments_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_message_request_attachments_inner_MAIN
#endif // create_message_request_attachments_inner_TEST
