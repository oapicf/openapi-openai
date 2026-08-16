
/*
 * CreateCompletionRequest_prompt.h
 *
 * The prompt(s) to generate completions for, encoded as a string, array of strings, array of tokens, or array of token arrays.  Note that &lt;|endoftext|&gt; is the document separator that the model sees during training, so if a prompt is not specified the model will generate as if from the beginning of a new document. 
 */

#ifndef TINY_CPP_CLIENT_CreateCompletionRequest_prompt_H_
#define TINY_CPP_CLIENT_CreateCompletionRequest_prompt_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief The prompt(s) to generate completions for, encoded as a string, array of strings, array of tokens, or array of token arrays.  Note that <|endoftext|> is the document separator that the model sees during training, so if a prompt is not specified the model will generate as if from the beginning of a new document. 
 *
 *  \ingroup Models
 *
 */

class CreateCompletionRequest_prompt{
public:

    /*! \brief Constructor.
	 */
    CreateCompletionRequest_prompt();
    CreateCompletionRequest_prompt(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateCompletionRequest_prompt();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_CreateCompletionRequest_prompt_H_ */
