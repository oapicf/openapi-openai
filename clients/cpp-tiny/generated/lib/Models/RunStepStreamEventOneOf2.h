
/*
 * RunStepStreamEvent_oneOf_2.h
 *
 * Occurs when parts of a [run step](/docs/api-reference/run-steps/step-object) are being streamed.
 */

#ifndef TINY_CPP_CLIENT_RunStepStreamEvent_oneOf_2_H_
#define TINY_CPP_CLIENT_RunStepStreamEvent_oneOf_2_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "RunStepDeltaObject.h"

namespace Tiny {


/*! \brief Occurs when parts of a [run step](/docs/api-reference/run-steps/step-object) are being streamed.
 *
 *  \ingroup Models
 *
 */

class RunStepStreamEvent_oneOf_2{
public:

    /*! \brief Constructor.
	 */
    RunStepStreamEvent_oneOf_2();
    RunStepStreamEvent_oneOf_2(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RunStepStreamEvent_oneOf_2();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getEvent();

	/*! \brief Set 
	 */
	void setEvent(std::string  event);
	/*! \brief Get 
	 */
	RunStepDeltaObject getData();

	/*! \brief Set 
	 */
	void setData(RunStepDeltaObject  data);


    private:
    std::string event{};
    RunStepDeltaObject data;
};
}

#endif /* TINY_CPP_CLIENT_RunStepStreamEvent_oneOf_2_H_ */
