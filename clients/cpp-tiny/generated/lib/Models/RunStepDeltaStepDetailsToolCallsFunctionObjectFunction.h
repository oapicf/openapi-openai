
/*
 * RunStepDeltaStepDetailsToolCallsFunctionObject_function.h
 *
 * The definition of the function that was called.
 */

#ifndef TINY_CPP_CLIENT_RunStepDeltaStepDetailsToolCallsFunctionObject_function_H_
#define TINY_CPP_CLIENT_RunStepDeltaStepDetailsToolCallsFunctionObject_function_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The definition of the function that was called.
 *
 *  \ingroup Models
 *
 */

class RunStepDeltaStepDetailsToolCallsFunctionObject_function{
public:

    /*! \brief Constructor.
	 */
    RunStepDeltaStepDetailsToolCallsFunctionObject_function();
    RunStepDeltaStepDetailsToolCallsFunctionObject_function(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RunStepDeltaStepDetailsToolCallsFunctionObject_function();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string name{};
    std::string arguments{};
    std::string output{};
};
}

#endif /* TINY_CPP_CLIENT_RunStepDeltaStepDetailsToolCallsFunctionObject_function_H_ */
