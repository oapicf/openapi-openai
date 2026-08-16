
/*
 * FineTuneCompletionRequestInput.h
 *
 * The per-line training example of a fine-tuning input file for completions models
 */

#ifndef TINY_CPP_CLIENT_FineTuneCompletionRequestInput_H_
#define TINY_CPP_CLIENT_FineTuneCompletionRequestInput_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The per-line training example of a fine-tuning input file for completions models
 *
 *  \ingroup Models
 *
 */

class FineTuneCompletionRequestInput{
public:

    /*! \brief Constructor.
	 */
    FineTuneCompletionRequestInput();
    FineTuneCompletionRequestInput(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FineTuneCompletionRequestInput();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string prompt{};
    std::string completion{};
};
}

#endif /* TINY_CPP_CLIENT_FineTuneCompletionRequestInput_H_ */
