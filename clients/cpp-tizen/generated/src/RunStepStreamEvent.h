/*
 * RunStepStreamEvent.h
 *
 * 
 */

#ifndef _RunStepStreamEvent_H_
#define _RunStepStreamEvent_H_


#include <string>
#include "RunStepObject.h"
#include "RunStepStreamEvent_oneOf.h"
#include "RunStepStreamEvent_oneOf_1.h"
#include "RunStepStreamEvent_oneOf_2.h"
#include "RunStepStreamEvent_oneOf_3.h"
#include "RunStepStreamEvent_oneOf_4.h"
#include "RunStepStreamEvent_oneOf_5.h"
#include "RunStepStreamEvent_oneOf_6.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class RunStepStreamEvent : public Object {
public:
	/*! \brief Constructor.
	 */
	RunStepStreamEvent();
	RunStepStreamEvent(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RunStepStreamEvent();

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

#endif /* _RunStepStreamEvent_H_ */
