/*
 * RunStepStreamEvent_oneOf_5.h
 *
 * Occurs when a [run step](/docs/api-reference/runs/step-object) is cancelled.
 */

#ifndef _RunStepStreamEvent_oneOf_5_H_
#define _RunStepStreamEvent_oneOf_5_H_


#include <string>
#include "RunStepObject.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Occurs when a [run step](/docs/api-reference/runs/step-object) is cancelled.
 *
 *  \ingroup Models
 *
 */

class RunStepStreamEvent_oneOf_5 : public Object {
public:
	/*! \brief Constructor.
	 */
	RunStepStreamEvent_oneOf_5();
	RunStepStreamEvent_oneOf_5(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RunStepStreamEvent_oneOf_5();

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

#endif /* _RunStepStreamEvent_oneOf_5_H_ */
