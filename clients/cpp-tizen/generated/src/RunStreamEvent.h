/*
 * RunStreamEvent.h
 *
 * 
 */

#ifndef _RunStreamEvent_H_
#define _RunStreamEvent_H_


#include <string>
#include "RunObject.h"
#include "RunStreamEvent_oneOf.h"
#include "RunStreamEvent_oneOf_1.h"
#include "RunStreamEvent_oneOf_2.h"
#include "RunStreamEvent_oneOf_3.h"
#include "RunStreamEvent_oneOf_4.h"
#include "RunStreamEvent_oneOf_5.h"
#include "RunStreamEvent_oneOf_6.h"
#include "RunStreamEvent_oneOf_7.h"
#include "RunStreamEvent_oneOf_8.h"
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

class RunStreamEvent : public Object {
public:
	/*! \brief Constructor.
	 */
	RunStreamEvent();
	RunStreamEvent(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RunStreamEvent();

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
	RunObject getData();

	/*! \brief Set 
	 */
	void setData(RunObject  data);

private:
	std::string event;
	RunObject data;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RunStreamEvent_H_ */
