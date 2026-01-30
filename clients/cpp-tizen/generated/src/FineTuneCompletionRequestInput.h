/*
 * FineTuneCompletionRequestInput.h
 *
 * The per-line training example of a fine-tuning input file for completions models
 */

#ifndef _FineTuneCompletionRequestInput_H_
#define _FineTuneCompletionRequestInput_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The per-line training example of a fine-tuning input file for completions models
 *
 *  \ingroup Models
 *
 */

class FineTuneCompletionRequestInput : public Object {
public:
	/*! \brief Constructor.
	 */
	FineTuneCompletionRequestInput();
	FineTuneCompletionRequestInput(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FineTuneCompletionRequestInput();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The input prompt for this training example.
	 */
	std::string getPrompt();

	/*! \brief Set The input prompt for this training example.
	 */
	void setPrompt(std::string  prompt);
	/*! \brief Get The desired completion for this training example.
	 */
	std::string getCompletion();

	/*! \brief Set The desired completion for this training example.
	 */
	void setCompletion(std::string  completion);

private:
	std::string prompt;
	std::string completion;
	void __init();
	void __cleanup();

};
}
}

#endif /* _FineTuneCompletionRequestInput_H_ */
