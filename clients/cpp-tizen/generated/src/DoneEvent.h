/*
 * DoneEvent.h
 *
 * Occurs when a stream ends.
 */

#ifndef _DoneEvent_H_
#define _DoneEvent_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Occurs when a stream ends.
 *
 *  \ingroup Models
 *
 */

class DoneEvent : public Object {
public:
	/*! \brief Constructor.
	 */
	DoneEvent();
	DoneEvent(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DoneEvent();

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
	std::string getData();

	/*! \brief Set 
	 */
	void setData(std::string  data);

private:
	std::string event;
	std::string data;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DoneEvent_H_ */
