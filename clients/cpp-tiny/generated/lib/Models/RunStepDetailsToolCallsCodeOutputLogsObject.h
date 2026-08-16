
/*
 * RunStepDetailsToolCallsCodeOutputLogsObject.h
 *
 * Text output from the Code Interpreter tool call as part of a run step.
 */

#ifndef TINY_CPP_CLIENT_RunStepDetailsToolCallsCodeOutputLogsObject_H_
#define TINY_CPP_CLIENT_RunStepDetailsToolCallsCodeOutputLogsObject_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Text output from the Code Interpreter tool call as part of a run step.
 *
 *  \ingroup Models
 *
 */

class RunStepDetailsToolCallsCodeOutputLogsObject{
public:

    /*! \brief Constructor.
	 */
    RunStepDetailsToolCallsCodeOutputLogsObject();
    RunStepDetailsToolCallsCodeOutputLogsObject(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RunStepDetailsToolCallsCodeOutputLogsObject();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string type{};
    std::string logs{};
};
}

#endif /* TINY_CPP_CLIENT_RunStepDetailsToolCallsCodeOutputLogsObject_H_ */
