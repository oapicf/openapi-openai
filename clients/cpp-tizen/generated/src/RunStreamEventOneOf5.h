/*
 * RunStreamEvent_oneOf_5.h
 *
 * Occurs when a [run](/docs/api-reference/runs/object) ends with status &#x60;incomplete&#x60;.
 */

#ifndef _RunStreamEvent_oneOf_5_H_
#define _RunStreamEvent_oneOf_5_H_


#include <string>
#include "RunObject.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Occurs when a [run](/docs/api-reference/runs/object) ends with status `incomplete`.
 *
 *  \ingroup Models
 *
 */

class RunStreamEvent_oneOf_5 : public Object {
public:
	/*! \brief Constructor.
	 */
	RunStreamEvent_oneOf_5();
	RunStreamEvent_oneOf_5(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RunStreamEvent_oneOf_5();

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

#endif /* _RunStreamEvent_oneOf_5_H_ */
