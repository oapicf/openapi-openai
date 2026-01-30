#ifndef response_format_text_TEST
#define response_format_text_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define response_format_text_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/response_format_text.h"
response_format_text_t* instantiate_response_format_text(int include_optional);



response_format_text_t* instantiate_response_format_text(int include_optional) {
  response_format_text_t* response_format_text = NULL;
  if (include_optional) {
    response_format_text = response_format_text_create(
      openai_api_response_format_text_TYPE_text
    );
  } else {
    response_format_text = response_format_text_create(
      openai_api_response_format_text_TYPE_text
    );
  }

  return response_format_text;
}


#ifdef response_format_text_MAIN

void test_response_format_text(int include_optional) {
    response_format_text_t* response_format_text_1 = instantiate_response_format_text(include_optional);

	cJSON* jsonresponse_format_text_1 = response_format_text_convertToJSON(response_format_text_1);
	printf("response_format_text :\n%s\n", cJSON_Print(jsonresponse_format_text_1));
	response_format_text_t* response_format_text_2 = response_format_text_parseFromJSON(jsonresponse_format_text_1);
	cJSON* jsonresponse_format_text_2 = response_format_text_convertToJSON(response_format_text_2);
	printf("repeating response_format_text:\n%s\n", cJSON_Print(jsonresponse_format_text_2));
}

int main() {
  test_response_format_text(1);
  test_response_format_text(0);

  printf("Hello world \n");
  return 0;
}

#endif // response_format_text_MAIN
#endif // response_format_text_TEST
