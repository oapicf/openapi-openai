/*
 * ErrorEvent.h
 *
 * Occurs when an [error](/docs/guides/error-codes#api-errors) occurs. This can happen due to an internal server error or a timeout.
 */

#ifndef _ErrorEvent_H_
#define _ErrorEvent_H_


#include <string>
#include "Error.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Occurs when an [error](/docs/guides/error-codes#api-errors) occurs. This can happen due to an internal server error or a timeout.
 *
 *  \ingroup Models
 *
 */

class ErrorEvent : public Object {
public:
	/*! \brief Constructor.
	 */
	ErrorEvent();
	ErrorEvent(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ErrorEvent();

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
	Error getData();

	/*! \brief Set 
	 */
	void setData(Error  data);

private:
	std::string event;
	Error data;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ErrorEvent_H_ */
