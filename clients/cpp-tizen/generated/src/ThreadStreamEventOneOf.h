/*
 * ThreadStreamEvent_oneOf.h
 *
 * Occurs when a new [thread](/docs/api-reference/threads/object) is created.
 */

#ifndef _ThreadStreamEvent_oneOf_H_
#define _ThreadStreamEvent_oneOf_H_


#include <string>
#include "ThreadObject.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Occurs when a new [thread](/docs/api-reference/threads/object) is created.
 *
 *  \ingroup Models
 *
 */

class ThreadStreamEvent_oneOf : public Object {
public:
	/*! \brief Constructor.
	 */
	ThreadStreamEvent_oneOf();
	ThreadStreamEvent_oneOf(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ThreadStreamEvent_oneOf();

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
	ThreadObject getData();

	/*! \brief Set 
	 */
	void setData(ThreadObject  data);

private:
	std::string event;
	ThreadObject data;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ThreadStreamEvent_oneOf_H_ */
