/*
 * RunStepStreamEvent_oneOf_1.h
 *
 * Occurs when a [run step](/docs/api-reference/runs/step-object) moves to an &#x60;in_progress&#x60; state.
 */

#ifndef _RunStepStreamEvent_oneOf_1_H_
#define _RunStepStreamEvent_oneOf_1_H_


#include <string>
#include "RunStepObject.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Occurs when a [run step](/docs/api-reference/runs/step-object) moves to an `in_progress` state.
 *
 *  \ingroup Models
 *
 */

class RunStepStreamEvent_oneOf_1 : public Object {
public:
	/*! \brief Constructor.
	 */
	RunStepStreamEvent_oneOf_1();
	RunStepStreamEvent_oneOf_1(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RunStepStreamEvent_oneOf_1();

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
	RunStepObject getData();

	/*! \brief Set 
	 */
	void setData(RunStepObject  data);

private:
	std::string event;
	RunStepObject data;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RunStepStreamEvent_oneOf_1_H_ */
