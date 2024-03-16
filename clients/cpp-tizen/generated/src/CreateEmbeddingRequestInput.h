/*
 * CreateEmbeddingRequest_input.h
 *
 * Input text to embed, encoded as a string or array of tokens. To embed multiple inputs in a single request, pass an array of strings or array of token arrays. Each input must not exceed the max input tokens for the model (8191 tokens for &#x60;text-embedding-ada-002&#x60;). [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_count_tokens_with_tiktoken.ipynb) for counting tokens. 
 */

#ifndef _CreateEmbeddingRequest_input_H_
#define _CreateEmbeddingRequest_input_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Input text to embed, encoded as a string or array of tokens. To embed multiple inputs in a single request, pass an array of strings or array of token arrays. Each input must not exceed the max input tokens for the model (8191 tokens for `text-embedding-ada-002`). [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_count_tokens_with_tiktoken.ipynb) for counting tokens. 
 *
 *  \ingroup Models
 *
 */

class CreateEmbeddingRequest_input : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateEmbeddingRequest_input();
	CreateEmbeddingRequest_input(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateEmbeddingRequest_input();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);


private:
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateEmbeddingRequest_input_H_ */
