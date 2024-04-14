#ifndef transcription_segment_TEST
#define transcription_segment_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define transcription_segment_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/transcription_segment.h"
transcription_segment_t* instantiate_transcription_segment(int include_optional);



transcription_segment_t* instantiate_transcription_segment(int include_optional) {
  transcription_segment_t* transcription_segment = NULL;
  if (include_optional) {
    transcription_segment = transcription_segment_create(
      56,
      56,
      1.337,
      1.337,
      "0",
      list_createList(),
      1.337,
      1.337,
      1.337,
      1.337
    );
  } else {
    transcription_segment = transcription_segment_create(
      56,
      56,
      1.337,
      1.337,
      "0",
      list_createList(),
      1.337,
      1.337,
      1.337,
      1.337
    );
  }

  return transcription_segment;
}


#ifdef transcription_segment_MAIN

void test_transcription_segment(int include_optional) {
    transcription_segment_t* transcription_segment_1 = instantiate_transcription_segment(include_optional);

	cJSON* jsontranscription_segment_1 = transcription_segment_convertToJSON(transcription_segment_1);
	printf("transcription_segment :\n%s\n", cJSON_Print(jsontranscription_segment_1));
	transcription_segment_t* transcription_segment_2 = transcription_segment_parseFromJSON(jsontranscription_segment_1);
	cJSON* jsontranscription_segment_2 = transcription_segment_convertToJSON(transcription_segment_2);
	printf("repeating transcription_segment:\n%s\n", cJSON_Print(jsontranscription_segment_2));
}

int main() {
  test_transcription_segment(1);
  test_transcription_segment(0);

  printf("Hello world \n");
  return 0;
}

#endif // transcription_segment_MAIN
#endif // transcription_segment_TEST
