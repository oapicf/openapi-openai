/*
 * MessageObject_incomplete_details.h
 *
 * On an incomplete message, details about why the message is incomplete.
 */

#ifndef _MessageObject_incomplete_details_H_
#define _MessageObject_incomplete_details_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief On an incomplete message, details about why the message is incomplete.
 *
 *  \ingroup Models
 *
 */

class MessageObject_incomplete_details : public Object {
public:
	/*! \brief Constructor.
	 */
	MessageObject_incomplete_details();
	MessageObject_incomplete_details(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MessageObject_incomplete_details();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The reason the message is incomplete.
	 */
	std::string getReason();

	/*! \brief Set The reason the message is incomplete.
	 */
	void setReason(std::string  reason);

private:
	std::string reason;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MessageObject_incomplete_details_H_ */
