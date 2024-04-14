#ifndef embedding_TEST
#define embedding_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define embedding_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/embedding.h"
embedding_t* instantiate_embedding(int include_optional);



embedding_t* instantiate_embedding(int include_optional) {
  embedding_t* embedding = NULL;
  if (include_optional) {
    embedding = embedding_create(
      56,
      list_createList(),
      openai_api_embedding_OBJECT_embedding
    );
  } else {
    embedding = embedding_create(
      56,
      list_createList(),
      openai_api_embedding_OBJECT_embedding
    );
  }

  return embedding;
}


#ifdef embedding_MAIN

void test_embedding(int include_optional) {
    embedding_t* embedding_1 = instantiate_embedding(include_optional);

	cJSON* jsonembedding_1 = embedding_convertToJSON(embedding_1);
	printf("embedding :\n%s\n", cJSON_Print(jsonembedding_1));
	embedding_t* embedding_2 = embedding_parseFromJSON(jsonembedding_1);
	cJSON* jsonembedding_2 = embedding_convertToJSON(embedding_2);
	printf("repeating embedding:\n%s\n", cJSON_Print(jsonembedding_2));
}

int main() {
  test_embedding(1);
  test_embedding(0);

  printf("Hello world \n");
  return 0;
}

#endif // embedding_MAIN
#endif // embedding_TEST
