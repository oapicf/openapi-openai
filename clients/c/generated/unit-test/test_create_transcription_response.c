#ifndef create_transcription_response_TEST
#define create_transcription_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_transcription_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_transcription_response.h"
create_transcription_response_t* instantiate_create_transcription_response(int include_optional);



create_transcription_response_t* instantiate_create_transcription_response(int include_optional) {
  create_transcription_response_t* create_transcription_response = NULL;
  if (include_optional) {
    create_transcription_response = create_transcription_response_create(
      "0"
    );
  } else {
    create_transcription_response = create_transcription_response_create(
      "0"
    );
  }

  return create_transcription_response;
}


#ifdef create_transcription_response_MAIN

void test_create_transcription_response(int include_optional) {
    create_transcription_response_t* create_transcription_response_1 = instantiate_create_transcription_response(include_optional);

	cJSON* jsoncreate_transcription_response_1 = create_transcription_response_convertToJSON(create_transcription_response_1);
	printf("create_transcription_response :\n%s\n", cJSON_Print(jsoncreate_transcription_response_1));
	create_transcription_response_t* create_transcription_response_2 = create_transcription_response_parseFromJSON(jsoncreate_transcription_response_1);
	cJSON* jsoncreate_transcription_response_2 = create_transcription_response_convertToJSON(create_transcription_response_2);
	printf("repeating create_transcription_response:\n%s\n", cJSON_Print(jsoncreate_transcription_response_2));
}

int main() {
  test_create_transcription_response(1);
  test_create_transcription_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_transcription_response_MAIN
#endif // create_transcription_response_TEST
