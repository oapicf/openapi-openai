
/*
 * RunStepStreamEvent_oneOf_3.h
 *
 * Occurs when a [run step](/docs/api-reference/run-steps/step-object) is completed.
 */

#ifndef TINY_CPP_CLIENT_RunStepStreamEvent_oneOf_3_H_
#define TINY_CPP_CLIENT_RunStepStreamEvent_oneOf_3_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "RunStepObject.h"

namespace Tiny {


/*! \brief Occurs when a [run step](/docs/api-reference/run-steps/step-object) is completed.
 *
 *  \ingroup Models
 *
 */

class RunStepStreamEvent_oneOf_3{
public:

    /*! \brief Constructor.
	 */
    RunStepStreamEvent_oneOf_3();
    RunStepStreamEvent_oneOf_3(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RunStepStreamEvent_oneOf_3();


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
	RunStepObject getData();

	/*! \brief Set 
	 */
	void setData(RunStepObject  data);


    private:
    std::string event{};
    RunStepObject data;
};
}

#endif /* TINY_CPP_CLIENT_RunStepStreamEvent_oneOf_3_H_ */
