/*
 * CreateCompletionRequest_prompt.h
 *
 * The prompt(s) to generate completions for, encoded as a string, array of strings, array of tokens, or array of token arrays.  Note that &lt;|endoftext|&gt; is the document separator that the model sees during training, so if a prompt is not specified the model will generate as if from the beginning of a new document. 
 */

#ifndef _CreateCompletionRequest_prompt_H_
#define _CreateCompletionRequest_prompt_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The prompt(s) to generate completions for, encoded as a string, array of strings, array of tokens, or array of token arrays.  Note that <|endoftext|> is the document separator that the model sees during training, so if a prompt is not specified the model will generate as if from the beginning of a new document. 
 *
 *  \ingroup Models
 *
 */

class CreateCompletionRequest_prompt : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateCompletionRequest_prompt();
	CreateCompletionRequest_prompt(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateCompletionRequest_prompt();

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

#endif /* _CreateCompletionRequest_prompt_H_ */
