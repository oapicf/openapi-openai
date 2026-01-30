/*
 * RunStepStreamEvent_oneOf_2.h
 *
 * Occurs when parts of a [run step](/docs/api-reference/run-steps/step-object) are being streamed.
 */

#ifndef _RunStepStreamEvent_oneOf_2_H_
#define _RunStepStreamEvent_oneOf_2_H_


#include <string>
#include "RunStepDeltaObject.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Occurs when parts of a [run step](/docs/api-reference/run-steps/step-object) are being streamed.
 *
 *  \ingroup Models
 *
 */

class RunStepStreamEvent_oneOf_2 : public Object {
public:
	/*! \brief Constructor.
	 */
	RunStepStreamEvent_oneOf_2();
	RunStepStreamEvent_oneOf_2(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RunStepStreamEvent_oneOf_2();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::string event;
	RunStepDeltaObject data;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RunStepStreamEvent_oneOf_2_H_ */
