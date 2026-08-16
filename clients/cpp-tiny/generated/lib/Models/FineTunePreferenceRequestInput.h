
/*
 * FineTunePreferenceRequestInput.h
 *
 * The per-line training example of a fine-tuning input file for chat models using the dpo method.
 */

#ifndef TINY_CPP_CLIENT_FineTunePreferenceRequestInput_H_
#define TINY_CPP_CLIENT_FineTunePreferenceRequestInput_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "FineTunePreferenceRequestInput_input.h"
#include "FineTunePreferenceRequestInput_preferred_completion_inner.h"
#include <list>

namespace Tiny {


/*! \brief The per-line training example of a fine-tuning input file for chat models using the dpo method.
 *
 *  \ingroup Models
 *
 */

class FineTunePreferenceRequestInput{
public:

    /*! \brief Constructor.
	 */
    FineTunePreferenceRequestInput();
    FineTunePreferenceRequestInput(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FineTunePreferenceRequestInput();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	FineTunePreferenceRequestInput_input getInput();

	/*! \brief Set 
	 */
	void setInput(FineTunePreferenceRequestInput_input  input);
	/*! \brief Get The preferred completion message for the output.
	 */
	std::list<FineTunePreferenceRequestInput_preferred_completion_inner> getPreferredCompletion();

	/*! \brief Set The preferred completion message for the output.
	 */
	void setPreferredCompletion(std::list <FineTunePreferenceRequestInput_preferred_completion_inner> preferred_completion);
	/*! \brief Get The non-preferred completion message for the output.
	 */
	std::list<FineTunePreferenceRequestInput_preferred_completion_inner> getNonPreferredCompletion();

	/*! \brief Set The non-preferred completion message for the output.
	 */
	void setNonPreferredCompletion(std::list <FineTunePreferenceRequestInput_preferred_completion_inner> non_preferred_completion);


    private:
    FineTunePreferenceRequestInput_input input;
    std::list<FineTunePreferenceRequestInput_preferred_completion_inner> preferred_completion;
    std::list<FineTunePreferenceRequestInput_preferred_completion_inner> non_preferred_completion;
};
}

#endif /* TINY_CPP_CLIENT_FineTunePreferenceRequestInput_H_ */
