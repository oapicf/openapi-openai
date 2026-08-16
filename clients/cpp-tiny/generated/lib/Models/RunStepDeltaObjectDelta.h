
/*
 * RunStepDeltaObject_delta.h
 *
 * The delta containing the fields that have changed on the run step.
 */

#ifndef TINY_CPP_CLIENT_RunStepDeltaObject_delta_H_
#define TINY_CPP_CLIENT_RunStepDeltaObject_delta_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "RunStepDeltaObject_delta_step_details.h"

namespace Tiny {


/*! \brief The delta containing the fields that have changed on the run step.
 *
 *  \ingroup Models
 *
 */

class RunStepDeltaObject_delta{
public:

    /*! \brief Constructor.
	 */
    RunStepDeltaObject_delta();
    RunStepDeltaObject_delta(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RunStepDeltaObject_delta();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	RunStepDeltaObject_delta_step_details getStepDetails();

	/*! \brief Set 
	 */
	void setStepDetails(RunStepDeltaObject_delta_step_details  step_details);


    private:
    RunStepDeltaObject_delta_step_details step_details;
};
}

#endif /* TINY_CPP_CLIENT_RunStepDeltaObject_delta_H_ */
