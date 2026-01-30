#ifndef create_chat_completion_request_response_format_TEST
#define create_chat_completion_request_response_format_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_chat_completion_request_response_format_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_chat_completion_request_response_format.h"
create_chat_completion_request_response_format_t* instantiate_create_chat_completion_request_response_format(int include_optional);

#include "test_response_format_json_schema_json_schema.c"


create_chat_completion_request_response_format_t* instantiate_create_chat_completion_request_response_format(int include_optional) {
  create_chat_completion_request_response_format_t* create_chat_completion_request_response_format = NULL;
  if (include_optional) {
    create_chat_completion_request_response_format = create_chat_completion_request_response_format_create(
      openai_api_create_chat_completion_request_response_format_TYPE_text,
       // false, not to have infinite recursion
      instantiate_response_format_json_schema_json_schema(0)
    );
  } else {
    create_chat_completion_request_response_format = create_chat_completion_request_response_format_create(
      openai_api_create_chat_completion_request_response_format_TYPE_text,
      NULL
    );
  }

  return create_chat_completion_request_response_format;
}


#ifdef create_chat_completion_request_response_format_MAIN

void test_create_chat_completion_request_response_format(int include_optional) {
    create_chat_completion_request_response_format_t* create_chat_completion_request_response_format_1 = instantiate_create_chat_completion_request_response_format(include_optional);

	cJSON* jsoncreate_chat_completion_request_response_format_1 = create_chat_completion_request_response_format_convertToJSON(create_chat_completion_request_response_format_1);
	printf("create_chat_completion_request_response_format :\n%s\n", cJSON_Print(jsoncreate_chat_completion_request_response_format_1));
	create_chat_completion_request_response_format_t* create_chat_completion_request_response_format_2 = create_chat_completion_request_response_format_parseFromJSON(jsoncreate_chat_completion_request_response_format_1);
	cJSON* jsoncreate_chat_completion_request_response_format_2 = create_chat_completion_request_response_format_convertToJSON(create_chat_completion_request_response_format_2);
	printf("repeating create_chat_completion_request_response_format:\n%s\n", cJSON_Print(jsoncreate_chat_completion_request_response_format_2));
}

int main() {
  test_create_chat_completion_request_response_format(1);
  test_create_chat_completion_request_response_format(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_chat_completion_request_response_format_MAIN
#endif // create_chat_completion_request_response_format_TEST
