
/*
 * RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.h
 *
 * Text output from the Code Interpreter tool call as part of a run step.
 */

#ifndef TINY_CPP_CLIENT_RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject_H_
#define TINY_CPP_CLIENT_RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Text output from the Code Interpreter tool call as part of a run step.
 *
 *  \ingroup Models
 *
 */

class RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject{
public:

    /*! \brief Constructor.
	 */
    RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject();
    RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The index of the output in the outputs array.
	 */
	int getIndex();

	/*! \brief Set The index of the output in the outputs array.
	 */
	void setIndex(int  index);
	/*! \brief Get Always `logs`.
	 */
	std::string getType();

	/*! \brief Set Always `logs`.
	 */
	void setType(std::string  type);
	/*! \brief Get The text output from the Code Interpreter tool call.
	 */
	std::string getLogs();

	/*! \brief Set The text output from the Code Interpreter tool call.
	 */
	void setLogs(std::string  logs);


    private:
    int index{};
    std::string type{};
    std::string logs{};
};
}

#endif /* TINY_CPP_CLIENT_RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject_H_ */
