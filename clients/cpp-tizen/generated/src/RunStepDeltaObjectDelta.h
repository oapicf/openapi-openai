/*
 * RunStepDeltaObject_delta.h
 *
 * The delta containing the fields that have changed on the run step.
 */

#ifndef _RunStepDeltaObject_delta_H_
#define _RunStepDeltaObject_delta_H_


#include <string>
#include "RunStepDeltaObject_delta_step_details.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The delta containing the fields that have changed on the run step.
 *
 *  \ingroup Models
 *
 */

class RunStepDeltaObject_delta : public Object {
public:
	/*! \brief Constructor.
	 */
	RunStepDeltaObject_delta();
	RunStepDeltaObject_delta(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RunStepDeltaObject_delta();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	RunStepDeltaObject_delta_step_details getStepDetails();

	/*! \brief Set 
	 */
	void setStepDetails(RunStepDeltaObject_delta_step_details  step_details);

private:
	RunStepDeltaObject_delta_step_details step_details;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RunStepDeltaObject_delta_H_ */
