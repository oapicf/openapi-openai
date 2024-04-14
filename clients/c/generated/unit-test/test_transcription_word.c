#ifndef transcription_word_TEST
#define transcription_word_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define transcription_word_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/transcription_word.h"
transcription_word_t* instantiate_transcription_word(int include_optional);



transcription_word_t* instantiate_transcription_word(int include_optional) {
  transcription_word_t* transcription_word = NULL;
  if (include_optional) {
    transcription_word = transcription_word_create(
      "0",
      1.337,
      1.337
    );
  } else {
    transcription_word = transcription_word_create(
      "0",
      1.337,
      1.337
    );
  }

  return transcription_word;
}


#ifdef transcription_word_MAIN

void test_transcription_word(int include_optional) {
    transcription_word_t* transcription_word_1 = instantiate_transcription_word(include_optional);

	cJSON* jsontranscription_word_1 = transcription_word_convertToJSON(transcription_word_1);
	printf("transcription_word :\n%s\n", cJSON_Print(jsontranscription_word_1));
	transcription_word_t* transcription_word_2 = transcription_word_parseFromJSON(jsontranscription_word_1);
	cJSON* jsontranscription_word_2 = transcription_word_convertToJSON(transcription_word_2);
	printf("repeating transcription_word:\n%s\n", cJSON_Print(jsontranscription_word_2));
}

int main() {
  test_transcription_word(1);
  test_transcription_word(0);

  printf("Hello world \n");
  return 0;
}

#endif // transcription_word_MAIN
#endif // transcription_word_TEST
