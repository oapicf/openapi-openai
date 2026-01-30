/*
 * FineTunePreferenceRequestInput.h
 *
 * The per-line training example of a fine-tuning input file for chat models using the dpo method.
 */

#ifndef _FineTunePreferenceRequestInput_H_
#define _FineTunePreferenceRequestInput_H_


#include <string>
#include "FineTunePreferenceRequestInput_input.h"
#include "FineTunePreferenceRequestInput_preferred_completion_inner.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The per-line training example of a fine-tuning input file for chat models using the dpo method.
 *
 *  \ingroup Models
 *
 */

class FineTunePreferenceRequestInput : public Object {
public:
	/*! \brief Constructor.
	 */
	FineTunePreferenceRequestInput();
	FineTunePreferenceRequestInput(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FineTunePreferenceRequestInput();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::list <FineTunePreferenceRequestInput_preferred_completion_inner>preferred_completion;
	std::list <FineTunePreferenceRequestInput_preferred_completion_inner>non_preferred_completion;
	void __init();
	void __cleanup();

};
}
}

#endif /* _FineTunePreferenceRequestInput_H_ */
