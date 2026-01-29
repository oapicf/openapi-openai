/*
 * RunStepDeltaStepDetailsToolCallsFunctionObject_function.h
 *
 * The definition of the function that was called.
 */

#ifndef _RunStepDeltaStepDetailsToolCallsFunctionObject_function_H_
#define _RunStepDeltaStepDetailsToolCallsFunctionObject_function_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The definition of the function that was called.
 *
 *  \ingroup Models
 *
 */

class RunStepDeltaStepDetailsToolCallsFunctionObject_function : public Object {
public:
	/*! \brief Constructor.
	 */
	RunStepDeltaStepDetailsToolCallsFunctionObject_function();
	RunStepDeltaStepDetailsToolCallsFunctionObject_function(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RunStepDeltaStepDetailsToolCallsFunctionObject_function();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The name of the function.
	 */
	std::string getName();

	/*! \brief Set The name of the function.
	 */
	void setName(std::string  name);
	/*! \brief Get The arguments passed to the function.
	 */
	std::string getArguments();

	/*! \brief Set The arguments passed to the function.
	 */
	void setArguments(std::string  arguments);
	/*! \brief Get The output of the function. This will be `null` if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet.
	 */
	std::string getOutput();

	/*! \brief Set The output of the function. This will be `null` if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet.
	 */
	void setOutput(std::string  output);

private:
	std::string name;
	std::string arguments;
	std::string output;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RunStepDeltaStepDetailsToolCallsFunctionObject_function_H_ */
