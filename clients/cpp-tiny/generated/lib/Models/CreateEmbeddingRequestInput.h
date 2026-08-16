
/*
 * CreateEmbeddingRequest_input.h
 *
 * Input text to embed, encoded as a string or array of tokens. To embed multiple inputs in a single request, pass an array of strings or array of token arrays. The input must not exceed the max input tokens for the model (8192 tokens for &#x60;text-embedding-ada-002&#x60;), cannot be an empty string, and any array must be 2048 dimensions or less. [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken) for counting tokens. 
 */

#ifndef TINY_CPP_CLIENT_CreateEmbeddingRequest_input_H_
#define TINY_CPP_CLIENT_CreateEmbeddingRequest_input_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief Input text to embed, encoded as a string or array of tokens. To embed multiple inputs in a single request, pass an array of strings or array of token arrays. The input must not exceed the max input tokens for the model (8192 tokens for `text-embedding-ada-002`), cannot be an empty string, and any array must be 2048 dimensions or less. [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken) for counting tokens. 
 *
 *  \ingroup Models
 *
 */

class CreateEmbeddingRequest_input{
public:

    /*! \brief Constructor.
	 */
    CreateEmbeddingRequest_input();
    CreateEmbeddingRequest_input(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateEmbeddingRequest_input();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_CreateEmbeddingRequest_input_H_ */
